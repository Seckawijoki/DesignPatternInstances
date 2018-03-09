package com.seckawijoki.javatest.design_patterns.command_pattern.command;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.Stereo;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class StereoOffCommand implements Command{
  private Stereo stereo;
  public StereoOffCommand(Stereo stereo){
    this.stereo = stereo;
  }
  @Override
  public void execute() {
    stereo.off();
  }

  @Override
  public void undo() {
    stereo.on();
  }

  @Override
  public void store() {

  }

  @Override
  public void load() {

  }
}
