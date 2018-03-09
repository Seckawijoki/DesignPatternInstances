package com.seckawijoki.javatest.design_patterns.prototype_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/11.
 */

public class PrototypePatternDemo {
  public static void main(String[] args) throws CloneNotSupportedException {
    ShapeCache.loadCache();

    Shape clonedShape = (Shape) ShapeCache.getShape(1);
    System.out.println("Shape : " + clonedShape.getName());

    Shape clonedShape2 = (Shape) ShapeCache.getShape(2);
    System.out.println("Shape : " + clonedShape2.getName());

    Shape clonedShape3 = (Shape) ShapeCache.getShape(3);
    System.out.println("Shape : " + clonedShape3.getName());
  }
}
