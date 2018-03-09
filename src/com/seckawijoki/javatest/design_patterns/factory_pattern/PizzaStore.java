package com.seckawijoki.javatest.design_patterns.factory_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */

public abstract class PizzaStore {
  protected PizzaStore(){}
  Pizza orderPizza(int type){
    Pizza pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
  protected abstract Pizza createPizza(int type);
}
