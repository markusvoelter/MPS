package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.module.GenerateAllModelsInModuleAction_false;
import jetbrains.mps.ide.actions.generate.ToggleTransientModelsSavingAction;
import jetbrains.mps.ide.actions.generate.GenerateFilesFromCurrentModelAction;
import jetbrains.mps.ide.actions.generate.GenerateTextFromCurrentModelAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class Generate_ActionGroup extends BaseActionGroup {
  public static final String ID = "jetbrains.mps.ide.actions.Generate";

  public  Generate_ActionGroup(MPSProject project) {
    super("Generate", Generate_ActionGroup.ID);
    this.setMnemonic("G".charAt(0));
    this.setInternal(false);
    this.add(new GenerateAllModelsInModuleAction_false(), this);
    this.addSeparator();
    this.add(new ToggleTransientModelsSavingAction(), this);
    this.addSeparator();
    this.add(new GenerateFilesFromCurrentModelAction(), this);
    this.add(new GenerateTextFromCurrentModelAction(), this);
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup(MainMenu_ActionGroup.ID);
      ActionGroup gWhat = manager.getGroup(Generate_ActionGroup.ID);
      if(gTo == null || gWhat == null) {
        return;
      }
      {
        String labelName;
        labelName = MainMenu_ActionGroup.LABEL_ID_generate;
        gTo.add(gWhat, owner, labelName);
      }
    }
  }

}
