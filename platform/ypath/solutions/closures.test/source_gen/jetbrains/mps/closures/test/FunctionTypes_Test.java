package jetbrains.mps.closures.test;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.closures.runtime.FunctionTypes._R;
import jetbrains.mps.closures.runtime.FunctionTypes;
import jetbrains.mps.closures.runtime.FunctionTypes._R_from_T;

public class FunctionTypes_Test extends TestCase {

  public void test_functionTypeAdapter_simple() throws Exception {
    _R<? extends Integer> fun1 = new FunctionTypes._R <Integer>() {

      public Integer invoke() {
        return 1;
      }

    };
    _R<? extends Integer> fun2 = fun1;
    _R<? extends Number> fun3 = fun1;
    fun3 = fun2;
    this.accept_int(fun1);
    this.accept_int(fun2);
    this.accept_Integer(fun2);
    this.accept_Number(fun2);
    this.accept_int(new FunctionTypes._R <Integer>() {

      public Integer invoke() {
        return 1;
      }

    });
    this.accept_Integer(new FunctionTypes._R <Integer>() {

      public Integer invoke() {
        return (Integer)1;
      }

    });
    this.accept_Number(new FunctionTypes._R <Integer>() {

      public Integer invoke() {
        return (Integer)1;
      }

    });
  }

  public void test_functionTypeAdapter_complex() throws Exception {
    _R_from_T<? extends Integer, ? super Integer> fun1 = new FunctionTypes._R_from_T <Integer, Integer>() {

      public Integer invoke(Integer i) {
        return i.intValue();
      }

    };
    _R_from_T<? extends Integer, ? super Integer> fun2 = new FunctionTypes._R_from_T <Integer, Integer>() {

      public Integer invoke(Integer i) {
        return Integer.valueOf(i);
      }

    };
    fun1 = fun2;
    fun2 = fun1;
    _R_from_T<? extends Integer, ? super Object> fun3 = new FunctionTypes._R_from_T <Integer, Object>() {

      public Integer invoke(Object o) {
        return o.hashCode();
      }

    };
    _R_from_T<? extends Integer, ? super String> fun4 = new FunctionTypes._R_from_T <Integer, String>() {

      public Integer invoke(String s) {
        return s.length();
      }

    };
    fun4 = fun3;
    this.accept_int_from_int(new FunctionTypes._R_from_T <Integer, Integer>() {

      public Integer invoke(Integer i) {
        return i.intValue();
      }

    });
    this.accept_int_from_int(fun1);
    this.accept_int_from_int(fun2);
    this.accept_int_from_Integer(new FunctionTypes._R_from_T <Integer, Integer>() {

      public Integer invoke(Integer i) {
        return Integer.valueOf(i);
      }

    });
    this.accept_int_from_Integer(fun1);
    this.accept_int_from_Integer(fun2);
    this.accept_Integer_from_int(new FunctionTypes._R_from_T <Integer, Integer>() {

      public Integer invoke(Integer i) {
        return i.intValue();
      }

    });
    this.accept_Integer_from_int(fun1);
    this.accept_Integer_from_int(fun2);
    this.accept_Integer_from_Object(new FunctionTypes._R_from_T <Integer, Object>() {

      public Integer invoke(Object o) {
        return o.hashCode();
      }

    });
    this.accept_Integer_from_Object(fun3);
    this.accept_Number_from_String(new FunctionTypes._R_from_T <Integer, String>() {

      public Integer invoke(String s) {
        return s.length();
      }

    });
    this.accept_Number_from_String(new FunctionTypes._R_from_T <Integer, Object>() {

      public Integer invoke(Object o) {
        return o.hashCode();
      }

    });
    this.accept_Number_from_String(fun3);
    this.accept_Number_from_String(fun4);
  }

  public void accept_int(_R<? extends Integer> fun) {
  }

  public void accept_Integer(_R<? extends Integer> fun) {
  }

  public void accept_Number(_R<? extends Number> fun) {
  }

  public void accept_int_from_int(_R_from_T<? extends Integer, ? super Integer> fun) {
  }

  public void accept_int_from_Integer(_R_from_T<? extends Integer, ? super Integer> fun) {
  }

  public void accept_Integer_from_int(_R_from_T<? extends Integer, ? super Integer> fun) {
  }

  public void accept_Integer_from_Object(_R_from_T<? extends Integer, ? super Object> fun) {
  }

  public void accept_Number_from_String(_R_from_T<? extends Number, ? super String> fun) {
  }

}
