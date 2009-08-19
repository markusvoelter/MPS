package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.actions.module.GenerateAllModelsInModuleAction;

public class GenerateModule_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GenerateModule_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.GenerateModule";

  public GenerateModule_ActionGroup() {
    super("GenerateModule", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      GenerateModule_ActionGroup.this.addAction("jetbrains.mps.ide.actions.RegenerateModule_Action", "jetbrains.mps.ide", new GenerateAllModelsInModuleAction(true));
      GenerateModule_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateModule_Action", "jetbrains.mps.ide", new GenerateAllModelsInModuleAction(false));
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(LanguageActions_ActionGroup.ID, LanguageActions_ActionGroup.LABEL_ID_generateModule);
    this.insertGroupIntoAnother(SolutionActions_ActionGroup.ID, SolutionActions_ActionGroup.LABEL_ID_generateModule);
    this.insertGroupIntoAnother(Generate_ActionGroup.ID, Generate_ActionGroup.LABEL_ID_generateModule);
  }
}
