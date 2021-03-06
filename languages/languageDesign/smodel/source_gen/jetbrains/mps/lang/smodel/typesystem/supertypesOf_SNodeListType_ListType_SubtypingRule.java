package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class supertypesOf_SNodeListType_ListType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_SNodeListType_ListType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode type, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode elementConcept = SLinkOperations.getTarget(type, "elementConcept", false);
    return new supertypesOf_SNodeListType_ListType_SubtypingRule.QuotationClass_r2ybw4_a0b0a().createNode(elementConcept, typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SNodeListType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_r2ybw4_a0b0a {
    public QuotationClass_r2ybw4_a0b0a() {
    }

    public SNode createNode(Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_2;
          quotedNode1_4.setReferent("concept", (SNode) parameter_5);
          quotedNode_1.addChild("elementType", quotedNode1_4);
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_2;
          quotedNode1_4.setReferent("concept", (SNode) parameter_5);
          quotedNode_1.addChild("elementType", quotedNode1_4);
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
