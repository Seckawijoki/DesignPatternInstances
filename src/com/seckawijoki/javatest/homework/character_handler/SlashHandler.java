package com.seckawijoki.javatest.homework.character_handler;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.exit;

/**
 * Created by 灵灯引芒 on 2017/4/18.
 */

public class SlashHandler implements ICharacterHandler {
  @Override
  public void handleCharacter(Analyzer analyzer, FileReader input_file, FileWriter output_file, char ch) throws IOException {
    int c = input_file.read();
    if ( c == '/') {					// '//' comment
      for( ; c != -1 && c != '\n'; c = input_file.read()) { }  //omit // comment
    }
    else if (c == '*') {				// /* comment
      int count = 1;
      for( c = input_file.read(); count > 0 && c != -1; c = input_file.read()) {
        if (c == '/') {
          c = input_file.read();
          if (c == '*') ++count;
        }
        else if (c == '*') {
          c = input_file.read();
          if (c == '/') --count;
        }
      }// for
      if (count > 0) {
        exit(1);
      }
    }
    else {								// / operator
      analyzer.output(output_file, "op",  '/');
    }
  }
}
