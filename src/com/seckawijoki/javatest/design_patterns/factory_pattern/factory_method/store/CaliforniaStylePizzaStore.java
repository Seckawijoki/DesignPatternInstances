package com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.store;


import com.seckawijoki.javatest.design_patterns.factory_pattern.Pizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.PizzaStore;
import com.seckawijoki.javatest.design_patterns.factory_pattern.PizzaType;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.CaliforniaStyleCheesePizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.CaliforniaStyleClamPizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.CaliforniaStylePepperoniPizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.CaliforniaStyleVeggiePizza;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */

public class CaliforniaStylePizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(int type) {
    Pizza pizza = null;
    switch (type){
      case PizzaType.CHEESE:
        pizza = new CaliforniaStyleCheesePizza();break;
      case PizzaType.CLAM:
        pizza = new CaliforniaStyleClamPizza();break;
      case PizzaType.PEPPERONI:
        pizza = new CaliforniaStylePepperoniPizza();break;
      case PizzaType.VEGGIE:
        pizza = new CaliforniaStyleVeggiePizza();break;
    }
    return pizza;
  }
}
