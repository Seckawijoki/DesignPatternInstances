package com.seckawijoki.javatest.design_patterns.command_pattern.command;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.TV;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class TVOffCommand implements Command {
  private TV tv;
  public TVOffCommand(TV tv){
    this.tv = tv;
  }
  @Override
  public void execute() {
    tv.off();
  }

  @Override
  public void undo() {
    tv.on();
  }

  @Override
  public void store() {

  }

  @Override
  public void load() {

  }
}
