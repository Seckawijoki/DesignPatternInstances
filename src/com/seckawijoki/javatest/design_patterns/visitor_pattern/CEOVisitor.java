package com.seckawijoki.javatest.design_patterns.visitor_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2019/8/18 at 22:52.
 */

class CEOVisitor implements Visitor {
  @Override
  public void visit(Engineer engineer) {
    System.out.println("CEOVisitor.visit(): Engineer: " + engineer.mName + ", KPI:" + engineer.mKpi);
  }

  @Override
  public void visit(Manager manager) {
    System.out.println("CEOVisitor.visit(): Manager: " + manager.mName + ", KPI: " + manager.mKpi + ", New products: " + manager.getProducts());
  }
}
