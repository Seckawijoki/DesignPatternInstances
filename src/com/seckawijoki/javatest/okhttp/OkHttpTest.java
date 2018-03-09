package com.seckawijoki.javatest.okhttp;

import com.zhy.http.okhttp.OkHttpUtils;

import java.io.File;
import java.io.IOException;

import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/16.
 */

public class OkHttpTest {
  private static final String Github_HongyangAndroid = "https://github.com/hongyangAndroid";
  private static final String BAIDU = "http://www.baidu.com";
  private static final String LOCALHOST = "http://172.29.25.79:8080/";
  private static final String ROUNDS_APP = "http://www.roundsapp.com/post";
  private OkHttpClient okHttpClient = new OkHttpClient();
  public static void main(String[] args) throws IOException {
    OkHttpTest test = new OkHttpTest();
    test.httpGet(LOCALHOST);
//    test.httpPost(ROUNDS_APP);
//    test.httpGetUtil(BAIDU);
//    test.httpPostUtil(ROUNDS_APP);
//    test.fileUpload(LOCALHOST);
  }
  private void fileUpload(String url){
    File file = new File("e:\\test.txt");
    RequestBody fileBody = RequestBody.create(MediaType.parse("application/octet-stream"), file);
    RequestBody requestBody = new MultipartBody.Builder()
            .addPart(Headers.of(
                    "Content-Disposition",
                    "form-data; name = \"username\""),
                    RequestBody.create(null, "张鸿洋"))
            .addPart(Headers.of(
                    "Content-Disposition",
                    "form-data; name=\"mFile\";filename=\"wjd.txt\""),fileBody)
            .build();
    Request request = new Request.Builder()
            .url(url)
            .post(requestBody)
            .build();

    okHttpClient.newCall(request).enqueue(new CommonCallback());
  }

  private void httpPostUtil(String url) throws IOException {
    Response response1 = OkHttpUtils
            .postString()
            .mediaType(MediaType.parse("application/json; charset=utf-8"))
            .url(url)
            //TODO
            .content(bowlingJson("Jake", "Jesse"))
            .build()
            .execute();
    System.out.println(response1.body().string());
  }

  private void httpPost(String url) throws IOException {
    RequestBody requestBody =
            RequestBody.create(
                    MediaType.parse("application/json; charset=utf-8"),
                    bowlingJson("Jake", "Jesse"));
    Request request = new Request.Builder()
            .post(requestBody)
            .url(url)
            .build();
    Response response = okHttpClient.newCall(request).execute();
    System.out.println(response.body().string());
  }

  private void httpGetUtil(String url) throws IOException{
    Response response1 = OkHttpUtils
            .get()
            .url(url)
            .build()
            .execute();
    System.out.println(response1.body().string());
  }

  private void httpGet(String url) throws IOException {
    final Request request = new Request.Builder()
            .url(url)
            .build();
    Call call = okHttpClient.newCall(request);
    call.enqueue(new CommonCallback());

    Response response = call.execute();
    System.out.println(response.body().string());
  }

  private String bowlingJson(String player1, String player2) {
    return "{'winCondition':'HIGH_SCORE',"
            + "'name':'Bowling',"
            + "'round':4,"
            + "'lastSaved':1367702411696,"
            + "'dateStarted':1367702378785,"
            + "'players':["
            + "{'name':'" + player1 + "','history':[10,8,6,7,8, 19],'color':-13388315,'total':39},"
            + "{'name':'" + player2 + "','history':[6,10,5,10,10, 20],'color':-48060,'total':41}"
            + "]}";
  }
}
