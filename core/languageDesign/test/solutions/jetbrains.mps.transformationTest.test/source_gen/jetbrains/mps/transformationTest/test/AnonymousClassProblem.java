package jetbrains.mps.transformationTest.test;

/*Generated by MPS */


public class AnonymousClassProblem {
  private int a;

  public AnonymousClassProblem() {
    this.a;
    new Runnable() {
      public void run() {
        new Comparable() {
          public int compareTo(Object p0) {
            return AnonymousClassProblem.this.a;
          }
        };
      }
    };
  }
}
