package com.seckawijoki.javatest.java_reflection;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/8.
 */

public class ClassLoaderPropTest {
  public static void main(String[] args) throws IOException {
    ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
    System.out.println("系统类加载器：" + systemLoader);
    Enumeration<URL> eml = systemLoader.getResources("");
    while (eml.hasMoreElements())
      System.out.println(eml.nextElement());
    ClassLoader extensionLoader = systemLoader.getParent();
    System.out.println("扩展类加载器：" + extensionLoader);
    System.out.println("扩展类加载器的加载路径：" + System.getProperty("java.ext.dirs"));
    System.out.println("扩展类加载器的parent：" + extensionLoader.getParent());
  }
}
