package com.seckawijoki.javatest.design_patterns.composite_pattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/19.
 */

class CompositeIterator implements Iterator {
  private Stack<Iterator> stack = new Stack<>();

  CompositeIterator(Iterator iterator) {
    stack.push(iterator);
  }

  @Override
  public boolean hasNext() {
    if (stack.isEmpty()) {
      return false;
    } else {
      Iterator iterator = stack.peek();
      if (!iterator.hasNext()) {
        stack.pop();
        return hasNext();
      } else {
        return true;
      }
    }
  }

  @Override
  public Object next() {
    if (hasNext()){
      Iterator iterator = stack.peek();
      MenuComponent menuComponent = (MenuComponent) iterator.next();
      if (menuComponent instanceof Menu) {
        stack.push(menuComponent.createIterator());
      }
      return menuComponent;
    } else {
      return null;
    }
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}
