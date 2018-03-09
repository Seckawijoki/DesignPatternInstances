package com.seckawijoki.javatest.design_patterns.mvc_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public class BeatController implements ControllerInterface {
  private BeatModelInterface model;
  private DJView view;

  public BeatController(BeatModelInterface model) {
    this.model = model;
    view = new DJView(model, this);
    view.createViews();
    view.disableStop();
    view.enableStart();
    model.initiate();
  }

  @Override
  public void start() {
    model.on();
    view.disableStart();
    view.enableStop();
  }

  @Override
  public void stop() {
    model.off();
    view.disableStop();
    view.enableStart();
  }

  @Override
  public void increaseBMP() {
    model.setBPM(model.getBPM() + 1);
  }

  @Override
  public void decreaseBMP() {
    model.setBPM(model.getBPM() - 1);
  }

  @Override
  public void setBPM(int bpm) {
    model.setBPM(bpm);
  }
}
