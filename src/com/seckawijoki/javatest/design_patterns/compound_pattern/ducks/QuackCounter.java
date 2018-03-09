package com.seckawijoki.javatest.design_patterns.compound_pattern.ducks;

import com.seckawijoki.javatest.design_patterns.compound_pattern.Observable;
import com.seckawijoki.javatest.design_patterns.compound_pattern.Observer;
import com.seckawijoki.javatest.design_patterns.compound_pattern.Quackable;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/21.
 */

public class QuackCounter implements Quackable {
  private Quackable duck;
  private static int numberOfDucks;
  private Observable observable;
  public QuackCounter(Quackable duck) {
    this.duck = duck;
    numberOfDucks = 0;
    observable = new Observable(duck);
  }
  public static int getQuacks(){
    return numberOfDucks;
  }
  @Override
  public void quack() {
    duck.quack();
    ++numberOfDucks;
  }

  @Override
  public void registerObserver(Observer observer) {
    duck.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    duck.notifyObservers();
  }
}
