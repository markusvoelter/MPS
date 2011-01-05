package jetbrains.mps.baseLanguage.collections.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.baseLanguage.collections.behavior.AbstractContainerCreator_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class add_copy_from_Intention extends BaseIntention implements Intention {
  public add_copy_from_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator";
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
    return "Specify Sequence to Copy From";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return AbstractContainerCreator_Behavior.call_canHaveParameter_2261417478150191157(node) && ListSequence.fromList(SLinkOperations.getTargets(node, "initValue", true)).count() == 0 && (SLinkOperations.getTarget(node, "copyFrom", true) == null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNodeFactoryOperations.setNewChild(node, "copyFrom", "jetbrains.mps.baseLanguage.structure.Expression");
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.collections.intentions";
  }
}
