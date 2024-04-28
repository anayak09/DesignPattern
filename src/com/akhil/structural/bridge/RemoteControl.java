package com.akhil.structural.bridge;

// Basic Remote Control (turnOn, turnoff)
// Advanced Remote Control (setChannel)
// Movie Remote Control (play, pause, rewind)
// RemoteControl
// SonyRemoteControl
//   AdvancedRemoteControl
//   SonyAdvancedRemoteControl
// Whenever a hierarchy grows in 2 separate dimensions, we need to have independent hierarchy and need to create a bridge
public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }
    public void turnOff() {
        device.turnOff();
    }
}
