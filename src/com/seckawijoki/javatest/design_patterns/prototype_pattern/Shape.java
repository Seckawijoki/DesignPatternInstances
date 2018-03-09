package com.seckawijoki.javatest.design_patterns.prototype_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/11.
 */

public abstract class Shape implements Cloneable {
  String name;
  int id;
  abstract void draw();
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  int getId(){
    return id;
  }
}
