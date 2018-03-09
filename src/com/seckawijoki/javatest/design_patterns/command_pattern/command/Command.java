package com.seckawijoki.javatest.design_patterns.command_pattern.command;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public interface Command {
  void execute();
  void undo();
  void store();
  void load();
}
