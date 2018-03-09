package com.seckawijoki.javatest.java_annotation;

public class InheritableTest extends Base{
  public static void main(String[] args) {
    System.out.println(InheritableTest.class.isAnnotationPresent(Inheritable.class));
  }
}
