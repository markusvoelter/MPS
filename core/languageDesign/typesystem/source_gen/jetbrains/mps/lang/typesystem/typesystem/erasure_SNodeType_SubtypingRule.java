package jetbrains.mps.lang.typesystem.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.typesystem.typesystem._Quotations;
import jetbrains.mps.smodel.SModelUtil_new;

public class erasure_SNodeType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public erasure_SNodeType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode snodeType) {
    return new _Quotations.QuotationClass_7().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SNodeType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
