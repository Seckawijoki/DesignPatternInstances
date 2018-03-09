package com.seckawijoki.javatest.homework.character_handler;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import sun.rmi.runtime.Log;

import static java.lang.System.exit;

/**
 * Created by 灵灯引芒 on 2017/4/17.
 */

public class Analyzer {
  public static final String TAG = "cppScanner";
  public boolean isAlpha(char ch) {
    return (ch <='Z' && ch >='A') || (ch <= 'z'&& ch >= 'a') || (ch == '_');
  }
  public boolean isDigital(char ch) {
    return (ch <= '9' && ch >= '0');
  }
  public boolean isAlpha_Digital(char ch) {
    return isAlpha(ch) || isDigital(ch);
  }
  public boolean isKeyword(final String str){
    return STRING.INT.iterateKeyWord(str);
  }
  public String getIdentifier_Keyword(FileReader in, char firstChar) throws IOException {
    String str = "";
    str += firstChar;
    int ch;
    for (ch = in.read(); ch != -1 && (isAlpha_Digital((char) ch) || ch == '-'); ch = in.read()) {
      str += (char)ch;
    }
    return str;
  }
  public String getNumber(FileReader in, char firstDigital) throws IOException {
    String str = "";
    str += firstDigital;
    int ch;
    while((ch = in.read())!= -1 && isDigital((char) ch)) {
      str += (char)ch;
    }
    return str;
  }
  public String getString(FileReader in) throws IOException {
    String str = "";
    int ch = in.read();
    for ( ;ch != -1 && ch != '"'; ch = in.read()) {
      str += ch;
      if (ch == '\\') {
        ch = in.read();
        if (ch != -1)
          str += (char)ch;
      }
    }
    if (ch == -1) {
      exit(1);
    }
    return str;
  }

  public String getChar(FileReader in) throws IOException {
    String str = "";
    int ch = in.read();
    for ( ;ch != -1 && ch != '\''; ch = in.read()) {
      str += ch;
      if (ch == '\\') {
        ch = in.read();
        if (ch != -1)
          str += (char)ch;
      }
    }
    if (ch == -1) {
      exit(1);
    }
    return str;
  }
  private int tupleCount = 0;
  public void output(FileWriter out, final String type, char value) throws IOException {
    if (++tupleCount % 5 == 0) out.write("\n");
    String str = "(" + type + ", " + value + " ) ";
    out.write(str);
  }
  public void output(FileWriter out, final String type, final String value) throws IOException {
    if (++tupleCount % 5 == 0) out.write("\n");
    String str = "(" + type + ", " + value + " ) ";
    out.write(str);
  }

  public void main() throws IOException {
    Analyzer analyzer = new Analyzer();
    File inputFile = new File("a.txt");

    if(!inputFile.exists()){
      return;
    }
    FileReader input_file = new FileReader(inputFile);
    File outputFile = new File("b.txt");
    FileWriter output_file = new FileWriter(outputFile);
    int ch;
    ICharacterHandler handler;
    for( ch = input_file.read(); ch != -1; ch = input_file.read()) {
      handler = CharacterHandlerFactory.create((char) ch);
      handler.handleCharacter(analyzer, input_file, output_file, (char) ch);
    }//for
    input_file.close();
    output_file.close();
  }
}
