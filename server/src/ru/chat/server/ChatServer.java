package ru.chat.server;

import ru.chat.network.TCPConnection;
import ru.chat.network.TCPConnectionListener;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer implements TCPConnectionListener {
    public static void main(String[] args) {
        new ChatServer();
    }

    private final List<TCPConnection> connections = new ArrayList<>();

    private ChatServer(){
        System.out.println("Server has been running");
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            while (true) {
                try {
                    new TCPConnection(this, serverSocket.accept());
                } catch (IOException e) {
                    System.out.println("TCPConnection exception: " + e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {

    }

    @Override
    public void onReceiveString(TCPConnection tcpConnection, String string) {

    }

    @Override
    public void onDisconnection(TCPConnection tcpConnection) {

    }

    @Override
    public void onException(TCPConnection tcpConnection, Exception e) {

    }
}
