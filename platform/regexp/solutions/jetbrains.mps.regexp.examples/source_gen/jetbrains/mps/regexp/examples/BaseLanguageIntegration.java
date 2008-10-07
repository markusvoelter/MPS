package jetbrains.mps.regexp.examples;

/*Generated by MPS */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import jetbrains.mps.baseLanguage.regexp.runtime.RegexpOperations;

/* package */class BaseLanguageIntegration {

  public static void email(String emailToAnalyse) {
    {
      Pattern _pattern_0 = _PrecompiledPatterns.REGEXP2;
      Matcher _matcher_0 = _pattern_0.matcher(emailToAnalyse);
      if (_matcher_0.matches()) {
        System.out.println("User name = " + _matcher_0.group(1));
        System.out.println("Domain = " + _matcher_0.group(2));
      }
    }
  }

  public static void contains(String s) {
    {
      Pattern _pattern_0 = _PrecompiledPatterns.REGEXP3;
      Matcher _matcher_0 = _pattern_0.matcher(s);
      if (_matcher_0.find()) {
        System.out.println(_matcher_0.group(1));
      }
    }
  }

  public static void forEach(String test) {
    {
      Pattern _pattern_0 = _PrecompiledPatterns.REGEXP4;
      Matcher _matcher_0 = _pattern_0.matcher(test);
      while (_matcher_0.find()) {
        System.out.println("number = " + _matcher_0.group(1));
      }
    }
  }

  public static String replaceAll(String s) {
    s = RegexpOperations.replace(s, _PrecompiledPatterns.REGEXP5, new _Replacer0(null, null));
    return s;
  }

  public static void split(String s) {
    for(String st : RegexpOperations.split(s, _PrecompiledPatterns.REGEXP6)) {
      System.out.println("s = " + st);
    }
  }

}
