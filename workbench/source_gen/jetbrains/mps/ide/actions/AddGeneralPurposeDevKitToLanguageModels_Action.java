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
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.library.GeneralPurpose_DevKit;
import jetbrains.mps.smodel.SModelRepository;

public class AddGeneralPurposeDevKitToLanguageModels_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(AddGeneralPurposeDevKitToLanguageModels_Action.class);

  public AddGeneralPurposeDevKitToLanguageModels_Action() {
    super("Add General Purpose Devkit to Language Models", "", ICON);
    this.setIsAlwaysVisible(false);
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
        log.error("User's action doUpdate method failed. Action:" + "AddGeneralPurposeDevKitToLanguageModels", t);
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
        for (EditableSModelDescriptor aspect : SetSequence.fromSet(l.getAspectModelDescriptors())) {
          aspect.getSModel().addDevKit(GeneralPurpose_DevKit.get().getModuleReference());
        }
      }
      SModelRepository.getInstance().saveAll();
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "AddGeneralPurposeDevKitToLanguageModels", t);
      }
    }
  }
}
