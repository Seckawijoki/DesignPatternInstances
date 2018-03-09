package com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.store;


import com.seckawijoki.javatest.design_patterns.factory_pattern.Pizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.PizzaStore;
import com.seckawijoki.javatest.design_patterns.factory_pattern.PizzaType;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.NYStyleCheesePizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.NYStyleClamPizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.NYStylePepperoniPizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.NYStyleVeggiePizza;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */

public class NYStylePizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(int type) {
    Pizza pizza = null;
    switch (type){
      case PizzaType.CHEESE:
        pizza = new NYStyleCheesePizza();break;
      case PizzaType.CLAM:
        pizza = new NYStyleClamPizza();break;
      case PizzaType.PEPPERONI:
        pizza = new NYStylePepperoniPizza();break;
      case PizzaType.VEGGIE:
        pizza = new NYStyleVeggiePizza();break;
    }
    return pizza;
  }
}
