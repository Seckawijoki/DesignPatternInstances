package com.seckawijoki.javatest.homework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import sun.rmi.runtime.Log;

/**
 * Created by 灵灯引芒 on 2017/4/7.
 */

public class ObjectObjected<E> {
  private E[] elements;
  private final static String TAG = "";

  @SuppressWarnings("unchecked")
  public ObjectObjected(E element) {
    this.elements = (E[]) new Object[1];
    this.elements[0] = element;
  }

  private void arraysAndGenericsDoNotMixWell() {
    Object[] objects = new Object[5];
    String[] strings = new String[5];
    objects = strings;
    List<Object> objectList = new ArrayList<>();
    List<String> stringList = new ArrayList<>();
    //下面语句将会输出true
    System.out.println(objectList.getClass() == stringList.getClass());
    //objectList = stringList;
  }

  private void arraysAndGenericsDoNotMixWell2() {
    Map map = new HashMap<>();
    map.put(0, 3.14);
    map.put(1, "string");
    map.put(2, Map.class);
    System.out.println(map);
    Map<Integer, Object> map2 = new HashMap();
    map2.putAll(map);
    System.out.println(map2);
  }

  private void fillMatrix(int[][] matrixArrays) {
    for (int i = 0; i < matrixArrays.length; i++) {
      for (int j = 0; j < matrixArrays[i].length; j++) {
        matrixArrays[i][j] = new Random().nextInt(MAX);
      }
    }
  }

  private final int MAX = 10;
  private int MATRIX_SIZE = 64;
  private long startTime, endTime;
  private void MatrixMultiplicationWithArrays() {
    int[][] matrixArrays1, matrixArrays2;
    matrixArrays1 = new int[MATRIX_SIZE][MATRIX_SIZE];
    matrixArrays2 = new int[MATRIX_SIZE][MATRIX_SIZE];
    fillMatrix(matrixArrays1);    fillMatrix(matrixArrays2);
    int[][] result = new int[MATRIX_SIZE][MATRIX_SIZE];
    System.out.print(" | 数组测试：");
    startTime = System.currentTimeMillis();
    for (int i = 0; i < MATRIX_SIZE; i++)
      for (int j = 0; j < MATRIX_SIZE; j++)
        for (int k = 0; k < MATRIX_SIZE; ++k)
          result[i][j] += matrixArrays1[k][i] * matrixArrays2[j][k];
    endTime = System.currentTimeMillis();
    System.out.print(String.format("%8d",endTime - startTime));
  }

  private List<List<Integer>> initiateMatrixList(Class<? extends List> clazz){
    List<List<Integer>> matrixList = null;
    if (clazz == ArrayList.class) {
      matrixList = new ArrayList<>(MATRIX_SIZE);
      for (int i = 0; i < MATRIX_SIZE; i++) {
        matrixList.add(new ArrayList<Integer>(MATRIX_SIZE));
      }
    } else if (clazz == Vector.class){
      matrixList = new Vector<>(MATRIX_SIZE);
      for (int i = 0; i < MATRIX_SIZE; i++) {
        matrixList.add(new Vector<Integer>(MATRIX_SIZE));
      }
    } else if (clazz == LinkedList.class){
      matrixList = new LinkedList<>();
      for (int i = 0; i < MATRIX_SIZE; i++) {
        matrixList.add(new LinkedList<Integer>());
      }
    } else if (clazz == Stack.class){
      matrixList = new Stack<>();
      for (int i = 0; i < MATRIX_SIZE; i++) {
        matrixList.add(new Stack<Integer>());
      }
    }
    return matrixList;
  }

  private void MatrixMultiplicationWithLists(Class<? extends List> clazz) {
    List<List<Integer>>matrixList1 = initiateMatrixList(clazz);
    List<List<Integer>>matrixList2 = initiateMatrixList(clazz);
    List<List<Integer>> result = initiateMatrixList(clazz);
    fillMatrix(matrixList1);   fillMatrix(matrixList2);
    System.out.print(" | " + clazz.getSimpleName() + "测试：");
    startTime = System.currentTimeMillis();
    for (int i = 0; i < MATRIX_SIZE; i++) {
      List row = result.get(i);
      for (int j = 0, sum = 0; j < MATRIX_SIZE; j++) {
        for (int k = 0; k < MATRIX_SIZE; ++k)
          sum += matrixList1.get(k).get(i) * matrixList2.get(j).get(k);
        row.add(sum);
      }
    }
    endTime = System.currentTimeMillis();
    System.out.print(String.format("%8d",endTime - startTime));
  }

