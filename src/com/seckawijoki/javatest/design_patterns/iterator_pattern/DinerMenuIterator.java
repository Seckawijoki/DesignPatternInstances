package com.seckawijoki.javatest.design_patterns.iterator_pattern;

import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/17.
 */

public class DinerMenuIterator implements Iterator {
  private MenuItem[] menuItems;
  private int position;

  public DinerMenuIterator(MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    return !(position >= menuItems.length || menuItems[position] == null);
  }

  @Override
  public Object next() {
    return menuItems[position++];
  }
}
