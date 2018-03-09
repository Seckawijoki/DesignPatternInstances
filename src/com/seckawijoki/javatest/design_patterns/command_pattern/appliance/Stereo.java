package com.seckawijoki.javatest.design_patterns.command_pattern.appliance;


import com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater.SwitchableAppliance;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class Stereo extends Appliance implements SwitchableAppliance {
  private int volume;
  public Stereo(){}
  public Stereo(String place) {
    this.place = place;
  }
  public void off(){
    System.out.println(place + "'s stereo is off.");
  }
  public void on(){
    System.out.println(place + " stereo is on.");
  }
  public void setCd(){
    System.out.println(place + " stereo is set for CD input.");
  }
  public void setDvd(){
    System.out.println(place + " stereo is set for DVD input.");
  }
  public void setRadio(){
    System.out.println(place + " stereo is set for radio input.");
  }
  public void setVolume(int volume){
    this.volume = volume;
    System.out.println(place + " stereo volume sets to " + volume + '.');
  }
}
