package com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.store;


import com.seckawijoki.javatest.design_patterns.factory_pattern.Pizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.PizzaStore;
import com.seckawijoki.javatest.design_patterns.factory_pattern.PizzaType;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.ChicagoStyleCheesePizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.ChicagoStyleClamPizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.ChicagoStylePepperoniPizza;
import com.seckawijoki.javatest.design_patterns.factory_pattern.factory_method.pizza.ChicagoStyleVeggiePizza;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */

public class ChicagoStylePizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(int type) {
    Pizza pizza = null;
    switch (type){
      case PizzaType.CHEESE:
        pizza = new ChicagoStyleCheesePizza();break;
      case PizzaType.CLAM:
        pizza = new ChicagoStyleClamPizza();break;
      case PizzaType.PEPPERONI:
        pizza = new ChicagoStylePepperoniPizza();break;
      case PizzaType.VEGGIE:
        pizza = new ChicagoStyleVeggiePizza();break;
    }
    return pizza;
  }
}
