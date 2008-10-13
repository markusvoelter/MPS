package sample1;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;

public class TestClosure {

  public static void main(String[] args) {
    _FunctionTypes._void_P0_E0 closure;
    _FunctionTypes._return_P1_E0<? extends Integer, ? super Integer> fib = new _FunctionTypes._return_P1_E0 <Integer, Integer>() {

      public Integer invoke(Integer n) {
        return (n <= 1 ?
          n :
          invoke(n - 1) + invoke(n - 2)
        );
      }

    };
    System.out.println("fib(8)=" + fib.invoke(8));
    System.out.println("fib(9)=" + new _FunctionTypes._return_P1_E0 <Integer, Integer>() {

      public Integer invoke(Integer n) {
        return (n <= 1 ?
          n :
          invoke(n - 1) + invoke(n - 2)
        );
      }

    }.invoke(9));
    int calc = new _FunctionTypes._return_P0_E0 <Integer>() {

      public Integer invoke() {
        return 2 + 2;
      }

    }.invoke();
    System.out.println("2+2=" + calc);
    System.out.println("fact(5)=" + new _FunctionTypes._return_P1_E0 <Integer, Integer>() {

      public Integer invoke(Integer n) {
        int res = 1;
        while (n > 1) {
          res = res * n;
          n = n - 1;
        }
        return res;
      }

    }.invoke(5));
    _FunctionTypes._return_P0_E0<? extends Iterable<Integer>> fun = new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _6_bar;
              private int _3_foo;
              private int _13_bar;
              private int _20_bar;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 6:
                      this._6_bar = 0;
                    case 7:
                      if (!(this._6_bar < 5)) {
                        this.__CP__ = 10;
                        break;
                      }
                      this.__CP__ = 8;
                      break;
                    case 9:
                      this._6_bar = this._6_bar + 2;
                      this.__CP__ = 7;
                      break;
                    case 13:
                      this._13_bar = 6;
                    case 14:
                      if (!(this._13_bar < 13)) {
                        this.__CP__ = 17;
                        break;
                      }
                      this.__CP__ = 15;
                      break;
                    case 16:
                      this._13_bar = this._13_bar + 3;
                      this.__CP__ = 14;
                      break;
                    case 17:
                      this._20_bar = 13;
                    case 21:
                      if (!(this._20_bar < 20)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 22;
                      break;
                    case 23:
                      this._20_bar = this._20_bar + 1;
                      this.__CP__ = 21;
                      break;
                    case 11:
                      this.__CP__ = 12;
                      this.yield((Integer)this._6_bar);
                      return true;
                    case 12:
                      this.__CP__ = 9;
                      this.yield((Integer)this._6_bar + this._3_foo);
                      return true;
                    case 18:
                      this.__CP__ = 19;
                      this.yield((Integer)this._13_bar);
                      return true;
                    case 20:
                      this.__CP__ = 16;
                      this.yield((Integer)this._13_bar + this._3_foo);
                      return true;
                    case 4:
                      this.__CP__ = 5;
                      this.yield((Integer)this._3_foo);
                      return true;
                    case 24:
                      this.__CP__ = 23;
                      this.yield((Integer)this._20_bar);
                      return true;
                    case 19:
                      this.__CP__ = 20;
                      this.yield((Integer)this._13_bar + 1);
                      return true;
                    case 0:
                      this._3_foo = -1;
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this._3_foo = 1;
                      this.__CP__ = 6;
                      break;
                    case 10:
                      this._3_foo = 2;
                      this.__CP__ = 13;
                      break;
                    case 8:
                      this.__CP__ = 11;
                      break;
                    case 15:
                      this.__CP__ = 18;
                      break;
                    case 22:
                      this.__CP__ = 24;
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

    };
    Iterable<Integer> seq = fun.invoke();
    for(int i : seq) {
      System.out.println("yielded: " + i);
    }
    seq = new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _2_i;
              private int _6_j;

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
                      if (!(this._2_i < 10)) {
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
                      this._6_j = 2;
                    case 7:
                      if (!(this._6_j < 5)) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 8;
                      break;
                    case 9:
                      this._6_j = this._6_j + 1;
                      this.__CP__ = 7;
                      break;
                    case 10:
                      if (this._2_i % this._6_j == 0) {
                        this.__CP__ = 11;
                        break;
                      }
                      this.__CP__ = 9;
                      break;
                    case 12:
                      this.__CP__ = 9;
                      this.yield((Integer)this._2_i * this._6_j);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 6;
                      break;
                    case 8:
                      this.__CP__ = 10;
                      break;
                    case 11:
                      this.__CP__ = 12;
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

    }.invoke();
    for(int i : seq) {
      System.out.println("yielded: " + i);
    }
    seq = new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _3_i;
              private int _7_j;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 4:
                      if (this._3_i > 0) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 9:
                      if (this._7_j > 0) {
                        this.__CP__ = 8;
                        break;
                      }
                      this.__CP__ = 10;
                      break;
                    case 11:
                      this.__CP__ = 12;
                      this.yield((Integer)this._3_i * this._7_j);
                      return true;
                    case 0:
                      this._3_i = 3;
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this._7_j = 3;
                      this.__CP__ = 8;
                      break;
                    case 10:
                      this._3_i = this._3_i - 1;
                      this.__CP__ = 4;
                      break;
                    case 8:
                      this.__CP__ = 11;
                      break;
                    case 12:
                      this._7_j = this._7_j - 1;
                      this.__CP__ = 9;
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

    }.invoke();
    for(int i : seq) {
      System.out.println("yielded: " + i);
    }
    final Iterable<Integer> si = new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
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
                      this._2_i = 0;
                    case 3:
                      if (!(this._2_i < 5)) {
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
                      this.yield((Integer)this._2_i);
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

    }.invoke();
    for(int i : new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private Integer _2_i;
              private Iterator<Integer> _2_i_it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_i_it = si.iterator();
                    case 3:
                      if (!(this._2_i_it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2_i = this._2_i_it.next();
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 3;
                      this.yield((Integer)this._2_i);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 5;
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

    }.invoke()) {
      System.out.println("i=" + i);
    }
    seq = new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _3_i;
              private int _9_j;
              private TestClosure.Enm[] _4_consts;
              private TestClosure.Enm _5_e;
              private int _14_r;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 15:
                      switch (this._5_e) {
                        case A:
                          this.__CP__ = 17;
                          break __switch__;
                        case B:
                          this.__CP__ = 18;
                          break __switch__;
                        case C:
                          this.__CP__ = 20;
                          break __switch__;
                        default:
                          this.__CP__ = 24;
                          break __switch__;
                      }
                    case 6:
                      if (this._3_i >= 0) {
                        this.__CP__ = 7;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 11:
                      if (this._9_j > 0) {
                        this.__CP__ = 10;
                        break;
                      }
                      this.__CP__ = 12;
                      break;
                    case 16:
                      this.__CP__ = 26;
                      this.yield((Integer)this._14_r);
                      return true;
                    case 0:
                      this._3_i = 2;
                      this._4_consts = new TestClosure.Enm[]{TestClosure.Enm.A,TestClosure.Enm.B,TestClosure.Enm.C};
                      this._5_e = null;
                      this.__CP__ = 6;
                      break;
                    case 7:
                      this._5_e = this._4_consts[this._3_i];
                      this._9_j = 3;
                      this.__CP__ = 10;
                      break;
                    case 12:
                      this._3_i = this._3_i - 1;
                      this.__CP__ = 6;
                      break;
                    case 10:
                      this._14_r = 0;
                      this.__CP__ = 15;
                      break;
                    case 26:
                      this._9_j = this._9_j - 1;
                      this.__CP__ = 11;
                      break;
                    case 24:
                      assert false;
                      this.__CP__ = 16;
                      break;
                    case 17:
                      this._14_r = this._9_j + 10;
                      this.__CP__ = 16;
                      break;
                    case 18:
                      this._14_r = this._9_j + 100;
                      this.__CP__ = 16;
                      break;
                    case 20:
                      this._14_r = this._9_j + 1000;
                      this.__CP__ = 16;
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

    }.invoke();
    for(int i : seq) {
      System.out.println("yielded: " + i);
    }
  }

  public static   enum Enm {
    A(),
    B(),
    C();
}

}
