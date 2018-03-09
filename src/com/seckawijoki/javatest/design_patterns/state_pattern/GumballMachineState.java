package com.seckawijoki.javatest.design_patterns.state_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/20.
 */

interface GumballMachineState {
  void insertQuarter();
  void ejectQuarter();
  void turnCrank();
  void dispense();
}
