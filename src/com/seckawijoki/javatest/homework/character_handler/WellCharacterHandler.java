package com.seckawijoki.javatest.homework.character_handler;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 灵灯引芒 on 2017/4/18.
 */

class WellCharacterHandler implements ICharacterHandler {
  @Override
  public void handleCharacter(Analyzer analyzer, FileReader input_file, FileWriter output_file, char c) throws IOException {
    String str = "";
    analyzer.output(output_file, "kw", c);
    str = analyzer.getIdentifier_Keyword(input_file, (char) -1);
    if (str.length() > 0) {
      if (analyzer.isKeyword(str)) {
        analyzer.output(output_file, "kw", str);
      } else {
        analyzer.output(output_file, "id", str);
      }
    }
  }
}
