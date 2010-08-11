package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import java.util.List;
import javax.swing.tree.TreeNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.projectPane.NamespaceTextNode;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.generator.generationTypes.JavaGenerationHandler;
import jetbrains.mps.generator.GeneratorManager;

public class GenerateFiles_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GenerateFiles_Action.class);

  private Project project;
  private List<TreeNode> ppNodes;

  public GenerateFiles_Action() {
    super("Generate Files", "Generate files from all models under this namespace", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    for (TreeNode selectedNode : GenerateFiles_Action.this.ppNodes) {
      if (!(selectedNode instanceof NamespaceTextNode)) {
        return false;
      }
    }
    return GenerateFiles_Action.this.getGenManager() != null;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GenerateFiles", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.ppNodes = event.getData(MPSDataKeys.LOGICAL_VIEW_NODES);
    if (this.ppNodes == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.project = null;
    this.ppNodes = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      IOperationContext projectContext = ProjectOperationContext.get(GenerateFiles_Action.this.project);
      List<EditableSModelDescriptor> models = new ArrayList<EditableSModelDescriptor>();
      for (TreeNode ppNode : ListSequence.fromList(GenerateFiles_Action.this.ppNodes)) {
        for (SModelDescriptor model : ListSequence.fromList(((NamespaceTextNode) ppNode).getModelsUnder())) {
          if (model instanceof EditableSModelDescriptor) {
            models.add(((EditableSModelDescriptor) model));
          }
        }
      }
      GenerateFiles_Action.this.getGenManager().generateModelsFromDifferentModules(projectContext, models, new JavaGenerationHandler());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GenerateFiles", t);
      }
    }
  }

  private GeneratorManager getGenManager() {
    return GenerateFiles_Action.this.project.getComponent(GeneratorManager.class);
  }
}
