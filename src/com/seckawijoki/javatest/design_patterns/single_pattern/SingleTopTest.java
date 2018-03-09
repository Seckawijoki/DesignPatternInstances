package com.seckawijoki.javatest.design_patterns.single_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */

public class SingleTopTest {
  private static SingleTop singleTop;
  public static void main(String []args){
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        int i;
        singleTop = SingleTop.getInstance();
      }
    };
    Thread thread1 = new Thread(runnable);
    Thread thread2 = new Thread(runnable);
    thread1.start();
    thread2.start();
  }
}
