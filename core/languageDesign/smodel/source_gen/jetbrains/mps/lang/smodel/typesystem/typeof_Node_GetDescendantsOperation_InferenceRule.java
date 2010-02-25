package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeof_Node_GetDescendantsOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_Node_GetDescendantsOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    final SNode ConceptFromOpParm_typevar_1207353217271 = typeCheckingContext.createNewRuntimeTypesVariable();
    RulesUtil.equate_conceptFromOpParm(typeCheckingContext, op, typeCheckingContext.getEquationManager().getRepresentator(ConceptFromOpParm_typevar_1207353217271));
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207353493596", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207353493598", true), (SNode) new typeof_Node_GetDescendantsOperation_InferenceRule.QuotationClass_1186_l523emnf6rrt().createNode(typeCheckingContext.getEquationManager().getRepresentator(ConceptFromOpParm_typevar_1207353217271), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_1186_l523emnf6rrt {
    public QuotationClass_1186_l523emnf6rrt() {
    }

    public SNode createNode(Object parameter_1186_l523emnf6krd, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1186_l523emnf6kqm = null;
      {
        quotedNode_1186_l523emnf6kqm = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1186_l523emnf6kqm = quotedNode_1186_l523emnf6kqm;
        quotedNode1_1186_l523emnf6kqm.setReferent("elementConcept", (SNode) parameter_1186_l523emnf6krd);
        result = quotedNode1_1186_l523emnf6kqm;
      }
      return result;
    }

    public SNode createNode(Object parameter_1186_l523emnf6krd) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1186_l523emnf6kqm = null;
      {
        quotedNode_1186_l523emnf6kqm = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1186_l523emnf6kqm = quotedNode_1186_l523emnf6kqm;
        quotedNode1_1186_l523emnf6kqm.setReferent("elementConcept", (SNode) parameter_1186_l523emnf6krd);
        result = quotedNode1_1186_l523emnf6kqm;
      }
      return result;
    }
  }
}
