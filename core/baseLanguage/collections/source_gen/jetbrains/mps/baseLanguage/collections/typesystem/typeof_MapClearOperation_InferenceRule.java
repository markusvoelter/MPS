package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_MapClearOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_MapClearOperation_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    final SNode KEY_typevar_1208542413607 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode VALUE_typevar_1208542413609 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(nodeToCheck);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1208542413610", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1208542413612", true), (SNode) new typeof_MapClearOperation_InferenceRule.QuotationClass_7774_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(VALUE_typevar_1208542413609), typeCheckingContext.getEquationManager().getRepresentator(KEY_typevar_1208542413607), typeCheckingContext), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.MapClearOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_7774_0 {
    public QuotationClass_7774_0() {
    }

    public SNode createNode(Object parameter_7774_0, Object parameter_7774_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7774_0 = null;
      SNode quotedNode_7774_1 = null;
      SNode quotedNode_7774_2 = null;
      {
        quotedNode_7774_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7774_0 = quotedNode_7774_0;
        {
          quotedNode_7774_1 = (SNode) parameter_7774_0;
          SNode quotedNode1_50;
          if (_parameterValues_129834374.contains(quotedNode_7774_1)) {
            quotedNode1_50 = CopyUtil.copy(quotedNode_7774_1);
          } else {
            _parameterValues_129834374.add(quotedNode_7774_1);
            quotedNode1_50 = quotedNode_7774_1;
          }
          if (quotedNode1_50 != null) {
            quotedNode_7774_0.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_50, typeCheckingContext));
          }
        }
        {
          quotedNode_7774_2 = (SNode) parameter_7774_1;
          SNode quotedNode1_51;
          if (_parameterValues_129834374.contains(quotedNode_7774_2)) {
            quotedNode1_51 = CopyUtil.copy(quotedNode_7774_2);
          } else {
            _parameterValues_129834374.add(quotedNode_7774_2);
            quotedNode1_51 = quotedNode_7774_2;
          }
          if (quotedNode1_51 != null) {
            quotedNode_7774_0.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_51, typeCheckingContext));
          }
        }
        result = quotedNode1_7774_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_7774_0, Object parameter_7774_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7774_0 = null;
      SNode quotedNode_7774_1 = null;
      SNode quotedNode_7774_2 = null;
      {
        quotedNode_7774_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7774_0 = quotedNode_7774_0;
        {
          quotedNode_7774_1 = (SNode) parameter_7774_0;
          SNode quotedNode1_50;
          if (_parameterValues_129834374.contains(quotedNode_7774_1)) {
            quotedNode1_50 = CopyUtil.copy(quotedNode_7774_1);
          } else {
            _parameterValues_129834374.add(quotedNode_7774_1);
            quotedNode1_50 = quotedNode_7774_1;
          }
          if (quotedNode1_50 != null) {
            quotedNode_7774_0.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_50));
          }
        }
        {
          quotedNode_7774_2 = (SNode) parameter_7774_1;
          SNode quotedNode1_51;
          if (_parameterValues_129834374.contains(quotedNode_7774_2)) {
            quotedNode1_51 = CopyUtil.copy(quotedNode_7774_2);
          } else {
            _parameterValues_129834374.add(quotedNode_7774_2);
            quotedNode1_51 = quotedNode_7774_2;
          }
          if (quotedNode1_51 != null) {
            quotedNode_7774_0.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_51));
          }
        }
        result = quotedNode1_7774_0;
      }
      return result;
    }
  }
}
