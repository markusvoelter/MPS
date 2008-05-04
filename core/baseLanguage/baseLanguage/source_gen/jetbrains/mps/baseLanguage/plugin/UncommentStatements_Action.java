package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class UncommentStatements_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(UncommentStatements_Action.class);

  private SNode node;
  private boolean isAlwaysVisible = false;

  public UncommentStatements_Action(MPSProject project) {
    super(project, "Uncomment Statements");
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl shift SLASH";
  }

  public boolean isApplicable(ActionContext context) {
    return (SNodeOperations.getAncestor(this.node, "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock", false, false) != null);
  }

  public void doUpdate(@NotNull() ActionContext context) {
    try {
      super.doUpdate(context);
      if (!(this.fillFieldsIfNecessary(context))) {
        this.setEnabled(false);
        this.setVisible(this.isAlwaysVisible);
        return;
      }
      {
        boolean enabled = this.isApplicable(context);
        this.setEnabled(enabled);
        this.setVisible(enabled || this.isAlwaysVisible);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "UncommentStatements", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      {
        SNode node = context.getNode();
        if (node != null) {
          if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.core.structure.BaseConcept"))) {
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
        SNode commentedStatementsBlock = SNodeOperations.getAncestor(this.node, "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock", false, false);
        for(SNode statement : SLinkOperations.getTargets(commentedStatementsBlock, "statement", true)) {
          SNodeOperations.insertPrevSiblingChild(commentedStatementsBlock, statement);
        }
        SNodeOperations.deleteNode(commentedStatementsBlock);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "UncommentStatements", t);
    }
  }

}
