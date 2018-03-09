package com.seckawijoki.javatest.homework;


import java.util.ArrayList;

import sun.rmi.runtime.Log;

/**
 * Created by 灵灯引芒 on 2017/4/17.
 */

class Matrix{
  private final static String TAG = "Matrix<Integer>";
  private ArrayList<ArrayList<Integer>> list;
  private int MAX = 3;
  private int row;
  private int column;

  @SuppressWarnings("unchecked")
  Matrix(int row, int column){
    list = new ArrayList<>(row);
    for (int i = 0; i < row; ++i)
      list.add(new ArrayList(column));
    this.row = row;
    this.column = column;
  }

  void log(){
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < list.size(); ++i) {
      ArrayList<Integer> row = list.get(i);
      for (int j = 0; j < row.size(); ++j) {
        sb.append(String.format("%5d", (Integer)row.get(j)));
      }
      sb.append("\n");
    }
  }

  void random(){
    for (int i = 0; i < row; ++i){
      ArrayList<Integer> arrayList = list.get(i);
      for (int j = 0; j < column; ++j){
        arrayList.add((int) (2 * Math.random() * MAX - MAX));
      }
    }
  }

  void insertRow(Integer[] integers, int row){
    ArrayList<Integer> arrayList = new ArrayList<>(integers.length);
    for (int i = 0; i < integers.length; ++i)
      arrayList.add(i, integers[i]);
    list.add(row, arrayList);
    ++this.row;
  }

  void removeRow(int row){
    list.remove(row);
    --this.row;
  }

  void insertColumn(Integer[] integers, int column){
    //TODO
    for (int i = 0; i < list.size(); ++i){
      ArrayList<Integer> arrayList = list.get(i);
      arrayList.add(column, integers[i]);
    }
    ++this.column;
  }

  void removeColumn(int column){
    //TODO
    for (int i = 0; i < list.size(); ++i){
      ArrayList<Integer> arrayList = list.get(i);
      arrayList.remove(column);
    }
    --this.column;
  }

  void rankByColumn(int column){
    for (int i = 0; i < list.size(); ++i) {
      ArrayList<Integer> array1 = list.get(i);
      for (int j = i + 1; j < list.size(); ++j) {
        ArrayList<Integer> array2 = list.get(j);
        if (array1.get(column) > array2.get(column)){
          for (int k = 0; k < array1.size(); ++k){
            int a = array1.get(k);
            int b = array2.get(k);
            a = a + b;
            b = a - b;
            a = a - b;
            array1.set(k, a);
            array2.set(k, b);
          }
        }
      }
    }
  }

  void rankByRow(int row){
    ArrayList<Integer> arrayList = list.get(row);
    for (int i = 0; i < arrayList.size(); ++i){
      for (int j = i+1; j < arrayList.size(); ++j) {
        if (arrayList.get(i) > arrayList.get(j)){
          for (int k = 0; k < list.size(); ++k){
            ArrayList<Integer> array = list.get(k);
            int a = array.get(i);
            int b = array.get(j);
            a = a + b;
            b = a - b;
            a = a - b;
            array.set(i, a);
            array.set(j, b);
          }
        }
      }
    }
  }

  Integer[] queryRow(int row){
    ArrayList<Integer> arrayList = list.get(row);
    Integer[] integers = new Integer[arrayList.size()];
    for (int i = 0; i < arrayList.size(); ++i)
      integers[i] = arrayList.get(i);
    return integers;
  }

  Integer[] queryColumn(int column){
    Integer []integers = new Integer[list.size()];
    for (int i = 0; i < list.size(); ++i){
      integers[i] = list.get(i).get(column);
    }
    return integers;
  }

  void set(int row, int column, int value){
    if (row > list.size()){
      ++this.row;
      list.add(new ArrayList<Integer>());
      row = this.row;
    }
    ArrayList<Integer> arrayList = list.get(row);
    if (column < arrayList.size())
      arrayList.set(column, value);
    else {
      ++this.column;
      arrayList.add(value);
    }
  }

  Integer get(int row, int column){
    return list.get(row).get(column);
  }

  int getRow(){
    return row;
  }

  int getColumn(){
    return column;
  }

  Matrix multiple(Matrix matrix){
    Matrix m = new Matrix(matrix.getRow(), column);
    for (int i = 0; i < matrix.getRow(); ++i){
      for (int j = 0; j < column; ++j) {
        int sum = 0;
        for (int k = 0; k < row; ++k)
          sum += get(k, j) * matrix.get(i, k);
        m.set(i, j, sum);
      }
    }
    return m;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Matrix matrix = new Matrix(row, column);
    matrix.addAll(list);
    return matrix;
  }

  private void addAll(ArrayList<ArrayList<Integer>> list) {
    this.list.addAll(list);
  }
}
