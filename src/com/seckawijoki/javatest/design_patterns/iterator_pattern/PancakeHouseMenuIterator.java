package com.seckawijoki.javatest.design_patterns.iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/17.
 */

public class PancakeHouseMenuIterator implements Iterator {
  private ArrayList<MenuItem> menuItemList;
  private int position;

  public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItemList) {
    this.menuItemList = menuItemList;
  }

  @Override
  public boolean hasNext() {
    return position < menuItemList.size();
  }

  @Override
  public Object next() {
    return menuItemList.get(position++);
  }
}
