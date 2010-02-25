package jetbrains.mps.baseLanguage.math.typesystem;

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
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_InIntervalExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_InIntervalExpression_InferenceRule() {
  }

  public void applyRule(final SNode expression, final TypeCheckingContext typeCheckingContext) {
    final SNode elementType_typevar_1235747425227 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(expression, "rightExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1235747425228", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) new typeof_InIntervalExpression_InferenceRule.QuotationClass_8278_l523emneijd4().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1235747425227), typeCheckingContext), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1235747425230", true), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(expression, "leftExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1235747425240", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequationStrong((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1235747425244", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1235747425227), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.InIntervalExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_8278_l523emneijd4 {
    public QuotationClass_8278_l523emneijd4() {
    }

    public SNode createNode(Object parameter_8278_l523emneiehu, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8278_l523emneieh5 = null;
      SNode quotedNode_8278_l523emneieh6 = null;
      {
        quotedNode_8278_l523emneieh5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.IntervalType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8278_l523emneieh5 = quotedNode_8278_l523emneieh5;
        {
          quotedNode_8278_l523emneieh6 = (SNode) parameter_8278_l523emneiehu;
          SNode quotedNode1_8278_l523emneieh6;
          if (_parameterValues_129834374.contains(quotedNode_8278_l523emneieh6)) {
            quotedNode1_8278_l523emneieh6 = CopyUtil.copy(quotedNode_8278_l523emneieh6);
          } else {
            _parameterValues_129834374.add(quotedNode_8278_l523emneieh6);
            quotedNode1_8278_l523emneieh6 = quotedNode_8278_l523emneieh6;
          }
          if (quotedNode1_8278_l523emneieh6 != null) {
            quotedNode_8278_l523emneieh5.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_8278_l523emneieh6, typeCheckingContext));
          }
        }
        result = quotedNode1_8278_l523emneieh5;
      }
      return result;
    }

    public SNode createNode(Object parameter_8278_l523emneiehu) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8278_l523emneieh5 = null;
      SNode quotedNode_8278_l523emneieh6 = null;
      {
        quotedNode_8278_l523emneieh5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.IntervalType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8278_l523emneieh5 = quotedNode_8278_l523emneieh5;
        {
          quotedNode_8278_l523emneieh6 = (SNode) parameter_8278_l523emneiehu;
          SNode quotedNode1_8278_l523emneieh6;
          if (_parameterValues_129834374.contains(quotedNode_8278_l523emneieh6)) {
            quotedNode1_8278_l523emneieh6 = CopyUtil.copy(quotedNode_8278_l523emneieh6);
          } else {
            _parameterValues_129834374.add(quotedNode_8278_l523emneieh6);
            quotedNode1_8278_l523emneieh6 = quotedNode_8278_l523emneieh6;
          }
          if (quotedNode1_8278_l523emneieh6 != null) {
            quotedNode_8278_l523emneieh5.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_8278_l523emneieh6));
          }
        }
        result = quotedNode1_8278_l523emneieh5;
      }
      return result;
    }
  }
}
