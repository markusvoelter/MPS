package jetbrains.mps.lang.findUsages.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConceptFunctionParameter_node_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ConceptFunctionParameter_node_InferenceRule() {
  }

  public void applyRule(final SNode conceptFunctionParameter_node, final TypeCheckingContext typeCheckingContext) {
    SNode applicableConcept = SLinkOperations.getTarget(SNodeOperations.getAncestor(conceptFunctionParameter_node, "jetbrains.mps.lang.findUsages.structure.FinderDeclaration", false, false), "forConcept", false);
    {
      SNode _nodeToCheck_1029348928467 = conceptFunctionParameter_node;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(conceptFunctionParameter_node, "r:00000000-0000-4000-0000-011c8959035a(jetbrains.mps.lang.findUsages.helgins)", "1205608715761", true), new QuotationClass_0().createNode(applicableConcept), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959035a(jetbrains.mps.lang.findUsages.helgins)", "1205608715759", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.findUsages.structure.ConceptFunctionParameter_node";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
