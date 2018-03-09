package com.seckawijoki.javatest.okhttp;



import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/16.
 */

public class CommonCallback implements Callback {
  @Override
  public void onFailure(Call call, IOException e) {
    System.out.println("Fail : " + call);
  }

  @Override
  public void onResponse(Call call, Response response) throws IOException {
    System.out.println("Successful: " + response);
    System.out.println("response.body().string(): " + response.body().string());
  }
}