  private void fillMatrix(List<List<Integer>> matrixList) {
    for (int i = 0; i < matrixList.size(); i++) {
      List<Integer> arrayList = matrixList.get(i);
      for (int j = 0; j < MATRIX_SIZE; ++j) {
        arrayList.add(new Random().nextInt(MAX));
      }
    }
  }

  public static void main(String[] args) {
    ObjectObjected objectObjected = new ObjectObjected(5);
    for (int i = 1 ; i <= 8; ++i, objectObjected.MATRIX_SIZE <<= 1) {
      System.out.print("\n规模：" + String.format("%8d", objectObjected.MATRIX_SIZE));
      objectObjected.MatrixMultiplicationWithArrays();
      objectObjected.MatrixMultiplicationWithLists(ArrayList.class);
      objectObjected.MatrixMultiplicationWithLists(Vector.class);
      objectObjected.MatrixMultiplicationWithLists(Stack.class);
      if (objectObjected.MATRIX_SIZE < 1000) {
        objectObjected.MatrixMultiplicationWithLists(LinkedList.class);
      }
    }
    CopyOnWriteArrayList copyOnWriteArrayList;
  }

  private <T> void arraysAndGenericsDoNotMixWell3(T[] ts) {
    Integer[][] integers = (Integer[][]) ts;
    System.out.println(integers);
  }

  public static void MatrixTest() {
    Matrix matrix = new Matrix(5, 5);
    matrix.random();
    matrix.log();

    matrix.insertRow(new Integer[]{2, 4, 6, 8, 10}, 4);
    matrix.log();

    matrix.removeRow(1);
    matrix.log();

    matrix.insertColumn(new Integer[]{2, 8, 6, 10, 4}, 2);
    matrix.log();

    matrix.removeColumn(1);
    matrix.log();

    matrix = new Matrix(6, 6);
    matrix.random();
    matrix.log();

    matrix.rankByColumn(0);
    matrix.log();

    matrix.rankByRow(0);
    matrix.log();

    Matrix m1 = new Matrix(3, 5);
    m1.random();
    m1.log();
    Matrix m2 = new Matrix(5, 3);
    m2.random();
    m2.log();
    Matrix m3 = m1.multiple(m2);
    m3.log();

  }

  public static void CirclesTest() {
    final float MAX = 100;

    ArrayList<Circle> circleList = new ArrayList<>();
    for (int i = 0; i < 10; ++i) {
      circleList.add(new Circle
              (getRandom(MAX), getRandom(MAX), getRandom(MAX)));
    }

    Collections.sort(circleList);


    Circle c1 = new Circle(0, 0, 1);
    Circle c2 = new Circle(1, 1, 2);
    Circle c3 = (Circle) c1.clone();
    int compare;
    compare = c1.compareTo(c2);
    compare = c2.compareTo(c1);
    compare = c1.compareTo(c3);
    compare = c3.compareTo(c2);
    compare = c2.compareTo(c3);


    Set<Circle> set1 = new HashSet<>(6);
    Set<Circle> set2 = new HashSet<>(6);
    for (int i = 1; i <= 6; ++i) {
      set1.add(new Circle(i, i, i));
      set2.add(new Circle(i * 2, i * 2, i * 2));
    }
    set1.retainAll(set2);

    HashSet<Circle> hashSet = new HashSet<>();
    for (int i = 0; i < 5; ++i)
      hashSet.add(
              new Circle(getRandom(MAX), getRandom(MAX), getRandom(MAX)));
    HashSet<Circle> clonedHashSet = (HashSet<Circle>) hashSet.clone();

    ArrayList<Circle> arrayList = new ArrayList<>();
    for (int i = 0; i < 5; ++i)
      arrayList.add(
              new Circle(getRandom(MAX), getRandom(MAX), getRandom(MAX)));
    ArrayList<Circle> clonedArrayList = (ArrayList<Circle>) arrayList.clone();
  }

  private static String getCompare(int compare) {
    if (compare == -1) return "<";
    else if (compare == 1) return ">";
    else return "==";
  }

  private static float getRandom(float max) {
    return (float) (Math.random() * max);
  }
}
