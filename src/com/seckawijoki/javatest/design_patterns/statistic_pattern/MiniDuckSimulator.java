package com.seckawijoki.javatest.design_patterns.statistic_pattern;


import com.seckawijoki.javatest.design_patterns.statistic_pattern.fly.FlyRocketPowered;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck duck = new ModelDuck();
    duck.performQuack();
    duck.performFly();
    duck.setFlyBehavior(new FlyRocketPowered());
    duck.performFly();
  }
}
