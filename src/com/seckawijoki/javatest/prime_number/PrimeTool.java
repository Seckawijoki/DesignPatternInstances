package com.seckawijoki.javatest.prime_number;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/23.
 */

public class PrimeTool {
  private PrimeTool(){}
  public static boolean isPrime(int digit){
    int sqrt = (int) Math.sqrt(digit);
    if (digit == 0)return false;
    if (digit == 1 || digit == 2)return true;
    if (digit %2 == 0)return false;
    for (int i = 3; i <= sqrt; i += 2)
      if (digit %i == 0)return false;
    return true;
  }
}
