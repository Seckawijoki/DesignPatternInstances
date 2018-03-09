package com.seckawijoki.javatest.design_patterns.observer_pattern;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by 灵灯引芒 on 2017/3/4.
 */

public class StatisticsDisplay implements Observer, DisplayElement {
  private final Observable observable;
  private List<Double> temperatureList = new ArrayList<>();
  private double max = Double.MIN_VALUE;
  private double min = Double.MAX_VALUE;
  StatisticsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  @Override
  public void display() {
    double sum = 0;
    for (Double t : temperatureList){
      sum += t;
    }
    int size = temperatureList.size();
    double average = size == 0 ? 0 : sum/size;
    System.out.println("Avg/Max/Min temperature(unit:°) = " + average + "/" + max + "/" + min);
  }

  @Override
  public void update(Observable observable, Object data) {
    if (observable instanceof WeatherData){
      double temperature = ((WeatherData) observable).getTemperature();
      temperatureList.add(temperature);
      if (max < temperature)max = temperature;
      if (min > temperature)min = temperature;
      display();
    }
  }
}
