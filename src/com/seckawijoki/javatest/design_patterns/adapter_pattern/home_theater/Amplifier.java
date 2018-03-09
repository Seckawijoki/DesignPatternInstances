package com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

class Amplifier implements SwitchableAppliance{
  private Tuner tuner;
  private DVDPlayer dvdPlayer;
  private CDPlayer cdPlayer;
  static class Builder{
    private Amplifier amplifier;
    Builder(){
      amplifier = new Amplifier();
    }
    Builder setTuner(Tuner tuner){
      amplifier.tuner = tuner;
      return this;
    }
    Builder setCDPlayer(CDPlayer cdPlayer){
      amplifier.cdPlayer = cdPlayer;
      return this;
    }
    Builder setDVDPlayer(DVDPlayer dvdPlayer){
      amplifier.dvdPlayer = dvdPlayer;
      return this;
    }
    Amplifier build(){
      return amplifier;
    }
  }
  public void on(){
    System.out.println("Amplifier turns on");
  }
  public void off(){
    System.out.println("Amplifier turns off");
  }
  void setCd(CDPlayer cd){
    cdPlayer = cd;
    System.out.println("Amplifier is set for CD output.");
  }
  void setDvd(DVDPlayer dvd){
    dvdPlayer = dvd;
    System.out.println("Amplifier is set for DVD output.");
  }
  void setStereoSound(){
    System.out.println("Amplifier is set to stereo sound mode.");
  }
  void setSurroundSound(){
    System.out.println("Amplifier sets to surround sound mode.");
  }
  void setTuner(Tuner tuner){this.tuner = tuner;}
  void setVolume(int volume){
    System.out.println("Amplifier sets volume to " + volume + ".");
  }
}
