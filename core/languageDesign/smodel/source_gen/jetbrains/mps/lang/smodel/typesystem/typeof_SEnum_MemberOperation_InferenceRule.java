package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.behavior.SEnumOperation_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeof_SEnum_MemberOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SEnum_MemberOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1240333198027", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1240333198029", true), (SNode) new typeof_SEnum_MemberOperation_InferenceRule.QuotationClass_7786_l523emnf6wgx().createNode(SEnumOperation_Behavior.call_getEnum_1240931322043(operation), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SEnum_MemberOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_7786_l523emnf6wgx {
    public QuotationClass_7786_l523emnf6wgx() {
    }

    public SNode createNode(Object parameter_7786_l523emnf6poi, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7786_l523emnf6pog = null;
      {
        quotedNode_7786_l523emnf6pog = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SEnumMemberType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7786_l523emnf6pog = quotedNode_7786_l523emnf6pog;
        quotedNode1_7786_l523emnf6pog.setReferent("enum", (SNode) parameter_7786_l523emnf6poi);
        result = quotedNode1_7786_l523emnf6pog;
      }
      return result;
    }

    public SNode createNode(Object parameter_7786_l523emnf6poi) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7786_l523emnf6pog = null;
      {
        quotedNode_7786_l523emnf6pog = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SEnumMemberType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7786_l523emnf6pog = quotedNode_7786_l523emnf6pog;
        quotedNode1_7786_l523emnf6pog.setReferent("enum", (SNode) parameter_7786_l523emnf6poi);
        result = quotedNode1_7786_l523emnf6pog;
      }
      return result;
    }
  }
}
