package com.seckawijoki.javatest.design_patterns.command_pattern.appliance;


import com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater.ClosableAppliance;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class CeilingFan extends Appliance implements ClosableAppliance {
  public interface Speed{
    int OFF = 0;
    int LOW = 1;
    int MEDIUM = 2;
    int HIGH = 3;
  }
  private int speed = Speed.OFF;
  public CeilingFan(){}
  public CeilingFan(String place){
    this.place = place;
  }
  public void high(){
    System.out.println(place + "'s ceiling fan is on high.");
    speed = Speed.HIGH;
  }
  public void medium(){
    System.out.println(place + " ceiling fan is on medium.");
    speed = Speed.MEDIUM;
  }
  public void low(){
    System.out.println(place + " ceiling fan is on low.");
    speed = Speed.LOW;
  }
  public void off(){
    System.out.println(place + " ceiling fan is on off.");
    speed = Speed.OFF;
  }
  public int getSpeed(){
    return speed;
  }
}
