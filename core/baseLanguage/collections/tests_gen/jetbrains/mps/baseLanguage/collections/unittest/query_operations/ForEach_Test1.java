package jetbrains.mps.baseLanguage.collections.unittest.query_operations;

/*Generated by MPS */

import junit.framework.TestCase;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import junit.framework.Assert;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.closures.runtime.YieldingIterator;

public class ForEach_Test1 extends TestCase {

  public void test_1() {
    List<Integer> list = ListSequence.<Integer>fromArray(1, 2, 3, 4, 5);
    final Wrappers._int sum = new Wrappers._int(0);
    ListSequence.fromList(list).visitAll(new IVisitor <Integer>() {

      public void visit(Integer i) {
        sum.value = sum.value + i;
      }

    });
    Assert.assertEquals(15, sum.value);
  }

  public void test_2() {
    Iterable<Integer> seq = Sequence.fromClosure(new ISequenceClosure <Integer>() {

      public Iterable<Integer> iterable() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _2_i;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_i = 1;
                    case 3:
                      if (!(this._2_i <= 5)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this._2_i = this._2_i + 1;
                      this.__CP__ = 3;
                      break;
                    case 6:
                      this.__CP__ = 5;
                      this.yield(this._2_i);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 6;
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
    final Wrappers._int sum = new Wrappers._int(0);
    Sequence.fromIterable(seq).visitAll(new IVisitor <Integer>() {

      public void visit(Integer i) {
        sum.value = sum.value + i;
      }

    });
    Assert.assertEquals(15, sum.value);
  }

  public void test_null() {
    Iterable<String> zseq = null;
    final Wrappers._int sum = new Wrappers._int(0);
    Sequence.fromIterable(zseq).visitAll(new IVisitor <String>() {

      public void visit(String s) {
        sum.value = sum.value + s.length();
      }

    });
    Assert.assertEquals(0, sum.value);
  }

}
