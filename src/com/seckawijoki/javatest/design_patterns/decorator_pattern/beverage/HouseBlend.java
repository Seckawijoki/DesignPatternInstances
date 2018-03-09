package com.seckawijoki.javatest.design_patterns.decorator_pattern.beverage;


import com.seckawijoki.javatest.design_patterns.decorator_pattern.Beverage;

/**
 * Created by 灵灯引芒 on 2017/3/4.
 */

public class HouseBlend extends Beverage {
  public HouseBlend(){
    description = "House Blend Coffee";
  }
  @Override
  public double cost() {
    return .89 + cupCost();
  }
}
