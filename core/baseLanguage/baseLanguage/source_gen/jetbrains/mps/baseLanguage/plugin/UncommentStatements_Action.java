package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class UncommentStatements_Action extends CurrentProjectMPSAction {

  public UncommentStatements_Action(MPSProject project) {
    super(project, "Uncomment Statements");
  }

  @NotNull()
  public String getKeyStroke() {
    return "control shift SLASH";
  }

  public void doUpdate(@NotNull()ActionContext context) {
    if (!(this.fillFieldsIfNecessary(context))) {
      this.setEnabled(false);
      this.setVisible(false);
      return;
    }
    {
      boolean enabled = SNodeOperations.isInstanceOf((((SNode) context.getNode())), "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock");
      this.setVisible(enabled);
      this.setEnabled(enabled);
    }
  }

  public boolean fillFieldsIfNecessary(ActionContext context) {
    try {
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull()ActionContext context) {
    if (!(this.fillFieldsIfNecessary(context))) {
      return;
    }
    {
      SNode node = context.getNode();
      {
        ICursor<SNode> _zCursor1 = CursorFactory.createCursor(SLinkOperations.getTargets(node, "statement", true));
        try {
          while (_zCursor1.moveToNext()) {
            SNode statement = _zCursor1.getCurrent();
            SNodeOperations.insertPrevSiblingChild(node, statement);
          }
        } finally {
          _zCursor1.release();
        }
      }
      SNodeOperations.deleteNode(node);
    }
  }

}
