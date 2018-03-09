package com.seckawijoki.javatest.design_patterns.factory_pattern;


import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.store.NYPizzaStore;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.store.ChicagoStylePizzaStore;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.store.NYStylePizzaStore;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */

public class PizzaTestDrive {
  private static void factoryMethod(){
    PizzaStore nyPizzaStore = new NYStylePizzaStore();
    PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

    Pizza pizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Ethan ordered a " + pizza.getName());
    pizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Joel ordered a " + pizza.getName());
  }
  private static void abstractFactory(){
    PizzaStore nyPizzaStore = new NYPizzaStore();
    Pizza pizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
    System.out.println(pizza);
  }
  public static void main(String []args){
    factoryMethod();
    abstractFactory();
  }
}
