package com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

class DVDPlayer implements SwitchableAppliance {
  private Amplifier amplifier;
  DVDPlayer(){

  }
  DVDPlayer(Amplifier amplifier){
    this.amplifier = amplifier;
  }
  void setAmplifier(Amplifier amplifier){
    this.amplifier = amplifier;
  }
  @Override
  public void on() {
    amplifier.on();
  }

  @Override
  public void off() {
    amplifier.off();
  }
  void eject(){
    System.out.println("A DVD is being ejected.");
  }
  void pause(){
    System.out.println("DVD player pauses.");
  }
  void play(String movie){
    System.out.println("DVD player plays movie " + movie + ".");
  }
  void stop(){
    System.out.println("DVD play stops playing the movie.");
  }
  void setSurroundAudio(){
    amplifier.setSurroundSound();
  }
  void setTwoChannelAudio(){
    System.out.println("DVD player switches to two channel audio.");
  }
  @Override
  public String toString() {
    return super.toString();
  }
}
