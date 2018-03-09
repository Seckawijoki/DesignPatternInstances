package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/5.
 */
public class DrawTestThree {
  public static void main(String[] args) {
    Account account = new Account("Seckawijoki", 0);
    new DrawThreeThread("取钱者", account, 800).start();
    new DepositThreeThread("存钱者甲", account, 800).start();
    new DepositThreeThread("存钱者乙", account, 800).start();
    new DepositThreeThread("存钱者丙", account, 800).start();
  }
}
class DrawThreeThread extends Thread{
  private Account account;
  private double drawAmount;

  public DrawThreeThread(String name, Account account, double drawAmount) {
    super(name);
    this.account = account;
    this.drawAmount = drawAmount;
  }

  @Override
  public void run() {
    for (int i = 0 ; i < 100 ; ++i){
      account.drawThree(drawAmount);
    }
  }
}
class DepositThreeThread extends Thread {
  private Account account;
  private double depositAmount;
  public DepositThreeThread(String name, Account account, double depositAmount) {
    super(name);
    this.account = account;
    this.depositAmount = depositAmount;
  }

  @Override
  public void run() {
    for (int i = 0 ; i < 100 ; ++i){
      account.depositThree(depositAmount);
    }
  }
}