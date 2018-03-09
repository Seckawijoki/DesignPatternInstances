package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class DaemonThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 1000; ++i){
      System.out.println(getName() + " -> i = " + i);
    }
  }

  public static void main(String[] args) {
    DaemonThread daemonThread = new DaemonThread();
    daemonThread.setDaemon(true);
    daemonThread.start();
    for (int i = 0 ; i < 10 ; ++i){
      System.out.println(Thread.currentThread().getName() + " -> i = " + i);
    }
    //前台进程main死亡后，后台进程daemonThread也随之死亡。
    //daemonThread的循环不会执行到999

  }
}
