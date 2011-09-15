package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import javax.swing.JComponent;
import com.intellij.execution.ui.ConsoleView;
import java.util.Queue;
import jetbrains.mps.internal.collections.runtime.QueueSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import com.intellij.openapi.project.Project;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import com.intellij.openapi.util.Key;
import com.intellij.execution.process.ProcessOutputTypes;
import javax.swing.SwingUtilities;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.openapi.util.Disposer;

public class TestOutputComponent implements TestView {
  private static final int MAX_SIZE = 10000;

  private final JComponent myComponent;
  private final ConsoleView myConsoleView;
  private final Queue<TestOutputComponent.Message> myMessages = QueueSequence.fromQueue(new LinkedList());
  private String myFilterClass;
  private String myFilterMethod;
  private final TestRunState myState;

  public TestOutputComponent(Project project, JComponent parentComponent, ConsoleView console, TestRunState state) {
    this.myConsoleView = console;
    this.myComponent = this.myConsoleView.getComponent();
    this.myState = state;
  }

  public void update() {
    final Wrappers._T<String> text = new Wrappers._T<String>(null);
    final Wrappers._T<Key> key = new Wrappers._T<Key>(null);
    final Wrappers._T<String> test = new Wrappers._T<String>(this.myState.getLoseClass());
    final Wrappers._T<String> method = new Wrappers._T<String>(this.myState.getLoseMethod());
    if (test.value != null && method.value != null) {
      text.value = "\nError: couldn't find method '" + method.value + "' in '" + test.value + "'\n\n";
      key.value = ProcessOutputTypes.STDERR;
    } else if (this.myState.getAvailableText() != null) {
      text.value = this.myState.getAvailableText();
      key.value = this.myState.getKey();
      test.value = this.myState.getCurrentClass();
      method.value = this.myState.getCurrentMethod();
    }
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        TestOutputComponent.this.appendWithParameters(test.value, method.value, text.value, key.value);
      }
    });
  }

  public void init() {
    this.clear();
  }

  public JComponent getComponent() {
    return this.myComponent;
  }

  public String getCurrentClassName() {
    return this.myState.getCurrentClass();
  }

  public String getCurrentMethodName() {
    return this.myState.getCurrentMethod();
  }

  public void filter(String filterClass, String filterMethod) {
    if (neq_r62oz9_a0a0a5_0(filterClass, this.myFilterClass) || neq_r62oz9_a0a0a5(filterMethod, this.myFilterMethod)) {
      this.myFilterClass = filterClass;
      this.myFilterMethod = filterMethod;
      this.myConsoleView.clear();
      for (TestOutputComponent.Message message : QueueSequence.fromQueue(this.myMessages)) {
        this.print(message);
      }
    }
  }

  public void appendWithParameters(String testClass, String testMethod, String text, Key type) {
    TestOutputComponent.Message newMessage = new TestOutputComponent.Message(testClass, testMethod, text, type);
    this.pushMessage(newMessage);
    this.print(newMessage);
  }

  public void append(String message, Key type) {
    TestOutputComponent.Message newMessage = new TestOutputComponent.Message(this.getCurrentClassName(), this.getCurrentMethodName(), message, type);
    this.pushMessage(newMessage);
    this.print(newMessage);
  }

  private void pushMessage(TestOutputComponent.Message newMessage) {
    if (QueueSequence.fromQueue(myMessages).count() >= MAX_SIZE) {
      QueueSequence.fromQueue(myMessages).removeFirstElement();
    }
    QueueSequence.fromQueue(myMessages).addLastElement(newMessage);
  }

  public void clear() {
    QueueSequence.fromQueue(this.myMessages).clear();
    this.myConsoleView.clear();
  }

  private void print(TestOutputComponent.Message message) {
    if (message.matches(this.myFilterClass, this.myFilterMethod)) {
      if (ProcessOutputTypes.STDERR.equals(message.getType())) {
        ConsoleView consoleView = this.myConsoleView;
        String text = message.getMessage();
        consoleView.print(text, ConsoleViewContentType.ERROR_OUTPUT);
      } else if (ProcessOutputTypes.SYSTEM.equals(message.getType())) {
        this.myConsoleView.print(message.getMessage(), ConsoleViewContentType.SYSTEM_OUTPUT);
      } else if (ProcessOutputTypes.STDOUT.equals(message.getType())) {
        this.myConsoleView.print(message.getMessage(), ConsoleViewContentType.NORMAL_OUTPUT);
      }
    }
  }

  public void dispose() {
    Disposer.dispose(this.myConsoleView);
  }

  public ConsoleView getConsole() {
    return this.myConsoleView;
  }

  private static boolean neq_r62oz9_a0a0a5(Object a, Object b) {
    return !((a != null ?
      a.equals(b) :
      a == b
    ));
  }

  private static boolean neq_r62oz9_a0a0a5_0(Object a, Object b) {
    return !((a != null ?
      a.equals(b) :
      a == b
    ));
  }

  private static class Message {
    private String myTestClass;
    private String myTestMethod;
    private String myMessage;
    private Key myType;

    public Message(String testClass, String testMethod, String message, Key types) {
      this.myTestClass = testClass;
      this.myTestMethod = testMethod;
      this.myMessage = message;
      this.myType = types;
    }

    public boolean matches(String testClass, String testMethod) {
      return testClass == null || (testClass.equals(this.myTestClass) && (testMethod == null || testMethod.equals(this.myTestMethod)));
    }

    public String getMessage() {
      return this.myMessage;
    }

    private Key getType() {
      return this.myType;
    }
  }
}
