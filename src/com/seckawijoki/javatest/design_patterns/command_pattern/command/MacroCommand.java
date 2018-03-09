package com.seckawijoki.javatest.design_patterns.command_pattern.command;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class MacroCommand implements Command{
  private Command[] commands;
  public MacroCommand(Command[] commands){
    this.commands = commands;
  }
  @Override
  public void execute() {
    for (Command command : commands)
      command.execute();
  }

  @Override
  public void undo() {
    for (Command command : commands)
      command.undo();
  }

  @Override
  public void store() {

  }

  @Override
  public void load() {

  }
}
