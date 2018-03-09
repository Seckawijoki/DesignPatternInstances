package com.seckawijoki.javatest.design_patterns.decorator_pattern.condiment_decorator;


import com.seckawijoki.javatest.design_patterns.decorator_pattern.Beverage;

/**
 * Created by 灵灯引芒 on 2017/3/4.
 */

abstract class CondimentDecorator extends Beverage {
  Beverage beverage;
  @Override
  public abstract String getDescription();
  public abstract double cost();
}
