package jetbrains.mps.baseLanguage.unitTest.runtime;

/*Generated by MPS */

import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class TestEvent {
  public static String START_TEST_PREFIX = "<START_TEST>";
  public static String END_TEST_PREFIX = "<END_TEST>";
  public static String ERROR_TEST_PREFIX = "<TEST_ERROR_BEGIN>";
  public static String ERROR_TEST_SUFFIX = "<TEST_ERROR_END>";
  public static String FAILURE_TEST_PREFIX = "<TEST_FAILURE_BEGIN>";
  public static String FAILURE_TEST_SUFFIX = "<TEST_FAILURE_END>";
  public static List<String> ALL_TOKENS;

  private String token;
  private String testCaseName;
  private String testMethodName;
  private long memoryUsage;
  private long time;

  public TestEvent(String token, Test test) {
    this.token = token;
    this.testCaseName = test.getClass().getName();
    if (test instanceof TestCase) {
      this.testMethodName = ((TestCase)test).getName();
    }
    Runtime runtime = Runtime.getRuntime();
    this.memoryUsage = runtime.totalMemory() - runtime.freeMemory();
    this.time = System.currentTimeMillis();
  }
  private TestEvent() {
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(this.token);
    builder.append(this.testCaseName);
    if (this.testMethodName != null) {
      builder.append(':').append(this.testMethodName);
    }
    builder.append(":memory=").append(this.memoryUsage);
    builder.append(":time=").append(this.time);
    return builder.toString();
  }

  public String getToken() {
    return this.token;
  }

  public String getTestCaseName() {
    return this.testCaseName;
  }

  public String getTestMethodName() {
    return this.testMethodName;
  }

  public long getMemoryUsage() {
    return this.memoryUsage;
  }

  public long getTime() {
    return this.time;
  }


  public static String isTestEvent(String messageString) {
    String token = null;
    for(String expectedToken : ALL_TOKENS) {
      if (messageString.startsWith(expectedToken)) {
        token = expectedToken;
        break;
      }
    }
    return token;
  }

  public static TestEvent parse(String messageString) {
    TestEvent testEvent = null;
    String expectedToken = isTestEvent(messageString);
    if (expectedToken != null) {
      testEvent = parse(expectedToken, messageString);
    }
    return testEvent;
  }

  private static TestEvent parse(String expectedToken, String messageString) {
    TestEvent testEvent = null;
    if (messageString.startsWith(expectedToken)) {
      String params = messageString.substring(expectedToken.length());
      {
        Pattern _pattern_0 = _PrecompiledPatterns.REGEXP0;
        Matcher _matcher_0 = _pattern_0.matcher(params);
        if (_matcher_0.matches()) {
          testEvent = new TestEvent();
          testEvent.token = expectedToken;
          testEvent.testCaseName = _matcher_0.group(1);
          testEvent.testMethodName = _matcher_0.group(2);
          testEvent.memoryUsage = Long.parseLong(_matcher_0.group(3));
          testEvent.time = Long.parseLong(_matcher_0.group(4));
        }
      }
    }
    return testEvent;
  }

  static {
    ALL_TOKENS = ListSequence.<String>fromArray(START_TEST_PREFIX, END_TEST_PREFIX, ERROR_TEST_PREFIX, ERROR_TEST_SUFFIX, FAILURE_TEST_PREFIX, FAILURE_TEST_SUFFIX);
  }

}
