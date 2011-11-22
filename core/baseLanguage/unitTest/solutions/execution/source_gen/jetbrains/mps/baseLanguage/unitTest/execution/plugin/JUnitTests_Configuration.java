package jetbrains.mps.baseLanguage.unitTest.execution.plugin;

/*Generated by MPS */

import jetbrains.mps.execution.api.configurations.BaseMpsRunConfiguration;
import jetbrains.mps.execution.api.settings.IPersistentConfiguration;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.baseLanguage.execution.api.JavaRunParameters_Configuration;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jdom.Element;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.util.xmlb.XmlSerializer;
import com.intellij.openapi.util.InvalidDataException;
import java.util.List;
import jetbrains.mps.baseLanguage.unitTest.execution.client.ITestNodeWrapper;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.ArrayList;
import com.intellij.openapi.progress.ProgressManager;
import jetbrains.mps.smodel.SNodePointer;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.Executor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ExecutionException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.util.JDOMExternalizable;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.configurations.ConfigurationInfoProvider;
import jetbrains.mps.execution.api.settings.SettingsEditorEx;

public class JUnitTests_Configuration extends BaseMpsRunConfiguration implements IPersistentConfiguration {
  private static final Logger LOG = Logger.getLogger(JUnitTests_Configuration.class);

  @NotNull
  private JUnitTests_Configuration.MyState myState = new JUnitTests_Configuration.MyState();
  private JavaRunParameters_Configuration myJavaRunParameters = new JavaRunParameters_Configuration();

  public JUnitTests_Configuration(Project project, JUnitTests_Configuration_Factory factory, String name) {
    super(project, factory, name);
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
    if (this.getRunType() == null) {
      throw new RuntimeConfigurationException("Type of test not selected.");
    }
    if (this.getRunType() != null) {
      // We do not validate, only check if there is something to test, since validating everything be very slow 
      // see MPS-8781 JUnit run configuration check method performance. 
      if (ListSequence.fromList(getTests()).isEmpty()) {
        throw new RuntimeConfigurationException("Could not find tests to run.");
      }
    }
  }

  @Override
  public void writeExternal(Element element) throws WriteExternalException {
    element.addContent(XmlSerializer.serialize(myState));
    {
      Element fieldElement = new Element("myJavaRunParameters");
      myJavaRunParameters.writeExternal(fieldElement);
      element.addContent(fieldElement);
    }
  }

  @Override
  public void readExternal(Element element) throws InvalidDataException {
    if (element == null) {
      throw new InvalidDataException("Cant read " + this + ": element is null.");
    }
    XmlSerializer.deserializeInto(myState, (Element) element.getChildren().get(0));
    {
      Element fieldElement = element.getChild("myJavaRunParameters");
      myJavaRunParameters.readExternal(fieldElement);
    }
  }

  public String getModel() {
    return myState.myModel;
  }

  public String getModule() {
    return myState.myModule;
  }

  public ClonableList<String> getTestCases() {
    return myState.myTestCases;
  }

  public ClonableList<String> getTestMethods() {
    return myState.myTestMethods;
  }

  public JUnitRunTypes2 getRunType() {
    return myState.myRunType;
  }

  public JavaRunParameters_Configuration getJavaRunParameters() {
    return myJavaRunParameters;
  }

  public void setModel(String value) {
    myState.myModel = value;
  }

  public void setModule(String value) {
    myState.myModule = value;
  }

  public void setTestCases(ClonableList<String> value) {
    myState.myTestCases = value;
  }

  public void setTestMethods(ClonableList<String> value) {
    myState.myTestMethods = value;
  }

  public void setRunType(JUnitRunTypes2 value) {
    myState.myRunType = value;
  }

