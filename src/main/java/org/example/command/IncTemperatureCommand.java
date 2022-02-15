package org.example.command;

public class IncTemperatureCommand implements ICommandAC {

  AC ac;

  public IncTemperatureCommand(AC ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    System.out.println("Increasing temp on the AC");
    ac.incTemp();
  }
}
