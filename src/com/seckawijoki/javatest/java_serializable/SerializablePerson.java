package com.seckawijoki.javatest.java_serializable;

import java.io.*;
import java.util.ArrayList;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 *
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class SerializablePerson
        implements Serializable {
  private String name;
  private transient int age;

  public SerializablePerson(String name, int age) {
    System.out.println("有参数的构造器");
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  private void writeObject(ObjectOutputStream out)
          throws IOException {
    out.writeObject(new StringBuffer(name).reverse());
    out.writeInt(age);
  }

  private void readObject(ObjectInputStream in)
          throws IOException, ClassNotFoundException {
    this.name = ((StringBuffer) in.readObject()).reverse().toString();
    this.age = in.readInt();
  }

  private Object writeReplace() throws ObjectStreamException {
    ArrayList<Object> list = new ArrayList<>();
    list.add(name);
    list.add(age);
    return list;
  }
}