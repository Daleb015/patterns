package org.example.command;

public class ACAutomationRemote {

  ICommandAC command;

  public ICommandAC getCommand() {
    return command;
  }

  public void setCommand(ICommandAC command) {
    this.command = command;
  }

  public void buttonPressed() {
    command.execute();
  }
}
