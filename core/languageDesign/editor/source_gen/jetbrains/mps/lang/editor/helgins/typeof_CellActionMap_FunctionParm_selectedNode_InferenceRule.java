package jetbrains.mps.lang.editor.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_CellActionMap_FunctionParm_selectedNode_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_CellActionMap_FunctionParm_selectedNode_InferenceRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext) {
    SNode applicableConcept = SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.lang.editor.structure.CellActionMapDeclaration", false, false), "applicableConcept", false);
    if (applicableConcept == null) {
      applicableConcept = SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.lang.editor.structure.BaseEditorComponent", false, false), "conceptDeclaration", false);
    }
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_1().createNode(applicableConcept), node, "r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.helgins)", "1179767185667");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.editor.structure.CellActionMap_FunctionParm_selectedNode";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
