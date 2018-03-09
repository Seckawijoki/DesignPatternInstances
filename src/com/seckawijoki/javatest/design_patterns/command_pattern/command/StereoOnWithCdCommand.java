package com.seckawijoki.javatest.design_patterns.command_pattern.command;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.Stereo;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class StereoOnWithCdCommand implements Command{
  private Stereo stereo;
  public StereoOnWithCdCommand(Stereo stereo){
    this.stereo = stereo;
  }
  @Override
  public void execute() {
    stereo.on();
    stereo.setCd();
    stereo.setVolume(11);
  }

  @Override
  public void undo() {
    stereo.off();
  }

  @Override
  public void store() {

  }

  @Override
  public void load() {

  }
}
