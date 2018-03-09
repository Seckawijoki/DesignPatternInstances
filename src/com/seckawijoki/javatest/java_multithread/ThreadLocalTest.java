package com.seckawijoki.javatest.java_multithread;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/6.
 */

public class ThreadLocalTest{
  public static void main(String[] args) {
    Account2 account2= new Account2("初始化");
    new AccountThread(account2, "线程甲").start();
    new AccountThread(account2, "线程乙").start();
  }
}
class Account2 {
  private ThreadLocal<String> name = new ThreadLocal<>();
  Account2(String name){
    this.name.set(name);
    System.out.println("---" + this.name.get());
  }
  String getName(){
    return name.get();
  }
  void setName(String name){
    this.name.set(name);
  }
}
class AccountThread extends Thread{
  private Account2 account2;

  public AccountThread(Account2 account2, String name) {
    super(name);
    this.account2 = account2;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      if ( i == 6 ){
        account2.setName(getName());
      }
      System.out.println(account2.getName() + " | i = " + i);
    }
  }
}
