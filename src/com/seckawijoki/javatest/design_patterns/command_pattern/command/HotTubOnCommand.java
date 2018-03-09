package com.seckawijoki.javatest.design_patterns.command_pattern.command;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.HotTub;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class HotTubOnCommand implements Command {
  private HotTub hotTub;
  public HotTubOnCommand(HotTub hotTub){
    this.hotTub = hotTub;
  }
  @Override
  public void execute() {
    hotTub.on();
  }

  @Override
  public void undo() {
    hotTub.off();
  }

  @Override
  public void store() {

  }

  @Override
  public void load() {

  }
}
