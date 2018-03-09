package com.seckawijoki.javatest.design_patterns.command_pattern.command;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.CeilingFan;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class CeilingFanMediumCommand implements Command {
  private CeilingFan ceilingFan;
  private int previousSpeed;
  public CeilingFanMediumCommand(CeilingFan ceilingFan){
    this.ceilingFan = ceilingFan;
  }
  @Override
  public void execute() {
    previousSpeed = ceilingFan.getSpeed();
    ceilingFan.medium();
  }

  @Override
  public void undo() {
    switch (previousSpeed){
      case CeilingFan.Speed.LOW:
        ceilingFan.low();break;
      case CeilingFan.Speed.MEDIUM:
        ceilingFan.medium();break;
      case CeilingFan.Speed.HIGH:
        ceilingFan.high();break;
      case CeilingFan.Speed.OFF:
        ceilingFan.off();break;
    }
  }

  @Override
  public void store() {

  }

  @Override
  public void load() {

  }
}
