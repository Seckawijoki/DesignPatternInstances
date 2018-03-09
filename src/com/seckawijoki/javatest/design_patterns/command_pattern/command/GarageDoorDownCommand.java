package com.seckawijoki.javatest.design_patterns.command_pattern.command;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.GarageDoor;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class GarageDoorDownCommand implements Command {
  private GarageDoor garageDoor;
  public GarageDoorDownCommand(GarageDoor garageDoor){
    this.garageDoor = garageDoor;
  }
  @Override
  public void execute() {
    garageDoor.down();
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
