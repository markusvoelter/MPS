package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.unitTest.plugin.TestStatisticsRow;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import org.apache.commons.lang.ObjectUtils;

public class TestMethodRow implements TestStatisticsRow {
  private static final int UNDEFINED = -1;
  private static final int SUCCEED = 0;
  private static final int FAILED = 1;
  private static final int ERRORED = 2;

  private String testCaseName;
  private String testMethodName;
  private long startTime = -1;
  private long finishTime = -1;
  private long usageBefore = -1;
  private long usageAfter = -1;
  private int state = UNDEFINED;

  public TestMethodRow(SNode testMethod) {
    this.testCaseName = ITestCase_Behavior.call_getClassName_1216136193905(ITestMethod_Behavior.call_getTestCase_1216134500045(testMethod));
    this.testMethodName = ITestMethod_Behavior.call_getTestName_1216136419751(testMethod);
  }

  public String getText() {
    return this.testMethodName;
  }

  public String getAdditionalText() {
    return null;
  }

  public long getElapsedTime() {
    long elapsedTime = -1;
    if (this.startTime >= 0 && this.finishTime >= 0) {
      elapsedTime = this.finishTime - this.startTime;
    }
    return elapsedTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }

  public void setFinishTime(long finishTime) {
    this.finishTime = finishTime;
  }

  public long getUsageBefore() {
    return this.usageBefore;
  }

  public void setUsageBefore(long usageBefore) {
    this.usageBefore = usageBefore;
  }

  public long getUsageAfter() {
    return this.usageAfter;
  }

  public void setUsageAfter(long usageAfter) {
    this.usageAfter = usageAfter;
  }

  public long getUsageDelta() {
    long usageDelta = -1;
    if (this.usageAfter >= 0 && this.usageBefore >= 0) {
      usageDelta = this.usageAfter - this.usageBefore;
    }
    return usageDelta;
  }

  public void setSucceed() {
    this.state = SUCCEED;
  }

  public void setFailed() {
    this.state = FAILED;
  }

  public void setErrored() {
    this.state = ERRORED;
  }

  public int getSuccessful() {
    return (this.state == SUCCEED ?
      1 :
      0
    );
  }

  public int getErrored() {
    return (this.state == ERRORED ?
      1 :
      0
    );
  }

  public int getFailed() {
    return (this.state == FAILED ?
      1 :
      0
    );
  }

  public boolean matches(String testCase, String testMethod) {
    return testCase == null || (ObjectUtils.equals(testCase, this.testCaseName) && (testMethod == null || ObjectUtils.equals(testMethod, this.testMethodName)));
  }

}
