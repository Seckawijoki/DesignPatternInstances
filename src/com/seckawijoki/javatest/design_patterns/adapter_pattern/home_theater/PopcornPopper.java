package com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

class PopcornPopper implements SwitchableAppliance{
  public void on(){
    System.out.println("Popper turns on.");
  }
  public void off(){
    System.out.println("Popper turns off.");
  }
  void pop(){
    System.out.println("Popper is popping.");
  }
  @Override
  public String toString() {
    return super.toString();
  }
}
