package com.seckawijoki.javatest.design_patterns.compound_pattern.ducks;

import com.seckawijoki.javatest.design_patterns.compound_pattern.Observable;
import com.seckawijoki.javatest.design_patterns.compound_pattern.Observer;
import com.seckawijoki.javatest.design_patterns.compound_pattern.Quackable;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/21.
 */

public class DuckCall implements Quackable {
  private Observable observable;
  public DuckCall() {
    observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("DuckCall: Kwak");
    notifyObservers();
  }

  @Override
  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    observable.notifyObservers();
  }
}
