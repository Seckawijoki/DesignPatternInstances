package com.seckawijoki.javatest.design_patterns.statistic_pattern;


import com.seckawijoki.javatest.design_patterns.statistic_pattern.fly.FlyWithWings;
import com.seckawijoki.javatest.design_patterns.statistic_pattern.quack.Quack;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class MallardDuck extends Duck {
  MallardDuck(){
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }
}
