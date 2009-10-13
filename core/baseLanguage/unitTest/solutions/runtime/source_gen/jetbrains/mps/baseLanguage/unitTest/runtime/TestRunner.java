package jetbrains.mps.baseLanguage.unitTest.runtime;

/*Generated by MPS */

import junit.runner.BaseTestRunner;
import java.util.List;
import junit.framework.Test;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.TestResult;
import java.io.PrintStream;

public class TestRunner extends BaseTestRunner {
  public TestRunner() {
  }

  public void start(String[] argv) throws Throwable {
    List<Test> tests = ListSequence.fromList(new ArrayList<Test>());
    for (int i = 0; i < argv.length; i++) {
      if ("-c".equals(argv[i])) {
        i++;
        Test test = this.getTest(argv[i]);
        ListSequence.fromList(tests).addElement(test);
      } else if ("-m".equals(argv[i])) {
        i++;
        String s = argv[i];
        int index = s.lastIndexOf('.');
        String testCase = s.substring(0, index);
        String method = s.substring(index + 1);
        Class<? extends TestCase> testClass = this.loadSuiteClass(testCase);
        Test test = TestSuite.createTest(testClass, method);
        ListSequence.fromList(tests).addElement(test);
      }
    }
    TestResult testResult = new TestResult();
    CommandOutputStream out = new CommandOutputStream(System.out);
    CommandOutputStream err = new CommandOutputStream(System.err);
    System.setOut(new PrintStream(out));
    System.setErr(new PrintStream(err));
    testResult.addListener(new MyTestListener(out, err));
    for (Test test : ListSequence.fromList(tests)) {
      if (test == null) {
        System.err.print("Can't run. Test is Null");
        continue;
      }
      if (test.countTestCases() == 0) {
        System.err.print("No tests found in " + test.getClass().getName());
        continue;
      }
      test.run(testResult);
    }
  }

  public void testFailed(int status, Test test, Throwable t) {
  }

  public void testStarted(String testName) {
  }

  public void testEnded(String testName) {
  }

  public void runFailed(String message) {
  }

  public static void main(String[] argv) {
    TestRunner runner = new TestRunner();
    try {
      runner.start(argv);
    } catch (Throwable t) {
      t.printStackTrace(System.err);
      System.exit(1);
    }
  }
}
