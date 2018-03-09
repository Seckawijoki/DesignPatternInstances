package com.seckawijoki.javatest.design_patterns.compound_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public class Quackologist implements Observer{
  @Override
  public void update(QuackObservable duck) {
    System.out.println("Quackologist: " + duck.getClass().getSimpleName() + " just quacked.");
  }
}
