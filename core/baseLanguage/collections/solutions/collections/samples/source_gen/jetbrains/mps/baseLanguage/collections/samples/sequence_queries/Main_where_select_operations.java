package jetbrains.mps.baseLanguage.collections.samples.sequence_queries;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;

/*package*/ class Main_where_select_operations {
  /*package*/ static void main(String[] args) {
    Iterable<Integer> nums = Sequence.fromClosure(new ISequenceClosure<Integer>() {
      public Iterable<Integer> iterable() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
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
                      this._2_i = 0;
                    case 3:
                      if (!(_2_i < 10)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 4;
                      break;
                    case 5:
                      _2_i++;
                      this.__CP__ = 3;
                      break;
                    case 6:
                      this.__CP__ = 5;
                      this.yield(_2_i);
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
    System.out.println("from sequence of 10 numbers,");
    System.out.println("where num is even,");
    System.out.println("produce string");
    final Wrappers._int count = new Wrappers._int(0);
    Iterable<String> strings = Sequence.fromIterable(nums).where(new IWhereFilter<Integer>() {
      public boolean accept(Integer n) {
        return n % 2 == 0;
      }
    }).select(new ISelector<Integer, String>() {
      public String select(Integer n) {
        count.value++;
        return "num:" + n;
      }
    });
    System.out.println("count (before):" + count.value);
    for (String s : Sequence.fromIterable(strings)) {
      System.out.println(s);
    }
    System.out.println("count (after):" + count.value);
  }
}
