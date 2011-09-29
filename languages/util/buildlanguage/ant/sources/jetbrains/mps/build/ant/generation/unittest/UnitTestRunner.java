/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.build.ant.generation.unittest;

import jetbrains.mps.internal.collections.runtime.ListSequence;
import junit.framework.*;
import junit.runner.BaseTestRunner;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitTestRunner extends RunListener {
  public static final String START_TEST_PREFIX = "<START_TEST>";
  public static final String END_TEST_PREFIX = "<END_TEST>";
  public static final String FAILURE_TEST_PREFIX = "<TEST_FAILURE_BEGIN>";
  public static final String FAILURE_TEST_SUFFIX = "<TEST_FAILURE_END>";
  private Description currentDesc;

  public void start(String[] argv) throws Throwable {
    runTests(collectTestsToRun(argv));
  }

  private void runTests(List<Request> tests) {
    JUnitCore jUnitCore = new JUnitCore();
    jUnitCore.addListener(this);
    for (Request test : tests) {
      if (test == null) {
        System.err.println("Can't run. Test is Null");
        continue;
      }
      jUnitCore.run(test);
    }
  }

  private List<Request> collectTestsToRun(String[] argv) throws ClassNotFoundException {
    List<Request> tests = new ArrayList<Request>();
    for (int i = 0; i < argv.length; i++) {
      if ("-c".equals(argv[i])) {
        i++;
        Class<?> testClass = Class.forName(argv[i]);
        tests.add(Request.aClass(testClass));
      } else if ("-m".equals(argv[i])) {
        i++;
        String s = argv[i];
        int index = s.lastIndexOf('.');
        String testCase = s.substring(0, index);
        String method = s.substring(index + 1);
        Class<?> testClass = Class.forName(testCase);
        tests.add(Request.aClass(testClass).filterWith(Description.createTestDescription(testClass, method)));
      }
    }
    return tests;
  }

  private String getTestName(String testName) {
    String[] parts = testName.split("\\(|\\)");
    return parts[1] + "." + parts[0];
  }

  private void testFailed(Failure failure) {
    System.out.flush();
    String testName = getTestName(failure.getTestHeader());
    System.err.println(FAILURE_TEST_PREFIX + failure.getMessage());
    failure.getException().printStackTrace(System.err);
    System.err.println(FAILURE_TEST_SUFFIX + testName);
    System.err.flush();
  }

  @Override
  public void testRunStarted(Description description) throws Exception {
    this.currentDesc = description;
  }

  @Override
  public void testRunFinished(Result result) throws Exception {
    if (result.getRunCount() == 0) {
       System.err.println("No tests found in " + currentDesc.getDisplayName());
    }
  }

  @Override
  public void testStarted(Description description) throws Exception {
    System.out.println(START_TEST_PREFIX + getTestName(description.getDisplayName()));
    System.out.flush();
  }

  @Override
  public void testFinished(Description description) throws Exception {
    System.out.println(END_TEST_PREFIX + getTestName(description.getDisplayName()));
    System.out.flush();
  }

  @Override
  public void testFailure(Failure failure) throws Exception {
    testFailed(failure);
  }

  @Override
  public void testAssumptionFailure(Failure failure) {
    testFailed(failure);
  }

  @Override
  public void testIgnored(Description description) throws Exception {
    super.testIgnored(description);
  }

  public static void main(String[] argv) {
    if (argv.length > 0 && "-w".equals(argv[0])) {
      try {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        r.readLine();
        r.close();
      } catch (IOException ignore) {}
    }

    UnitTestRunner runner = new UnitTestRunner();
    try {
      runner.start(argv);
    } catch (Throwable t) {
      t.printStackTrace(System.err);
      System.exit(1);
    }
  }
}
