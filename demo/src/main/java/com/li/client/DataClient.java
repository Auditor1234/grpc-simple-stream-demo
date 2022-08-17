package com.li.client;

import com.li.rpc.domain.DataRequest;
import com.li.rpc.domain.DataResponse;
import com.li.rpc.rpcservice.GrpcServiceApisGrpc.GrpcServiceApisBlockingStub;
import static com.li.rpc.rpcservice.GrpcServiceApisGrpc.newBlockingStub;

import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class DataClient {
    private GrpcServiceApisBlockingStub blockingStub = null;
    private ManagedChannel channel = null;
    public DataClient(String ip, int port){
        this.channel = ManagedChannelBuilder.forTarget(ip + ":" + port).usePlaintext().build();
        this.blockingStub = newBlockingStub(this.channel);
        System.out.println("connected to server at " + ip + ":" + port);
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                try {
                    channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }

    public DataResponse getName(DataRequest request){
        return this.blockingStub.getName(request);
    }

    public void shutdown() throws InterruptedException{
        this.channel.shutdown().awaitTermination(5L, TimeUnit.SECONDS);
    }
}
