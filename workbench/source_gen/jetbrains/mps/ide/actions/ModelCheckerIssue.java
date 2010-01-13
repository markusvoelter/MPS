package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.findusages.model.SearchResult;

public class ModelCheckerIssue {
  private SNode myNode;
  private String myMessage;
  private IModelCheckerFix myFix;

  public ModelCheckerIssue(SNode node, String message, IModelCheckerFix fix) {
    this.myNode = node;
    this.myMessage = message;
    this.myFix = fix;
  }

  public ModelCheckerIssue(SNode node, String message) {
    this(node, message, null);
  }

  public SNode getNode() {
    return this.myNode;
  }

  public String getMessage() {
    return this.myMessage;
  }

  public boolean fix() {
    if (this.myFix != null && !(this.myNode.isDeleted())) {
      return this.myFix.doFix();
    } else {
      return false;
    }
  }

  public boolean isFixable() {
    return this.myFix != null;
  }

  public static SearchResult<ModelCheckerIssue> getSearchResult(SNode node, String message, IModelCheckerFix fix, String severity, String category) {
    ModelCheckerIssue issue = new ModelCheckerIssue(node, message, fix);
    return new SearchResult<ModelCheckerIssue>(issue, node, severity, category);
  }
}
