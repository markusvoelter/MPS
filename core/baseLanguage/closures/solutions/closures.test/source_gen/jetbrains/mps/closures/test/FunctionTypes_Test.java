package jetbrains.mps.closures.test;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.baseLanguage.closures.util.Constants;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import junit.framework.Assert;

public class FunctionTypes_Test extends TestCase {
  public void test_functionTypeAdapter_simple() throws Exception {
    _FunctionTypes._return_P0_E0<? extends Integer> fun1 = new _FunctionTypes._return_P0_E0<Integer>() {
      public Integer invoke() {
        return 1;
      }
    };
    _FunctionTypes._return_P0_E0<? extends Integer> fun2 = fun1;
    _FunctionTypes._return_P0_E0<? extends Number> fun3 = fun1;
    fun3 = fun2;
    this.accept_int(fun1);
    this.accept_int(fun2);
    this.accept_Integer(fun2);
    this.accept_Number(fun2);
    this.accept_int(new _FunctionTypes._return_P0_E0<Integer>() {
      public Integer invoke() {
        return 1;
      }
    });
    this.accept_Integer(new _FunctionTypes._return_P0_E0<Integer>() {
      public Integer invoke() {
        return (Integer) 1;
      }
    });
    this.accept_Number(new _FunctionTypes._return_P0_E0<Integer>() {
      public Integer invoke() {
        return (Integer) 1;
      }
    });
  }

  public void test_exceptions() throws Exception {
    _FunctionTypes._void_P0_E1<? extends Exception> throwsException = new _FunctionTypes._void_P0_E1<Exception>() {
      public void invoke() throws Exception {
        throw new Exception();
      }
    };
    _FunctionTypes._void_P0_E1<? extends RuntimeException> throwsRuntimeException = new _FunctionTypes._void_P0_E1<RuntimeException>() {
      public void invoke() throws RuntimeException {
        throw new RuntimeException();
      }
    };
    throwsException = throwsRuntimeException;
    _FunctionTypes._void_P0_E1<? extends IllegalArgumentException> throwsOne = new _FunctionTypes._void_P0_E1<IllegalArgumentException>() {
      public void invoke() throws IllegalArgumentException {
        throw new IllegalArgumentException();
      }
    };
    _FunctionTypes._void_P0_E2<? extends IllegalThreadStateException, ? extends NumberFormatException> throwsTwo = new _FunctionTypes._void_P0_E2<IllegalThreadStateException, NumberFormatException>() {
      public void invoke() throws IllegalThreadStateException, NumberFormatException {
        if (true) {
          throw new NumberFormatException();
        } else {
          throw new IllegalThreadStateException();
        }
      }
    };
    if (!(Constants.ONLY_CLOSURE_LITERAL_AS_FUNCTION_TYPE)) {
      /*
        throwsOne = throwsTwo;
      */
    }
  }

