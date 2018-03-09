package com.seckawijoki.javatest.design_patterns.state_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/20.
 */

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5);

    System.out.println(gumballMachine);

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);
  }
}
