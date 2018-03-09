package com.seckawijoki.javatest.design_patterns.bridge_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/11.
 */

class GreenCircle implements DrawApi {
  @Override
  public void drawCircle(int radius, int x, int y) {
    System.out.println("Drawing a green circle on(" + x  + ", " + y + ") with radius of " + radius);
  }
}
