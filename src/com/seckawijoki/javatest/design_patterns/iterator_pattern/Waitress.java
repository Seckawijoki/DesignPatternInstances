package com.seckawijoki.javatest.design_patterns.iterator_pattern;

import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/17.
 */

public class Waitress {
  private PancakeHouseMenu pancakeHouseMenu;
  private DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu(){
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinerIterator = dinerMenu.createIterator();
    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(pancakeIterator);
    System.out.println("\nLUNCH");
    printMenu(dinerIterator);
  }

  private void printMenu(Iterator iterator){
    while (iterator.hasNext()){
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem);
    }
  }
}
