package com.seckawijoki.javatest.java_multithread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/6.
 */

public class BlockingQueueTest {
  public static void main(String[] args) {
    BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
    new Producer(bq).start();
    new Producer(bq).start();
    new Producer(bq).start();
    new Consumer(bq).start();
  }
}
class Producer extends Thread{
  private BlockingQueue<String> bq;

  public Producer(BlockingQueue<String> bq) {
    this.bq = bq;
  }

  @Override
  public void run() {
    String []strings = new String []{"Java", "Struts", "Spring"};
    for (int i = 0 ; i < 99999999 ; ++i){
      System.out.println(getName() + " | 生产者准备生产集合元素！");
      try {
        Thread.sleep(200);
        bq.put(strings[i %3]);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(getName() + " | 生产完成：" + bq);
    }
  }
}
class Consumer extends Thread{
  private BlockingQueue<String> bq;
  public Consumer(BlockingQueue<String> bq) {
    this.bq = bq;
  }

  @Override
  public void run() {
    while (true){
      System.out.println(getName() + " | 消费者准备消费集合！");
      try {
        Thread.sleep(200);
        bq.take();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(getName() + " | 消费完成：" + bq);
    }
  }
}