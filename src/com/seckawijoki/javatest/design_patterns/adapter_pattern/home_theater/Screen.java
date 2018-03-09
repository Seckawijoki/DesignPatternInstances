package com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

class Screen {
  void up(){
    System.out.println("Screen is rising up.");
  }
  void down(){
    System.out.println("Screen is dropping down.");
  }
  @Override
  public String toString() {
    return super.toString();
  }
}
