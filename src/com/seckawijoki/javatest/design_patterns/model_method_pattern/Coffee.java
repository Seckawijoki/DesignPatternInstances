package com.seckawijoki.javatest.design_patterns.model_method_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/6.
 */

public class Coffee extends CaffeineBeverage {
  @Override
  void brew() {
    System.out.println("Dripping coffee through filter.");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding sugar and milk.");
  }

  @Override
  boolean customWantsCondiments() {
    String answer = getUserInput();
    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput(){
    String answer = null;
    System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException e) {
      System.err.println("IO error trying to read your answer.");
    }
    if (answer == null)
      return "no";
    return answer;
  }
}
