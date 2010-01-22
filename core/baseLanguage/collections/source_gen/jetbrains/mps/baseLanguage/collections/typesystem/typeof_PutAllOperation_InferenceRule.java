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

public class typeof_PutAllOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_PutAllOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext) {
    final SNode KEY_typevar_1240906967388 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode VALUE_typevar_1240906971637 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(operation);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240906982948", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240906975191", true), (SNode) new typeof_PutAllOperation_InferenceRule.QuotationClass_2445_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(KEY_typevar_1240906967388), typeCheckingContext.getEquationManager().getRepresentator(VALUE_typevar_1240906971637), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(operation, "map", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240907008336", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240907000627", true), (SNode) new typeof_PutAllOperation_InferenceRule.QuotationClass_2445_1().createNode(typeCheckingContext.getEquationManager().getRepresentator(KEY_typevar_1240906967388), typeCheckingContext.getEquationManager().getRepresentator(VALUE_typevar_1240906971637), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240907073642", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240907069153", true), (SNode) new typeof_PutAllOperation_InferenceRule.QuotationClass_2445_2().createNode(typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.PutAllOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_2445_0 {
    public QuotationClass_2445_0() {
    }

    public SNode createNode(Object parameter_2445_0, Object parameter_2445_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2445_0 = null;
      SNode quotedNode_2445_1 = null;
      SNode quotedNode_2445_2 = null;
      {
        quotedNode_2445_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2445_0 = quotedNode_2445_0;
        {
          quotedNode_2445_1 = (SNode) parameter_2445_0;
          SNode quotedNode1_152;
          if (_parameterValues_129834374.contains(quotedNode_2445_1)) {
            quotedNode1_152 = CopyUtil.copy(quotedNode_2445_1);
          } else {
            _parameterValues_129834374.add(quotedNode_2445_1);
            quotedNode1_152 = quotedNode_2445_1;
          }
          if (quotedNode1_152 != null) {
            quotedNode_2445_0.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_152, typeCheckingContext));
          }
        }
        {
          quotedNode_2445_2 = (SNode) parameter_2445_1;
          SNode quotedNode1_153;
          if (_parameterValues_129834374.contains(quotedNode_2445_2)) {
            quotedNode1_153 = CopyUtil.copy(quotedNode_2445_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2445_2);
            quotedNode1_153 = quotedNode_2445_2;
          }
          if (quotedNode1_153 != null) {
            quotedNode_2445_0.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_153, typeCheckingContext));
          }
        }
        result = quotedNode1_2445_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_2445_0, Object parameter_2445_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2445_0 = null;
      SNode quotedNode_2445_1 = null;
      SNode quotedNode_2445_2 = null;
      {
        quotedNode_2445_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2445_0 = quotedNode_2445_0;
        {
          quotedNode_2445_1 = (SNode) parameter_2445_0;
          SNode quotedNode1_152;
          if (_parameterValues_129834374.contains(quotedNode_2445_1)) {
            quotedNode1_152 = CopyUtil.copy(quotedNode_2445_1);
          } else {
            _parameterValues_129834374.add(quotedNode_2445_1);
            quotedNode1_152 = quotedNode_2445_1;
          }
          if (quotedNode1_152 != null) {
            quotedNode_2445_0.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_152));
          }
        }
        {
          quotedNode_2445_2 = (SNode) parameter_2445_1;
          SNode quotedNode1_153;
          if (_parameterValues_129834374.contains(quotedNode_2445_2)) {
            quotedNode1_153 = CopyUtil.copy(quotedNode_2445_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2445_2);
            quotedNode1_153 = quotedNode_2445_2;
          }
          if (quotedNode1_153 != null) {
            quotedNode_2445_0.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_153));
          }
        }
        result = quotedNode1_2445_0;
      }
      return result;
    }
  }

  public static class QuotationClass_2445_1 {
    public QuotationClass_2445_1() {
    }

    public SNode createNode(Object parameter_2445_2, Object parameter_2445_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2445_3 = null;
      SNode quotedNode_2445_4 = null;
      SNode quotedNode_2445_5 = null;
      {
        quotedNode_2445_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2445_1 = quotedNode_2445_3;
        {
          quotedNode_2445_4 = (SNode) parameter_2445_2;
          SNode quotedNode1_154;
          if (_parameterValues_129834374.contains(quotedNode_2445_4)) {
            quotedNode1_154 = CopyUtil.copy(quotedNode_2445_4);
          } else {
            _parameterValues_129834374.add(quotedNode_2445_4);
            quotedNode1_154 = quotedNode_2445_4;
          }
          if (quotedNode1_154 != null) {
            quotedNode_2445_3.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_154, typeCheckingContext));
          }
        }
        {
          quotedNode_2445_5 = (SNode) parameter_2445_3;
          SNode quotedNode1_155;
          if (_parameterValues_129834374.contains(quotedNode_2445_5)) {
            quotedNode1_155 = CopyUtil.copy(quotedNode_2445_5);
          } else {
            _parameterValues_129834374.add(quotedNode_2445_5);
            quotedNode1_155 = quotedNode_2445_5;
          }
          if (quotedNode1_155 != null) {
            quotedNode_2445_3.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_155, typeCheckingContext));
          }
        }
        result = quotedNode1_2445_1;
      }
      return result;
    }

    public SNode createNode(Object parameter_2445_2, Object parameter_2445_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2445_3 = null;
      SNode quotedNode_2445_4 = null;
      SNode quotedNode_2445_5 = null;
      {
        quotedNode_2445_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2445_1 = quotedNode_2445_3;
        {
          quotedNode_2445_4 = (SNode) parameter_2445_2;
          SNode quotedNode1_154;
          if (_parameterValues_129834374.contains(quotedNode_2445_4)) {
            quotedNode1_154 = CopyUtil.copy(quotedNode_2445_4);
          } else {
            _parameterValues_129834374.add(quotedNode_2445_4);
            quotedNode1_154 = quotedNode_2445_4;
          }
          if (quotedNode1_154 != null) {
            quotedNode_2445_3.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_154));
          }
        }
        {
          quotedNode_2445_5 = (SNode) parameter_2445_3;
          SNode quotedNode1_155;
          if (_parameterValues_129834374.contains(quotedNode_2445_5)) {
            quotedNode1_155 = CopyUtil.copy(quotedNode_2445_5);
          } else {
            _parameterValues_129834374.add(quotedNode_2445_5);
            quotedNode1_155 = quotedNode_2445_5;
          }
          if (quotedNode1_155 != null) {
            quotedNode_2445_3.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_155));
          }
        }
        result = quotedNode1_2445_1;
      }
      return result;
    }
  }

  public static class QuotationClass_2445_2 {
    public QuotationClass_2445_2() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2445_6 = null;
      {
        quotedNode_2445_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2445_2 = quotedNode_2445_6;
        result = quotedNode1_2445_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2445_6 = null;
      {
        quotedNode_2445_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2445_2 = quotedNode_2445_6;
        result = quotedNode1_2445_2;
      }
      return result;
    }
  }
}
