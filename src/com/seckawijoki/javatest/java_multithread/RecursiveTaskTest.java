package com.seckawijoki.javatest.java_multithread;


import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RecursiveTask;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/6.
 */

public class RecursiveTaskTest {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    int []integers = new int[100];
    int total = 0;
    Random random = new Random();
    for (int i = 0; i < integers.length; i++) {
      int temp = random.nextInt(20);
      total += (integers[i] = temp);
    }
    System.out.println(total);
    ForkJoinPool forkJoinPool = new ForkJoinPool();
    //返回Future<>实例
    Future<Integer> future = forkJoinPool.submit(new CalculateTask(integers, 0, integers.length));
    System.out.println(future.get());
    forkJoinPool.shutdown();
  }
}
class CalculateTask extends RecursiveTask<Integer>{
  private static final int THRESHOLD = 20;
  private int []integers;
  private int start;
  private int end;
  public CalculateTask(int[] integers, int start, int end) {
    this.integers = integers;
    this.start = start;
    this.end = end;
  }
  @Override
  protected Integer compute() {
    int sum = 0;
    if (end - start < THRESHOLD){
      for (int i = start; i < end; ++i)sum += integers[i];
      return sum;
    } else {
      int middle = (start + end) /2;
      CalculateTask left = new CalculateTask(integers, start, middle);
      CalculateTask right = new CalculateTask(integers, middle, end);
      left.fork();
      right.fork();
      //RecursiveTask<>子类任务带返回值的调用
      return left.join() + right.join();
    }
  }
}
