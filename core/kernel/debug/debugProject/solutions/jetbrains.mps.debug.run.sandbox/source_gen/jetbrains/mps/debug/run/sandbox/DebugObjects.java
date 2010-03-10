package jetbrains.mps.baseLanguage.sandbox.runTest;

/*Generated by MPS */


public class DebugObjects {
  private static int myStaticField = 1;

  private int myNonStaticField;

  public DebugObjects() {
    myStaticField++;
    this.myNonStaticField = myStaticField;
  }

  public void doStrangeThings() {
    System.err.println("Doing strange things.");
    System.err.println(this.myNonStaticField);
    while (true) {
      System.err.println("We are in an infinite loop!");
    }
  }

  public static void main(String[] args) {
    DebugObjects object = new DebugObjects();
    object.doStrangeThings();
  }
}
