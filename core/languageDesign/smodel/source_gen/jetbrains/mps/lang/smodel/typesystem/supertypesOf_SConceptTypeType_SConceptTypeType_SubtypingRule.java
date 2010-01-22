package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class supertypesOf_SConceptTypeType_SConceptTypeType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_SConceptTypeType_SConceptTypeType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode type, TypeCheckingContext typeCheckingContext) {
    List<SNode> list = ListSequence.fromList(new ArrayList<SNode>());
    SNode concept = SLinkOperations.getTarget(type, "conceptDeclaraton", false);
    if (SNodeOperations.isInstanceOf(concept, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
      List<SNode> superConcepts = SConceptOperations.getDirectSuperConcepts(concept, false);
      for (SNode superConcept : ListSequence.fromList(superConcepts)) {
        ListSequence.fromList(list).addElement(new supertypesOf_SConceptTypeType_SConceptTypeType_SubtypingRule.QuotationClass_8679_0().createNode(superConcept, typeCheckingContext));
      }
      ListSequence.fromList(list).addElement(new supertypesOf_SConceptTypeType_SConceptTypeType_SubtypingRule.QuotationClass_8679_1().createNode(typeCheckingContext));
    }
    return list;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SConceptType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_8679_0 {
    public QuotationClass_8679_0() {
    }

    public SNode createNode(Object parameter_8679_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8679_0 = null;
      {
        quotedNode_8679_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SConceptType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8679_0 = quotedNode_8679_0;
        quotedNode1_8679_0.setReferent("conceptDeclaraton", (SNode) parameter_8679_0);
        result = quotedNode1_8679_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_8679_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8679_0 = null;
      {
        quotedNode_8679_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SConceptType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8679_0 = quotedNode_8679_0;
        quotedNode1_8679_0.setReferent("conceptDeclaraton", (SNode) parameter_8679_0);
        result = quotedNode1_8679_0;
      }
      return result;
    }
  }

  public static class QuotationClass_8679_1 {
    public QuotationClass_8679_1() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8679_1 = null;
      {
        quotedNode_8679_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SConceptType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8679_1 = quotedNode_8679_1;
        result = quotedNode1_8679_1;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8679_1 = null;
      {
        quotedNode_8679_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SConceptType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8679_1 = quotedNode_8679_1;
        result = quotedNode1_8679_1;
      }
      return result;
    }
  }
}
