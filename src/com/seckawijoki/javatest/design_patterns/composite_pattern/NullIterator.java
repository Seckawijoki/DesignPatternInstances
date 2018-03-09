package com.seckawijoki.javatest.design_patterns.composite_pattern;

import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/19.
 */

public class NullIterator implements Iterator {
  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public Object next() {
    return null;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}
