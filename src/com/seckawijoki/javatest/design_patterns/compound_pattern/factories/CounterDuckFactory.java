package com.seckawijoki.javatest.design_patterns.compound_pattern.factories;

import com.seckawijoki.javatest.design_patterns.compound_pattern.Quackable;
import com.seckawijoki.javatest.design_patterns.compound_pattern.ducks.DuckCall;
import com.seckawijoki.javatest.design_patterns.compound_pattern.ducks.MallardDuck;
import com.seckawijoki.javatest.design_patterns.compound_pattern.ducks.QuackCounter;
import com.seckawijoki.javatest.design_patterns.compound_pattern.ducks.RedheadDuck;
import com.seckawijoki.javatest.design_patterns.compound_pattern.ducks.RubberDuck;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/21.
 */

public class CounterDuckFactory extends AbstractDuckFactory {
  @Override
  public Quackable createMallardDuck() {
    return new QuackCounter(new MallardDuck());
  }

  @Override
  public Quackable createRedheadDuck() {
    return new QuackCounter(new RedheadDuck());
  }

  @Override
  public Quackable createDuckCall() {
    return new QuackCounter(new DuckCall());
  }

  @Override
  public Quackable createRubberDuck() {
    return new QuackCounter(new RubberDuck());
  }
}
