package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class Generate_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Generate_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Generate";
  public static final String LABEL_ID_saveTransientModels = ID + "saveTransientModels";
  public static final String LABEL_ID_generateModule = ID + "generateModule";
  public static final String LABEL_ID_generateModel = ID + "generateModel";

  public Generate_ActionGroup() {
    super("Generate", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      Generate_ActionGroup.this.addAnchor(Generate_ActionGroup.LABEL_ID_saveTransientModels);
      Generate_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CheckModelsBeforeGeneration_Action", "jetbrains.mps.ide");
      Generate_ActionGroup.this.addSeparator();
      Generate_ActionGroup.this.addAnchor(Generate_ActionGroup.LABEL_ID_generateModule);
      Generate_ActionGroup.this.addSeparator();
      Generate_ActionGroup.this.addAnchor(Generate_ActionGroup.LABEL_ID_generateModel);
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother("GenerateMenu", null);
  }
}
