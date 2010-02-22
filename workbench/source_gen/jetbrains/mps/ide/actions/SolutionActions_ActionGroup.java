package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class SolutionActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(SolutionActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.SolutionActions";
  public static final String LABEL_ID_solutionNew = ID + "solutionNew";
  public static final String LABEL_ID_generateModule = ID + "generateModule";
  public static final String LABEL_ID_refactoring = ID + "refactoring";
  public static final String LABEL_ID_favorites = ID + "favorites";

  public SolutionActions_ActionGroup() {
    super("SolutionActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      SolutionActions_ActionGroup.this.addAnchor(SolutionActions_ActionGroup.LABEL_ID_solutionNew);
      SolutionActions_ActionGroup.this.addSeparator();
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.AddModuleToProject_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.RemoveModuleFromProject_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.DeleteModules_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CopyModuleName_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addSeparator();
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GetModuleContentsFromSource_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addSeparator();
      SolutionActions_ActionGroup.this.addAnchor(SolutionActions_ActionGroup.LABEL_ID_generateModule);
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateTextFromSolution_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CheckModule_Action", "jetbrains.mps.ide", "Solution");
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.OptimizeModuleImports_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.AnalyzeClasspath_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowModuleDependencies_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addSeparator();
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.MakeModule_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.RebuildModule_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CleanModule_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addSeparator();
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.SetModuleFolder_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addSeparator();
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.SolutionProperties_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addSeparator();
      SolutionActions_ActionGroup.this.addAnchor(SolutionActions_ActionGroup.LABEL_ID_refactoring);
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ModuleRefactoringHistory_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.UpgradeModelPersistenceInModule_Action", "jetbrains.mps.ide");
      SolutionActions_ActionGroup.this.addSeparator();
      SolutionActions_ActionGroup.this.addAnchor(SolutionActions_ActionGroup.LABEL_ID_favorites);
      SolutionActions_ActionGroup.this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
