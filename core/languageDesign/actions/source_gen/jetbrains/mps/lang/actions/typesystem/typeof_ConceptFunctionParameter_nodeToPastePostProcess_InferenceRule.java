package jetbrains.mps.lang.actions.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.actions.behavior.ConceptFunctionParameter_nodeToPastePostProcess_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class typeof_ConceptFunctionParameter_nodeToPastePostProcess_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ConceptFunctionParameter_nodeToPastePostProcess_InferenceRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = node;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902a6(jetbrains.mps.lang.actions.typesystem)", "6026743057587447957", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902a6(jetbrains.mps.lang.actions.typesystem)", "6026743057587447954", true), (SNode) new typeof_ConceptFunctionParameter_nodeToPastePostProcess_InferenceRule.QuotationClass_5jwgr_a0a0a0().createNode(SLinkOperations.getTarget(ConceptFunctionParameter_nodeToPastePostProcess_Behavior.call_getPostProcessor_6026743057587447970(node), "concept", false), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToPastePostProcess";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_5jwgr_a0a0a0 {
    public QuotationClass_5jwgr_a0a0a0() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("concept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("concept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
