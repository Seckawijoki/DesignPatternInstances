package com.seckawijoki.javatest.design_patterns.command_pattern.command;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.HotTub;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class HotTubOffCommand implements Command {
  private HotTub hotTub;
  public HotTubOffCommand(HotTub hotTub){
    this.hotTub = hotTub;
  }
  @Override
  public void execute() {
    hotTub.off();
  }

  @Override
  public void undo() {
    hotTub.on();
  }

  @Override
  public void store() {

  }

  @Override
  public void load() {

  }
}
