package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.project.Solution;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.project.DevKit;

public class AddModuleToProject_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(AddModuleToProject_Action.class);

  private List<IModule> modules;
  private MPSProject mpsProject;

  public AddModuleToProject_Action() {
    super("Add to Project", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    for (IModule module : AddModuleToProject_Action.this.modules) {
      if (AddModuleToProject_Action.this.mpsProject.getModules().contains(module)) {
        return false;
      }
    }
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "AddModuleToProject", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.modules = event.getData(MPSDataKeys.MODULES);
    if (this.modules == null) {
      return false;
    }
    this.mpsProject = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.mpsProject == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      for (IModule module : ListSequence.fromList(AddModuleToProject_Action.this.modules)) {
        if (module instanceof Language) {
          AddModuleToProject_Action.this.mpsProject.addProjectLanguage(((Language) module));
        } else if (module instanceof Solution) {
          IFile file = module.getDescriptorFile();
          assert file != null;
          AddModuleToProject_Action.this.mpsProject.addProjectSolution(file.toFile());
        } else if (module instanceof DevKit) {
          IFile file = module.getDescriptorFile();
          assert file != null;
          AddModuleToProject_Action.this.mpsProject.addProjectDevKit(file);
        }
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "AddModuleToProject", t);
      }
    }
  }
}
