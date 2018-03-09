package com.seckawijoki.javatest.design_patterns.command_pattern.appliance;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class GarageDoor {
  public void up(){
    System.out.println("Garage door is up.");
  }
  public void down(){
    System.out.println("Garage door is down.");
  }
  public void stop(){
    System.out.println("Garage door is stopped.");
  }
  public void lightOn(){
    System.out.println("Garage door's light is on.");
  }
  public void lightOff(){
    System.out.println("Garage door's light is off.");
  }
}
