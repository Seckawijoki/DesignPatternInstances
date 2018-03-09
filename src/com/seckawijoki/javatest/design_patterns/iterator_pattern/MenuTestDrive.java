package com.seckawijoki.javatest.design_patterns.iterator_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/17.
 */

public class MenuTestDrive {
  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }
}
