package com.seckawijoki.javatest.design_patterns.visitor_pattern;

import java.util.Random;

/**
 * Created by 瑶琴频曲羽衣魂 on 2019/8/18 at 22:46.
 */

public abstract class Staff {
  public String mName;
  public int mKpi;

  public Staff(String name) {
    this.mName = name;
    mKpi = new Random().nextInt(10);
  }
  public abstract void accept(Visitor visitor);
}
