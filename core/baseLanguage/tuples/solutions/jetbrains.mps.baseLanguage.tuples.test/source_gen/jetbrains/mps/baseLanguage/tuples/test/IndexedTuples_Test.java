package jetbrains.mps.baseLanguage.tuples.test;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Test;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import junit.framework.Assert;
import jetbrains.mps.baseLanguage.tuples.util.A;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class IndexedTuples_Test extends TestCase {
  @Test
  public void test_empty() throws Exception {
    Tuples._0 empty = MultiTuple.from();
    empty.assign(MultiTuple.from());
    Tuples._0 emptyToo = MultiTuple.empty0().assign(empty);
  }

  @Test
  public void test_creatingAndAssigning() throws Exception {
    Tuples._2<Integer, String> pair = MultiTuple.from(1, "a");
    Assert.assertSame(1, pair._0());
    Assert.assertEquals("a", pair._1());
    Tuples._2<Integer, String> anotherPair = MultiTuple.<Integer, String>empty2().assign(pair);
    Assert.assertFalse(((Object)anotherPair) == ((Object)pair));
    Assert.assertTrue(MultiTuple.eq(anotherPair, pair));
    Assert.assertEquals(pair, anotherPair);
    Assert.assertSame(1, anotherPair._0());
    Assert.assertEquals("a", anotherPair._1());
    pair._0(111);
    pair._1("aaaa");
    Assert.assertSame(1, anotherPair._0());
    Assert.assertEquals("a", anotherPair._1());
    Assert.assertSame(111, pair._0());
    Assert.assertEquals("aaaa", pair._1());
  }

  @Test
  public void test_writeVar() throws Exception {
    int a;
    {
      Tuples._1<Integer> _tmp9717_0 = MultiTuple.from(1);
      a = _tmp9717_0._0();
    }
    Assert.assertSame(1, a);
    char c = 'a';
    {
      Tuples._2<Integer, Character> _tmp9717_1 = MultiTuple.from(2, 'b');
      a = _tmp9717_1._0();
      c = _tmp9717_1._1();
    }
    Assert.assertSame(2, a);
    Assert.assertSame('b', c);
  }

  @Test
  public void test_swapVars() throws Exception {
    String foo = "bar";
    String bar = "foo";
    {
      Tuples._2<String, String> _tmp9717_2 = MultiTuple.from(bar, foo);
      foo = _tmp9717_2._0();
      bar = _tmp9717_2._1();
    }
    Assert.assertEquals("foo", foo);
    Assert.assertEquals("bar", bar);
  }

  @Test
  public void test_multiValueReturn() throws Exception {
    Tuples._2<String, Character> pair = MultiTuple.<String, Character>empty2().assign(this.toTuple("abc", 'd'));
    Assert.assertEquals("abc", pair._0());
    Assert.assertSame('d', pair._1());
  }

  @Test
  public void test_equalsOperator() throws Exception {
    Tuples._2<Integer, Character> tpl1 = MultiTuple.from(1, 'a');
    Tuples._2<Integer, Character> tpl2 = MultiTuple.from(1, 'a');
    Assert.assertTrue(MultiTuple.eq(tpl1, tpl2));
    Assert.assertFalse(!(MultiTuple.eq(tpl1, tpl2)));
    tpl2._0(2);
    tpl1._1('b');
    Assert.assertTrue(!(MultiTuple.eq(tpl1, tpl2)));
    Assert.assertFalse(MultiTuple.eq(tpl1, tpl2));
  }

  @Test
  public void test_mps5466() throws Exception {
    Iterable<Tuples._2<String, Boolean>> seq = A.foo();
    Assert.assertSame(1, Sequence.fromIterable(seq).where(new IWhereFilter<Tuples._2<String, Boolean>>() {
      public boolean accept(Tuples._2<String, Boolean> it) {
        return it._1() != true;
      }
    }).count());
  }

  public Tuples._2<String, Character> toTuple(String s, char c) {
    return MultiTuple.from(s, c);
  }
}
