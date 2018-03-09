package com.seckawijoki.javatest.design_patterns.decorator_pattern;

/**
 * Created by 灵灯引芒 on 2017/3/4.
 */

public abstract class Beverage {
  protected String description = "";
  public abstract double cost();
  protected double cupCost(){
    switch (size){
      case TALL:
        return .1;
      default:
      case GRANDE:
        return .15;
      case VENTI:
        return .2;
    }
  }
  private String cupDescription(){
    switch (size){
      case TALL:
       return  "[Tall Cup($0.1)]";
      default:
      case GRANDE:
        return  "[Grande Cup($0.15)]";
      case VENTI:
       return  "[Venti Cup($0.2)]";
    }
  }
  public String getDescription(){
    return String.format(description+ "($%.2f)" + cupDescription(), cost()-cupCost());
  }

  protected int size = GRANDE;
  public static final int TALL = 10;
  public static final int GRANDE = 15;
  public static final int VENTI = 20;
  public int getSize() {
    return size;
  }
  public void setSize(int size) {
    this.size = size;
  }

}
