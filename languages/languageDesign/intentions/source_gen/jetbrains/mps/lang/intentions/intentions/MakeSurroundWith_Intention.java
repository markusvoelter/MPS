package jetbrains.mps.lang.intentions.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class MakeSurroundWith_Intention extends BaseIntention implements Intention {
  public MakeSurroundWith_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.intentions.structure.SurroundWithIntentionDeclaration")) {
      return "Make Plain Intention";
    } else {
      return "Make a Surround with Intention";
    }
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.intentions.structure.SurroundWithIntentionDeclaration") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.intentions.structure.IntentionDeclaration");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode sd;
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.intentions.structure.SurroundWithIntentionDeclaration")) {
      sd = SModelOperations.createNewRootNode(SNodeOperations.getModel(node), "jetbrains.mps.lang.intentions.structure.IntentionDeclaration", null);
    } else {
      sd = SModelOperations.createNewRootNode(SNodeOperations.getModel(node), "jetbrains.mps.lang.intentions.structure.SurroundWithIntentionDeclaration", null);
    }
    SPropertyOperations.set(sd, "name", SPropertyOperations.getString(node, "name"));
    SPropertyOperations.set(sd, "alias", SPropertyOperations.getString(node, "alias"));
    SPropertyOperations.set(sd, "shortDescription", SPropertyOperations.getString(node, "shortDescription"));
    SPropertyOperations.set(sd, "virtualPackage", SPropertyOperations.getString(node, "virtualPackage"));
    SPropertyOperations.set(sd, "isAvailableInChildNodes", "" + SPropertyOperations.getBoolean(node, "isAvailableInChildNodes"));
    SPropertyOperations.set(sd, "isErrorIntention", "" + SPropertyOperations.getBoolean(node, "isErrorIntention"));
    SLinkOperations.setTarget(sd, "forConcept", SLinkOperations.getTarget(node, "forConcept", false), false);
    SLinkOperations.setTarget(sd, "descriptionFunction", SLinkOperations.getTarget(node, "descriptionFunction", true), true);
    SLinkOperations.setTarget(sd, "childFilterFunction", SLinkOperations.getTarget(node, "childFilterFunction", true), true);
    SLinkOperations.setTarget(sd, "isApplicableFunction", SLinkOperations.getTarget(node, "isApplicableFunction", true), true);
    SLinkOperations.setTarget(sd, "executeFunction", SLinkOperations.getTarget(node, "executeFunction", true), true);

    SNodeOperations.deleteNode(node);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.intentions.intentions";
  }
}
