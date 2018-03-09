package com.seckawijoki.javatest.design_patterns.state_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/20.
 */

public class SoldState implements GumballMachineState {
  private GumballMachine gumballMachine;
  SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Please wait, we're already giving you a gumball.");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Sorry, you already turned the crank.");
  }

  @Override
  public void turnCrank() {
    System.out.println("Turning twice doesn't get you another gumball.");
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() > 0)
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    else {
      System.out.println("Oops, out of gumballs!");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }
}
