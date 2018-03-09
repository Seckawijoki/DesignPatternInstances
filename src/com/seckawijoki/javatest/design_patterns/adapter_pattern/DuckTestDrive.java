package com.seckawijoki.javatest.design_patterns.adapter_pattern;

import com.seckawijoki.javatest.design_patterns.adapter_pattern.duck_and_turkey.Duck;
import com.seckawijoki.javatest.design_patterns.adapter_pattern.duck_and_turkey.MallardDuck;
import com.seckawijoki.javatest.design_patterns.adapter_pattern.duck_and_turkey.TurkeyAdapter;
import com.seckawijoki.javatest.design_patterns.adapter_pattern.duck_and_turkey.WildTurkey;
import com.seckawijoki.javatest.design_patterns.adapter_pattern.enumeration_iterator.IteratorEnumeration;

import java.util.ArrayList;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

public class DuckTestDrive {
  private static void SimpleAdapterTest(){

    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();

    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    System.out.println("\nThe Turkey says...");
    turkey.gobble();
    turkey.fly();

    System.out.println("\nThe Duck says...");
    duck.quack();
    duck.fly();

    System.out.println("\nThe TurkeyAdapter says...");
    turkeyAdapter.quack();
    turkeyAdapter.fly();
  }
  public static void main(String []args){
    ArrayList<Integer> arrayList = new ArrayList<>();
    IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(arrayList.iterator());
  }
}