  public List<ITestNodeWrapper> getTests() {
    final List<ITestNodeWrapper>[] all = (List<ITestNodeWrapper>[]) new List[1];
    if (this.getRunType() != null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          all[0] = Sequence.fromIterable(JUnitTests_Configuration.this.getRunType().collect(JUnitTests_Configuration.this)).toListSequence();
        }
      });
    }
    return all[0];
  }

  public List<ITestNodeWrapper> getTestsUnderProgress() {
    final List<ITestNodeWrapper> stuffToTest = ListSequence.fromList(new ArrayList<ITestNodeWrapper>());
    final JUnitRunTypes2 runTypes2 = this.getRunType();
    final JUnitTests_Configuration configuration = this;
    Runnable collect = new Runnable() {
      public void run() {
        if (runTypes2 != null) {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              ListSequence.fromList(stuffToTest).addSequence(Sequence.fromIterable(runTypes2.collect(configuration)));
            }
          });
        }
      }
    };
    if (eq_p90f5h_a0a4a51_0(this.getRunType(), JUnitRunTypes2.PROJECT) || eq_p90f5h_a0a4a51(this.getRunType(), JUnitRunTypes2.MODULE)) {
      // collecting for module/project is slow, so execute under progress 
      ProgressManager.getInstance().runProcessWithProgressSynchronously(collect, "Collecting Tests To Run", false, this.getProject());
    } else {
      collect.run();
    }
    return stuffToTest;
  }

  public List<SNodePointer> getTestsToMake() {
    final List<ITestNodeWrapper>[] stuffToTest = (List<ITestNodeWrapper>[]) new List[1];
    ApplicationManager.getApplication().invokeAndWait(new Runnable() {
      public void run() {
        stuffToTest[0] = getTestsUnderProgress();
      }
    }, ModalityState.NON_MODAL);
    return ListSequence.fromList(stuffToTest[0]).select(new ISelector<ITestNodeWrapper, SNodePointer>() {
      public SNodePointer select(ITestNodeWrapper it) {
        return it.getNodePointer();
      }
    }).toListSequence();
  }

  @Override
  public JUnitTests_Configuration clone() {
    JUnitTests_Configuration clone = null;
    try {
      clone = createCloneTemplate();
      clone.myState = (JUnitTests_Configuration.MyState) myState.clone();
      clone.myJavaRunParameters = (JavaRunParameters_Configuration) myJavaRunParameters.clone();
      return clone;
    } catch (CloneNotSupportedException ex) {
      JUnitTests_Configuration.LOG.error(ex);
    }
    return clone;
  }

  @Nullable
  public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {
    return new JUnitTests_Configuration_RunProfileState(this, executor, environment);
  }

  @Nullable
  public SettingsEditor<JDOMExternalizable> getRunnerSettingsEditor(ProgramRunner runner) {
    return null;
  }

  public JDOMExternalizable createRunnerSettings(ConfigurationInfoProvider provider) {
    return null;
  }

  public SettingsEditorEx<JUnitTests_Configuration> getConfigurationEditor() {
    return (SettingsEditorEx<JUnitTests_Configuration>) getEditor();
  }

  public JUnitTests_Configuration createCloneTemplate() {
    return (JUnitTests_Configuration) super.clone();
  }

  public SettingsEditorEx<? extends IPersistentConfiguration> getEditor() {
    return new JUnitTests_Configuration_Editor(myJavaRunParameters.getEditor());
  }

  @Override
  public boolean canExecute(String executorId) {
    return JUnitTests_Configuration_RunProfileState.canExecute(executorId);
  }

  public Object[] createMakeNodePointersTask() {
    return new Object[]{this.getTestsToMake()};
  }

  private static boolean eq_p90f5h_a0a4a51(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_p90f5h_a0a4a51_0(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  public class MyState {
    public String myModel;
    public String myModule;
    public ClonableList<String> myTestCases = new ClonableList<String>();
    public ClonableList<String> myTestMethods = new ClonableList<String>();
    public JUnitRunTypes2 myRunType;

    public MyState() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      JUnitTests_Configuration.MyState state = new JUnitTests_Configuration.MyState();
      state.myModel = myModel;
      state.myModule = myModule;
      if (myTestCases != null) {
        state.myTestCases = myTestCases.clone();
      }
      if (myTestMethods != null) {
        state.myTestMethods = myTestMethods.clone();
      }
      state.myRunType = myRunType;
      return state;
    }
  }
}
