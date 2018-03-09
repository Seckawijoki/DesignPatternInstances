package com.seckawijoki.javatest.design_patterns.model_method_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/6.
 */

public class BeverageTest {
  public static void main(String[] args) {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();

    System.out.println("\nMaking tea...");
    tea.prepareRecipe();

    System.out.println("\nMaking coffee...");
    coffee.prepareRecipe();
  }
}
