package com.seckawijoki.javatest.design_patterns.command_pattern.appliance;


import com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater.SwitchableAppliance;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class TV extends Appliance implements SwitchableAppliance {
  private int volume;
  public TV(String place){
    this.place = place;
  }

  public TV() {

  }

  public void on(){
    System.out.println(place + " TV is on.");
  }
  public void off(){
    System.out.println(place + " TV is off.");
  }
  public void setInputChannel(int channel){
    System.out.println(place + " TV sets channel to "+ channel + '.');
  }
  public void setVolume(int volume){
    this.volume = volume;
    System.out.println(place + " TV sets volume to " + volume + '.');
  }
}
