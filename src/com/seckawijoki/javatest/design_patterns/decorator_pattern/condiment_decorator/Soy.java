package com.seckawijoki.javatest.design_patterns.decorator_pattern.condiment_decorator;


import com.seckawijoki.javatest.design_patterns.decorator_pattern.Beverage;

/**
 * Created by 灵灯引芒 on 2017/3/4.
 */

public class Soy extends CondimentDecorator {
  public Soy(Beverage b){
    beverage = b;
  }
  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy(0.15)";
  }

  @Override
  public double cost() {
    return .15 + beverage.cost();
  }
}
