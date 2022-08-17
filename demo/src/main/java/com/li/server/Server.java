package com.li.server;

import java.io.IOException;

public class Server {
    private NameNodeRpcServer server = null;
    public static void main(String[] args) {
        Server nameNode = new Server();
        nameNode.start();
    }

    private void start(){
        this.server = new NameNodeRpcServer();
        try {
            this.server.start();
            this.server.blockUntilShutdown();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
