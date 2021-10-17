package org.example.command;

public class CommandDesignPattern {
    public static void main(String[] args) {

        AC acRoomOne = new AC();
        AC acRoomTwo = new AC();

        ACAutomationRemote remote = new ACAutomationRemote();

        remote.setCommand(new StartACCommand(acRoomOne));
        remote.buttonPressed();
        remote.setCommand(new StartACCommand(acRoomTwo));
        remote.buttonPressed();
        remote.setCommand(new IncTemperatureCommand(acRoomOne));
        remote.buttonPressed();



    }
}
