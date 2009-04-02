package jetbrains.mps.baseLanguage.collections.unittest.simple_operations;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Test;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import junit.framework.Assert;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class Contains_Test extends TestCase {

  @Test()
  public void test_test1() throws Exception {
    Iterable<Integer> intS = Sequence.fromClosure(new ISequenceClosure <Integer>() {

      public Iterable<Integer> iterable() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this.__CP__ = 3;
                      this.yield(10);
                      return true;
                    case 3:
                      this.__CP__ = 4;
                      this.yield(20);
                      return true;
                    case 4:
                      this.__CP__ = 1;
                      this.yield((Integer)30);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    default:
                      break __loop__;
                  }
                } while(true);
                return false;
              }
            };
          }
        };
      }
    });
    Assert.assertTrue(Sequence.fromIterable(intS).contains(10));
    Assert.assertFalse(Sequence.fromIterable(intS).contains(15));
  }

  @Test()
  public void test_test2() throws Exception {
    List<Integer> intL = ListSequence.<Integer>fromArray(10, 20, 30);
    Assert.assertTrue(ListSequence.fromList(intL).contains(10));
    Assert.assertFalse(ListSequence.fromList(intL).contains(15));
    //     null test
    intL = null;
    Assert.assertFalse(ListSequence.fromList(intL).contains(15));
  }

}
