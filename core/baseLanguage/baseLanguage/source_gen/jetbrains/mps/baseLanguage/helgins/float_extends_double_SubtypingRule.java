package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;

public class float_extends_double_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public float_extends_double_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode floatType) {
    return new QuotationClass_47().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.FloatType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
