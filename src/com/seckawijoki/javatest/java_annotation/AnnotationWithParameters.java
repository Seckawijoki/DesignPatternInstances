package com.seckawijoki.javatest.java_annotation;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/9.
 */

@interface AnnotationWithParameters {
  String name() default "Seckawijoki";
  int age() default 18;
}
