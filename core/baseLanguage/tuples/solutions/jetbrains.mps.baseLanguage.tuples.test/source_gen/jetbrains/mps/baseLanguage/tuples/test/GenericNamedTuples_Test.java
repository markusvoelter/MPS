package jetbrains.mps.baseLanguage.tuples.test;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Test;
import junit.framework.Assert;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;

public class GenericNamedTuples_Test extends TestCase {
  @Test
  public void test_pair() throws Exception {
    Pair<String, Integer> pair = new Pair<String, Integer>("abcd", 1);
    Assert.assertEquals("abcd", pair.first());
    Assert.assertSame(1, pair.second());
    pair.assignFrom(new Pair<String, Integer>("dbca", 2));
    Assert.assertEquals("dbca", pair.first());
    Assert.assertSame(2, pair.second());
  }

  @Test
  public void test_pairToIndexedTuple() throws Exception {
    Pair<Integer, String> pair = new Pair<Integer, String>(1, "abc");
    int x;
    String y;
    {
      Tuples._2<Integer, String> _tmp6988_0 = pair;
      x = _tmp6988_0._0();
      y = _tmp6988_0._1();
    }
    Assert.assertSame(1, x);
    Assert.assertEquals("abc", y);
  }

  public Pair<String, String> pairOfStrings() {
    return new Pair<String, String>("X", "Y");
  }
}
