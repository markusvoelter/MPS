package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.dialogs.project.properties.language.LanguagePropertiesDialog;
import jetbrains.mps.smodel.ModelAccess;

public class LanguageProperties_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(LanguageProperties_Action.class);
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}\\icons\\languageProperties.png", "jetbrains.mps.ide"), true);

  public IOperationContext context;

  public LanguageProperties_Action() {
    super("Language Properties", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "alt ENTER";
  }

  public boolean isApplicable(AnActionEvent event) {
    return new ActionEventData(event).getModule() instanceof Language;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "LanguageProperties", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ActionEventData data = new ActionEventData(event);
      final Language language = (Language)data.getModule();
      final IOperationContext localContext = LanguageProperties_Action.this.context;
      final LanguagePropertiesDialog[] dialog = new LanguagePropertiesDialog[1];
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          dialog[0] = new LanguagePropertiesDialog(language, localContext);
        }

      });
      dialog[0].showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "LanguageProperties", t);
    }
  }

}
