package com.seckawijoki.javatest.design_patterns.prototype_pattern;

import java.util.Hashtable;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/11.
 */

public class ShapeCache {
  private static Hashtable<Integer, Shape> shapeTable = new Hashtable<>();
  static Shape getShape(int id) throws CloneNotSupportedException {
    Shape shape = shapeTable.get(id);
    return (Shape) shape.clone();
  }
  static void loadCache(){
    Circle circle = new Circle();
    circle.setId(1);
    shapeTable.put(circle.getId(),circle);

    Triangle square = new Triangle();
    square.setId(2);
    shapeTable.put(square.getId(),square);

    Rectangle rectangle = new Rectangle();
    rectangle.setId(3);
    shapeTable.put(rectangle.getId(),rectangle);
  }
}
