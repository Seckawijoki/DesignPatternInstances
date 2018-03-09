package com.seckawijoki.javatest.design_patterns.iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/17.
 */

public class PancakeHouseMenu {
  private ArrayList<MenuItem> menuItemList;

  public PancakeHouseMenu() {
    menuItemList = new ArrayList<>();
    addItem("K&B's Pancake Breakfast", "Pancakes wit scrambled eggs, and toast", true, 2.99);
    addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
    addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
  }

  public void addItem(String name, String description, boolean vegetarian, double price){
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItemList.add(menuItem);
  }

  public Iterator createIterator(){
    return  new PancakeHouseMenuIterator(menuItemList);
  }
}
