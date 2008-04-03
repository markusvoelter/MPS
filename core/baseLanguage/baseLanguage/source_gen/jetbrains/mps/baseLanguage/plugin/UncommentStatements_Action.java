package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class UncommentStatements_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(UncommentStatements_Action.class);

  private SNode node;
  private boolean isAlwaysVisible = false;

  public  UncommentStatements_Action(MPSProject project) {
    super(project, "Uncomment Statements");
  }

  @NotNull()
  public String getKeyStroke() {
    return "control shift SLASH";
  }

  public void doUpdate(@NotNull() ActionContext context) {
    try {
      super.doUpdate(context);
      if (!(this.fillFieldsIfNecessary(context))) {
        this.setEnabled(false);
        this.setVisible(this.isAlwaysVisible);
        return;
      }
      this.setEnabled(true);
      this.setVisible(true);
    } catch (Throwable t) {
      UncommentStatements_Action.LOG.error("User's action doUpdate method failed. Action:" + "UncommentStatements", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      {
        SNode node = context.getNode();
        if (node != null) {
          if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock"))) {
            node = null;
          }
        }
        this.node = node;
        /*
          if (!(<!IsSubtypeExpression TextGen not found!>)) {
            return false;
          }
        */
      }
      if (this.node == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() ActionContext context) {
    try {
      if (!(this.fillFieldsIfNecessary(context))) {
        return;
      }
      {
        ICursor<SNode> _zCursor1 = CursorFactory.createCursor(SLinkOperations.getTargets(this.node, "statement", true));
        try {
          while(_zCursor1.moveToNext()) {
            SNode statement = _zCursor1.getCurrent();
            SNodeOperations.insertPrevSiblingChild(this.node, statement);
          }
        } finally {
          _zCursor1.release();
        }
      }
      SNodeOperations.deleteNode(this.node);
    } catch (Throwable t) {
      UncommentStatements_Action.LOG.error("User's action execute method failed. Action:" + "UncommentStatements", t);
    }
  }

}
