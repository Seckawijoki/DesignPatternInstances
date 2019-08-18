package com.seckawijoki.javatest.design_patterns.visitor_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2019/8/18 at 22:48.
 */

interface Visitor {
  void visit(Engineer engineer);
  void visit(Manager manager);
}
