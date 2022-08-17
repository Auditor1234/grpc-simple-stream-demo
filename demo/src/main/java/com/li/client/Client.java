package com.li.client;

public class Client {
    private String ip = "localhost";
    private int port = 8888;
    DataClientServer clientServer = null;
    
    public void start(){
        this.clientServer = new DataClientServer(ip, port);
    }

    public void shutdown(){
        if(this.clientServer != null)
            try {
                clientServer.shutdown();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }

    public void sendMessage(String id, String name, String data){
        this.clientServer.sendMessage(id, name, data);
    }

    public static void main(String[] args) {
        String id = "helloworld-";
        String name = "client-01";
        String data = "Good evening";
        Client client = new Client();
        client.start();
        int count = 5;
        for(int i = 0; i < count; i++)
        client.sendMessage(id + i, name, data);
    }
}
