package com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.factory;

import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.cheese.Cheese;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.cheese.MozzarellaCheese;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.clams.Clams;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.clams.FrozenClams;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.dough.Dough;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.dough.ThickCrustDough;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.pepperoni.Pepperoni;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.pepperoni.SlicedPepperoni;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.sauce.PlumTomatoSauce;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.sauce.Sauce;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.BlackOlives;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Eggplant;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Spinach;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Veggies;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClams() {
    return new FrozenClams();
  }
}
