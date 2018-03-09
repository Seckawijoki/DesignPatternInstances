package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class DrawOneThread extends Thread{
  private Account account;
  private double drawAmount;

  public DrawOneThread(String name, Account account, double drawAmount) {
    super(name);
    this.account = account;
    this.drawAmount = drawAmount;
  }

  @Override  public void run() {
    account.drawTwo(drawAmount);
    /*
    synchronized (account) {
      if (account.getBalance() >= drawAmount) {
        System.out.println(getName() + " | 取钱成功！吐出钞票：：" + drawAmount);
        account.setBalance(account.getBalance() - drawAmount);
        System.out.println("\t 余额为： " + account.getBalance());
      } else {
        System.out.println(getName() + " | 取钱失败！余额不足！");
      }
    }
    */
  }

  public static void main(String[] args) {
    Account account = new Account("Seckawijoki", 1000);
    new DrawOneThread("甲", account, 800).start();
    new DrawOneThread("乙", account, 800).start();
  }
}
