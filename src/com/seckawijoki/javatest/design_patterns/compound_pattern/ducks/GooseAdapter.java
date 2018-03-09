package com.seckawijoki.javatest.design_patterns.compound_pattern.ducks;


import com.seckawijoki.javatest.design_patterns.compound_pattern.Observable;
import com.seckawijoki.javatest.design_patterns.compound_pattern.Observer;
import com.seckawijoki.javatest.design_patterns.compound_pattern.Quackable;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/21.
 */

public class GooseAdapter implements Quackable {
  private Goose goose;
  private Observable observable;
  public GooseAdapter(Goose goose) {
    this.goose = goose;
    observable = new Observable(this);
  }

  @Override
  public void quack() {
    goose.honk();
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
