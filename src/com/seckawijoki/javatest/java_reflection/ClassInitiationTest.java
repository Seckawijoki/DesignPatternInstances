package com.seckawijoki.javatest.java_reflection;

import java.lang.reflect.Constructor;

public class ClassInitiationTest {
  static {
    b = 6;
    System.out.println("static initiation code block：b = 6");
  }
  private static int b = 9;
  public static void main(String[] args) {
    System.out.println(ClassInitiation.compileConstant);
    System.out.println(ClassInitiation.toBeCompiledConstant);
    System.out.println(b);

    ClassLoader classLoader = ClassLoader.getSystemClassLoader();
    try {
      Class<?> c1 = classLoader.loadClass(ClassInitiation.class.getName());
      System.out.println("system load class  ClassInitiation");
      Class<?> c2 = Class.forName(ClassInitiation.class.getName());
      Constructor<?> constructor = c2.getConstructor();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
  }
}
