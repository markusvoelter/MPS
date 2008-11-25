package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.util.CollectionUtil;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelUtil_new;

public class PrimitiveArraySupertypes_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public PrimitiveArraySupertypes_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode arrayType) {
    // see JLS 3.0
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(arrayType, "componentType", true), "jetbrains.mps.baseLanguage.structure.PrimitiveType")) {
      return CollectionUtil.asList(new _Quotations.QuotationClass_85().createNode(), new _Quotations.QuotationClass_86().createNode(), new _Quotations.QuotationClass_87().createNode());
    }
    return new ArrayList<SNode>();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
