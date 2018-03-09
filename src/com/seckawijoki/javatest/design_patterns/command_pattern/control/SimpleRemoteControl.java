package com.seckawijoki.javatest.design_patterns.command_pattern.control;


import com.seckawijoki.javatest.design_patterns.command_pattern.command.Command;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class SimpleRemoteControl {
  private Command slot;
  public SimpleRemoteControl(){}
  public void setCommand(Command command){
    slot = command;
  }
  public void buttonBeenPressed(){
    slot.execute();
  }
}
