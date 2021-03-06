package jetbrains.mps.baseLanguage.closures.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class convert_to_restricted_Intention extends BaseIntention implements Intention {
  public convert_to_restricted_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType";
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
    return "Convert to Restricted Function Type";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.getConceptDeclaration(node) == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode rft = SNodeFactoryOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.closures.structure.FunctionType");
    List<SNode> ptypes = SLinkOperations.getTargets(node, "parameterType", true);
    for (SNode pt : ptypes) {
      ListSequence.fromList(SLinkOperations.getTargets(rft, "parameterType", true)).addElement(SNodeOperations.detachNode(pt));
    }
    SLinkOperations.setTarget(rft, "resultType", SNodeOperations.detachNode(SLinkOperations.getTarget(node, "resultType", true)), true);
    List<SNode> ttypes = SLinkOperations.getTargets(node, "throwsType", true);
    for (SNode tt : ttypes) {
      ListSequence.fromList(SLinkOperations.getTargets(rft, "throwsType", true)).addElement(SNodeOperations.detachNode(tt));
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.closures.intentions";
  }
}
