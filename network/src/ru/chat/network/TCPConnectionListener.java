package ru.chat.network;

public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection tcpConnection);
    void onReceiveString(TCPConnection tcpConnection, String string);
    void onDisconnection(TCPConnection tcpConnection);
    void onException(TCPConnection tcpConnection, Exception e);

}
