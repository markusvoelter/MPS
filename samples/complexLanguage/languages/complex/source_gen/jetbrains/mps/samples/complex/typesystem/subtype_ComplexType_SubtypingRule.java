package jetbrains.mps.samples.complex.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SModelUtil_new;

public class subtype_ComplexType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public subtype_ComplexType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode doubleType, TypeCheckingContext typeCheckingContext) {
    return new _Quotations.QuotationClass_2().createNode(typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.DoubleType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }
}