  public void test_exceptionsYield() throws Exception {
    _FunctionTypes._return_P0_E1<? extends Iterable<Integer>, ? extends IllegalArgumentException> throwsOne = new _FunctionTypes._return_P0_E1<Iterable<Integer>, IllegalArgumentException>() {
      public Iterable<Integer> invoke() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
              private int __CP__ = 0;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 3:
                      if (true) {
                        this.__CP__ = 4;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 2:
                      this.__CP__ = 3;
                      this.yield(0);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      throw new IllegalArgumentException();
                    default:
                      break __loop__;
                  }
                } while (true);
                return false;
              }
            };
          }
        };
      }
    };
    _FunctionTypes._return_P0_E3<? extends Iterable<Integer>, ? extends IllegalArgumentException, ? extends IllegalThreadStateException, ? extends NumberFormatException> throwsThree = new _FunctionTypes._return_P0_E3<Iterable<Integer>, IllegalArgumentException, IllegalThreadStateException, NumberFormatException>() {
      public Iterable<Integer> invoke() {
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
                      if (!(_2_i < 3)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 4;
                      break;
                    case 5:
                      _2_i++;
                      this.__CP__ = 3;
                      break;
                    case 7:
                      switch (_2_i) {
                        case 1:
                          this.__CP__ = 8;
                          break __switch__;
                        case 2:
                          this.__CP__ = 9;
                          break __switch__;
                        case 0:
                          this.__CP__ = 11;
                          break __switch__;
                        default:
                          this.__CP__ = 15;
                          break __switch__;
                      }
                    case 6:
                      this.__CP__ = 7;
                      this.yield(_2_i);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 6;
                      break;
                    case 8:
                      throw new NumberFormatException();
                    case 9:
                      throw new IllegalThreadStateException();
                    case 11:
                      throw new IllegalArgumentException();
                    case 15:
                      this.__CP__ = 5;
                      break;
                    default:
                      break __loop__;
                  }
                } while (true);
                return false;
              }
            };
          }
        };
      }
    };
    if (!(Constants.ONLY_CLOSURE_LITERAL_AS_FUNCTION_TYPE)) {
      /*
        throwsOne = throwsThree;
      */
    }
  }

  public void test_functionTypeAdapter_complex() throws Exception {
    _FunctionTypes._return_P1_E0<? extends Integer, ? super Integer> fun1 = new _FunctionTypes._return_P1_E0<Integer, Integer>() {
      public Integer invoke(Integer i) {
        return i.intValue();
      }
    };
    _FunctionTypes._return_P1_E0<? extends Integer, ? super Integer> fun2 = new _FunctionTypes._return_P1_E0<Integer, Integer>() {
      public Integer invoke(Integer i) {
        return Integer.valueOf(i);
      }
    };
    fun1 = fun2;
    fun2 = fun1;
    _FunctionTypes._return_P1_E0<? extends Integer, ? super Object> fun3 = new _FunctionTypes._return_P1_E0<Integer, Object>() {
      public Integer invoke(Object o) {
        return o.hashCode();
      }
    };
    _FunctionTypes._return_P1_E0<? extends Integer, ? super String> fun4 = new _FunctionTypes._return_P1_E0<Integer, String>() {
      public Integer invoke(String s) {
        return s.length();
      }
    };
    fun4 = fun3;
    this.accept_int_from_int(new _FunctionTypes._return_P1_E0<Integer, Integer>() {
      public Integer invoke(Integer i) {
        return i.intValue();
      }
    });
    this.accept_int_from_int(fun1);
    this.accept_int_from_int(fun2);
    this.accept_int_from_Integer(new _FunctionTypes._return_P1_E0<Integer, Integer>() {
      public Integer invoke(Integer i) {
        return Integer.valueOf(i);
      }
    });
    this.accept_int_from_Integer(fun1);
    this.accept_int_from_Integer(fun2);
    this.accept_Integer_from_int(new _FunctionTypes._return_P1_E0<Integer, Integer>() {
      public Integer invoke(Integer i) {
        return i.intValue();
      }
    });
    this.accept_Integer_from_int(fun1);
    this.accept_Integer_from_int(fun2);
    this.accept_Integer_from_Object(new _FunctionTypes._return_P1_E0<Integer, Object>() {
      public Integer invoke(Object o) {
        return o.hashCode();
      }
    });
    this.accept_Integer_from_Object(fun3);
    this.accept_Number_from_String(new _FunctionTypes._return_P1_E0<Integer, String>() {
      public Integer invoke(String s) {
        return s.length();
      }
    });
    this.accept_Number_from_String(new _FunctionTypes._return_P1_E0<Integer, Object>() {
      public Integer invoke(Object o) {
        return o.hashCode();
      }
    });
    this.accept_Number_from_String(fun3);
    this.accept_Number_from_String(fun4);
  }

  public void test_return_null() throws Exception {
    final Wrappers._boolean b = new Wrappers._boolean(true);
    _FunctionTypes._return_P0_E0<? extends String> ret_string = new _FunctionTypes._return_P0_E0<String>() {
      public String invoke() {
        if (b.value) {
          return "foo";
        } else {
          return null;
        }
      }
    };
    Assert.assertSame("foo", ret_string.invoke());
    b.value = false;
    Assert.assertNull(ret_string.invoke());
    ret_string = new _FunctionTypes._return_P0_E0<String>() {
      public String invoke() {
        return null;
      }
    };
    Assert.assertNull(ret_string.invoke());
  }

  public void test_specifiedInterface() throws Exception {
    _FunctionTypes._return_P1_E0<? extends Integer, ? super Boolean> ssdf = new _FunctionTypes._return_P1_E0<Integer, Boolean>() {
      public Integer invoke(Boolean b) {
        return 0;
      }
    };
  }

  public void accept_int(_FunctionTypes._return_P0_E0<? extends Integer> fun) {
  }

  public void accept_Integer(_FunctionTypes._return_P0_E0<? extends Integer> fun) {
  }

  public void accept_Number(_FunctionTypes._return_P0_E0<? extends Number> fun) {
  }

  public void accept_int_from_int(_FunctionTypes._return_P1_E0<? extends Integer, ? super Integer> fun) {
  }

  public void accept_int_from_Integer(_FunctionTypes._return_P1_E0<? extends Integer, ? super Integer> fun) {
  }

  public void accept_Integer_from_int(_FunctionTypes._return_P1_E0<? extends Integer, ? super Integer> fun) {
  }

  public void accept_Integer_from_Object(_FunctionTypes._return_P1_E0<? extends Integer, ? super Object> fun) {
  }

  public void accept_Number_from_String(_FunctionTypes._return_P1_E0<? extends Number, ? super String> fun) {
  }
}
