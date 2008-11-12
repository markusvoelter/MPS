package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.actions.model.CreateRootNodeGroup;
import jetbrains.mps.workbench.actions.nodes.PasteNodeAction;
import jetbrains.mps.workbench.actions.model.DeleteModelsAction;
import jetbrains.mps.workbench.actions.model.OptimizeImportsAction;
import jetbrains.mps.workbench.actions.model.ShowReferencesToMissingStuffAction;
import jetbrains.mps.workbench.actions.model.GenerateGroup_autoplan;
import jetbrains.mps.generator.IGenerationType;
import jetbrains.mps.workbench.actions.model.ShowMappingsPartitioningAction;
import jetbrains.mps.workbench.actions.model.ModelPropertiesAction;

public class ModelActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ModelActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ModelActions";
  public static final String LABEL_ID_refactoring = ID + "refactoring";
  public static final String LABEL_ID_vcs = ID + "vcs";

  public ModelActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new CreateRootNodeGroup());
      this.add(new PasteNodeAction());
      this.addSeparator();
      this.add(new DeleteModelsAction());
      this.add(new CloneModel_Action());
      this.addSeparator();
      this.add(new OptimizeImportsAction());
      this.add(new AddMissingImports_Action());
      this.add(new ShowReferencesToMissingStuffAction());
      this.addSeparator();
      this.add(new CheckModel_Action());
      this.addSeparator();
      this.add(new GenerateGroup_autoplan(IGenerationType.FILES));
      this.add(new GenerateGroup_autoplan(IGenerationType.TEXT));
      this.add(new ShowMappingsPartitioningAction());
      this.addSeparator();
      this.add(new ShowDifferencesWithModelOnDisk_Action());
      this.addSeparator();
      this.add(new RevertMemoryChanges_Action());
      this.add(new SaveModel_Action());
      this.addSeparator();
      this.addAnchor(ModelActions_ActionGroup.LABEL_ID_refactoring);
      this.addSeparator();
      this.addAnchor(ModelActions_ActionGroup.LABEL_ID_vcs);
      this.addSeparator();
      this.add(new ModelPropertiesAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
