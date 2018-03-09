package com.seckawijoki.javatest.service_provider;// Simple test program for service provider framework

import java.io.File;

public class Test {
  public static void main(String[] args) {
    // Providers would execute these lines
    Services.registerProvider("txt", TXT_READER_PROVIDER);
    Services.registerProvider("exe", EXE_READER_PROVIDER);
    Services.registerProvider("xml", XML_READER_PROVIDER);

    // Clients would execute these lines
    Service s1 = Services.newInstance("txt");
    Service s2 = Services.newInstance("exe");
    Service s3 = Services.newInstance("xml");
  }

  private static Provider EXE_READER_PROVIDER = new Provider() {
    public Service newService() {
      return new Service() {
        @Override
        public void readFile(File path) {
          //TODO 读exe
        }
      };
    }
  };
  private static Provider TXT_READER_PROVIDER = new Provider() {
    public Service newService() {
      return new Service() {
        @Override
        public void readFile(File path) {
          //TODO 读txt
        }
      };
    }
  };
  private static Provider XML_READER_PROVIDER = new Provider() {
    public Service newService() {
      return new Service() {
        @Override
        public void readFile(File path) {
          //TODO 读xml
        }
      };
    }
  };
}
