package com.seckawijoki.javatest.design_patterns.statistic_pattern;


import com.seckawijoki.javatest.design_patterns.statistic_pattern.fly.FlyBehavior;
import com.seckawijoki.javatest.design_patterns.statistic_pattern.quack.QuackBehavior;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

abstract class Duck implements Animal{
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  Duck(){
  }
  public void setFlyBehavior(FlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }
  public void setQuackBehavior(QuackBehavior quackBehavior){
    this.quackBehavior = quackBehavior;
  }
  @Override
  public void performQuack() {
    quackBehavior.quack();
  }
  @Override
  public void performFly() {
    flyBehavior.fly();
  }
  void swim(){
    System.out.println("All ducks float, even decoys!");
  }
  @Override
  public String toString() {
    return "I'm a duck.";
  }
}
