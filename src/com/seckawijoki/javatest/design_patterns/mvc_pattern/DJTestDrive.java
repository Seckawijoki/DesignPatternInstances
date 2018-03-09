package com.seckawijoki.javatest.design_patterns.mvc_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public class DJTestDrive {
  public static void main(String[] args) {
    BeatModelInterface model = new BeatModel();
    ControllerInterface controller = new BeatController(model);
  }
}
