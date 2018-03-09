package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class JoinThread extends Thread {
  public JoinThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0 ; i < 100 ; ++i){
      System.out.println(getName() + " -> i = " + i);
    }
  }

  public static void main(String[] args) throws InterruptedException {
    //new JoinThread("新线程").start();
    for ( int i = 0 ; i < 100 ; ++i){
      if ( i == 20 ){
        JoinThread joinThread = new JoinThread("被join的线程");
        joinThread.start();
        //main线程需要等待joinThread执行完毕，才会继续执行
        joinThread.join();
      }
      System.out.println(Thread.currentThread().getName() + " -> i = " + i);
    }
  }
}
