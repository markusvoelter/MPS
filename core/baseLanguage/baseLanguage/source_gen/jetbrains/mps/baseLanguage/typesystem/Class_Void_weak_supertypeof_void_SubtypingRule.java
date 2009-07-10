package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SModelUtil_new;

public class Class_Void_weak_supertypeof_void_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public Class_Void_weak_supertypeof_void_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode voidType, TypeCheckingContext typeCheckingContext) {
    return new _Quotations.QuotationClass_102().createNode(typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.VoidType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return true;
  }

}
