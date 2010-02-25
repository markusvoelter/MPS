package jetbrains.mps.lang.findUsages.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeof_ConceptFunctionParameter_node_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ConceptFunctionParameter_node_InferenceRule() {
  }

  public void applyRule(final SNode conceptFunctionParameter_node, final TypeCheckingContext typeCheckingContext) {
    SNode applicableConcept = SLinkOperations.getTarget(SNodeOperations.getAncestor(conceptFunctionParameter_node, "jetbrains.mps.lang.findUsages.structure.FinderDeclaration", false, false), "forConcept", false);
    {
      SNode _nodeToCheck_1029348928467 = conceptFunctionParameter_node;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959035a(jetbrains.mps.lang.findUsages.typesystem)", "1205608715759", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959035a(jetbrains.mps.lang.findUsages.typesystem)", "1205608715761", true), (SNode) new typeof_ConceptFunctionParameter_node_InferenceRule.QuotationClass_5712_l523emnexib2().createNode(applicableConcept, typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.findUsages.structure.ConceptFunctionParameter_node";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_5712_l523emnexib2 {
    public QuotationClass_5712_l523emnexib2() {
    }

    public SNode createNode(Object parameter_5712_l523emnexi57, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5712_l523emnexi55 = null;
      {
        quotedNode_5712_l523emnexi55 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5712_l523emnexi55 = quotedNode_5712_l523emnexi55;
        quotedNode1_5712_l523emnexi55.setReferent("concept", (SNode) parameter_5712_l523emnexi57);
        result = quotedNode1_5712_l523emnexi55;
      }
      return result;
    }

    public SNode createNode(Object parameter_5712_l523emnexi57) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5712_l523emnexi55 = null;
      {
        quotedNode_5712_l523emnexi55 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5712_l523emnexi55 = quotedNode_5712_l523emnexi55;
        quotedNode1_5712_l523emnexi55.setReferent("concept", (SNode) parameter_5712_l523emnexi57);
        result = quotedNode1_5712_l523emnexi55;
      }
      return result;
    }
  }
}
