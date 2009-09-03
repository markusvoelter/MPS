package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunner;
import javax.swing.SwingUtilities;
import com.intellij.openapi.application.impl.ApplicationImpl;
import com.intellij.openapi.application.ApplicationManager;

public class TransformationTestRuner extends TestRunner {
  public TransformationTestRuner() {
  }

  public static void main(String[] argv) {
    TestRunner runner = new TestRunner();
    try {
      runner.start(argv);
    } catch (Throwable t) {
      t.printStackTrace(System.err);
      System.exit(1);
    }
    BaseTransformationTest.getProjectContainer().clear();
    try {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          ((ApplicationImpl)ApplicationManager.getApplication()).exit(true);
        }
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.exit(0);
  }
}
