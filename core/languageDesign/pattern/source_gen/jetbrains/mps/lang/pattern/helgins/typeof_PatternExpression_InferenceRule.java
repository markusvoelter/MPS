package jetbrains.mps.lang.pattern.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PatternExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_PatternExpression_InferenceRule() {
  }

  public void applyRule(final SNode patternExpression, final TypeCheckingContext typeCheckingContext) {
    SNode patternExpression1 = patternExpression;
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_0().createNode(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(patternExpression1, "patternNode", true))), patternExpression1, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.helgins)", "1196515055997");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.pattern.structure.PatternExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
