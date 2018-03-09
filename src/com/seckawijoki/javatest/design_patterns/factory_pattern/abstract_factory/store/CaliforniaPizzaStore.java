package com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.store;


import com.seckawijoki.javatest.design_patterns.factory_pattern.Pizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.PizzaStore;
import com.seckawijoki.javatest.design_patterns.factory_pattern.PizzaType;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.factory.CaliforniaPizzaIngredientFactory;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.factory.PizzaIngredientFactory;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.pizza.CheesePizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.pizza.ClamsPizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.pizza.PepperoniPizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.pizza.VeggiesPizza;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class CaliforniaPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(int type) {
    Pizza pizza;
    PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
    switch (type){
      default:
      case PizzaType.CHEESE:
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("California Style Cheese Pizza");
        break;
      case PizzaType.VEGGIE:
        pizza = new VeggiesPizza(ingredientFactory);
        pizza.setName("California Style Veggies Pizza");
        break;
      case PizzaType.CLAM:
        pizza = new ClamsPizza(ingredientFactory);
        pizza.setName("California Style Clams Pizza");
        break;
      case PizzaType.PEPPERONI:
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("California Style Pepperoni Pizza");
        break;
    }
    return pizza;
  }
}
