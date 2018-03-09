package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class SecondThread implements Runnable {
  private int i;

  @Override
  public void run() {
    for (; i < 100; ++i) {
      //继承Runnable接口时，将不能直接获取线程的名字
      System.out.println(" | " + Thread.currentThread().getName() + "-> i = " + i);
      //if (i %5 == 0)        System.out.print('\n');
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println(" | " + Thread.currentThread().getName() + "-> i = " + i);
      //if (i %5 == 0)        System.out.print('\n');
      if (i == 20){
        //共同更新成员变量i
        SecondThread firstThread = new SecondThread();
        new Thread(firstThread, "新线程壹").start();
        new Thread(firstThread, "新线程贰").start();
      }
    }
  }
}
