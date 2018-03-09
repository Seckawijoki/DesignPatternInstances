package com.seckawijoki.javatest.design_patterns.composite_pattern;

import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/18.
 */

abstract class MenuComponent {
  private String name;
  private String description;

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  double getPrice() {
    throw new UnsupportedOperationException();
  }

  boolean isVegetarian() {
    throw new UnsupportedOperationException();
  }

  void add(MenuComponent component){
    throw new UnsupportedOperationException();
  }

  void remove(MenuComponent component){
    throw new UnsupportedOperationException();
  }

  MenuComponent get(int index){
    throw new UnsupportedOperationException();
  }

  MenuComponent(String name, String description) {
    this.name = name;
    this.description = description;
  }

  void print(){
    throw new UnsupportedOperationException();
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + ": " + getName()  + "\n   -- " + getDescription();
  }

  abstract Iterator createIterator();
}
