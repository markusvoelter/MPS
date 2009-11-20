package jetbrains.mps.baseLanguage.closures.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class add_throws_to_FunctionType_Intention extends BaseIntention {
  public add_throws_to_FunctionType_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.closures.structure.FunctionType";
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
    return "Add Throws Clause";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return ListSequence.fromList(SLinkOperations.getTargets(node, "throwsType", true)).isEmpty();
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SLinkOperations.addNewChild(node, "throwsType", "jetbrains.mps.baseLanguage.structure.ClassifierType");
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.closures.intentions";
  }
}
