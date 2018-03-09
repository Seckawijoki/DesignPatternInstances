package com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

class Projector implements SwitchableAppliance{
  private DVDPlayer dvdPlayer;
  public Projector(DVDPlayer dvdPlayer){
    this.dvdPlayer = dvdPlayer;
  }
  @Override
  public void on() {
    dvdPlayer.on();
  }

  @Override
  public void off() {
    dvdPlayer.off();
  }
  void tvMode(){
    System.out.println("Projector is set to TV mode.");
  }
  void wideScreenMode(){
    System.out.println("Projector is set to screen mode.");
  }
  @Override
  public String toString() {
    return super.toString();
  }
}
