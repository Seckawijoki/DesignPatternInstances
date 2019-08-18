package com.seckawijoki.javatest.design_patterns.visitor_pattern;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 瑶琴频曲羽衣魂 on 2019/8/18 at 22:57.
 */

class BusinessReport {
  List<Staff> mStaffList = new LinkedList<>();

  public BusinessReport() {
    mStaffList.add(new Manager("Wang"));
    mStaffList.add(new Engineer("Shawn.Xiong"));
    mStaffList.add(new Engineer("Kael"));
    mStaffList.add(new Engineer("Chaosssss"));
    mStaffList.add(new Engineer("Tiiiime"));
  }

  public void showReport(Visitor visitor){
    for (int i = 0; i < mStaffList.size(); i++) {
      mStaffList.get(i).accept(visitor);
    }
  }
}
