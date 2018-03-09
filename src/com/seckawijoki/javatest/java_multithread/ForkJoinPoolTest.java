package com.seckawijoki.javatest.java_multithread;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/6.
 */

public class ForkJoinPoolTest {
  public static void main(String[] args) throws InterruptedException {
    ForkJoinPool forkJoinPool = new ForkJoinPool();
    forkJoinPool.submit(new PrintTask(0, 300));
    forkJoinPool.awaitTermination(2, TimeUnit.SECONDS);
    forkJoinPool.shutdown();
  }
}
class PrintTask extends RecursiveAction{
private static final int THRESHOLD = 50;
  private int start, end;
  public PrintTask(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  protected void compute() {
    if (end - start < THRESHOLD){
      for (int i = start; i < end; ++i){
        System.out.println(Thread.currentThread().getName() + " | i = " + i);
      }
    } else {
      int middle = (start + end) /2;
      PrintTask left = new PrintTask(start, middle);
      PrintTask right = new PrintTask(middle, end);
      left.fork();
      right.fork();
    }
  }
}
