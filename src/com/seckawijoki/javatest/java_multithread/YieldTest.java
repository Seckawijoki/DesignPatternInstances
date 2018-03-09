package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class YieldTest extends Thread {
  public YieldTest(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0 ; i < 100 ; ++i){
      System.out.println(getName() + " -> i = " + i);
      //让步给优先级不低于自己的线程。
      if ( i == 20 )Thread.yield();
    }
  }

  public static void main(String[] args) {
    YieldTest yt1 = new YieldTest("高级");
    yt1.setPriority(Thread.MAX_PRIORITY);
    yt1.start();
    YieldTest yt2 = new YieldTest("低级");
    yt2.setPriority(Thread.MIN_PRIORITY);
    yt2.start();
  }
}
