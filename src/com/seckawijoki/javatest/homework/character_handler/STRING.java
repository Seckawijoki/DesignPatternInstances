package com.seckawijoki.javatest.homework.character_handler;

import java.util.EnumSet;
import java.util.Stack;

/**
 * Created by 灵灯引芒 on 2017/4/18.
 */

public enum STRING {
  INCLUDE("include"),
  DEFINE("define"),
  PRAGMA("pragma"),
  USING("using"),
  NAMESPACE("namespace"),
  IF("if"),
  ELSE("else"),
  BOOL("bool"),
  INT("int"),
  CHAR("char");
  private String str;
  STRING(String s) {
    str = s;
  }
  boolean iterateKeyWord(final String str) {
    EnumSet<STRING> enumSet = EnumSet.allOf(STRING.class);
    Stack<Integer> stack;
    return str.equals(INCLUDE.str)
        || str.equals(DEFINE.str)
        || str.equals(PRAGMA.str)
        || str.equals(USING.str)
        || str.equals(NAMESPACE.str)
        || str.equals(IF.str)
        || str.equals(ELSE.str)
        || str.equals(BOOL.str)
        || str.equals(INT.str)
        || str.equals(CHAR.str)
        ;
  }
}
