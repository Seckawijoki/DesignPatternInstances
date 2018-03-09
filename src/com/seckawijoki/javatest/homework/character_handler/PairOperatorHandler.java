package com.seckawijoki.javatest.homework.character_handler;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 灵灯引芒 on 2017/4/18.
 */

public class PairOperatorHandler implements ICharacterHandler {
  @Override
  public void handleCharacter(Analyzer analyzer,
                              FileReader input_file,
                              FileWriter output_file,
                              char ch)
      throws IOException {
    String str = "";
    int pair = input_file.read();
    if (pair == ch){
      str += ch;
      str += pair;
      analyzer.output(output_file, "op", str);
    } else {
      analyzer.output(output_file, "op", ch);
    }
  }
}
