package com.seckawijoki.javatest.design_patterns.command_pattern.command;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.Light;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class LightOffCommand implements Command {
  private Light light;
  public LightOffCommand(Light light){
    this.light = light;
  }
  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }

  @Override
  public void store() {

  }

  @Override
  public void load() {

  }
}
