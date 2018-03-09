package com.seckawijoki.javatest.design_patterns.model_method_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/6.
 */

public class Tea extends CaffeineBeverage {
  @Override
  void brew() {
    System.out.println("Steeping the tea.");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding lemon.");
  }
}
