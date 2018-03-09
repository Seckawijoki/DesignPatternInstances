package com.seckawijoki.javatest;

import com.seckawijoki.javatest.constants.MoJiReTsu;
import com.seckawijoki.javatest.constants.ServerPath;

import java.io.File;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/24.
 */

public class JAVA_TEST {
  private JAVA_TEST(){
    postFileTest();
  }
  private void postFileTest(){
//    String filePath = "d:\\sh000001.gif";
//    String filePath = "F:\\Java关系图片\\JVM.png";
    String filePath = "F:\\Java关系图片\\Throwable.jpg";
    String userId = "1";
    File file = new File(filePath);
    String postfix = filePath.substring(1 + filePath.lastIndexOf("."));
    System.out.println("JAVA_TEST.postFileTest(): file = " + file);
    RequestBody fileBody = RequestBody.create(MediaType.parse("image/*"), file);
    System.out.println("JAVA_TEST.postFileTest(): fileBody = " + fileBody);
    RequestBody requestBody = new MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart(MoJiReTsu.USER_ID, userId)
            .addFormDataPart(
                    "portrait_user" + userId,
                    "portrait_user" + userId + "." + postfix,
                    fileBody)
            .build();
    System.out.println("JAVA_TEST.postFileTest(): requestBody = " + requestBody);
    Request request = new Request.Builder()
            .url(ServerPath.UPLOAD_USER_PORTRAIT)
            .post(requestBody)
            .build();
    System.out.println("JAVA_TEST.postFileTest(): request = " + request);
    try {
      Response response = new OkHttpClient().newCall(request).execute();
      String result = response.body().string();
      System.out.println("JAVA_TEST.postFileTest(): result = " + result);
    } catch ( IOException e ) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    new  JAVA_TEST();
  }

}
