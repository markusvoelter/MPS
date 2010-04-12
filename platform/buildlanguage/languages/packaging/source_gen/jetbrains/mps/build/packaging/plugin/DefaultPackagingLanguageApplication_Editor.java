package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.baseLanguage.runConfigurations.runtime.JavaConfigOptions;
import jetbrains.mps.baseLanguage.runConfigurations.runtime.MainNodeChooser;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.awt.GridBagLayout;
import jetbrains.mps.baseLanguage.util.plugin.run.LayoutUtil;
import jetbrains.mps.baseLanguage.runConfigurations.runtime.IJavaNodeChangeListener;
import javax.swing.JLabel;

public class DefaultPackagingLanguageApplication_Editor extends JPanel {
  private JavaConfigOptions myJavaConfigurationOptions = new JavaConfigOptions();
  private ConfigurationChoosePanel myUsersComponent = new ConfigurationChoosePanel();
  private MainNodeChooser myChooseNodeComponent = new MainNodeChooser(new _FunctionTypes._return_P0_E0<SNode>() {
    public SNode invoke() {
      final Wrappers._T<SNode> c = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          c.value = SConceptOperations.findConceptDeclaration("jetbrains.mps.build.packaging.structure.MPSLayout");
        }
      });
      return c.value;
    }
  }.invoke(), new _FunctionTypes._return_P1_E0<Boolean, SNode>() {
    public Boolean invoke(SNode node) {
      return ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.build.packaging.structure.INotBuildableComponent", false, new String[]{})).isEmpty();
    }
  });

  public DefaultPackagingLanguageApplication_Editor() {
    super(new GridBagLayout());

    this.add(this.myUsersComponent, LayoutUtil.createPanelConstraints(1));
    this.add(this.myJavaConfigurationOptions, LayoutUtil.createPanelConstraints(2));
    {
      MainNodeChooser chooser = this.myChooseNodeComponent;
      chooser.addNodeChangeListener(new IJavaNodeChangeListener() {
        public void nodeChanged(SNode node) {
          DefaultPackagingLanguageApplication_Editor.this.myUsersComponent.nodeChanged(node);
        }
      });

      JPanel panel = new JPanel(new GridBagLayout());
      panel.add(new JLabel("Main node:"), LayoutUtil.createLabelConstraints(0));
      panel.add(chooser, LayoutUtil.createPanelConstraints(1));
      this.add(panel, LayoutUtil.createPanelConstraints(0));
    }
  }

  public void apply(DefaultPackagingLanguageApplication_Configuration configuration) {
    this.myJavaConfigurationOptions.apply(configuration.getStateObject().myJavaRunParameters);
    {
      MainNodeChooser mainClassField = this.myChooseNodeComponent;
      configuration.setNode(mainClassField.getNode());
    }
  }

  public void reset(DefaultPackagingLanguageApplication_Configuration configuration) {
    this.myJavaConfigurationOptions.reset(configuration.getStateObject().myJavaRunParameters);
    (this.myChooseNodeComponent).setNode(configuration.getNode());
  }

  public void dispose() {
    this.myJavaConfigurationOptions.dispose();
  }

  public ConfigurationChoosePanel getUsersComponent() {
    return this.myUsersComponent;
  }
}
