package com.seckawijoki.javatest.network_programming;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/10.
 */

public class URLDecoderTest {
  public static void main(String[] args) throws UnsupportedEncodingException {
    String keyword = URLDecoder.decode("%B7%E8%BF%F1java", "GBK");
    System.out.println(keyword);
    String urlString = URLEncoder.encode("疯狂Android讲义", "GBK");
    System.out.println(urlString);
  }
}
