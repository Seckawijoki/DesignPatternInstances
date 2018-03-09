package com.seckawijoki.javatest.design_patterns.state_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/20.
 */

public class GumballMachine {
  private GumballMachineState soldOutState;
  private GumballMachineState noQuarterState;
  private GumballMachineState hasQuarterState;
  private GumballMachineState soldState;
  private GumballMachineState winnerState;
  private GumballMachineState state;

  public void refill(int count) {
    this.count = count;
    state = noQuarterState;
  }

  private int count;

  GumballMachine(int count) {
    this.count = count;
    soldState = new SoldState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldOutState = new SoldOutState(this);
    winnerState = new WinnerState(this);
    state = noQuarterState;
  }

  void insertQuarter(){
    state.insertQuarter();
  }

  void ejectQuarter(){
    state.ejectQuarter();
  }

  void turnCrank(){
    state.turnCrank();
    state.dispense();
  }

  void releaseBall(){
    System.out.println("A gumball comes rolling out the slot...");
    if (count > 0)count -= 1;
  }

  public void setState(GumballMachineState state) {
    this.state = state;
  }

  public int getCount() {
    return count;
  }

  public GumballMachineState getSoldOutState() {
    return soldOutState;
  }

  public GumballMachineState getNoQuarterState() {
    return noQuarterState;
  }

  public GumballMachineState getHasQuarterState() {
    return hasQuarterState;
  }

  public GumballMachineState getSoldState() {
    return soldState;
  }

  public GumballMachineState getWinnerState() {
    return winnerState;
  }

  @Override
  public String toString() {
    return "\nMighty Gumball Inc.\nJava-enabled Standing Gumball Model #2004\nInventory: "
            + count + " gumballs\n" + (count <= 0 ? "Machine is sold out.\n" : "Machine is waiting for quarters.\n") + "";
  }
}
