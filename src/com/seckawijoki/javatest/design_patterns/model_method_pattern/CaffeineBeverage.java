package com.seckawijoki.javatest.design_patterns.model_method_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/6.
 */

public abstract class CaffeineBeverage {
  final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if (customWantsCondiments())
      addCondiments();
  }
  abstract void  brew();
  abstract void addCondiments();
  void boilWater(){
    System.out.println("Boiling water,");
  }
  void pourInCup(){
    System.out.println("Pouring into cup");
  }
  boolean customWantsCondiments(){
    return true;
  }
}
