package com.seckawijoki.javatest.design_patterns.visitor_pattern;

/**
 * Created by 瑶琴频曲羽衣魂 on 2019/8/18 at 22:57.
 */

public class Client {
  public static void main(String[] args) {
    BusinessReport businessReport = new BusinessReport();
    System.out.println("Client.main(): Report to CEO");
    businessReport.showReport(new CEOVisitor());
    System.out.println("Client.main(): Report to CTO");
    businessReport.showReport(new CTOVisitor());
  }
}
