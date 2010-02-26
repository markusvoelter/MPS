package tests;

/*Generated by MPS */

import junit.framework.TestCase;
import java.util.regex.Pattern;
import jetbrains.mps.baseLanguage.regexp.runtime.RegexpOperations;
import junit.framework.Assert;

public class Replace_Test extends TestCase {
  private static Pattern REGEXP_a0a0a0a_0 = Pattern.compile("(\\w+)", 0);

  public void test_replace1() throws Exception {
    String s = RegexpOperations.replace("Manny goes home", REGEXP_a0a0a0a_0, new _Replacer_a0a0a0a(Replace_Test.this, null));
    Assert.assertEquals("<Manny> <goes> <home>", s);
  }
}
