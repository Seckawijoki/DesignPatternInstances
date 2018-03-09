package com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.pizza;

import com.seckawijoki.javatest.design_patterns.factory_pattern.Pizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.factory.PizzaIngredientFactory;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class CheesePizza extends Pizza {
  private PizzaIngredientFactory ingredientFactory;
  public CheesePizza(PizzaIngredientFactory factory){
    ingredientFactory = factory;
  }
  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
  }
}
