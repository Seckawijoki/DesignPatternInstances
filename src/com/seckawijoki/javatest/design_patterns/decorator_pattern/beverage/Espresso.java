package com.seckawijoki.javatest.design_patterns.decorator_pattern.beverage;


import com.seckawijoki.javatest.design_patterns.decorator_pattern.Beverage;

/**
 * Created by 灵灯引芒 on 2017/3/4.
 */

public class Espresso extends Beverage {
  public Espresso(){
    description = "Espresso";
  }
  @Override
  public double cost() {
    return 1.99 + cupCost();
  }
}
