package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.lang.refactoring.plugin.NodeRefactoring_ActionGroup;

public class RefactoringAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(RefactoringAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.RefactoringAddition";

  public RefactoringAddition_ActionGroup() {
    super("RefactoringAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.InlineLocalVariable_Action", "jetbrains.mps.baseLanguage");
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.ExtractMethod_Action", "jetbrains.mps.baseLanguage");
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.InlineMethod_Action", "jetbrains.mps.baseLanguage");
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.ChangeMethodSignature_Action", "jetbrains.mps.baseLanguage");
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.RenameMethodDeclaration_Action", "jetbrains.mps.baseLanguage");
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.IntroduceVariable_Action", "jetbrains.mps.baseLanguage");
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.IntroduceField_Action", "jetbrains.mps.baseLanguage");
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.IntroduceConstant_Action", "jetbrains.mps.baseLanguage");
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.MoveStaticMethod_Action", "jetbrains.mps.baseLanguage");
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.RenameVariable_Action", "jetbrains.mps.baseLanguage");
      RefactoringAddition_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.RenameMethod_Action", "jetbrains.mps.baseLanguage");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(NodeRefactoring_ActionGroup.ID, null);
  }
}
