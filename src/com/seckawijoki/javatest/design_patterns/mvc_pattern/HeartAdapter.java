package com.seckawijoki.javatest.design_patterns.mvc_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/22.
 */

public class HeartAdapter implements BeatModelInterface {
  private HeartModelInterface heart;

  public HeartAdapter(HeartModelInterface heart) {
    this.heart = heart;
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

  }

  @Override
  public int getBPM() {
    return heart.getHeartRate();
  }

  @Override
  public void registerObserver(BeatObserver observer) {
    heart.registerObserver(observer);
  }

  @Override
  public void removeObserver(BeatObserver observer) {
    heart.removeObserver(observer);

  }

  @Override
  public void notifyBeatObservers() {
    heart.notifyBeatObservers();

  }

  @Override
  public void registerObserver(BPMObserver observer) {
    heart.registerObserver(observer);

  }

  @Override
  public void removeObserver(BPMObserver observer) {
    heart.removeObserver(observer);

  }

  @Override
  public void notifyBPMObservers() {
    heart.notifyBPMObservers();
  }
}
