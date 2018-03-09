package com.seckawijoki.javatest.homework;


/**
 * Created by 灵灯引芒 on 2017/4/7.
 */

//第12条：使类和成员的可访问能力最小化
public class Circle implements Comparable{
  private final float x, y;
  private final float radius;

  public Circle(float x, float y, float r){
    this.x = x;
    this.y = y;
    radius = r;
  }

  //第9条：总是要改写toString
  @Override
  public String toString() {
    return "\n圆心：(" + x + ", " + y + ") 半径：" + radius + " | @" + Integer.toHexString(hashCode());
  }
  //第8条：改写equels时总是要改写hashCode
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Circle circle = (Circle) o;

    if (Float.compare(circle.x, x) != 0) return false;
    return Float.compare(circle.radius, radius) == 0;
  }

  //第10条：谨慎地改写clone
  @Override
  protected Object clone(){
    return new Circle(x, y, radius);
  }

  @Override
  public int hashCode() {
    int result = (x != +0.0f ? Float.floatToIntBits(x) : 0);
    result = 31 * result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
    result = 31 * result + (radius != +0.0f ? Float.floatToIntBits(radius) : 0);
    return result;
  }

  //第11条：考虑改写Comparable接口
  @Override
  public int compareTo(Object another) {
    if (another instanceof Circle){
      Circle circle = (Circle) another;
      if (radius < circle.radius)
        return -1;
      else if (radius > circle.radius)
        return 1;
      else
        return 0;
    } else {
      return 0;
    }
  }
}
