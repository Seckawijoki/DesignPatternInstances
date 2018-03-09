package com.seckawijoki.javatest.design_patterns.adapter_pattern.duck_and_turkey;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class TurkeyAdapter implements Duck {
  private Turkey turkey;
  public TurkeyAdapter(Turkey turkey){
    this.turkey = turkey;
  }
  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    for (int i = 0; i < 5; ++i)
      turkey.fly();
  }
}
