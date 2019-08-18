package com.seckawijoki.javatest.design_patterns.visitor_pattern;

import java.util.Random;

/**
 * Created by 瑶琴频曲羽衣魂 on 2019/8/18 at 22:49.
 */

class Manager extends Staff {
  private int mProducts;
  public Manager(String name) {
    super(name);
    mProducts = new Random().nextInt(10);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public int getProducts(){
    return mProducts;
  }
}
