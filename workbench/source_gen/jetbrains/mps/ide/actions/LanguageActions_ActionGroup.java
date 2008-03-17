package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.action.Label;
import jetbrains.mps.ide.actions.module.GenerateAllModelsInModuleAction_true;
import jetbrains.mps.ide.actions.module.GenerateAllModelsInModuleAction_false;
import jetbrains.mps.ide.modelchecker.CheckLanguageAction;
import jetbrains.mps.ide.actions.language.OptimizeLanguageImportsAction;
import jetbrains.mps.ide.actions.language.LanguagePropertiesAction;
import jetbrains.mps.ide.hierarchy.LanguageHierarchyAction;
import jetbrains.mps.ide.actions.project.AddModuleToProjectAction;
import jetbrains.mps.ide.actions.project.RemoveModuleFromProjectAction;
import jetbrains.mps.ide.actions.make.MakeModuleAction;
import jetbrains.mps.ide.actions.make.CleanModuleAction;
import jetbrains.mps.ide.actions.module.SetModuleFolderAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;

public class LanguageActions_ActionGroup extends BaseActionGroup {
  public static final String ID = "jetbrains.mps.ide.actions.LanguageActions";
  public static final String LABEL_ID_newGroup = "newGroup";

  public  LanguageActions_ActionGroup(MPSProject project) {
    super("", LanguageActions_ActionGroup.ID);
    this.setInternal(false);
    this.add(new Label(LanguageActions_ActionGroup.LABEL_ID_newGroup), this);
    this.addSeparator();
    this.add(new GenerateAllModelsInModuleAction_true(), this);
    this.add(new GenerateAllModelsInModuleAction_false(), this);
    this.add(new CheckLanguageAction(), this);
    this.add(new OptimizeLanguageImportsAction(), this);
    this.addSeparator();
    this.add(new LanguagePropertiesAction(), this);
    this.add(new LanguageHierarchyAction(), this);
    this.addSeparator();
    this.add(new AddModuleToProjectAction(), this);
    this.add(new RemoveModuleFromProjectAction(), this);
    this.addSeparator();
    this.add(new MakeModuleAction(), this);
    this.add(new CleanModuleAction(), this);
    this.addSeparator();
    this.add(new SetModuleFolderAction(), this);
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
  }

}
