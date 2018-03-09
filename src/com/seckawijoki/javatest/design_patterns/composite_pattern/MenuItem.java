package com.seckawijoki.javatest.design_patterns.composite_pattern;

import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/18.
 */

final class MenuItem extends MenuComponent{
  private double price;
  private boolean vegetarian;
  MenuItem(String name, String description, boolean vegetarian, double price) {
    super(name, description);
    this.price = price;
    this.vegetarian = vegetarian;
  }

  @Override
  double getPrice() {
    return price;
  }

  @Override
  boolean isVegetarian() {
    return vegetarian;
  }

  @Override
  void print() {
    System.out.print("  "  + getName());
    if (isVegetarian())
      System.out.print("(v)");
    System.out.println(", " + price);
    System.out.println("        -- " + getDescription());
  }

  @Override
  Iterator createIterator() {
    return new NullIterator();
  }

}
