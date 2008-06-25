package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import javax.swing.JComponent;
import com.intellij.execution.ui.ConsoleView;
import java.util.List;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.execution.impl.ConsoleViewImpl;
import org.apache.commons.lang.ObjectUtils;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.openapi.util.Disposer;

public class TestOutputComponent {

  private JComponent component;
  private ConsoleView consoleView;
  private List<TestOutputComponent.Message> messages;
  private String curClass;
  private String curMethod;
  private String filterClass;
  private String filterMethod;

  public TestOutputComponent(Project project, JComponent parentComponent) {
    this.messages = ListSequence.<TestOutputComponent.Message>fromArray();
    this.consoleView = new ConsoleViewImpl(project);
    this.component = this.consoleView.getComponent();
  }

  public JComponent getComponent() {
    return this.component;
  }

  public void filter(String filterClass, String filterMethod) {
    if (!(ObjectUtils.equals(filterClass, this.filterClass)) || !(ObjectUtils.equals(filterMethod, this.filterMethod))) {
      this.filterClass = filterClass;
      this.filterMethod = filterMethod;
      this.consoleView.clear();
      for(TestOutputComponent.Message message : this.messages) {
        this.append(message);
      }
    }
  }

  public void start(String testClass, String testMethod) {
    this.curClass = testClass;
    this.curMethod = testMethod;
  }

  public void end(String testClass, String testMethod) {
    this.curClass = null;
    this.curMethod = null;
  }

  public void append(String message, boolean error, boolean internal) {
    TestOutputComponent.Message newMessage = new TestOutputComponent.Message(this.curClass, this.curMethod, message, error, internal);
    ListSequence.fromList(this.messages).addElement(newMessage);
    this.append(newMessage);
  }

  public void clear() {
    this.messages = ListSequence.<TestOutputComponent.Message>fromArray();
    this.consoleView.clear();
  }

  private void append(TestOutputComponent.Message message) {
    if (message.matches(this.filterClass, this.filterMethod)) {
      if (message.isError()) {
        this.consoleView.print(message.getMessage() + "\n", ConsoleViewContentType.ERROR_OUTPUT);
      } else if (message.isInternal()) {
        this.consoleView.print(message.getMessage() + "\n", ConsoleViewContentType.SYSTEM_OUTPUT);
      } else
      {
        this.consoleView.print(message.getMessage() + "\n", ConsoleViewContentType.NORMAL_OUTPUT);
      }
    }
  }

  public void dispose() {
    Disposer.dispose(this.consoleView);
  }

  private static class Message {

    private String testClass;
    private String testMethod;
    private String message;
    private boolean error;
    private boolean internal;

    public Message(String testClass, String testMethod, String message, boolean error, boolean internal) {
      this.testClass = testClass;
      this.testMethod = testMethod;
      this.message = message;
      this.error = error;
      this.internal = internal;
    }

    public boolean matches(String testClass, String testMethod) {
      return testClass == null || (testClass.equals(this.testClass) && (testMethod == null || testMethod.equals(this.testMethod)));
    }

    public String getMessage() {
      return this.message;
    }

    public boolean isError() {
      return this.error;
    }

    public boolean isInternal() {
      return this.internal;
    }

}

}
