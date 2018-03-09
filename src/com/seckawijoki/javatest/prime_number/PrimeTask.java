package com.seckawijoki.javatest.prime_number;

import java.util.concurrent.RecursiveTask;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/23.
 */

public class PrimeTask extends RecursiveTask<Integer> {
  public static int THREAD_NUMBER = 0;
  private static final int THRESHOLD = 10000;
  private int start;
  private int end;
  public PrimeTask(int start, int end) {
    ++THREAD_NUMBER;
    this.start = start;
    this.end = end;
  }
  @Override
  protected Integer compute() {
    int sum = 0;
    if (end - start <= THRESHOLD){
      for (int i = start; i < end; ++i) {
        if (PrimeTool.isPrime(start)) {
          System.out.println(Thread.currentThread().getName() + " | 素数：" + start);
          ++sum;
        }
      }
    } else {
      int middle = (start + end) /2;
      PrimeTask left = new PrimeTask(start, middle);
      PrimeTask right = new PrimeTask(middle+1, end);
      left.fork();
      right.fork();
      sum = left.join() + right.join();
    }
    return sum;
  }
}
