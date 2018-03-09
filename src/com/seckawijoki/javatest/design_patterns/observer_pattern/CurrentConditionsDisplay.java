package com.seckawijoki.javatest.design_patterns.observer_pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 灵灯引芒 on 2017/3/3.
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement{
  private final Observable observable;
  private double temperature;
  private double humidity;
  CurrentConditionsDisplay(Observable observable){
    this.observable = observable;
    observable.addObserver(this);
  }
  @Override
  public void update(Observable observable, Object data) {
    if (observable instanceof WeatherData){
      WeatherData weatherData = (WeatherData) observable;
      temperature = weatherData.getTemperature();
      humidity = weatherData.getHumidity();
      display();
    }
  }

  @Override
  public void display() {
    System.out.println(
        "Current conditions:" + temperature + "F degrees | " + humidity + "% humidity");
  }
}
