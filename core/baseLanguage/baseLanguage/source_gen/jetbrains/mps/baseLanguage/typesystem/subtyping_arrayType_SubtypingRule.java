package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class subtyping_arrayType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public subtyping_arrayType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode arrayType) {
    List<SNode> result = new ArrayList<SNode>();
    for(SNode componentTypeSupertype : TypeChecker.getInstance().getSubtypingManager().collectImmediateSupertypes(SLinkOperations.getTarget(arrayType, "componentType", true))) {
      if (SNodeOperations.isInstanceOf(componentTypeSupertype, "jetbrains.mps.baseLanguage.structure.Type")) {
        ListSequence.fromList(result).addElement(new _Quotations.QuotationClass_57().createNode(componentTypeSupertype));
      }
    }
    return result;
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
