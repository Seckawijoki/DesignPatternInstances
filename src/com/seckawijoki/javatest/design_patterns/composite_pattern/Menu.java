package com.seckawijoki.javatest.design_patterns.composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/18.
 */

final class Menu extends MenuComponent {
  private List<MenuComponent> menuComponentList;

  public Menu(String name, String description) {
    super(name, description);
    menuComponentList = new ArrayList<>();
  }

  @Override
  void print() {
    System.out.print("\n" + getName());
    System.out.println(", " + getDescription());
    System.out.println("----------------");
    for (Object menuComponent : menuComponentList)
      ((MenuComponent) menuComponent).print();
  }

  @Override
  Iterator createIterator() {
    return new CompositeIterator(menuComponentList.iterator());
  }

  @Override
  void add(MenuComponent component){
    menuComponentList.add(component);
  }

  @Override
  void remove(MenuComponent component){
    menuComponentList.remove(component);
  }

  @Override
  MenuComponent get(int index){
    return (MenuComponent) menuComponentList.get(index);
  }

}
