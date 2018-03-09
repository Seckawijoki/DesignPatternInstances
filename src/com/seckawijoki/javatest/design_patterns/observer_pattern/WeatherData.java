package com.seckawijoki.javatest.design_patterns.observer_pattern;


import java.util.Observable;

/**
 * Created by 灵灯引芒 on 2017/3/3.
 */

public class WeatherData extends Observable {
  public double getTemperature() {
    return temperature;
  }
  public double getHumidity() {
    return humidity;
  }
  public double getPressure() {
    return pressure;
  }
  private double temperature;
  private double humidity;
  private double pressure;
  public WeatherData(){}
  public void measurementsChanged(){
    setChanged();
    notifyObservers();
    System.out.print('\n');
  }

  /**
   * 一个外部简单调用的方法。
   * 只是为了测试观察者模式启动时的情形。
   * @param t
   * @param h
   * @param p
   */
  void setMeasurements(double t, double h, double p){
    temperature = t;
    humidity = h;
    pressure = p;
    measurementsChanged();
  }
}
