package com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.factory;


import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.cheese.Cheese;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.cheese.GoatCheese;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.clams.Calamari;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.clams.Clams;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.dough.Dough;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.dough.VeryThinCrustDough;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.pepperoni.Pepperoni;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.pepperoni.SlicedPepperoni;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.sauce.BruschettaSauce;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.sauce.Sauce;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Spinach;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Veggies;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/4.
 */

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory{
  @Override
  public Dough createDough() {
    return new VeryThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new BruschettaSauce();
  }

  @Override
  public Cheese createCheese() {
    return new GoatCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[]{new Spinach()};
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClams() {
    return new Calamari();
  }
}
