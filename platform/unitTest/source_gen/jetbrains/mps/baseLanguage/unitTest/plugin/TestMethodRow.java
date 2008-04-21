package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class TestMethodRow implements TestStatisticsRow {
  public static final int UNDEFINED = -1;
  public static final int SUCCEED = 0;
  public static final int FAILED = 1;
  public static final int ERRORED = 2;

  private String testMethodName;
  private long startTime = -1;
  private long finishTime = -1;
  private long usageBefore = -1;
  private long usageAfter = -1;
  private int state = TestMethodRow.UNDEFINED;

  public  TestMethodRow(SNode testMethod) {
    this.testMethodName = SPropertyOperations.getString(testMethod, "name");
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
    this.state = TestMethodRow.SUCCEED;
  }

  public void setFailed() {
    this.state = TestMethodRow.FAILED;
  }

  public void setErrored() {
    this.state = TestMethodRow.ERRORED;
  }

  public int getSuccessful() {
    return (this.state == TestMethodRow.SUCCEED ?
      1 :
      0
    );
  }

  public int getErrored() {
    return (this.state == TestMethodRow.ERRORED ?
      1 :
      0
    );
  }

  public int getFailed() {
    return (this.state == TestMethodRow.FAILED ?
      1 :
      0
    );
  }

}
