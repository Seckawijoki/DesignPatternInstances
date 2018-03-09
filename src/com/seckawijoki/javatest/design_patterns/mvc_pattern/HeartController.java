package com.seckawijoki.javatest.design_patterns.mvc_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public class HeartController implements ControllerInterface{
  private HeartModelInterface model;
  private DJView view;

  public HeartController(HeartModelInterface model) {
    this.model = model;
    view = new DJView(new HeartAdapter(model), this);
    view.createViews();
    view.disableStop();
    view.disableStart();
  }

  @Override
  public void start() {

  }

  @Override
  public void stop() {

  }

  @Override
  public void increaseBMP() {

  }

  @Override
  public void decreaseBMP() {

  }

  @Override
  public void setBPM(int bpm) {

  }
}
