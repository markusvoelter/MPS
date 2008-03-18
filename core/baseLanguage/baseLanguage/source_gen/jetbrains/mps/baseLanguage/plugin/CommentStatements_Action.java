package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;

import java.util.List;

import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;

import java.util.StringTokenizer;

public class CommentStatements_Action extends CurrentProjectMPSAction {

  private SNode myNode;

  public CommentStatements_Action(MPSProject project) {
    super(project, "Comment Statements");
  }

  @NotNull()
  public String getKeyStroke() {
    return "control shift SLASH";
  }

  public String getIconPath() {
    return "";
  }

  public void doUpdate(@NotNull()ActionContext context) {
    if (!(this.fillFieldsIfNecessary(context))) {
      return;
    }
    {
      List<SNode> nodes = context.getNodes();
      boolean enabled = false;
      if (nodes != null) {
        enabled = true;
        {
          ICursor<SNode> _zCursor = CursorFactory.createCursor(nodes);
          try {
            while (_zCursor.moveToNext()) {
              SNode node = _zCursor.getCurrent();
              if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Statement"))) {
                enabled = false;
                break;
              }
            }
          } finally {
            _zCursor.release();
          }
        }
        if (SequenceOperations.getSize(nodes) == 1 && SNodeOperations.isInstanceOf(SequenceOperations.getFirst(nodes), "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock")) {
          enabled = false;
        }
      }
      this.setVisible(enabled);
      this.setEnabled(enabled);
    }
  }

  public boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      this.myNode = context.getNode();
      if (this.myNode == null) {
        return false;
      }
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
      List<SNode> statements = ((List<SNode>) context.getNodes());
      SModel model = context.getModel().getSModel();
      SNode commentedStatementsBlock = SNodeOperations.insertNewPrevSiblingChild(SequenceOperations.getFirst(statements), "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock");
      SLinkOperations.addAll(commentedStatementsBlock, "statement", statements);
      SNodeOperations.deleteNode(ListOperations.getElement(SLinkOperations.getTargets(commentedStatementsBlock, "statement", true), 0));
      //this.qwe();
    }
  }


}
