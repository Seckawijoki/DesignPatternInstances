package com.seckawijoki.javatest.design_patterns.state_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/20.
 */

public class NoQuarterState implements GumballMachineState {
  private GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You inserted a quarter.");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You haven't insert a quarter.");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned but there's no quarters.");
  }

  @Override
  public void dispense() {
    System.out.println("You need to pay first.");
  }
}
