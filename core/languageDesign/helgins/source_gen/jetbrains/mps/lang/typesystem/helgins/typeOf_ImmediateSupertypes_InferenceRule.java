package jetbrains.mps.lang.typesystem.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ImmediateSupertypes_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_ImmediateSupertypes_InferenceRule() {
  }

  public void applyRule(final SNode immediateSupertypesExpr, final TypeCheckingContext typeCheckingContext) {
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_5().createNode(), immediateSupertypesExpr, "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1177069172275");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.typesystem.structure.ImmediateSupertypesExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
