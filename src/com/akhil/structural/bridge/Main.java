package com.akhil.structural.bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();

        var remoteControl1 = new AdvancedRemoteControl(new SonyTV());
        remoteControl1.setChannel(1);
    }
}
