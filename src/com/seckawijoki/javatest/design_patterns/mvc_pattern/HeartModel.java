package com.seckawijoki.javatest.design_patterns.mvc_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public class HeartModel implements HeartModelInterface {
  private List<BeatObserver> beatObserverList = new ArrayList<>();
  private List<BPMObserver> bpmObserverList = new ArrayList<>();
  private int heartRate;
  @Override
  public int getHeartRate() {
return heartRate;
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
