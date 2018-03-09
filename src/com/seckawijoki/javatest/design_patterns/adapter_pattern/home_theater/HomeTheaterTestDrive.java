package com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class HomeTheaterTestDrive {
  public static void main(String[] args) {
    HomeTheaterFacade homeTheater = new HomeTheaterFacade();
    homeTheater.watchMovie("Raiders of the Lost Ark");
    homeTheater.endMovie();
  }
}
