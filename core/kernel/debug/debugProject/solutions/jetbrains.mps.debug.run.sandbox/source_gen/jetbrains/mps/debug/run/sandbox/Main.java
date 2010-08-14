package jetbrains.mps.debug.run.sandbox;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.SNode;

public class Main {
  public int myI;

  public Main() {
    System.err.println();
  }

  public void foo() {
    this.myI = 5;
    System.err.println("done");
  }

  public static void main(String[] args) {
    new Main() {
      public void foo() {
      }
    };
    new Thread(new Runnable() {
      public void run() {
        int i = 0;
        _FunctionTypes._void_P0_E0 cl = new _FunctionTypes._void_P0_E0() {
          public void invoke() {
            System.err.print("blah");
            System.err.print("blah");
          }
        };
        while (true) {
          i++;
          cl.invoke();
        }
      }
    }).start();
    new Main() {
      public void foo() {
      }
    };
    System.err.println("hello");
    for (int i = 0; i < 2; i++) {
      doSomething();
    }
    new Main().foo();
    SNode n = null;
    System.err.println("" + n);
    doSomething();
    doSomething();
    doSomething();
    int[] array = {1 ,2};
    int j = 50;
    Integer intVar = 200;
    while (j > 0) {
      j--;
      intVar--;
    }
    do {
      System.err.println("do ... while");

      j++;
      array[0]++;
    } while (j < 0);
    while (true) {
      System.err.println("hi");
    }
  }

  public static void doSomething() {
    System.err.println("doing something...");
    System.err.println("doing something once again...");
  }
}
