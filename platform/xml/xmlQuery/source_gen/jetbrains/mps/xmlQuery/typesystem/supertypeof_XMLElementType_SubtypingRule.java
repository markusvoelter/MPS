package jetbrains.mps.xmlQuery.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypeof_XMLElementType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypeof_XMLElementType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode xmlType, TypeCheckingContext typeCheckingContext) {
    if ((SLinkOperations.getTarget(xmlType, "schema", false) == null)) {
      return new _Quotations.QuotationClass_1().createNode(typeCheckingContext);
    } else {
      return new _Quotations.QuotationClass_2().createNode(typeCheckingContext);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.xmlQuery.structure.XMLElementType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return true;
  }
}
