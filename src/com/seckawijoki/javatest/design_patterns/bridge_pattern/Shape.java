package com.seckawijoki.javatest.design_patterns.bridge_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/11.
 */

public abstract class Shape {
  DrawApi drawApi;

  public Shape(DrawApi drawApi) {
    this.drawApi = drawApi;
  }

  abstract void draw();
}
