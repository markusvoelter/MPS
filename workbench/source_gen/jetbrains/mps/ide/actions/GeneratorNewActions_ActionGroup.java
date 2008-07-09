package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.model.NewModelAction;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class GeneratorNewActions_ActionGroup extends BaseGroup {
  public static Logger LOG = Logger.getLogger(GeneratorNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.GeneratorNewActions";

  public GeneratorNewActions_ActionGroup() {
    super("New", ID, true, false, null);
    this.setPopup(true);
    try {
      this.add(new NewModelAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(GeneratorActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(GeneratorNewActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = GeneratorActions_ActionGroup.LABEL_ID_generatorNew;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
  }

}
