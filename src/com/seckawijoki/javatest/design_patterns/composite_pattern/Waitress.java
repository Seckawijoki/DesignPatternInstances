package com.seckawijoki.javatest.design_patterns.composite_pattern;

import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/18.
 */

public class Waitress {
  private MenuComponent allMenus;

  Waitress(MenuComponent allMenus) {
    this.allMenus = allMenus;
  }
  void printMenu(){
    allMenus.print();
  }
  void printVegetarianMenu(){
    Iterator iterator = allMenus.createIterator();
    System.out.println("\nVEGETARIAN MENU\n-----");
    while (iterator.hasNext()){
      MenuComponent menuComponent = (MenuComponent) iterator.next();
      try {
        if (menuComponent.isVegetarian()){
          menuComponent.print();
        }
      } catch (UnsupportedOperationException e){}
    }
  }
}
