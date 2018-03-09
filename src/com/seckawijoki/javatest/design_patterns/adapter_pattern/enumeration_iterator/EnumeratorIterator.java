package com.seckawijoki.javatest.design_patterns.adapter_pattern.enumeration_iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class EnumeratorIterator implements Iterator {
  private Enumeration enumeration;
  public EnumeratorIterator(Enumeration enumeration){
    this.enumeration = enumeration;
  }
  @Override
  public boolean hasNext() {
    return enumeration.hasMoreElements();
  }

  @Override
  public Object next() {
    return enumeration.nextElement();
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}
