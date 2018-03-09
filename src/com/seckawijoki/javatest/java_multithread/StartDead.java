package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class StartDead extends Thread {
  private int i;

  @Override
  public void run() {
    for ( ; i < 10 ; ++i){
      System.out.println(getName() + " -> i = " + i);
    }
  }

  public static void main(String[] args) {
    StartDead startDead = new StartDead();
    for (int i = 0 ; i < 500 ; ++i){
      System.out.println(Thread.currentThread().getName() + " -> i = " + i);
      if ( i == 20 ){
        startDead.start();
        System.out.println(startDead.isAlive() + " i = " + i);
      }
      if (i > 20 && !startDead.isAlive()){
        //启动死亡的线程，会直接报错
//        startDead = new StartDead();
        startDead.start();
      }
    }
  }
}
