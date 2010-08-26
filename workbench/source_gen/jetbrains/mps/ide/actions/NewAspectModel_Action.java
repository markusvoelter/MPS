package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.IModule;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.LanguageAspect;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SModelDescriptor;
import javax.swing.SwingUtilities;
import jetbrains.mps.ide.projectPane.ProjectPane;

public class NewAspectModel_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(NewAspectModel_Action.class);

  private IModule module;
  private Project ideaProject;
  private LanguageAspect aspect;

  public NewAspectModel_Action(LanguageAspect aspect_par) {
    super("Aspect Model", "", ICON);
    this.aspect = aspect_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      event.getPresentation().setText(NameUtil.capitalize(NewAspectModel_Action.this.aspect.getName()) + " Aspect");
      event.getPresentation().setIcon(IconManager.getIconForAspect(NewAspectModel_Action.this.aspect));
      if (NewAspectModel_Action.this.module instanceof Language) {
        NewAspectModel_Action.this.setEnabledState(event.getPresentation(), NewAspectModel_Action.this.aspect.get(((Language) NewAspectModel_Action.this.module)) == null);
      } else {
        NewAspectModel_Action.this.setEnabledState(event.getPresentation(), false);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "NewAspectModel", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    this.ideaProject = event.getData(MPSDataKeys.PROJECT);
    if (this.ideaProject == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.module = null;
    this.ideaProject = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final SModelDescriptor modelDescriptor = NewAspectModel_Action.this.aspect.createNew(((Language) NewAspectModel_Action.this.module));
      // we need it since tree is updated later 
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          ProjectPane.getInstance(NewAspectModel_Action.this.ideaProject).selectModel(modelDescriptor);
        }
      });
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "NewAspectModel", t);
      }
    }
  }

  @NotNull
  public String getActionId() {
    StringBuilder res = new StringBuilder(500);
    res.append(NewAspectModel_Action.class.getName());
    res.append("#");
    res.append(aspect_State((LanguageAspect) this.aspect));
    res.append("!");
    return res.toString();
  }

  public static String aspect_State(LanguageAspect object) {
    return object.getName();
  }
}
