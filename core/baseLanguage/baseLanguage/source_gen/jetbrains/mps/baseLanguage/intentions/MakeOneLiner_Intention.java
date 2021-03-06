package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.baseLanguage.behavior.IfStatement_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class MakeOneLiner_Intention extends BaseIntention implements Intention {
  public MakeOneLiner_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.IfStatement";
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
    return "Make One Liner";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return !(IfStatement_Behavior.call_isGuardIf_1237547453258(node)) && !(SPropertyOperations.getBoolean(node, "forceOneLine"));
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SPropertyOperations.set(node, "forceMultiLine", "" + false);
    SPropertyOperations.set(node, "forceOneLine", "" + true);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
