package com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

class Tuner implements SwitchableAppliance{
  private Amplifier amplifier;
  Tuner(){

  }
  Tuner(Amplifier amplifier){
    this.amplifier = amplifier;
  }
  void setAmplifier(Amplifier amplifier){
    this.amplifier = amplifier;
  }
  public void on(){
    amplifier.on();
  }
  public void off(){
    amplifier.off();
  }
  void setAm(double am){
    System.out.println("Tuner sets AM to " + am + ".");
  }
  void seFm(double fm){
    System.out.println("Tuner sets FM to " + fm + ".");
  }
  void setFrequency(double frequency){
    System.out.println("Tuner sets frequency to " + frequency + ".");
  }
  @Override
  public String toString() {
    return super.toString();
  }
}
