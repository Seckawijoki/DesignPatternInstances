package com.seckawijoki.javatest.design_patterns.statistic_pattern;


import com.seckawijoki.javatest.design_patterns.statistic_pattern.fly.FlyNoWay;
import com.seckawijoki.javatest.design_patterns.statistic_pattern.quack.Quack;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

class ModelDuck extends Duck {
  ModelDuck(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }
}
