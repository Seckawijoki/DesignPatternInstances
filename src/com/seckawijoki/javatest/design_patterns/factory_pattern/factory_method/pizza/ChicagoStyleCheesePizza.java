package com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */

public class ChicagoStyleCheesePizza extends CheesePizza {
  public ChicagoStyleCheesePizza() {
    name = "Chicago Style Deep Dish Cheese Pizza";

    toppings.add("Shredded MozzarellaCheese Cheese");
  }

  @Override
  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
