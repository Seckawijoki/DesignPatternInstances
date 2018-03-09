package com.seckawijoki.javatest.design_patterns.adapter_pattern.duck_and_turkey;

import java.util.Random;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class DuckAdapter implements Turkey {
  private Duck duck;
  private Random random;
  public DuckAdapter(Duck duck){
    this.duck = duck;
  }
  @Override
  public void gobble() {
    duck.quack();
  }

  @Override
  public void fly() {
    if (random.nextInt() == 5)
      duck.fly();
  }
}
