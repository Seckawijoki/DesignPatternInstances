package com.seckawijoki.javatest.design_patterns.state_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/20.
 */

public class SoldOutState implements GumballMachineState {
  private GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You can't insert a quarter, the machine is sold out.");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You can't eject, you haven't inserted a quarter yet.");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned, but there's no gumballs.");
  }

  @Override
  public void dispense() {
    System.out.println("No gumballs dispensed.");
  }

}
