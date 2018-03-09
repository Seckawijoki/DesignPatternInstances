package com.seckawijoki.javatest.design_patterns.decorator_pattern;


import com.seckawijoki.javatest.design_patterns.decorator_pattern.beverage.DarkRoast;
import com.seckawijoki.javatest.design_patterns.decorator_pattern.beverage.Espresso;
import com.seckawijoki.javatest.design_patterns.decorator_pattern.beverage.HouseBlend;
import com.seckawijoki.javatest.design_patterns.decorator_pattern.condiment_decorator.Mocha;
import com.seckawijoki.javatest.design_patterns.decorator_pattern.condiment_decorator.Soy;
import com.seckawijoki.javatest.design_patterns.decorator_pattern.condiment_decorator.Whip;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/3.
 */

public class StarBuzzCoffee {
  public static void main(String []args){
    Beverage b = new Espresso();
    System.out.println(b.getDescription() + ": $" + b.cost());

    Beverage b1 = new DarkRoast();
    b1 = new Soy(b1);
    b1 = new Mocha(b1);
    b1 = new Mocha(b1);
    b1 = new Whip(b1);
    System.out.println(b1.getDescription() + ": $" + b1.cost());

    Beverage b2 = new HouseBlend();
    b2.setSize(Beverage.VENTI);
    b2 = new Soy(b2);
    b2 = new Mocha(b2);
    b2 = new Whip(b2);
    System.out.println(b2.getDescription() + ": $" + b2.cost());
  }
}
