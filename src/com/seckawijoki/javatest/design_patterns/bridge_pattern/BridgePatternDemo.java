package com.seckawijoki.javatest.design_patterns.bridge_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/11.
 */

public class BridgePatternDemo {
  public static void main(String[] args) {
    Circle circle1 = new Circle(new RedCircle(), 1, 2, 3);
    Circle circle2 = new Circle(new GreenCircle(), 4, 5, 6);
    Circle circle3 = new Circle(new BlueCircle(), 7 ,8 ,9);

    circle1.draw();
    circle2.draw();
    circle3.draw();
  }
}
