package com.seckawijoki.javatest.design_patterns.visitor_pattern;

import java.util.Random;

/**
 * Created by 瑶琴频曲羽衣魂 on 2019/8/18 at 22:48.
 */

class Engineer extends Staff {
  public Engineer(String name) {
    super(name);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public int getCodeLines(){
    return new Random().nextInt(10*10000);
  }
}
