package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.typesystem._Quotations;
import jetbrains.mps.smodel.SModelUtil_new;

public class double_extends_floatingPoint_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public double_extends_floatingPoint_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode doubleType) {
    return SLinkOperations.getTarget(new _Quotations.QuotationClass_52().createNode(), "descriptor", false);
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
