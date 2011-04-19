package jetbrains.mps.execution.demo.plugin;

/*Generated by MPS */

import jetbrains.mps.execution.configurations.lib.Node_Configuration;
import jetbrains.mps.execution.configurations.runtime.BaseMpsRunConfiguration;
import jetbrains.mps.execution.settings.runtime.IPersistentConfiguration;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.RuntimeConfigurationException;
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
import jetbrains.mps.execution.settings.runtime.SettingsEditorEx;

public class DemoApplication_Configuration extends BaseMpsRunConfiguration implements IPersistentConfiguration {
  private static final Logger LOG = Logger.getLogger(DemoApplication_Configuration.class);
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${mps_home}/core/baseLanguage/baseLanguage/icons/run.png", "jetbrains.mps.execution.demo"), true);

  @NotNull
  private DemoApplication_Configuration.MyState myState = new DemoApplication_Configuration.MyState();
  private Node_Configuration myNode = new Node_Configuration(new _FunctionTypes._return_P0_E0<SNode>() {
    public SNode invoke() {
      final Wrappers._T<SNode> concept = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          concept.value = SConceptOperations.findConceptDeclaration("jetbrains.mps.execution.demo.structure.SomeConcept");
        }
      });
      return concept.value;
    }
  }.invoke(), new _FunctionTypes._return_P1_E0<Boolean, SNode>() {
    public Boolean invoke(SNode node) {
      return SPropertyOperations.getBoolean(SNodeOperations.cast(node, "jetbrains.mps.execution.demo.structure.SomeConcept"), "valid");
    }
  });
  private Make_Configuration myMake = new Make_Configuration();

  public DemoApplication_Configuration(Project project, DemoApplication_Configuration_Factory factory, String name) {
    super(project, factory, name);
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
    this.getNode().checkConfiguration();
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
      Element fieldElement = new Element("myMake");
      myMake.writeExternal(fieldElement);
      element.addContent(fieldElement);
    }
  }

  @Override
  public void readExternal(Element element) throws InvalidDataException {
    XmlSerializer.deserializeInto(myState, (Element) element.getChildren().get(0));
    {
      Element fieldElement = element.getChild("myNode");
      myNode.readExternal(fieldElement);
    }
    {
      Element fieldElement = element.getChild("myMake");
      myMake.readExternal(fieldElement);
    }
  }

  public Node_Configuration getNode() {
    return myNode;
  }

  public Make_Configuration getMake() {
    return myMake;
  }

  @Override
  public DemoApplication_Configuration clone() {
    DemoApplication_Configuration clone = null;
    try {
      clone = createCloneTemplate();
      clone.myState = (DemoApplication_Configuration.MyState) myState.clone();
      clone.myNode = (Node_Configuration) myNode.clone();
      clone.myMake = (Make_Configuration) myMake.clone();
      return clone;
    } catch (CloneNotSupportedException ex) {
      DemoApplication_Configuration.LOG.error(ex);
    }
    return clone;
  }

  @Nullable
  public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {
    return new DemoApplication_Configuration_RunProfileState(this, executor, environment);
  }

  @Nullable
  public SettingsEditor<JDOMExternalizable> getRunnerSettingsEditor(ProgramRunner runner) {
    return null;
  }

  public JDOMExternalizable createRunnerSettings(ConfigurationInfoProvider provider) {
    return null;
  }

  public SettingsEditorEx<DemoApplication_Configuration> getConfigurationEditor() {
    return (SettingsEditorEx<DemoApplication_Configuration>) getEditor();
  }

  public DemoApplication_Configuration createCloneTemplate() {
    return (DemoApplication_Configuration) super.clone();
  }

  public SettingsEditorEx<? extends IPersistentConfiguration> getEditor() {
    return new DemoApplication_Configuration_Editor(myNode.getEditor(), myMake.getEditor());
  }

  public Icon getIcon() {
    return ICON;
  }

  @Override
  public boolean canExecute(String executorId) {
    return DemoApplication_Configuration_RunProfileState.canExecute(executorId);
  }

  public class MyState {
    public MyState() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      DemoApplication_Configuration.MyState state = new DemoApplication_Configuration.MyState();
      return state;
    }
  }
}
