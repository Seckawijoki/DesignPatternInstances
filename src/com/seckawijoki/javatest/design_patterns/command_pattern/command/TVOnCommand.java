package com.seckawijoki.javatest.design_patterns.command_pattern.command;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.TV;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class TVOnCommand implements Command {
  private TV tv;
  public TVOnCommand(TV tv){
    this.tv = tv;
  }
  @Override
  public void execute() {
    tv.on();
    tv.setInputChannel(26);
    tv.setVolume(24);
  }

  @Override
  public void undo() {
    tv.off();
  }

  @Override
  public void store() {

  }

  @Override
  public void load() {

  }
}
