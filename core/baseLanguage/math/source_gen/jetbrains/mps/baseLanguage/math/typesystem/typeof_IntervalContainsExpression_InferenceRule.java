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

public class typeof_IntervalContainsExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_IntervalContainsExpression_InferenceRule() {
  }

  public void applyRule(final SNode expression, final TypeCheckingContext typeCheckingContext) {
    final SNode elementType_typevar_1235747425251 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(expression, "leftExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1235747425252", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) new typeof_IntervalContainsExpression_InferenceRule.QuotationClass_0848_l523emneijga().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1235747425251), typeCheckingContext), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1235747425254", true), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(expression, "rightExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1235747425264", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequationStrong((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1235747425268", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1235747425251), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.IntervalContainsExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_0848_l523emneijga {
    public QuotationClass_0848_l523emneijga() {
    }

    public SNode createNode(Object parameter_0848_l523emneiek5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0848_l523emneiejg = null;
      SNode quotedNode_0848_l523emneiejh = null;
      {
        quotedNode_0848_l523emneiejg = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.IntervalType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0848_l523emneiejg = quotedNode_0848_l523emneiejg;
        {
          quotedNode_0848_l523emneiejh = (SNode) parameter_0848_l523emneiek5;
          SNode quotedNode1_0848_l523emneiejh;
          if (_parameterValues_129834374.contains(quotedNode_0848_l523emneiejh)) {
            quotedNode1_0848_l523emneiejh = CopyUtil.copy(quotedNode_0848_l523emneiejh);
          } else {
            _parameterValues_129834374.add(quotedNode_0848_l523emneiejh);
            quotedNode1_0848_l523emneiejh = quotedNode_0848_l523emneiejh;
          }
          if (quotedNode1_0848_l523emneiejh != null) {
            quotedNode_0848_l523emneiejg.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_0848_l523emneiejh, typeCheckingContext));
          }
        }
        result = quotedNode1_0848_l523emneiejg;
      }
      return result;
    }

    public SNode createNode(Object parameter_0848_l523emneiek5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0848_l523emneiejg = null;
      SNode quotedNode_0848_l523emneiejh = null;
      {
        quotedNode_0848_l523emneiejg = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.IntervalType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0848_l523emneiejg = quotedNode_0848_l523emneiejg;
        {
          quotedNode_0848_l523emneiejh = (SNode) parameter_0848_l523emneiek5;
          SNode quotedNode1_0848_l523emneiejh;
          if (_parameterValues_129834374.contains(quotedNode_0848_l523emneiejh)) {
            quotedNode1_0848_l523emneiejh = CopyUtil.copy(quotedNode_0848_l523emneiejh);
          } else {
            _parameterValues_129834374.add(quotedNode_0848_l523emneiejh);
            quotedNode1_0848_l523emneiejh = quotedNode_0848_l523emneiejh;
          }
          if (quotedNode1_0848_l523emneiejh != null) {
            quotedNode_0848_l523emneiejg.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_0848_l523emneiejh));
          }
        }
        result = quotedNode1_0848_l523emneiejg;
      }
      return result;
    }
  }
}
