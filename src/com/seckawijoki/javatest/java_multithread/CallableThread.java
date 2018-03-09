package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread implements Callable<Integer> {
  @Override
  public Integer call() throws Exception {
    int i = 0;
    for (; i < 100; ++i)
      System.out.println(Thread.currentThread().getName() + " -> 循环变量 i = " + i);
    return i;
  }
  public static void main(String[] args) {
    CallableThread callableThread = new CallableThread();
    //使用FutureTask<>实例去获取返回值
    FutureTask<Integer> task = new FutureTask<>(callableThread);
    for (int i = 0; i < 100; ++i){
      System.out.println(Thread.currentThread().getName() + " -> 循环变量 i = " + i);
      if (i == 20)
        new Thread(task, "带返回值的线程").start();
    }
    try {
      //task.get()方法会阻塞线程
      System.out.println("子线程的返回值：" + task.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }
}
