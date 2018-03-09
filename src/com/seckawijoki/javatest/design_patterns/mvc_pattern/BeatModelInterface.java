package com.seckawijoki.javatest.design_patterns.mvc_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public interface BeatModelInterface {
  void initiate();
  void on();
  void off();
  void setBPM(int bpm);
  int getBPM();
  void registerObserver(BeatObserver observer);
  void removeObserver(BeatObserver observer);
  void notifyBeatObservers();
  void registerObserver(BPMObserver observer);
  void removeObserver(BPMObserver observer);
  void notifyBPMObservers();
}
