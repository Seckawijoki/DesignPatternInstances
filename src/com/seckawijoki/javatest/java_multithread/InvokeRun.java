package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class InvokeRun extends Thread {
  private int i;

  @Override
  public void run() {
    for ( ; i < 100 ; ++i)
      System.out.println(Thread.currentThread().getName() + " - > i = " + i);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; ++i){
      System.out.println(Thread.currentThread().getName() + " -> i = " + i);
      if ( i == 20 ){
        InvokeRun invokeRun = new InvokeRun();
        invokeRun.run();
        invokeRun.start();
        //直接调用线程的run()方法后，再次调用start()启动线程时，将引发IllegalThreadStateException错误
      }
    }
  }
}
