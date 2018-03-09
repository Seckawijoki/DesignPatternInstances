package com.seckawijoki.javatest.design_patterns.factory_pattern;


import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.cheese.Cheese;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.clams.Clams;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.dough.Dough;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.pepperoni.Pepperoni;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.sauce.Sauce;
import com.seckawijoki.javatest.design_patterns.factory_pattern.abstract_factory.ingredient.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */
public abstract class Pizza {
  protected String name;
  protected Dough dough;
  protected Sauce sauce;
  protected Veggies[] veggies;
  protected Cheese cheese;
  protected Pepperoni pepperoni;
  protected Clams clams;
  protected List<String> toppings = new ArrayList<>();
  public void prepare(){
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough...");
    System.out.println("Adding sauce...");
    System.out.print("Adding toppings: ");
    for (String topping : toppings)
      System.out.print(topping + ' ');
    System.out.print('\n');
  }
  public void bake(){
    System.out.println("Bake for 25 minutes at 350");
  }
  public void cut(){
    System.out.println("Cutting the pizza into diagonal slices");
  }
  public void box(){
    System.out.println("Place pizza in official PizzaSore box");
  }
  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    StringBuilder stringBuffer = new StringBuilder();
    stringBuffer.append(name);
    stringBuffer.append(":\ndough: ");
    stringBuffer.append(dough.getClass().getSimpleName());
    stringBuffer.append("\nsauce: ");
    stringBuffer.append(sauce.getClass().getSimpleName());
    if (cheese != null) {
      stringBuffer.append("\ncheese: ");
      stringBuffer.append(cheese.getClass().getSimpleName());
    }
    if (veggies != null) {
      stringBuffer.append("\nveggies: ");
      for (Veggies veggie : veggies) {
        stringBuffer.append(veggie.getClass().getSimpleName());
        stringBuffer.append(" ");
      }
    }
    if (clams != null){
      stringBuffer.append("\nclams: ");
      stringBuffer.append(clams.getClass().getSimpleName());
    }
    if (pepperoni != null){
      stringBuffer.append("\npepperoni: ");
      stringBuffer.append(pepperoni.getClass().getSimpleName());
    }
    return stringBuffer.toString();
  }
}
