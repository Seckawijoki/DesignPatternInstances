package com.seckawijoki.javatest.design_patterns.decorator_pattern.condiment_decorator;


import com.seckawijoki.javatest.design_patterns.decorator_pattern.Beverage;

/**
 * Created by 灵灯引芒 on 2017/3/4.
 */

public class Mocha extends CondimentDecorator {
  public Mocha(Beverage b){
    beverage = b;
  }
  @Override
  public double cost() {
    return 0.2 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha(0.2)";
  }
}
