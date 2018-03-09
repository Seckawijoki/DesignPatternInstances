package com.seckawijoki.javatest.lisp_to_c;

import java.lang.String;
import java.lang.Boolean;
import java.util.Arrays;
import java.util.Scanner;

public class LispToC {
  private static boolean isOctNumber(String str) {
    boolean flag = false;
    for (int i = 0, n = str.length(); i < n; i++) {
      char c = str.charAt(i);
      if (c == '0' | c == '1' | c == '2' | c == '3' | c == '4' | c == '5' | c == '6' | c == '7' | c == '8' | c == '9') {
        flag = true;
      }
    }
    return flag;
  }

  private static boolean isOctNumberRex(String str) {
    String validate = "\\d+";
    return str.matches(validate);
  }

  public static void main(String[] args) {
    String str = "( add ( add 1 1 ) ( sub 1 1 ) )";


    String[] str1 = str.split(" ");
    System.out.println(Arrays.toString(str1));

    System.out.println("");

    String[] str2 = new String[str1.length - 2];
    for (int i = 1; i < str1.length - 1; i++) {
      str2[i - 1] = str1[i];
    }
    System.out.println(Arrays.toString(str2));
    int kuohao = 0;
    for (int i = 0; i < str2.length; i++) {
      if (str2[i] == "(") {
        kuohao += 1;
      } else if (str2[i] == ")") {
        kuohao -= 1;
        if (kuohao == 0) {

        }
      } else if (isOctNumberRex(str2[i]) && Boolean.parseBoolean(str2[i])) {

      }
    }
  }
}
