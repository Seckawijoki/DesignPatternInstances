package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/5.
 */
public class DrawTestFour {
  public static void main(String[] args) {
    Account account = new Account("Seckawijoki", 0);
    new DrawFourThread("取钱者④", account, 800).start();
    new DepositFourThread("存钱者④甲", account, 800).start();
    new DepositFourThread("存钱者④乙", account, 800).start();
    new DepositFourThread("存钱者④丙", account, 800).start();
  }
}
class DrawFourThread extends Thread{
  private Account account;
  private double drawAmount;

  public DrawFourThread(String name, Account account, double drawAmount) {
    super(name);
    this.account = account;
    this.drawAmount = drawAmount;
  }

  @Override
  public void run() {
    for (int i = 0 ; i < 100 ; ++i){
      account.drawFour(drawAmount);
    }
  }
}
class DepositFourThread extends Thread {
  private Account account;
  private double depositAmount;
  public DepositFourThread(String name, Account account, double depositAmount) {
    super(name);
    this.account = account;
    this.depositAmount = depositAmount;
  }

  @Override
  public void run() {
    for (int i = 0 ; i < 100 ; ++i){
      account.depositFour(depositAmount);
    }
  }
}