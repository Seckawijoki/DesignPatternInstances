package com.seckawijoki.javatest.java_generics;

import java.lang.reflect.Array;
import java.util.EmptyStackException;
import java.util.Vector;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/19.
 */

//由于ensureCapacity和isEmpty这两个方法来自Vector类
//我们直接让我们的Stack继承自Vector
public class Stack<E> extends Vector<E>{
  private E[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;
  public Stack() {
    //创建泛型数组的两个方法
    //elements = new E[DEFAULT_INITIAL_CAPACITY];
    elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    elements = (E[]) Array.newInstance(elements.getClass().getComponentType(), DEFAULT_INITIAL_CAPACITY);
  }
  public void push(E e) {
    //原Vector类中方法ensureCapacity需要传入一个整数（当前容量+1）
    ensureCapacity(size+1);
    elements[size++] = e;
  }
  public E pop() {
    if (size==0)
      throw new EmptyStackException();
    E result = elements[--size];
    elements[size] = null; // Eliminate obsolete reference
    return result;
  }
   // no changes in isEmpty or ensureCapacity

  @Override
  public synchronized String toString() {
    StringBuilder stringBuilder = new StringBuilder("[");
    int i;
    for (i = 0; i < size - 1; i++) {
      stringBuilder.append(elements[i]);
      stringBuilder.append(',');
    }
    stringBuilder.append(elements[i]);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }

  public static void main(String[] args) {
     Stack<Integer> myStack = new Stack<>();
     for (int i = 0; i < 5; i++) {
       myStack.push(i);
     }
     System.out.println(myStack);
   }
}

