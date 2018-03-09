package com.seckawijoki.javatest.homework.character_handler;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 灵灯引芒 on 2017/4/18.
 */

class DefaultHandler implements ICharacterHandler {
  @Override
  public void handleCharacter(Analyzer analyzer, FileReader input_file, FileWriter output_file, char ch) throws IOException {
    String str;
    if(analyzer.isAlpha(ch)) {						// identifier or keywords
      str = analyzer.getIdentifier_Keyword(input_file, ch);
      if (analyzer.isKeyword(str))
        analyzer.output(output_file, "kw", str);
      else
        analyzer.output(output_file, "id", str);
    }
    else if (analyzer.isDigital(ch)) {
      str = analyzer.getNumber(input_file, ch);
      analyzer.output(output_file, "num", str);
    }
  }
}
