package com.seckawijoki.javatest.design_patterns.command_pattern;


import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.CeilingFan;
import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.GarageDoor;
import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.HotTub;
import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.Light;
import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.Stereo;
import com.seckawijoki.javatest.design_patterns.command_pattern.appliance.TV;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.CeilingFanHighCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.CeilingFanMediumCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.CeilingFanOffCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.Command;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.GarageDoorDownCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.GarageDoorUpCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.HotTubOffCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.HotTubOnCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.LightOffCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.LightOnCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.MacroCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.StereoOffCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.StereoOnCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.StereoOnWithCdCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.TVOffCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.command.TVOnCommand;
import com.seckawijoki.javatest.design_patterns.command_pattern.control.RemoteControl;
import com.seckawijoki.javatest.design_patterns.command_pattern.control.SimpleRemoteControl;

import java.util.concurrent.ThreadPoolExecutor;


/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class RemoteControlTest {
  private static void simpleTest(){
    SimpleRemoteControl remoteControl = new SimpleRemoteControl();
    Light light = new Light("Light");
    LightOnCommand lightOn = new LightOnCommand(light);
    GarageDoor garageDoor = new GarageDoor();
    GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);

    remoteControl.setCommand(lightOn);
    remoteControl.buttonBeenPressed();
    remoteControl.setCommand(garageDoorOpen);
    remoteControl.buttonBeenPressed();
  }
  private static void switchableTest(){
    RemoteControl remoteControl = new RemoteControl();
    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    CeilingFan ceilingFan = new CeilingFan("Living Room");
    GarageDoor garageDoor = new GarageDoor();
    Stereo stereo = new Stereo("Living Room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

    CeilingFanHighCommand ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
    GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

    StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
    remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
    remoteControl.setCommand(3, stereoOnWithCd, stereoOff);

    System.out.println(remoteControl);

    for (int i = 0; i < 4; ++i) {
      remoteControl.onButtonBeenPushed(i);
      remoteControl.offButtonBeenPushed(i);
    }
  }
  private static void lightWithUndoTest(){
    RemoteControl remoteControl = new RemoteControl();
    Light livingRoomLight = new Light("Living Room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

    remoteControl.onButtonBeenPushed(0);
    remoteControl.offButtonBeenPushed(0);
    System.out.println(remoteControl);
    System.out.print("--- Undo Control --- ");
    remoteControl.undoButtonBeenPushed();

    remoteControl.offButtonBeenPushed(0);
    remoteControl.onButtonBeenPushed(0);
    System.out.println(remoteControl);
    System.out.print("--- Undo Control --- ");
    remoteControl.undoButtonBeenPushed();
  }

  private static void ceilingFanWithUndoTest(){
    RemoteControl remoteControl = new RemoteControl();

    CeilingFan ceilingFan = new CeilingFan("Living Room");

    CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
    CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
    remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

    remoteControl.onButtonBeenPushed(0);
    remoteControl.offButtonBeenPushed(0);
    System.out.println(remoteControl);
    System.out.print("--- Undo Control --- ");
    remoteControl.undoButtonBeenPushed();

    remoteControl.onButtonBeenPushed(1);
    System.out.println(remoteControl);
    System.out.print("--- Undo Control --- ");
    remoteControl.undoButtonBeenPushed();
  }

  private static  void macroCommandsTest(){
    RemoteControl remoteControl = new RemoteControl();

    Light light = new Light();
    TV tv = new TV();
    Stereo stereo = new Stereo();
    HotTub hotTub = new HotTub();

    LightOnCommand lightOn = new LightOnCommand(light);
    StereoOnCommand stereoOn = new StereoOnCommand(stereo);
    TVOnCommand tvOn = new TVOnCommand(tv);
    HotTubOnCommand hotTubOn = new HotTubOnCommand(hotTub);

    LightOffCommand lightOff = new LightOffCommand(light);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    TVOffCommand tvOff = new TVOffCommand(tv);
    HotTubOffCommand hotTubOff = new HotTubOffCommand(hotTub);

    Command[] partyOn = new Command[]{lightOn, stereoOn, tvOn, hotTubOn};
    Command[] partyOff = new Command[]{lightOff, stereoOff, tvOff, hotTubOff};

    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);

    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

    System.out.println(remoteControl);
    System.out.println("--- Pushing Macro On ---");
    remoteControl.onButtonBeenPushed(0);
    System.out.println("--- Pushing Macro Off ---");
    remoteControl.offButtonBeenPushed(0);
    System.out.println("--- Undo Control ---");
    remoteControl.undoButtonBeenPushed();
  }

  public static void main(String []args){
    //simpleTest();
   //switchableTest();
    //lightWithUndoTest();
    //ceilingFanWithUndoTest();
    macroCommandsTest();

    ThreadPoolExecutor threadPoolExecutor;
  }
}
