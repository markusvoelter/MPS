package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeOf_LinkList_AddNewChildOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_LinkList_AddNewChildOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    final SNode Concept_typevar_1206099501305 = typeCheckingContext.createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConcept(typeCheckingContext, op, typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1206099501305));
    SNode parameterConcept = SLinkOperations.getTarget(op, "concept", false);
    if (parameterConcept == null) {
      {
        SNode _nodeToCheck_1029348928467 = op;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205771608895", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205771608897", true), (SNode) new typeOf_LinkList_AddNewChildOperation_InferenceRule.QuotationClass_9799_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1206099501305), typeCheckingContext), _info_12389875345);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = op;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1227536373800", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1227536373802", true), (SNode) new typeOf_LinkList_AddNewChildOperation_InferenceRule.QuotationClass_9799_1().createNode(parameterConcept, typeCheckingContext), _info_12389875345);
      }
      {
        SNode _nodeToCheck_1029348928467 = op;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1227536411703", 0, intentionProvider);
        _info_12389875345.setInequationGroup("default");
        typeCheckingContext.createLessThanInequationStrong((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1227536397149", true), (SNode) new typeOf_LinkList_AddNewChildOperation_InferenceRule.QuotationClass_9799_2().createNode(typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1206099501305), typeCheckingContext), true, _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.LinkList_AddNewChildOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_9799_0 {
    public QuotationClass_9799_0() {
    }

    public SNode createNode(Object parameter_9799_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9799_0 = null;
      {
        quotedNode_9799_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9799_0 = quotedNode_9799_0;
        quotedNode1_9799_0.setReferent("concept", (SNode) parameter_9799_0);
        result = quotedNode1_9799_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_9799_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9799_0 = null;
      {
        quotedNode_9799_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9799_0 = quotedNode_9799_0;
        quotedNode1_9799_0.setReferent("concept", (SNode) parameter_9799_0);
        result = quotedNode1_9799_0;
      }
      return result;
    }
  }

  public static class QuotationClass_9799_1 {
    public QuotationClass_9799_1() {
    }

    public SNode createNode(Object parameter_9799_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9799_1 = null;
      {
        quotedNode_9799_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9799_1 = quotedNode_9799_1;
        quotedNode1_9799_1.setReferent("concept", (SNode) parameter_9799_1);
        result = quotedNode1_9799_1;
      }
      return result;
    }

    public SNode createNode(Object parameter_9799_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9799_1 = null;
      {
        quotedNode_9799_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9799_1 = quotedNode_9799_1;
        quotedNode1_9799_1.setReferent("concept", (SNode) parameter_9799_1);
        result = quotedNode1_9799_1;
      }
      return result;
    }
  }

  public static class QuotationClass_9799_2 {
    public QuotationClass_9799_2() {
    }

    public SNode createNode(Object parameter_9799_2, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9799_2 = null;
      {
        quotedNode_9799_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9799_2 = quotedNode_9799_2;
        quotedNode1_9799_2.setReferent("concept", (SNode) parameter_9799_2);
        result = quotedNode1_9799_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_9799_2) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9799_2 = null;
      {
        quotedNode_9799_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9799_2 = quotedNode_9799_2;
        quotedNode1_9799_2.setReferent("concept", (SNode) parameter_9799_2);
        result = quotedNode1_9799_2;
      }
      return result;
    }
  }
}
