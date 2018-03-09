package com.seckawijoki.javatest.java_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Seckawijoki on 2017/5/9.
 */

@SuppressWarnings("unchecked")
public class AnnotationTest {
  @AnnotationWithParameters(name = "xx", age = 21)
  public void info(){

  }


  public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
    List<String> stringList = new ArrayList();
    //faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));

    annotationsWithParameters();
  }

  private static void annotationsWithParameters(){
    Class clazz = null;
    try {
      clazz = Class.forName(AnnotationTest.class.getName());
      Method method = clazz.getMethod("info");
      Annotation[] annotations = method.getAnnotations();
      for (Annotation annotation : annotations) {
        System.out.println(annotation);
        if (annotation instanceof AnnotationWithParameters){
          System.out.println("Tag is " + annotation);
          System.out.println("tag.name():" + ((AnnotationWithParameters) annotation).name());
          System.out.println("tag.age():" + ((AnnotationWithParameters) annotation).age());
        }
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
  }

  private static void faultyMethod(List<String>... stringList){
    List[] lists = stringList;
    List<Integer> integerList = new ArrayList<>();
    integerList.add(new Random().nextInt(100));
    lists[0] = integerList;
    String string = String.valueOf(lists[0].get(0));
  }
}
