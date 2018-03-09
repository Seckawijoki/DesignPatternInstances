package com.seckawijoki.javatest.design_patterns.compound_pattern.ducks;

import com.seckawijoki.javatest.design_patterns.compound_pattern.Observer;
import com.seckawijoki.javatest.design_patterns.compound_pattern.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/21.
 */

public class Flock implements Quackable {
  private List<Quackable> duckList = new ArrayList<>();
  public void add(Quackable... quackableAnimals){
    for (int i = 0; i <quackableAnimals.length; i++) {
      duckList.add(quackableAnimals[i]);
    }
  }
  @Override
  public void quack() {
    Iterator iterator = duckList.iterator();
    while (iterator.hasNext() ){
      ((Quackable)iterator.next()).quack();
    }
  }

  @Override
  public void registerObserver(Observer observer) {
    for (int i = 0; i < duckList.size(); i++) {
      Quackable duck = duckList.get(i);
      duck.registerObserver(observer);
    }
  }

  @Override
  public void notifyObservers() {
  }
}
