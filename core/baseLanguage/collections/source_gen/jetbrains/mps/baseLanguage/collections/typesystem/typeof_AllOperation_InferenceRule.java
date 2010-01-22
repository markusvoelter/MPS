package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_AllOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_AllOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext) {
    final SNode elementType_typevar_1235566876897 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(operation);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566876898", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566876906", true), (SNode) new typeof_AllOperation_InferenceRule.QuotationClass_7530_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1235566876897), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566876911", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566876916", true), (SNode) new typeof_AllOperation_InferenceRule.QuotationClass_7530_1().createNode(typeCheckingContext), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(operation, "closure", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566876918", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566876927", true), (SNode) new typeof_AllOperation_InferenceRule.QuotationClass_7530_2().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1235566876897), typeCheckingContext), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.AllOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_7530_0 {
    public QuotationClass_7530_0() {
    }

    public SNode createNode(Object parameter_7530_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7530_0 = null;
      SNode quotedNode_7530_1 = null;
      {
        quotedNode_7530_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7530_0 = quotedNode_7530_0;
        {
          quotedNode_7530_1 = (SNode) parameter_7530_0;
          SNode quotedNode1_77;
          if (_parameterValues_129834374.contains(quotedNode_7530_1)) {
            quotedNode1_77 = CopyUtil.copy(quotedNode_7530_1);
          } else {
            _parameterValues_129834374.add(quotedNode_7530_1);
            quotedNode1_77 = quotedNode_7530_1;
          }
          if (quotedNode1_77 != null) {
            quotedNode_7530_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_77, typeCheckingContext));
          }
        }
        result = quotedNode1_7530_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_7530_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7530_0 = null;
      SNode quotedNode_7530_1 = null;
      {
        quotedNode_7530_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7530_0 = quotedNode_7530_0;
        {
          quotedNode_7530_1 = (SNode) parameter_7530_0;
          SNode quotedNode1_77;
          if (_parameterValues_129834374.contains(quotedNode_7530_1)) {
            quotedNode1_77 = CopyUtil.copy(quotedNode_7530_1);
          } else {
            _parameterValues_129834374.add(quotedNode_7530_1);
            quotedNode1_77 = quotedNode_7530_1;
          }
          if (quotedNode1_77 != null) {
            quotedNode_7530_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_77));
          }
        }
        result = quotedNode1_7530_0;
      }
      return result;
    }
  }

  public static class QuotationClass_7530_1 {
    public QuotationClass_7530_1() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7530_2 = null;
      {
        quotedNode_7530_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7530_1 = quotedNode_7530_2;
        result = quotedNode1_7530_1;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7530_2 = null;
      {
        quotedNode_7530_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7530_1 = quotedNode_7530_2;
        result = quotedNode1_7530_1;
      }
      return result;
    }
  }

  public static class QuotationClass_7530_2 {
    public QuotationClass_7530_2() {
    }

    public SNode createNode(Object parameter_7530_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7530_3 = null;
      SNode quotedNode_7530_4 = null;
      SNode quotedNode_7530_5 = null;
      {
        quotedNode_7530_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7530_2 = quotedNode_7530_3;
        {
          quotedNode_7530_4 = (SNode) parameter_7530_1;
          SNode quotedNode1_78;
          if (_parameterValues_129834374.contains(quotedNode_7530_4)) {
            quotedNode1_78 = CopyUtil.copy(quotedNode_7530_4);
          } else {
            _parameterValues_129834374.add(quotedNode_7530_4);
            quotedNode1_78 = quotedNode_7530_4;
          }
          if (quotedNode1_78 != null) {
            quotedNode_7530_3.addChild("parameterType", HUtil.copyIfNecessary(quotedNode1_78, typeCheckingContext));
          }
        }
        {
          quotedNode_7530_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_7530_3 = quotedNode_7530_5;
          quotedNode_7530_3.addChild("resultType", quotedNode1_7530_3);
        }
        result = quotedNode1_7530_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_7530_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7530_3 = null;
      SNode quotedNode_7530_4 = null;
      SNode quotedNode_7530_5 = null;
      {
        quotedNode_7530_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7530_2 = quotedNode_7530_3;
        {
          quotedNode_7530_4 = (SNode) parameter_7530_1;
          SNode quotedNode1_78;
          if (_parameterValues_129834374.contains(quotedNode_7530_4)) {
            quotedNode1_78 = CopyUtil.copy(quotedNode_7530_4);
          } else {
            _parameterValues_129834374.add(quotedNode_7530_4);
            quotedNode1_78 = quotedNode_7530_4;
          }
          if (quotedNode1_78 != null) {
            quotedNode_7530_3.addChild("parameterType", HUtil.copyIfNecessary(quotedNode1_78));
          }
        }
        {
          quotedNode_7530_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_7530_3 = quotedNode_7530_5;
          quotedNode_7530_3.addChild("resultType", quotedNode1_7530_3);
        }
        result = quotedNode1_7530_2;
      }
      return result;
    }
  }
}
