package com.seckawijoki.javatest.design_patterns.prototype_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/11.
 */

public class Triangle extends Shape {
  public Triangle() {
    name = "Triangle";
  }

  @Override
  void draw() {
    System.out.println("Inside Triangle:: draw() method");
  }
}
