package com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

class CDPlayer implements SwitchableAppliance {
  private Amplifier amplifier;
  CDPlayer(){

  }
  CDPlayer(Amplifier amplifier){
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
    System.out.println("A CD is being ejected.");
  }
  void pause(){
    System.out.println("CD player pauses.");
  }
  void play(){
    System.out.println("CD player plays.");
  }
  void stop(){
    System.out.println("CD player stops.");
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
