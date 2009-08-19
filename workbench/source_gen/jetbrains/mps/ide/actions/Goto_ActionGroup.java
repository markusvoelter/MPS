package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.ide.actions.GotoActionAction;
import jetbrains.mps.workbench.actions.goTo.GoToRootNodeAction;
import jetbrains.mps.workbench.actions.goTo.GoToNamedNodeAction;
import jetbrains.mps.workbench.actions.goTo.GoToModelAction;
import jetbrains.mps.workbench.actions.goTo.GoToLanguageAction;
import jetbrains.mps.workbench.actions.goTo.GoToSolutionAction;
import jetbrains.mps.workbench.actions.goTo.GoToDevkitAction;

public class Goto_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Goto_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Goto";

  public Goto_ActionGroup() {
    super("Go To", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToAction_Action", "jetbrains.mps.ide", new GotoActionAction());
      Goto_ActionGroup.this.addSeparator();
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToRootNode_Action", "jetbrains.mps.ide", new GoToRootNodeAction());
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToNamedNode_Action", "jetbrains.mps.ide", new GoToNamedNodeAction());
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToNodeById_Action", "jetbrains.mps.ide");
      Goto_ActionGroup.this.addSeparator();
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToConceptDeclaration_Action", "jetbrains.mps.ide");
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToEditorDeclaration_Action", "jetbrains.mps.ide");
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToRules_Action", "jetbrains.mps.ide");
      Goto_ActionGroup.this.addSeparator();
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToModel_Action", "jetbrains.mps.ide", new GoToModelAction());
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToLanguage_Action", "jetbrains.mps.ide", new GoToLanguageAction());
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToSolution_Action", "jetbrains.mps.ide", new GoToSolutionAction());
      Goto_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GoToDevkit_Action", "jetbrains.mps.ide", new GoToDevkitAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother("GoToMenu", null);
  }
}
