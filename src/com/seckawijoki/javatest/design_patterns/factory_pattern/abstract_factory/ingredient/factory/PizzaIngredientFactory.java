package com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.factory;

import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.cheese.Cheese;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.clams.Clams;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.dough.Dough;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.pepperoni.Pepperoni;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.sauce.Sauce;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Veggies;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public interface PizzaIngredientFactory {
  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
  Veggies[] createVeggies();
  Pepperoni createPepperoni();
  Clams createClams();
}
