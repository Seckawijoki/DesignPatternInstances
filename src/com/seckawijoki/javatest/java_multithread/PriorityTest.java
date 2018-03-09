package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class PriorityTest extends Thread {
  public PriorityTest(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0 ; i < 50 ; ++i){
      System.out.println(getName() + " | 优先级：" + getPriority() + " | i = " + i);
    }
  }

  public static void main(String[] args) {
    Thread.currentThread().setPriority(6);
    for (int i = 0 ; i < 30 ; ++i){
      if ( i == 10 ){
        PriorityTest low = new PriorityTest("低级");
        low.start();
        System.out.println("创建之初的优先级：" + low.getPriority());
        low.setPriority(Thread.MIN_PRIORITY);
      }
      if ( i == 20 ){
        //优先级高的线程获得更多的执行机会
        PriorityTest high = new PriorityTest("高级");
        high.start();
        System.out.println("创建之初的优先级：" + high.getPriority());
        high.setPriority(Thread.MAX_PRIORITY);
      }
    }
  }
}
