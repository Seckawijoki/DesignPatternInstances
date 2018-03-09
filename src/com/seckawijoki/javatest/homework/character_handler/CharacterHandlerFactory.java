package com.seckawijoki.javatest.homework.character_handler;

/**
 * Created by 灵灯引芒 on 2017/4/18.
 */

public class CharacterHandlerFactory {
  public static ICharacterHandler create(char c){
    switch (c){
      case ' ' : case '\n' : case '\r' :
        return new EmptyHandler();
      case '#':
        return new WellCharacterHandler();
      case '[':case']':
        return new SquareBracketsHandler();
      case '"':
        return new DoubleQuotationHandler();
      case '\'':
        return new SingleQuotationHandler();
      case '+': case '-' : case '&' : case '|' :
      case '<' : case '>' : case '=' :
        return new PairOperatorHandler();
      case '^' : case '?' : case '%' :
      case '!' : case '*': case '(' : case ')' :
        return new LogicalOperatorHandler();
      case ',' : case '{' :  case ':' :
      case '}' : case '.' :  case ';' :
        return new GrammerCharacterHandler();
      case '/' :
        return new SlashHandler();
      default:
        return new DefaultHandler();
    }
  }
}
