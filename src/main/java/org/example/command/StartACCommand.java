package org.example.command;

public class StartACCommand implements ICommandAC {

  AC ac;

  public StartACCommand(AC ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    System.out.println("Turning on the AC");
    ac.turnOn();
  }
}
