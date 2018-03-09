package com.seckawijoki.javatest.design_patterns.iterator_pattern;

import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/17.
 */

public class DinerMenu {
  private static int MAX_ITEMS = 6;
  private int numberOfItems = 0;
  private MenuItem []menuItems;
  DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];

    addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
    addItem("Hot dog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
  }

  public Iterator createIterator(){
    return  new DinerMenuIterator(menuItems);
  }

  public void addItem(String name, String description, boolean vegetarian, double price){
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfItems > MAX_ITEMS)
      System.err.println("Sorry, menu is full! Can't add item to menu!");
    else
      menuItems[numberOfItems++] = menuItem;
  }
}
