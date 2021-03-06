package jetbrains.mps.baseLanguage.execution.plugin;

/*Generated by MPS */

import jetbrains.mps.execution.api.configurations.BaseMpsRunConfiguration;
import jetbrains.mps.execution.api.settings.IPersistentConfiguration;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.execution.lib.MultiConceptNode_Configuration;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ArrayUtils;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.execution.api.Java_Command;
import jetbrains.mps.baseLanguage.execution.api.JavaRunParameters_Configuration;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import org.jdom.Element;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.util.xmlb.XmlSerializer;
import com.intellij.openapi.util.InvalidDataException;
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
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNodePointer;

public class Java_Configuration extends BaseMpsRunConfiguration implements IPersistentConfiguration {
  private static final Logger LOG = Logger.getLogger(Java_Configuration.class);

  @NotNull
  private Java_Configuration.MyState myState = new Java_Configuration.MyState();
  private MultiConceptNode_Configuration myNode = new MultiConceptNode_Configuration(Sequence.fromIterable(Sequence.fromArray(ArrayUtils.asArray(MultiTuple.<SNode,_FunctionTypes._return_P1_E0<? extends Boolean, ? super SNode>>from(ModelAccess.instance().runReadAction(new Computable<SNode>() {
    public SNode compute() {
      return SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassConcept");
    }
  }), new _FunctionTypes._return_P1_E0<Boolean, SNode>() {
    public Boolean invoke(SNode node) {
      return ((Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.BaseConcept"), "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_isRunnable_7941158526576616752", new Class[]{SNode.class}));
    }
  }), MultiTuple.<SNode,_FunctionTypes._return_P1_E0<? extends Boolean, ? super SNode>>from(ModelAccess.instance().runReadAction(new Computable<SNode>() {
    public SNode compute() {
      return SConceptOperations.findConceptDeclaration("jetbrains.mps.execution.util.structure.IMainClass");
    }
  }), new _FunctionTypes._return_P1_E0<Boolean, SNode>() {
    public Boolean invoke(SNode node) {
      return ((Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(SNodeOperations.cast(node, "jetbrains.mps.execution.util.structure.IMainClass"), "jetbrains.mps.execution.util.structure.IMainClass"), "virtual_isNodeRunnable_4666195181811081448", new Class[]{SNode.class})) && Java_Command.isUnitNode(node);
    }
  })))).toListSequence());
  private JavaRunParameters_Configuration myRunParameters = new JavaRunParameters_Configuration();

  public Java_Configuration(Project project, Java_Configuration_Factory factory, String name) {
    super(project, factory, name);
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
    this.getNode().checkConfiguration();
    if (SNodeOperations.isInstanceOf(this.getNode().getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      final Wrappers._boolean hasMainMethod = new Wrappers._boolean();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          hasMainMethod.value = (((SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(SNodeOperations.cast(Java_Configuration.this.getNode().getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "call_getMainMethod_1213877355884", new Class[]{SNode.class})) == null);
        }
      });
      if (hasMainMethod.value) {
        throw new RuntimeConfigurationException("Selected class does not have main method.");
      }
    }
  }

  @Override
  public void writeExternal(Element element) throws WriteExternalException {
    element.addContent(XmlSerializer.serialize(myState));
    {
      Element fieldElement = new Element("myNode");
      myNode.writeExternal(fieldElement);
      element.addContent(fieldElement);
    }
    {
      Element fieldElement = new Element("myRunParameters");
      myRunParameters.writeExternal(fieldElement);
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
      Element fieldElement = element.getChild("myNode");
      myNode.readExternal(fieldElement);
    }
    {
      Element fieldElement = element.getChild("myRunParameters");
      myRunParameters.readExternal(fieldElement);
    }
  }

  public MultiConceptNode_Configuration getNode() {
    return myNode;
  }

  public JavaRunParameters_Configuration getRunParameters() {
    return myRunParameters;
  }

  @Override
  public Java_Configuration clone() {
    Java_Configuration clone = null;
    try {
      clone = createCloneTemplate();
      clone.myState = (Java_Configuration.MyState) myState.clone();
      clone.myNode = (MultiConceptNode_Configuration) myNode.clone();
      clone.myRunParameters = (JavaRunParameters_Configuration) myRunParameters.clone();
      return clone;
    } catch (CloneNotSupportedException ex) {
      Java_Configuration.LOG.error(ex);
    }
    return clone;
  }

  @Nullable
  public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {
    return new Java_Configuration_RunProfileState(this, executor, environment);
  }

  @Nullable
  public SettingsEditor<JDOMExternalizable> getRunnerSettingsEditor(ProgramRunner runner) {
    return null;
  }

  public JDOMExternalizable createRunnerSettings(ConfigurationInfoProvider provider) {
    return null;
  }

  public SettingsEditorEx<Java_Configuration> getConfigurationEditor() {
    return (SettingsEditorEx<Java_Configuration>) getEditor();
  }

  public Java_Configuration createCloneTemplate() {
    return (Java_Configuration) super.clone();
  }

  public SettingsEditorEx<? extends IPersistentConfiguration> getEditor() {
    return new Java_Configuration_Editor(myNode.getEditor(), myRunParameters.getEditor());
  }

  @Override
  public boolean canExecute(String executorId) {
    return Java_Configuration_RunProfileState.canExecute(executorId);
  }

  public Object[] createMakeNodePointersTask() {
    return new Object[]{ListSequence.fromListAndArray(new ArrayList<SNodePointer>(), this.getNode().getNodePointer())};
  }

  public class MyState {
    public MyState() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      Java_Configuration.MyState state = new Java_Configuration.MyState();
      return state;
    }
  }
}
