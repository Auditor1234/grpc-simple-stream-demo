package com.li.client;

import com.li.rpc.domain.DataRequest;
import com.li.rpc.domain.DataResponse;

public class DataClientServer {
    private String ip;
    private int port;
    private DataClient dataClient = null;

    public DataClientServer(String ip, int port){
        this.ip = ip;
        this.port = port;
        this.dataClient = new DataClient(this.ip, this.port);
    }
    public void sendMessage(String id, String name, String data){
        DataRequest request = DataRequest.newBuilder()
                            .setData(data)
                            .setInstanceId(id)
                            .setName(name)
                            .build();
        DataResponse response = dataClient.getName(request);
        System.out.println("成功取得消息， Name为：" + response.getMessage());
    }
    
    public void shutdown() throws InterruptedException{
        this.dataClient.shutdown();
    }
}
