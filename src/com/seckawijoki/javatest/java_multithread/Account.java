package com.seckawijoki.javatest.java_multithread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class Account {
  //使用同步锁的方法
  private final ReentrantLock reentrantLock = new ReentrantLock();
  private String number;
  private double balance;
  //传统的线程通信
  private boolean hasDeposited = false;
  //使用Condition控制线程通信
  private final Lock lock = new ReentrantLock();
  private final Condition condition = lock.newCondition();
  Account(String number, double balance) {
    this.number = number;
    this.balance = balance;
  }

  /**
   * 使用Condition控制线程通信
   * @param depositAmount
   */
  void depositFour(double depositAmount){
    lock.lock();
    try {
      if (hasDeposited){
        condition.await();
      } else {
        System.out.println(Thread.currentThread().getName() + " 存钱：" + depositAmount);
        balance += depositAmount;
        System.out.println("账户余额为：" + balance);
        hasDeposited = false;
        condition.signalAll();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  /**
   * 使用Condition控制线程通信
   * @param drawAmount
   */
  void drawFour(double drawAmount){
    lock.lock();
    try {
      if (!hasDeposited){
        condition.await();
      } else{
        System.out.println(Thread.currentThread().getName() + " 取钱：" + drawAmount);
        balance -= drawAmount;
        System.out.println("账户余额：" + balance);
        hasDeposited = false;
        condition.signalAll();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  /**
   * 传统的线程通信
   * @param depositAmount
   */
  synchronized void depositThree(double depositAmount){
      try {
        if (hasDeposited) {
          wait();
        } else {
          System.out.println(Thread.currentThread().getName() + "存钱：" + depositAmount);
          balance += depositAmount;
          System.out.println("账户余额为：" + balance);
          hasDeposited = true;
          notifyAll();
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
  }

  /**
   * 传统的线程通信
   * @param drawAmount
   */
  synchronized void drawThree(double drawAmount) {
    try {
      if (!hasDeposited){
        wait();
      } else {
          System.out.println(Thread.currentThread().getName() + "取钱：" + drawAmount);
          balance -= drawAmount;
          System.out.println("账户余额为：" + balance);
          hasDeposited = false;
          notifyAll();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  /**
   * 使用同步锁的方法
   * @param drawAmount
   */
  public void drawTwo(double drawAmount) {
    System.out.println("使用同步锁的方法实现同步");
    reentrantLock.lock();
    try {
      if (balance >= drawAmount) {
        System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);
        balance -= drawAmount;        System.out.println("\t 余额为：" + balance);
      } else
        System.out.println(Thread.currentThread().getName() + "取钱失败！余额不足！");
    } finally {    reentrantLock.unlock();    }
  }

  /**
   * 线程安全的一个方法：使用synchronized修饰方法
   * @param drawAmount
   */
  public synchronized void drawOne(double drawAmount) {
    System.out.println("synchronized修饰方法");
    if (balance >= drawAmount) {
      System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);
      balance -= drawAmount;
      System.out.println("\t 余额为：" + balance);
    } else {
      System.out.println(Thread.currentThread().getName() + "取钱失败！余额不足！");
    }
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  @Override
  public int hashCode() {
    return number.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj != null
            && obj.getClass() == Account.class) {
      Account target = (Account) obj;
      return target.getNumber().equals(number);
    }
    return false;
  }
}
