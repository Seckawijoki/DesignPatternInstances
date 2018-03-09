package com.seckawijoki.javatest.design_patterns.command_pattern.appliance;


import com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater.SwitchableAppliance;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class Light extends Appliance implements SwitchableAppliance {
  public Light(){}
  public Light(String place){
    this.place = place;
  }
  public void off(){
    System.out.println(place + " light is off.");
  }
  public void on(){
    System.out.println(place + " light is on.");
  }
  public void dim(){
    System.out.println(place + " light dims.");
  }
}
