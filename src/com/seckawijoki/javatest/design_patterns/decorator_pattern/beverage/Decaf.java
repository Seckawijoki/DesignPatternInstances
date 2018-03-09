package com.seckawijoki.javatest.design_patterns.decorator_pattern.beverage;


import com.seckawijoki.javatest.design_patterns.decorator_pattern.Beverage;

/**
 * Created by 灵灯引芒 on 2017/3/4.
 */

public class Decaf extends Beverage {
  public Decaf(){

  }
  @Override
  public double cost() {
    return 1.05 + cupCost();
  }
}
