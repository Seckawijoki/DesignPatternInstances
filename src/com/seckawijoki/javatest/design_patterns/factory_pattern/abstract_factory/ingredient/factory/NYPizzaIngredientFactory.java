package com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.factory;


import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.cheese.Cheese;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.cheese.ReggianoCheese;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.clams.Clams;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.clams.FreshClams;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.dough.Dough;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.dough.ThickCrustDough;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.pepperoni.Pepperoni;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.pepperoni.SlicedPepperoni;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.sauce.MarinaraSauce;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.sauce.Sauce;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Garlic;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Mushroom;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Onion;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.RedPepper;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Veggies;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClams() {
    return new FreshClams();
  }
}
