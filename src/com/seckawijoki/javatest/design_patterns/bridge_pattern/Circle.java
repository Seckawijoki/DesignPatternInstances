package com.seckawijoki.javatest.design_patterns.bridge_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/11.
 */

public class Circle extends Shape {
  private int radius, x, y;
  public Circle(DrawApi drawApi, int radius, int x, int y) {
    super(drawApi);
    this.radius = radius;
    this.x = x;
    this.y = y;
  }

  @Override
  void draw() {
    drawApi.drawCircle(radius, x, y);
  }
}
