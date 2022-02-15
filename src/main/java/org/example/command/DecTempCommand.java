package org.example.command;

public class DecTempCommand implements ICommandAC {

  AC ac;

  public DecTempCommand(AC ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    System.out.println("Decrease on the AC");
    ac.decTemp();
  }
}
