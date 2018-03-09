package com.seckawijoki.javatest.design_patterns.prototype_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/11.
 */

public class Circle extends Shape{
  public Circle() {
    name = "circle";
  }

  @Override
  void draw() {
    System.out.println("Inside Circle:: draw() method");
  }
}
