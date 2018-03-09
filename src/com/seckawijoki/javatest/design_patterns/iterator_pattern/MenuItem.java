package com.seckawijoki.javatest.design_patterns.iterator_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/17.
 */

public class MenuItem {
  private String name;
  private String description;
  private boolean vegetarian;

  @Override
  public String toString() {
    return name + ", " + price + " -- " + description;
  }

  public MenuItem(String name, String description, boolean vegetarian, double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

  public double getPrice() {
    return price;
  }

  private double price;
}
