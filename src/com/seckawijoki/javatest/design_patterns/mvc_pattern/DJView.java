package com.seckawijoki.javatest.design_patterns.mvc_pattern;


import javafx.scene.control.ProgressBar;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public class DJView implements BeatObserver, BPMObserver{
  private BeatModelInterface model;
  private ControllerInterface controller;
  private ProgressBar pbBeat;
  public DJView(BeatModelInterface model, ControllerInterface controller) {
    this.model = model;
    this.controller = controller;
    model.registerObserver((BeatObserver) this);
    model.registerObserver((BPMObserver) this);
  }


  public void createViews(){
    //TODO
  }

  @Override
  public void updateBPM() {
    int bpm = model.getBPM();

  }

  @Override
  public void updateBeat() {
    pbBeat.setProgress(model.getBPM());
  }

  public void enableStop(){
  }

  public void disableStop(){
  }

  public void enableStart(){
  }

  public void disableStart(){
  }

}
