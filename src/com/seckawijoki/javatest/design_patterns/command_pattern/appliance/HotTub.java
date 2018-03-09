package com.seckawijoki.javatest.design_patterns.command_pattern.appliance;


import com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater.SwitchableAppliance;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class HotTub extends Appliance implements SwitchableAppliance {
  private double temperature;
  public HotTub(){}
  public void on(){
    System.out.println(place + " hot tub is on.");
  }
  public void off(){
    System.out.println(place + " hot tub is off.");
  }
  public void circulate(){
    System.out.println(place + " hot tub circulates.");
  }
  public void jetsOn(){
    System.out.println(place + " hot tub jets are on.");
  }
  public void jetsOff(){
    System.out.println(place + " hot tub jets are off.");
  }
  public void setTemperature(double temperature){
    this.temperature = temperature;
    System.out.println(place + " hot tub sets temperature to " + temperature + '.');
  }
}
