package com.seckawijoki.javatest.java_network_programming;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class DigestThread extends Thread implements Callable<byte[]> {
  private String fileName;
  private byte[] digest;
  private DigestThread(String fileName) {
    this.fileName = fileName;
  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    byte[] digest = null;
    String fileName = "D:\\pac.txt";
    DigestThread t = new DigestThread(fileName);
    /*
    FutureTask<byte[]> futureTask = new FutureTask<>(t);
    new Thread(futureTask).start();
    digest = futureTask.get();
    */
    t.start();
    digest = t.getDigest();

    StringBuilder result = new StringBuilder(fileName);
    result.append(": ");
    result.append(new String(digest));
    System.out.println(Thread.currentThread().getName() + result);

  }

  @Override
  public void run() {
    byte[] digest = null;
    try {
      FileInputStream fis = new FileInputStream(fileName);
      MessageDigest sha = MessageDigest.getInstance("SHA-256");
      DigestInputStream dis = new DigestInputStream(fis, sha);
      while (dis.read() != -1);
      dis.close();
      digest = sha.digest();
      this.digest = digest;

      StringBuilder result = new StringBuilder(fileName);
      result.append(": ");
      result.append(new String(digest));
      System.out.println(Thread.currentThread().getName() + result);

    } catch (NoSuchAlgorithmException | IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public byte[] call() throws Exception {
    byte[] digest = null;
    try {
      FileInputStream fis = new FileInputStream(fileName);
      MessageDigest sha = MessageDigest.getInstance("SHA-256");
      DigestInputStream dis = new DigestInputStream(fis, sha);
      while (dis.read() != -1);
      dis.close();
      digest = sha.digest();
      this.digest = digest;

      StringBuilder result = new StringBuilder(fileName);
      result.append(": ");
      result.append(new String(digest));
      System.out.println(Thread.currentThread().getName() + result);
    } catch (NoSuchAlgorithmException | IOException e) {
      e.printStackTrace();
    }
    return digest;
  }

  public byte[] getDigest() {
    return digest;
  }
}
