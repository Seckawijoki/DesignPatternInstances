package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class FirstThread extends Thread {
  private int i;

  @Override
  public void run() {
    for (; i < 100; ++i) {
      System.out.println(" | " + getName() + "-> i = " + i);
      //if (i %5 == 0)        System.out.print('\n');
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println(" | " + Thread.currentThread().getName() + "-> i = " + i);
      //if (i %5 == 0)        System.out.print('\n');
      if (i == 20){
        new FirstThread().start();
        new FirstThread().start();
      }
    }
  }
}
