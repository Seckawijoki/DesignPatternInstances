package com.seckawijoki.javatest.design_patterns.adapter_pattern.duck_and_turkey;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class MallardDuck implements Duck {
  @Override
  public void quack() {
    System.out.println("Quack." +
            "");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying.");
  }
}
