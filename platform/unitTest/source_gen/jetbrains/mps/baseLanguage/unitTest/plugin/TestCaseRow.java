package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class TestCaseRow implements TestStatisticsRow {

  private String text;
  private String additionalText;
  private List<TestMethodRow> methodRows = ListOperations.<TestMethodRow>createList();

  public  TestCaseRow(SNode testCase) {
    this.text = SPropertyOperations.getString(testCase, "name");
    this.additionalText = SNodeOperations.getModel(testCase).getLongName();
  }

  public String getText() {
    return this.text;
  }

  public String getAdditionalText() {
    return this.additionalText;
  }

  public long getElapsedTime() {
    long elapsedTime = 0;
    {
      ICursor<TestMethodRow> _zCursor7 = CursorFactory.createCursor(this.methodRows);
      try {
        while(_zCursor7.moveToNext()) {
          TestMethodRow methodRow = _zCursor7.getCurrent();
          {
            long methodTime = methodRow.getElapsedTime();
            if (methodTime >= 0) {
              elapsedTime = elapsedTime + methodTime;
            }
          }
        }
      } finally {
        _zCursor7.release();
      }
    }
    return elapsedTime;
  }

  public long getUsageBefore() {
    long usageBefore = -1;
    TestMethodRow methodRow = SequenceOperations.getFirst(this.methodRows);
    if (methodRow != null) {
      long methodUsageBefore = methodRow.getUsageBefore();
      if (methodUsageBefore >= 0) {
        usageBefore = methodUsageBefore;
      }
    }
    return usageBefore;
  }

  public long getUsageAfter() {
    long usageAfter = -1;
    TestMethodRow methodRow = SequenceOperations.getLast(this.methodRows);
    if (methodRow != null) {
      long methodUsageAfter = methodRow.getUsageAfter();
      if (methodUsageAfter >= 0) {
        usageAfter = methodUsageAfter;
      }
    }
    return usageAfter;
  }

  public long getUsageDelta() {
    long usageBefore = this.getUsageBefore();
    long usageAfter = this.getUsageAfter();
    long usageDelta = -1;
    if (usageAfter >= 0 && usageBefore >= 0) {
      usageDelta = usageAfter - usageBefore;
    }
    return usageDelta;
  }

  public int getSuccessful() {
    int count = 0;
    {
      ICursor<TestMethodRow> _zCursor8 = CursorFactory.createCursor(this.methodRows);
      try {
        while(_zCursor8.moveToNext()) {
          TestMethodRow methodRow = _zCursor8.getCurrent();
          count = count + methodRow.getSuccessful();
        }
      } finally {
        _zCursor8.release();
      }
    }
    return count;
  }

  public int getErrored() {
    int count = 0;
    {
      ICursor<TestMethodRow> _zCursor9 = CursorFactory.createCursor(this.methodRows);
      try {
        while(_zCursor9.moveToNext()) {
          TestMethodRow methodRow = _zCursor9.getCurrent();
          count = count + methodRow.getErrored();
        }
      } finally {
        _zCursor9.release();
      }
    }
    return count;
  }

  public int getFailed() {
    int count = 0;
    {
      ICursor<TestMethodRow> _zCursor10 = CursorFactory.createCursor(this.methodRows);
      try {
        while(_zCursor10.moveToNext()) {
          TestMethodRow methodRow = _zCursor10.getCurrent();
          count = count + methodRow.getFailed();
        }
      } finally {
        _zCursor10.release();
      }
    }
    return count;
  }

  public void addMethodRow(TestMethodRow methodRow) {
    ListOperations.addElement(this.methodRows, methodRow);
  }

}
