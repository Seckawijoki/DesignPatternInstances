package com.seckawijoki.javatest.java_multithread;

import java.util.Date;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/3.
 */

public class SleepTest {
  public static void main(String[] args) throws InterruptedException {
    for (int i = 0 ; i < 10 ; ++i){
      System.out.println("当前时间：" + new Date());
      Thread.sleep(1000);
    }
  }
}
