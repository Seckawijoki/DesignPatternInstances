package com.seckawijoki.javatest.lisp_to_c;

import java.util.Arrays;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/31.
 */

public class TransformationHomework {
  private static final String[] LISP_EXPRESSIONS ={
          "(add 1 4)",
          "(mul 2 2)",
          "(add 1 (mul 2 2))",
          "(mul (add 1 2) 2)",
          "(mul (add 1 2) (sub 3 2))",
  };
  private static final String[] LISP_JUDGED = {
          "(add 5 3)",
          "(add 5 T)",
          "(gt (add 5 3) (sub 5 3))",
          "(gt (add 5 3) (lt 5 3))",
          "(and T F)",
          "(or (add 5 3) T)",
          "(not T)",
          "(not 5)",
  };
  public static void main(String[] args) {
    TransformationHomework homework = new TransformationHomework();
    //第一题
    for (int i = 0; i < LISP_EXPRESSIONS.length; i++)       System.out.println(homework.lispFunctionTransformedToC(LISP_EXPRESSIONS[i]));
    //第二题
    //for (int i = 0; i < LISP_EXPRESSIONS.length; i++)       System.out.println(homework.calculationOfLispExpression(LISP_EXPRESSIONS[i]));
    //第三题
    //for (int i = 0; i < LISP_JUDGED.length; i++)       System.out.println(homework.judge(LISP_JUDGED[i]));
  }
  
  private String judge(String lispExpression){
    String []expressions = parseExpression(lispExpression);
    LispBinaryTree lispBinaryTree = new LispBinaryTree(expressions);
    System.out.println(lispExpression);
    return           lispBinaryTree.judge();
  }

  private int calculationOfLispExpression(String lispExpression){
    String []expressions = parseExpression(lispExpression);
    LispBinaryTree lispBinaryTree = new LispBinaryTree(expressions);
    System.out.println(lispExpression);
    return lispBinaryTree.calculate();
  }

  private String lispFunctionTransformedToC(String lispExpression){
    String []expressions = parseExpression(lispExpression);
    System.out.println(Arrays.toString(expressions));
    LispBinaryTree lispBinaryTree = new LispBinaryTree(expressions);
    System.out.println(lispExpression);
    return lispBinaryTree.toCExpression();
  }

  private String[] parseExpression(String expression){
    expression = expression.replace("(", "");
    expression = expression.replace(")", "");
    return expression.split(" ");
  }
}
