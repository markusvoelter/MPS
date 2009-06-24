package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class map_extends_java_util_Map_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public map_extends_java_util_Map_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode mapType, TypeCheckingContext typeCheckingContext) {
    return new _Quotations.QuotationClass_53().createNode(SLinkOperations.getTarget(mapType, "keyType", true), SLinkOperations.getTarget(mapType, "valueType", true), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.MapType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return true;
  }

}
