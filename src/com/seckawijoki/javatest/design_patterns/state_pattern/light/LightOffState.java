package com.seckawijoki.javatest.design_patterns.state_pattern.light;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/21.
 */

public class LightOffState implements LightState {
  private Light light;
  public LightOffState(Light light) {
    this.light = light;
  }

  @Override
  public void handleSwitch() {
    System.out.println("Light turned on...");
    light.setLightState(light.getOnState());
  }
}
