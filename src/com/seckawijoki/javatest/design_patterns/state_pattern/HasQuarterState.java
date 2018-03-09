package com.seckawijoki.javatest.design_patterns.state_pattern;

import java.util.Random;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/20.
 */

public class HasQuarterState implements GumballMachineState {
  private GumballMachine gumballMachine;
  private Random random = new Random(System.currentTimeMillis());
  HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You can't insert another quarter.");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Quarter returned.");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned...");
    int winner = random.nextInt(10);
    if ((winner == 0) && gumballMachine.getCount() > 1){
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
  }

  @Override
  public void dispense() {
    System.out.println("No gumballs dispensed.");
  }
}
