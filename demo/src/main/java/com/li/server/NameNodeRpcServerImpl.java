package com.li.server;

import com.li.rpc.domain.DataRequest;
import com.li.rpc.domain.DataResponse;
import com.li.rpc.rpcservice.GrpcServiceApisGrpc.GrpcServiceApisImplBase;

import io.grpc.stub.StreamObserver;;

public class NameNodeRpcServerImpl extends GrpcServiceApisImplBase{
    @Override
    public void getName(DataRequest request, StreamObserver<DataResponse> responseObserver) {
        // TODO Auto-generated method stub
        String name = request.getName();
        String id = request.getInstanceId();
        String message = request.getData();
        System.out.println("接收到DataRequest请求：");
        System.out.println("name = " + name);
        System.out.println("InstanceId = " + id);
        System.out.println("message = " + message);

        DataResponse response = DataResponse.newBuilder()
                                            .setInstanceId("1111122222")
                                            .setMessage("Good morning!" + name)
                                            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
