package org.example.command;

public class StopAcCommand implements ICommandAC{
    AC ac;

    public StopAcCommand(AC ac) {
        this.ac = ac;
    }


    @Override
    public void execute() {
        System.out.println("Stop on the AC");
        ac.turnOff();
    }
}
