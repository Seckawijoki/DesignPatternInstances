package com.seckawijoki.javatest.design_patterns.compound_pattern.factories;

import com.seckawijoki.javatest.design_patterns.compound_pattern.Quackable;
import com.seckawijoki.javatest.design_patterns.compound_pattern.ducks.Goose;
import com.seckawijoki.javatest.design_patterns.compound_pattern.ducks.GooseAdapter;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/21.
 */

public abstract class AbstractDuckFactory {
  public abstract Quackable createMallardDuck();
  public abstract Quackable createRedheadDuck();
  public abstract Quackable createDuckCall();
  public abstract Quackable createRubberDuck();
  public Quackable createGoose(){
    return new GooseAdapter(new Goose());
  }
}
