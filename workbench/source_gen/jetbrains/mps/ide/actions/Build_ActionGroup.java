package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.actions.build.CleanAllAction;
import jetbrains.mps.workbench.actions.build.MakeAllAction;
import jetbrains.mps.workbench.actions.build.RebuildAllAction;

public class Build_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(Build_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Build";

  public Build_ActionGroup() {
    super("Build", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(false);
    this.setMnemonic("B".charAt(0));
    this.setPopup(false);
    try {
      this.add(new MakeAllAction());
      this.add(new CleanAllAction());
      this.add(new RebuildAllAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      DefaultActionGroup gToDef = ActionUtils.getDefaultGroup("BuildMenu");
      BaseGroup gWhat = ActionUtils.getGroup(Build_ActionGroup.ID);
      if (gToDef == null || gWhat == null) {
        return;
      }
      gToDef.add(gWhat);
    }
  }

}
