package com.akhil.structural.facade;

public class NotificationServer {
    // Connect -- returns a Connection Object (will use this to disconnect later)
    // authenticate(appId, key) -- returns an AuthToken
    // send(AuthToken, message, targetUser/targetDevice)
    // conn.disconnect()

    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending a message");
    }
}
