package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.renameModel.ModelRenamer;

public class RenameAspects_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(RenameAspects_Action.class);

  public RenameAspects_Action() {
    super("RenameAspects", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "RenameAspects", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      for (Language l : ListSequence.fromList(MPSModuleRepository.getInstance().getAllLanguages())) {
        RenameAspects_Action.this.renameAspect(l, "helgins", "typesystem");
        RenameAspects_Action.this.renameAspect(l, "languageTest", "test");
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "RenameAspects", t);
      }
    }
  }

  private void renameAspect(Language l, String oldName, String newName) {
    SModelFqName oldFqName = SModelFqName.fromString(l.getModuleFqName() + "." + oldName);
    SModelFqName newFqName = SModelFqName.fromString(l.getModuleFqName() + "." + newName);
    SModelDescriptor model = l.getScope().getModelDescriptor(oldFqName);
    if (model == null) {
      return;
    }
    new ModelRenamer(model, newFqName, false).rename();
  }
}
