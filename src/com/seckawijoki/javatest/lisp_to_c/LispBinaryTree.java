package com.seckawijoki.javatest.lisp_to_c;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/7.
 */

public class LispBinaryTree {
  private Node root = null;
  private String[] strings;
  private int position = 0;

  LispBinaryTree(String[] strings) {
    this.strings = strings;
    root = createTree();
  }

  private Node createTree() {
    if (position >= strings.length) return null;
    Node node = null;
    if (strings[position].matches("[0-9]*")) {
      node = new Node();
      node.digit = Integer.valueOf(strings[position]);
      node.type = Integer.class;
      node.operation = null;
    } else if (LispToC_Utils.isOperation(strings[position])) {
      node = new Node();
      node.type = Operation.class;
      node.operation = strings[position];
      ++position;      node.leftChild = createTree();
      if (node.operation.equals(Operation.NOT)){
        //布尔值的保存
        node.rightChild = null;
      } else {
        ++position;        node.rightChild = createTree();
      }
    } else if (strings[position].equals("T") || strings[position].equals("F")) {
      //布尔值的保存
      node = new Node();
      node.type = Boolean.class;
      node.bool = strings[position].equals("T");
      ++position;      node.leftChild = createTree();
      ++position;      node.rightChild = createTree();
    }
    return node;
  }

  private String preOrder(Node node) {
    if (node == null) return "";
    StringBuilder stringBuilder = new StringBuilder();
    if (node.type == Integer.class) {
      stringBuilder.append(node.digit);
    } else if (node.type == Boolean.class){
      stringBuilder.append(node.bool ? 'T' : 'F');
    } else if (node.type == Operation.class){
      stringBuilder.append(node.operation);
    } else {
      stringBuilder.append("error");
    }
    stringBuilder.append(' ');
    stringBuilder.append(preOrder(node.leftChild));
    stringBuilder.append(preOrder(node.rightChild));
    return stringBuilder.toString();
  }

  private int calculate(Node node) {
    if (node.type == Integer.class) return node.digit;
    int left = calculate(node.leftChild);
    int right = calculate(node.rightChild);
    return LispToC_Utils.calculate(node.operation, left, right);
  }

  private Class judge(Node node) {
    Class left, right;
    if (node == null) return null;
    if (node.type == Integer.class || node.type == Boolean.class) {
      return node.type;
    }  else {
      left = judge(node.leftChild);
      right = judge(node.rightChild);
      if (left == Exception.class || right == Exception.class)
        return Exception.class;
      if (node.type == Operation.class)
        return LispToC_Utils.judge(node.operation, left, right);
    }
    return Exception.class;
  }

  @Override
  public String toString() {
    return preOrder(root);
  }

  int calculate() {
    return calculate(root);
  }

  private String preOrderForCExpression(Node node) {
    if (node == null) return "";
    StringBuilder stringBuilder = new StringBuilder();
    if (node.type == Integer.class) {
      stringBuilder.append(node.digit);
    } else if (node.type == Boolean.class){
      stringBuilder.append(node.bool ? 'T' : 'F');
    } else if (node.type == Operation.class){
      stringBuilder.append(node.operation);
      stringBuilder.append('(');
    } else {
      stringBuilder.append("error");
    }
    stringBuilder.append(preOrderForCExpression(node.leftChild));
    String right = preOrderForCExpression(node.rightChild);
    if (!right.equals("")) {
      stringBuilder.append(',');
      stringBuilder.append(right);
    }
    if (node.type == Operation.class)
      stringBuilder.append(')');
    return stringBuilder.toString();
  }

  String toCExpression(){
    return preOrderForCExpression(root);
  }

  String judge() {
    Class judgment = judge(root);
    if (judgment == Boolean.class) return "bool";
    if (judgment == Integer.class) return "int";
    return "error";
  }

  class Node {
    Node leftChild = null;
    Node rightChild = null;
    String operation = null;
    int digit = Integer.MIN_VALUE;
    boolean bool;
    Class type;
  }
}
