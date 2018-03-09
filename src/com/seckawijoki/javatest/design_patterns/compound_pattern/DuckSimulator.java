package com.seckawijoki.javatest.design_patterns.compound_pattern;

import com.seckawijoki.javatest.design_patterns.compound_pattern.ducks.Flock;
import com.seckawijoki.javatest.design_patterns.compound_pattern.ducks.QuackCounter;
import com.seckawijoki.javatest.design_patterns.compound_pattern.factories.AbstractDuckFactory;
import com.seckawijoki.javatest.design_patterns.compound_pattern.factories.CounterDuckFactory;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/21.
 */

public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator duckSimulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CounterDuckFactory();
    duckSimulator.simulate(duckFactory);
  }

  private void simulate(AbstractDuckFactory duckFactory) {
    System.out.println("\nDuck Simulator: With Composite - Flocks");

    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = duckFactory.createGoose();
    Flock flockOfDucks = new Flock();

    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();
    Flock flockOfMallards = new Flock();
    flockOfMallards.add(mallardOne, mallardTwo, mallardThree, mallardFour);

    flockOfDucks.add(flockOfMallards);
    flockOfDucks.add(redheadDuck, duckCall, rubberDuck, gooseDuck);
/*
    System.out.println("\nDuck Simulator: Whole Flock Simulation");
    simulate(flockOfDucks);

    System.out.println("\nDuck Simulator: Mallard Flock Simulation");
    simulate(flockOfMallards);
*/

    System.out.println("\nDuck Simulator: With Observers");
    Quackologist quackologist = new Quackologist();
    flockOfDucks.registerObserver(quackologist);
    simulate(flockOfDucks);

    System.out.println("The ducks quack " + QuackCounter.getQuacks() + " times.");
  }

  private void simulate(Quackable... quackableAnimals) {
    for (int i = 0; i < quackableAnimals.length; i++) {
      quackableAnimals[i].quack();
    }
  }
}
