package com.seckawijoki.javatest.design_patterns.statistic_pattern.fly;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class FlyNoWay implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I cannot fly.");
  }
}
