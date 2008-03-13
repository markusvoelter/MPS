package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.gotoMenu.GoToRootAction;
import jetbrains.mps.ide.actions.gotoMenu.GoToSymbolAction;
import jetbrains.mps.ide.actions.gotoMenu.GoToConceptAction;
import jetbrains.mps.ide.actions.gotoMenu.GoToNodeAction;
import jetbrains.mps.ide.actions.nodes.GoToConceptDeclarationAction;
import jetbrains.mps.ide.actions.nodes.GoToEditorDeclarationAction;
import jetbrains.mps.ide.actions.nodes.GoToRulesAction;
import jetbrains.mps.ide.actions.gotoMenu.GoToProjectPaneAction;
import jetbrains.mps.ide.actions.gotoMenu.ReturnToEditorAction;
import jetbrains.mps.ide.actions.gotoMenu.GoToLanguageAction;
import jetbrains.mps.ide.actions.gotoMenu.GoToModelAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class Goto_ActionGroup extends BaseActionGroup {

  public  Goto_ActionGroup(MPSProject project) {
    super("Go To", "jetbrains.mps.ide.actions.Goto");
    this.setMnemonic("O".charAt(0));
    this.setInternal(false);
    this.add(new GoToRootAction());
    this.add(new GoToSymbolAction());
    this.add(new GoToConceptAction());
    this.add(new GoToNodeAction());
    this.addSeparator();
    this.add(new GoToConceptDeclarationAction());
    this.add(new GoToEditorDeclarationAction());
    this.add(new GoToRulesAction());
    this.addSeparator();
    this.add(new GoToProjectPaneAction());
    this.add(new ReturnToEditorAction());
    this.addSeparator();
    this.add(new GoToLanguageAction());
    this.add(new GoToModelAction());
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup("jetbrains.mps.ide.actions.MainMenu");
      ActionGroup gWhat = manager.getGroup("jetbrains.mps.ide.actions.Goto");
      if(gTo == null || gWhat == null) {
        return;
      }
      gTo.add(gWhat, owner, "jetbrains.mps.ide.actions.goto_ExtentionPoint");
    }
  }

}
