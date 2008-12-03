package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class AbstractFileActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(AbstractFileActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.AbstractFileActions";
  public static final String LABEL_ID_vcs = ID + "vcs";

  public AbstractFileActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.ide.projectPane.fileSystem.actions.FileCutAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.projectPane.fileSystem.actions.FileCopyAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.projectPane.fileSystem.actions.FilePasteAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.projectPane.fileSystem.actions.FileDeleteActionFixed", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAnchor(AbstractFileActions_ActionGroup.LABEL_ID_vcs);
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(FileActions_ActionGroup.ID, FileActions_ActionGroup.LABEL_ID_abstractFileActions);
    this.insertGroupIntoAnother(FolderActions_ActionGroup.ID, FolderActions_ActionGroup.LABEL_ID_abstractFileActions);
    this.insertGroupIntoAnother(ModuleActions_ActionGroup.ID, ModuleActions_ActionGroup.LABEL_ID_abstractFileActions);
  }

}
