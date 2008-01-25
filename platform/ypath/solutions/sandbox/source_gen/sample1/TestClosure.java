package sample1;

/*Generated by MPS */

import sample1._FunctionTypes._void;
import sample1._FunctionTypes._int_int;
import sample1._FunctionTypes._sequence1_Integer;
import java.util.Iterator;

public class TestClosure {

  public static void main(String[] args) {
    _void closure;
    _int_int fib = new _FunctionTypes._int_int() {

      public int invoke(int n) {
        return (n <= 1 ?
          n :
          this.invoke(n - 1) + this.invoke(n - 2)
        );
      }

    };
    System.out.println("fib(8)=" + fib.invoke(8));
    System.out.println("fib(9)=" + new _FunctionTypes._int_int() {

      public int invoke(int n) {
        return (n <= 1 ?
          n :
          this.invoke(n - 1) + this.invoke(n - 2)
        );
      }

    }.invoke(9));
    int calc = new _FunctionTypes._int() {

      public int invoke() {
        return 2 + 2;
      }

    }.invoke();
    System.out.println("2+2=" + calc);
    System.out.println("fact(5)=" + new _FunctionTypes._int_int() {

      public int invoke(int n) {
        int res = 1;
        while(n > 1) {
          res = res * n;
          n = n - 1;
        }
        return res;
      }

    }.invoke(5));
    _sequence1_Integer fun = new _FunctionTypes._sequence1_Integer() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new _FunctionTypes.YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _1_foo;
              private int _5_bar;
              private int _14_bar;
              private int _24_bar;

              protected boolean moveToNext() {
__loop__:
                do {
                  switch (this.__CP__) {
                    case 5:
                      this._5_bar = 0;
                    case 6:
                      if(!(this._5_bar < 5)) {
                        this.__CP__ = 13;
                        break;
                      }
                      this.__CP__ = 7;
                      break;
                    case 12:
                      this._5_bar = this._5_bar + 2;
                      this.__CP__ = 6;
                      break;
                    case 14:
                      this._14_bar = 6;
                    case 15:
                      if(!(this._14_bar < 13)) {
                        this.__CP__ = 24;
                        break;
                      }
                      this.__CP__ = 16;
                      break;
                    case 23:
                      this._14_bar = this._14_bar + 3;
                      this.__CP__ = 15;
                      break;
                    case 24:
                      this._24_bar = 13;
                    case 25:
                      if(!(this._24_bar < 20)) {
                        this.__CP__ = 30;
                        break;
                      }
                      this.__CP__ = 26;
                      break;
                    case 29:
                      this._24_bar = this._24_bar + 1;
                      this.__CP__ = 25;
                      break;
                    case 2:
                      this.__CP__ = 4;
                      this.yield((Integer)this._1_foo);
                      return true;
                    case 8:
                      this.__CP__ = 10;
                      this.yield((Integer)this._5_bar);
                      return true;
                    case 10:
                      this.__CP__ = 12;
                      this.yield((Integer)this._5_bar + this._1_foo);
                      return true;
                    case 17:
                      this.__CP__ = 19;
                      this.yield((Integer)this._14_bar);
                      return true;
                    case 19:
                      this.__CP__ = 21;
                      this.yield((Integer)this._14_bar + 1);
                      return true;
                    case 21:
                      this.__CP__ = 23;
                      this.yield((Integer)this._14_bar + this._1_foo);
                      return true;
                    case 27:
                      this.__CP__ = 29;
                      this.yield((Integer)this._24_bar);
                      return true;
                    case 7:
                      this.__CP__ = 8;
                      break;
                    case 16:
                      this.__CP__ = 17;
                      break;
                    case 26:
                      this.__CP__ = 27;
                      break;
                    case 0:
                      this._1_foo = -1;
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this._1_foo = 1;
                      this.__CP__ = 5;
                      break;
                    case 13:
                      this._1_foo = 2;
                      this.__CP__ = 14;
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
    seq = new _FunctionTypes._sequence1_Integer() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new _FunctionTypes.YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _1_i;
              private int _4_j;

              protected boolean moveToNext() {
__loop__:
                do {
                  switch (this.__CP__) {
                    case 4:
                      this._4_j = 2;
                    case 5:
                      if(!(this._4_j < 5)) {
                        this.__CP__ = 12;
                        break;
                      }
                      this.__CP__ = 6;
                      break;
                    case 11:
                      this._4_j = this._4_j + 1;
                      this.__CP__ = 5;
                      break;
                    case 1:
                      this._1_i = 1;
                    case 2:
                      if(!(this._1_i < 10)) {
                        this.__CP__ = 13;
                        break;
                      }
                      this.__CP__ = 3;
                      break;
                    case 12:
                      this._1_i = this._1_i + 1;
                      this.__CP__ = 2;
                      break;
                    case 7:
                      if(this._1_i % this._4_j == 0) {
                        this.__CP__ = 8;
                        break;
                      }
                      this.__CP__ = 11;
                      break;
                    case 9:
                      this.__CP__ = 11;
                      this.yield((Integer)this._1_i * this._4_j);
                      return true;
                    case 8:
                      this.__CP__ = 9;
                      break;
                    case 6:
                      this.__CP__ = 7;
                      break;
                    case 3:
                      this.__CP__ = 4;
                      break;
                    case 0:
                      this.__CP__ = 1;
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
    seq = new _FunctionTypes._sequence1_Integer() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new _FunctionTypes.YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _1_i;
              private int _4_j;

              protected boolean moveToNext() {
__loop__:
                do {
                  switch (this.__CP__) {
                    case 2:
                      if(this._1_i > 0) {
                        this.__CP__ = 3;
                        break;
                      }
                      this.__CP__ = 11;
                      break;
                    case 9:
                      if(this._4_j > 0) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 10;
                      break;
                    case 6:
                      this.__CP__ = 8;
                      this.yield((Integer)this._1_i * this._4_j);
                      return true;
                    case 5:
                      this.__CP__ = 6;
                      break;
                    case 8:
                      this._4_j = this._4_j - 1;
                      this.__CP__ = 9;
                      break;
                    case 3:
                      this._4_j = 3;
                      this.__CP__ = 5;
                      break;
                    case 10:
                      this._1_i = this._1_i - 1;
                      this.__CP__ = 2;
                      break;
                    case 0:
                      this._1_i = 3;
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

    }.invoke();
    for(int i : seq) {
      System.out.println("yielded: " + i);
    }
  }

}
