package com.seckawijoki.javatest.design_patterns.state_pattern.light;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/21.
 */

public class Light {

  private LightState offState, onState;
  private LightState lightState;
  Light(){
    offState = new LightOffState(this);
    onState = new LightOnState(this);
    lightState = offState;
  }

  void turnOn(){
    lightState.handleSwitch();
  }

  void turnOff(){
    lightState.handleSwitch();
  }

  void setLightState(LightState lightState) {
    this.lightState = lightState;
  }

  LightState getOnState() {
    return onState;
  }

  LightState getOffState() {
    return offState;
  }
}
