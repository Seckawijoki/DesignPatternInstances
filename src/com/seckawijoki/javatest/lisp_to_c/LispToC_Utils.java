package com.seckawijoki.javatest.lisp_to_c;


/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/8.
 */

public class LispToC_Utils {
  static Class judge(String operation, Class left, Class right){
    Class judgment = Exception.class;
    if (left != right)return judgment;
    switch (operation){
      case Operation.EQUALS:
      case Operation.GREATER_THAN:
      case Operation.LESS_THAN:
        if (left == Integer.class && right == Integer.class)
          judgment = Boolean.class;
        else
          judgment = Exception.class;
        break;
      case Operation.ADD:
      case Operation.SUB:
      case Operation.MUL:
      case Operation.DIV:
      case Operation.MOD:
        if (left == Integer.class && right == Integer.class)
          judgment = Integer.class;
        else
          judgment = Exception.class;
        break;
      case Operation.NOT:
        if (left == Boolean.class)
          judgment = Boolean.class;
        else
          judgment = Exception.class;
        break;
      case Operation.AND:
      case Operation.OR:
        if (left == Boolean.class && right == Boolean.class)
          judgment = Boolean.class;
        else
          judgment = Exception.class;
        break;
    }
    return judgment;
  }
  static int calculate(String operation,
                       int left, int right){
    switch (operation){
      default:
      case Operation.ADD:
        return left + right;
      case Operation.SUB:
        return left - right;
      case Operation.MUL:
        return left * right;
      case Operation.DIV:
        return left /right;
      case Operation.MOD:
        return left %right;
    }
  }
  static boolean isOperation(String operation){
    return operation.equals(Operation.ADD)
            ||operation.equals(Operation.SUB)
            ||operation.equals(Operation.MUL)
            ||operation.equals(Operation.DIV)
            ||operation.equals(Operation.MOD)
            ||operation.equals(Operation.AND)
            ||operation.equals(Operation.OR)
            ||operation.equals(Operation.EQUALS)
            ||operation.equals(Operation.GREATER_THAN)
            ||operation.equals(Operation.LESS_THAN)
            ||operation.equals(Operation.NOT)
            ;
  }
  private LispToC_Utils(){}
}
