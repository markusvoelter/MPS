package jetbrains.mps.debug.run.sandbox;

/*Generated by MPS */


public class Cls {
  private static long ourL;

  private int myI = 239;

  public Cls() {
  }

  public void foo() {
    myI = myI + 1;
    System.err.println("a");
  }

  public static void main(String[] args) {
    int i = 1;
    while (i < 6) {
      i++;
    }
    System.err.println("hello");
    new Cls().foo();
  }
}
