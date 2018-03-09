package com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

class TheaterLight implements SwitchableAppliance{
  public void on(){
    System.out.println("Theater light turns on.");
  }
  public void off(){
    System.out.println("Theater light turns off.");
  }
  void dim(int dim){
    System.out.println("Theater light sets dim to " + dim);
  }
}
