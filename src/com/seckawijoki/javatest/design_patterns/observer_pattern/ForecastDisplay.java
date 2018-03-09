package com.seckawijoki.javatest.design_patterns.observer_pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */

public class ForecastDisplay implements Observer, DisplayElement{
  private final Observable observable;
  private double lastPressure;
  private double currentPressure = 29.92;
  ForecastDisplay(Observable observable){
    this.observable = observable;
    observable.addObserver(this);
  }
  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData){
      WeatherData weatherData = (WeatherData) o;
      lastPressure = currentPressure;
      currentPressure = weatherData.getPressure();
      display();
    }
  }

  @Override
  public void display() {
    System.out.println("lastPressure: " + lastPressure + " | currentPressure: " + currentPressure);
  }
}
