package com.seckawijoki.javatest.homework;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 灵灯引芒 on 2017/4/21.
 */

public class Reduction {
  interface Function<T> {
    T apply(T arg1, T arg2);
  }
  static <E> E reduce(E[] es, Function<E> f, E initVal) {
    E[] snapshot;
    synchronized(es) {
      snapshot = (E[]) new Object[es.length];
      for (int i = 0; i < es.length; ++i)
        snapshot[i] = es[i];
    }
    E result = initVal;
    for (E e : es)
      result = f.apply(result, e);
    return result;
  }

  static <E> E reduce(List<E> list, Function<E> f, E initVal) {
    List<E> snapshot;
    Class clazz = String.class;
    synchronized(list) {
      snapshot = new ArrayList<>(list);
    }
    E result = initVal;
    for (E e : snapshot)
      result = f.apply(result, e);
    return result;
  }

  // A few sample functions
  private static final Function<String> CONCAT = new Function<String>() {
    @Override
    public String apply(String arg1, String arg2) {
      return arg1 + arg2;
    }
  };

  private static final Function<Integer> SUM = new Function<Integer>(){
    public Integer apply(Integer i1, Integer i2) {
      return i1 + i2;
    }
  };

  private static final Function<Integer> PRODUCT = new Function<Integer>(){
    public Integer apply(Integer i1, Integer i2) {
      return i1 * i2;
    }
  };

  private static final Function<Integer> MAX = new Function<Integer>(){
    public Integer apply(Integer i1, Integer i2) {
      return Math.max(i1, i2);
    }
  };

  private static final Function<Integer> MIN = new Function<Integer>(){
    public Integer apply(Integer i1, Integer i2) {
      return Math.min(i1, i2);
    }
  };

  public static void main(String[] args) {
    final String TAG = "Reduction";
    List<Integer> intList = Arrays.asList(
        2, 7, 1, 8, 2, 8, 1, 8, 2, 8);
    Integer[] ints = {
        2, 7, 1, 8, 2, 8, 1, 8, 2, 8};

    System.out.println(reduce(ints, SUM, 0));
    System.out.println(reduce(ints, PRODUCT, 1));
    System.out.println(reduce(ints, MAX, Integer.MIN_VALUE));
    System.out.println(reduce(ints, MIN, Integer.MAX_VALUE));

    String []str = {"I ", "am ", "a ", "student."};
    System.out.println(reduce(str, CONCAT, ""));
    /*
    Log.i(TAG, reduce(ints, SUM, 0) + "");
    Log.i(TAG, reduce(ints, PRODUCT, 0) + "");
    Log.i(TAG, reduce(ints, MAX, Integer.MIN_VALUE) + "");
    Log.i(TAG, reduce(ints, MIN, Integer.MAX_VALUE) + "");
*/
    // Reduce intList using each of the above reducers
    System.out.println(reduce(intList, SUM, 0));
    System.out.println(reduce(intList, PRODUCT, 1));
    System.out.println(reduce(intList, MAX, Integer.MIN_VALUE));
    System.out.println(reduce(intList, MIN, Integer.MAX_VALUE));
  }

}