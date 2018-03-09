package com.seckawijoki.javatest.design_patterns.command_pattern.control;


import com.seckawijoki.javatest.design_patterns.command_pattern.command.Command;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.EmptyCommand;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class RemoteControl {
  private Command[] onCommands;
  private Command[] offCommands;
  private Command undoCommand;
  public RemoteControl(){
    onCommands = new Command[7];
    offCommands = new Command[7];
    Command emptyCommand = new EmptyCommand();
    for (int i = 0; i < 7; ++i){
      onCommands[i] = emptyCommand;
      offCommands[i] = emptyCommand;
    }
    undoCommand = emptyCommand;
  }

  public void setCommand(int slot, Command on, Command off){
    onCommands[slot] = on;
    offCommands[slot] = off;
  }

  public void onButtonBeenPushed(int slot){
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }

  public void offButtonBeenPushed(int slot){
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }

  public void undoButtonBeenPushed(){
    undoCommand.undo();
  }

  @Override
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("\n------ Remote Control ------\n");
    for (int i = 0; i < onCommands.length; ++i) {
      stringBuffer.append(
              "[slot " + i + "] "
                      + onCommands[i].getClass().getSimpleName() + "     "
                      + offCommands[i].getClass().getSimpleName() + "\n"
      );
    }
    stringBuffer.append("[undo] " + undoCommand.getClass().getSimpleName());
    return stringBuffer.toString();
  }
}
