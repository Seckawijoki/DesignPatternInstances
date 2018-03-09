package com.seckawijoki.javatest.design_patterns.mvc_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public interface ControllerInterface {
  void start();
  void stop();
  void increaseBMP();
  void decreaseBMP();
  void setBPM(int bpm);
}
