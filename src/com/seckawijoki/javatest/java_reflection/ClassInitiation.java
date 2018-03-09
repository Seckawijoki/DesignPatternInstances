package com.seckawijoki.javatest.java_reflection;

class ClassInitiation {
  static int staticInt = 6;
  static final String compileConstant = "final constant";
  static final String toBeCompiledConstant = System.currentTimeMillis() + "";
  static {
    System.out.println("Class ClassInitiation static initiation code block");
    staticInt = 10;
  }
}


