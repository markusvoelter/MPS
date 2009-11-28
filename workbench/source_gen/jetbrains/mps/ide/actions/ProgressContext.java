package jetbrains.mps.ide.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ide.progress.TaskProgressSettings;

public class ProgressContext {
  private long myStartTime;
  private long myEstimatedTime;
  private List<String> myTaskNames = ListSequence.fromList(new ArrayList<String>());
  private int myCurrentTaskIndex = 0;
  private ProgressIndicator myProgressIndicator;

  public ProgressContext(ProgressIndicator progressIndicator, List<String> taskNames) {
    this.myTaskNames = taskNames;
    this.myProgressIndicator = progressIndicator;
    this.myStartTime = System.currentTimeMillis();
    this.myEstimatedTime = getEstimatedTimeMillis(taskNames);
  }

  public ProgressContext(ProgressIndicator progressIndicator, Iterable<String> taskNames) {
    this(progressIndicator, Sequence.fromIterable(taskNames).toListSequence());
  }

  public ProgressContext(ProgressIndicator progressIndicator, String taskName) {
    this(progressIndicator, Sequence.fromArray(new String[]{taskName}));
  }

  public void saveEstimatedTime(long subtaskStartTime) {
    addEstimatedTimeMillis(ListSequence.fromList(this.myTaskNames).getElement(this.myCurrentTaskIndex), subtaskStartTime);
    this.myCurrentTaskIndex++;
  }

  public void saveEstimatedTime() {
    this.saveEstimatedTime(this.myStartTime);
  }

  public long getStartTime() {
    return this.myStartTime;
  }

  public long getEstimatedTime() {
    return this.myEstimatedTime;
  }

  public ProgressIndicator getProgressIndicator() {
    return this.myProgressIndicator;
  }

  private static long getEstimatedTimeMillis(String taskName) {
    return TaskProgressSettings.getInstance().getEstimatedTimeMillis(taskName);
  }

  private static long getEstimatedTimeMillis(Iterable<String> taskNames) {
    long result = 0;
    for (String taskName : Sequence.fromIterable(taskNames)) {
      result += getEstimatedTimeMillis(taskName);
    }
    return result;
  }

  private static void addEstimatedTimeMillis(String taskName, long startTime) {
    TaskProgressSettings.getInstance().addEstimatedTimeMillis(taskName, System.currentTimeMillis() - startTime);
  }
}
