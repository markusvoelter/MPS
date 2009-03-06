package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class SolutionActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(SolutionActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.SolutionActions";
  public static final String LABEL_ID_solutionNew = ID + "solutionNew";
  public static final String LABEL_ID_refactoring = ID + "refactoring";

  public SolutionActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAnchor(SolutionActions_ActionGroup.LABEL_ID_solutionNew);
      this.addSeparator();
      this.addAction("jetbrains.mps.workbench.actions.project.AddModuleToProjectAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.RemoveModuleFromProject_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.module.DeleteModuleAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.CopyModuleName_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.workbench.actions.module.GenerateAllModelsInModuleAction", "jetbrains.mps.ide", true);
      this.addAction("jetbrains.mps.workbench.actions.module.GenerateAllModelsInModuleAction", "jetbrains.mps.ide", false);
      this.addAction("jetbrains.mps.workbench.actions.solution.GenerateTextFromAllModelsInSolutionAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.CheckSolution_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.solution.OptimizeSolutionImportsAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.AnalyzeClasspath_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.module.ShowModuleDependenciesAction", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.MakeModule_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.RebuildModule_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.CleanModule_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.SetModuleFolder_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.SolutionProperties_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAnchor(SolutionActions_ActionGroup.LABEL_ID_refactoring);
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
