package jetbrains.mps.closures.test;

/*Generated by MPS */

import jetbrains.mps.closures.test.Parent_Test;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import junit.framework.Assert;

public class Child_Test extends Parent_Test {

  public void testFoo() {
    this.setFoo(7);
    final int foo = 11;
    int bar = new _FunctionTypes._return_P0_E0 <Integer>() {

      public Integer invoke() {
        return Child_Test.this.foo * foo;
      }
    }.invoke();
    Assert.assertEquals(7 * 11, bar);
  }

  public void setFoo(int foo) {
    this.foo = foo;
  }


  public static  <T>void foo() {
  }

}
