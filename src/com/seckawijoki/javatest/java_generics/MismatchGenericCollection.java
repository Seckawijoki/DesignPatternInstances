package com.seckawijoki.javatest.java_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/19.
 */

public class MismatchGenericCollection {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    List<Number> numberList = new ArrayList<>();
    List list;
    for (int i = 0; i < 5; ++i){
      integerList.add(i);
      numberList.add(i);
    }
    System.out.println(integerList.getClass() == numberList.getClass());
    //numberList = integerList;
    System.out.println(numberList.containsAll(integerList));
    System.out.println(integerList.containsAll(numberList));
  }

}
