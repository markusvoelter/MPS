package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleReference;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.actions.language.NewAccessoryModelAction;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class LanguageNewActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(LanguageNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.LanguageNewActions";

  public LanguageNewActions_ActionGroup() {
    super("New", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().getRegisteredAction(language.getClass("jetbrains.mps.ide.actions.NewGenerator_Action"), language.getModuleFqName()));
      }
      this.addSeparator();
      if (BaseGroup.class.isAssignableFrom(NewAccessoryModelAction.class)) {
        this.add(new NewAccessoryModelAction());
      } else {
        this.add(ActionFactory.getInstance().getRegisteredAction(NewAccessoryModelAction.class, null));
      }
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(LanguageActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(LanguageNewActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = LanguageActions_ActionGroup.LABEL_ID_newGroup;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
  }

}
