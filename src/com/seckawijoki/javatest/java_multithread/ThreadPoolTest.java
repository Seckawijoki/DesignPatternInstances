package com.seckawijoki.javatest.java_multithread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/6.
 */

public class ThreadPoolTest {
  public static void main(String[] args) {
    ExecutorService pool = Executors.newFixedThreadPool(6);
    //返回Future<>实例
    pool.submit(new SimpleThread());
    pool.submit(new SimpleThread());
    pool.shutdown();
  }
}
class SimpleThread implements Runnable{
  @Override
  public void run() {
    for ( int i = 0 ; i < 100 ; ++i){
      System.out.println(Thread.currentThread().getName() + " | i = " + i);
    }
  }
}
