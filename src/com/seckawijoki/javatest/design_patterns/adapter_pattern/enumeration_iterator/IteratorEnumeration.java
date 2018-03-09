package com.seckawijoki.javatest.design_patterns.adapter_pattern.enumeration_iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class IteratorEnumeration implements Enumeration {
  private Iterator iterator;
  public IteratorEnumeration(Iterator iterator){
    this.iterator = iterator;
  }
  @Override
  public boolean hasMoreElements() {
    return iterator.hasNext();
  }

  @Override
  public Object nextElement() {
    return iterator.next();
  }
}
