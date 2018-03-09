package com.seckawijoki.javatest.homework.character_handler;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 灵灯引芒 on 2017/4/18.
 */

public class GrammerCharacterHandler implements ICharacterHandler {
  @Override
  public void handleCharacter(Analyzer analyzer, FileReader input_file, FileWriter output_file, char ch) throws IOException {
    analyzer.output(output_file, "pun", ch);
  }
}
