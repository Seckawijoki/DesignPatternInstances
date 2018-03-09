package com.seckawijoki.javatest.design_patterns.mvc_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public class BeatModel implements BeatModelInterface {
  private List<BeatObserver> beatObserverList = new ArrayList<>();
  private List<BPMObserver> bpmObserverList = new ArrayList<>();
  private int bpm = 90;

  public void beatEvent(){
    notifyBeatObservers();
  }
  @Override
  public void initiate() {

  }

  @Override
  public void on() {

  }

  @Override
  public void off() {

  }

  @Override
  public void setBPM(int bpm) {
    this.bpm = bpm;
    notifyBPMObservers();
  }

  @Override
  public int getBPM() {
    return bpm;
  }

  @Override
  public void registerObserver(BeatObserver observer) {
    beatObserverList.add(observer);
  }

  @Override
  public void removeObserver(BeatObserver observer) {
    beatObserverList.remove(observer);
  }

  @Override
  public void notifyBeatObservers() {
    for (int i = 0; i < beatObserverList.size(); i++) {
      BeatObserver observer = beatObserverList.get(i);
      observer.updateBeat();
    }
  }

  @Override
  public void registerObserver(BPMObserver observer) {
    bpmObserverList.add(observer);
  }

  @Override
  public void removeObserver(BPMObserver observer) {
    bpmObserverList.remove(observer);
  }

  @Override
  public void notifyBPMObservers() {
    for (int i = 0; i < bpmObserverList.size(); i++) {
      BPMObserver observer = bpmObserverList.get(i);
      observer.updateBPM();
    }
  }
}
