package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.ide.actions.nodes.GoToEditorDeclarationAction;
import jetbrains.mps.ide.actions.nodes.GoToRulesAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.actions.goTo.actions.*;

public class Goto_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(Goto_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Goto";

  public Goto_ActionGroup() {
    super("Go To", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new GoToActionAction());
      this.addSeparator();
      this.add(new GoToRootNodeAction());
      this.add(new GoToNamedNodeAction());
      this.add(new GoToConceptNodeAction());
      this.add(new GoToNodeByIdAction());
      this.addSeparator();
      this.add(new GoToConceptDeclaration_Action());
      this.add(new GoToEditorDeclarationAction());
      this.add(new GoToRulesAction());
      this.addSeparator();
      this.add(new GoToModelAction());
      this.add(new GoToLanguageAction());
      this.add(new GoToSolutionAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      DefaultActionGroup gToDef = ActionUtils.getDefaultGroup("GoToMenu");
      BaseGroup gWhat = ActionUtils.getGroup(Goto_ActionGroup.ID);
      if (gToDef == null || gWhat == null) {
        return;
      }
      gToDef.add(gWhat);
    }
  }

}
