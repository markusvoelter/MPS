package jetbrains.mps.lang.smodel.typesystem;

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

public class typeof_OperationParm_LinkQualifier_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_OperationParm_LinkQualifier_InferenceRule() {
  }

  public void applyRule(final SNode operationParam, final TypeCheckingContext typeCheckingContext) {
    final SNode linkQualifier = SLinkOperations.getTarget(operationParam, "linkQualifier", true);
    if (SNodeOperations.isInstanceOf(linkQualifier, "jetbrains.mps.lang.smodel.structure.LinkRefQualifier")) {
      {
        SNode _nodeToCheck_1029348928467 = operationParam;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "4228794276714510602", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "4228794276714510614", true), (SNode) new typeof_OperationParm_LinkQualifier_InferenceRule.QuotationClass_8228_l523emnf6x2m().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.as(linkQualifier, "jetbrains.mps.lang.smodel.structure.LinkRefQualifier"), "link", false), "target", false), typeCheckingContext), _info_12389875345);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = operationParam;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5168775467716640824", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5168775467716640829", true), (SNode) new typeof_OperationParm_LinkQualifier_InferenceRule.QuotationClass_8228_l523emnf6x4e().createNode(typeCheckingContext), _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.OperationParm_LinkQualifier";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_8228_l523emnf6x2m {
    public QuotationClass_8228_l523emnf6x2m() {
    }

    public SNode createNode(Object parameter_8228_l523emnf6qa8, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8228_l523emnf6qa6 = null;
      {
        quotedNode_8228_l523emnf6qa6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8228_l523emnf6qa6 = quotedNode_8228_l523emnf6qa6;
        quotedNode1_8228_l523emnf6qa6.setReferent("concept", (SNode) parameter_8228_l523emnf6qa8);
        result = quotedNode1_8228_l523emnf6qa6;
      }
      return result;
    }

    public SNode createNode(Object parameter_8228_l523emnf6qa8) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8228_l523emnf6qa6 = null;
      {
        quotedNode_8228_l523emnf6qa6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8228_l523emnf6qa6 = quotedNode_8228_l523emnf6qa6;
        quotedNode1_8228_l523emnf6qa6.setReferent("concept", (SNode) parameter_8228_l523emnf6qa8);
        result = quotedNode1_8228_l523emnf6qa6;
      }
      return result;
    }
  }

  public static class QuotationClass_8228_l523emnf6x4e {
    public QuotationClass_8228_l523emnf6x4e() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8228_l523emnf6qan = null;
      {
        quotedNode_8228_l523emnf6qan = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8228_l523emnf6qan = quotedNode_8228_l523emnf6qan;
        result = quotedNode1_8228_l523emnf6qan;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8228_l523emnf6qan = null;
      {
        quotedNode_8228_l523emnf6qan = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8228_l523emnf6qan = quotedNode_8228_l523emnf6qan;
        result = quotedNode1_8228_l523emnf6qan;
      }
      return result;
    }
  }
}
