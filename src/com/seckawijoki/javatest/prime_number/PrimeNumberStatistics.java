package com.seckawijoki.javatest.prime_number;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/23.
 */

public class PrimeNumberStatistics {
  private static final int MAXIMUM = 1000000;
  public static void main(String[] args) {
    ForkJoinPool forkJoinPool = new ForkJoinPool();
    PrimeTask primeTask = new PrimeTask(0, MAXIMUM);
    forkJoinPool.submit(primeTask);
    forkJoinPool.shutdown();
    System.out.println(MAXIMUM + "以内的素数个数：" + MAXIMUM);
    System.out.println("开启的线程个数：" + PrimeTask.THREAD_NUMBER);
  }
}
