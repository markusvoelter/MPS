package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;

import javax.swing.Icon;

import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.messages.MessagesViewTool;
import jetbrains.mps.project.IModule;
import jetbrains.mps.generator.TransientModelsModule;
import jetbrains.mps.smodel.SModelRepository;

public class RemoveTransientModels_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(RemoveTransientModels_Action.class);
  private static final Icon ICON = null;

  public MPSProject project;

  public RemoveTransientModels_Action() {
    super("Remove Transient Models", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "RemoveTransientModels", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      RemoveTransientModels_Action.this.project.getComponent(MessagesViewTool.class).clear();
      IModule module = RemoveTransientModels_Action.this.project.getComponentSafe(TransientModelsModule.class);
      SModelRepository.getInstance().unRegisterModelDescriptors(module);
      SModelRepository.getInstance().removeUnusedDescriptors();
      System.gc();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "RemoveTransientModels", t);
    }
  }

}
