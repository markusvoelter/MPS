package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_IMethodCall_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_IMethodCall_InferenceRule() {
  }

  public void applyRule(final SNode methodCall, final TypeCheckingContext typeCheckingContext) {
    if (SLinkOperations.getTarget(methodCall, "baseMethodDeclaration", false) == null) {
      return;
    }
    // ---
    Map<SNode, List<SNode>> mmap = new HashMap<SNode, List<SNode>>();
    RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(methodCall, SLinkOperations.getTarget(SLinkOperations.getTarget(methodCall, "baseMethodDeclaration", false), "returnType", true), mmap);
    RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(mmap);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.IMethodCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
