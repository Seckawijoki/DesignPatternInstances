package com.seckawijoki.javatest.design_patterns.state_pattern.light;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/21.
 */

public class LightStateTest {
  public static void main(String[] args) {
    Light light = new Light();
    light.turnOn();
    light.turnOff();
    light.turnOn();
  }
}
