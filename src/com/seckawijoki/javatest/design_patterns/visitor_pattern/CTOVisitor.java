package com.seckawijoki.javatest.design_patterns.visitor_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2019/8/18 at 22:55.
 */

class CTOVisitor implements Visitor {
  @Override
  public void visit(Engineer engineer) {
    System.out.println("CTOVisitor.visit(): Engineer: " + engineer.mName + ", code functions : " + engineer.getCodeLines());
  }

  @Override
  public void visit(Manager manager) {
    System.out.println("CTOVisitor.visit(): Manager: " + manager.mName + ", product number: " + manager.getProducts());
  }
}
