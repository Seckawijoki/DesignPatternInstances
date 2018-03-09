package com.seckawijoki.javatest.design_patterns.compound_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public class Observable implements QuackObservable {
  private List<Observer> observerList = new ArrayList<>();
  private QuackObservable duck;

  public Observable(QuackObservable duck) {
    this.duck = duck;
  }

  @Override
  public void registerObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void notifyObservers() {
    Iterator iterator = observerList.iterator();
    while (iterator.hasNext())
      ((Observer)iterator.next()).update(duck);
  }
}
