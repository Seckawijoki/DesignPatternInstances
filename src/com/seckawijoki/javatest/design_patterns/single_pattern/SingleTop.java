package com.seckawijoki.javatest.design_patterns.single_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */

public class SingleTop {
  private volatile static SingleTop singleTop;
  private SingleTop(){}
  public static SingleTop getInstance(){
    if (singleTop == null) {
      synchronized (SingleTop.class) {
        if (singleTop == null) {
          singleTop = new SingleTop();
        }
      }
    }
    return singleTop;
  }
}
