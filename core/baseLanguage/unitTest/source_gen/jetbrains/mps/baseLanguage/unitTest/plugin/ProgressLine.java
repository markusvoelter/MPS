package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import com.intellij.openapi.progress.util.ColorProgressBar;
import javax.swing.JLabel;
import java.util.Set;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestEvent;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.openapi.application.ApplicationManager;

public class ProgressLine extends JPanel {
  private final ColorProgressBar progressBar = new ColorProgressBar();
  private final JLabel state = new JLabel("Starting...");
  private final ProgressLine.StateInfo stateInfo = new ProgressLine.StateInfo();
  private boolean testsBuilt = false;
  private Set<TestEvent> events = SetSequence.fromSet(new HashSet<TestEvent>());
  private List<String> methodName = ListSequence.fromList(new ArrayList<String>());

  public ProgressLine() {
    super(new GridLayout(1, 2));
    this.add(this.state);
    final JPanel progress = new JPanel(new GridBagLayout());
    this.add(progress);
    progress.add(this.progressBar, new GridBagConstraints(0, 0, 0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
    this.testsBuilt = true;
    this.progressBar.setColor(ColorProgressBar.GREEN);
  }

  public void setMethods(List<String> methods) {
    ListSequence.fromList(this.methodName).addSequence(ListSequence.fromList(methods));
    this.stateInfo.setTotal(ListSequence.fromList(this.methodName).count());
  }

  public void onEvent(TestEvent event) {
    if (SetSequence.fromSet(this.events).contains(event) || !(ListSequence.fromList(this.methodName).contains(event.getTestMethodName()))) {
      return;
    } else {
      SetSequence.fromSet(this.events).addElement(event);
    }
    String token = event.getToken();
    if (token.equals(TestEvent.END_TEST_PREFIX)) {
      this.stateInfo.onComplete();
      ListSequence.fromList(this.methodName).removeElement(event.getTestMethodName());
    } else if (token.equals(TestEvent.ERROR_TEST_PREFIX)) {
      this.stateInfo.onDefect();
      this.progressBar.setColor(ColorProgressBar.RED);
    }
    this.stateInfo.setTestName(event.getTestMethodName(), event.getTestCaseName());
    this.progressBar.setFraction(this.stateInfo.getCompletedPercent());
    this.stateInfo.updateLabel(this.state);
  }

  public void onProcessStarted(final ProcessHandler processHandler) {
    if (this.testsBuilt) {
      return;
    }
    processHandler.addProcessListener(new ProcessAdapter() {
      @Override
      public void processTerminated(ProcessEvent p0) {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
          public void run() {
            if (!(ProgressLine.this.testsBuilt) && ProgressLine.this.progressBar.getFraction() == 0.0) {
              ProgressLine.this.progressBar.setColor(ColorProgressBar.RED);
              ProgressLine.this.progressBar.setFraction(1.0);
              ProgressLine.this.state.setText("Failed to start");
            }
          }
        });
      }
    });
  }

  public static class StateInfo {
    private int total = 0;
    private int completed = 0;
    private int defects = 0;
    private String testName = "";

    public StateInfo() {
    }

    public void onComplete() {
      this.completed++;
    }

    public void onDefect() {
      this.defects++;
    }

    public void setTestName(String name, String className) {
      this.testName = name;
    }

    public void setTotal(int total) {
      this.total = total;
    }

    public double getCompletedPercent() {
      return (double)this.completed / (double)this.total;
    }

    public void updateLabel(final JLabel label) {
      StringBuilder sb = new StringBuilder();
      if (this.total == this.completed) {
        sb.append(" Done: " + this.completed + " of " + this.total + " ");
        this.testName = "";
      }
      if (this.defects > 0) {
        sb.append(" Failed: " + this.defects);
      } else if (sb.length() == 0) {
        sb.append(" Running: " + this.completed + " of " + this.total);
      }
      label.setText(sb + "  " + this.testName);
    }
  }
}
