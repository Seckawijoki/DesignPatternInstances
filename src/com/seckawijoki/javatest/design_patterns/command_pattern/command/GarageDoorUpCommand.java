package com.seckawijoki.javatest.design_patterns.command_pattern.command;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.GarageDoor;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class GarageDoorUpCommand implements Command {
  private GarageDoor garageDoor;
  public GarageDoorUpCommand(GarageDoor garageDoor){
    this.garageDoor = garageDoor;
  }
  @Override
  public void execute() {
    garageDoor.up();
    garageDoor.lightOn();
  }

  @Override
  public void undo() {
    garageDoor.stop();
    garageDoor.lightOff();
  }

  @Override
  public void store() {

  }

  @Override
  public void load() {

  }
}
