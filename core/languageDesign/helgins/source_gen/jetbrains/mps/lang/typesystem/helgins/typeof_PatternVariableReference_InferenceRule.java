package jetbrains.mps.lang.typesystem.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PatternVariableReference_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_PatternVariableReference_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1202488970879", true), typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "patternVarDecl", false), "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1202488976090", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1202488974038", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.typesystem.structure.PatternVariableReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
