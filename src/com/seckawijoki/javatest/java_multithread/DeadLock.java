package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/5.
 */

public class DeadLock implements Runnable{
  private AAA aaa = new AAA();
  private BBB bbb = new BBB();
  private void initiate(){
    Thread.currentThread().setName("主线程");
    aaa.foo(bbb);
    System.out.println("进入了主线程后");
  }
  @Override
  public void run() {
    Thread.currentThread().setName("副线程");
    bbb.bar(aaa);
    System.out.println("进入了副线程后");
  }

  public static void main(String[] args) {
    DeadLock deadLock = new DeadLock();
    new Thread(deadLock).start();
    deadLock.initiate();
  }
}
class AAA{
  synchronized void foo(BBB bbb){
    System.out.println("当前线程名：" + Thread.currentThread().getName() + " 进入了AAA实例的foo方法");
    try {
      Thread.sleep(200);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("当前线程名：" + Thread.currentThread().getName() + "企图调用BBB实例的last方法");
    bbb.last();
  }
  synchronized void last(){
    System.out.println("进入了AAA类的last方法内部");
  }
}
class BBB{
synchronized void bar(AAA aaa){
  System.out.println("当前线程名：" + Thread.currentThread().getName() + " 进入了BBB实例的bar方法");
  try {
    Thread.sleep(200);
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
  System.out.println("当前线程名：" + Thread.currentThread().getName() + "企图调用AAA实例的last方法");
  aaa.last();
}
  synchronized void last() {
    System.out.println("进入了BBB类的last方法内部");
  }
}
