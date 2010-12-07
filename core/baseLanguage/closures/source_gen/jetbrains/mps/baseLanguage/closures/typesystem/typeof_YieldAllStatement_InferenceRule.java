package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_YieldAllStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_YieldAllStatement_InferenceRule() {
  }

  public void applyRule(final SNode statement, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    final SNode elementType_typevar_1228998160752 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(statement, "expression", true);
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "5050026341848553735", 3, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "5050026341848553737", true), (SNode) new typeof_YieldAllStatement_InferenceRule.QuotationClass_oliywx_a0a1a0().createNode(typeCheckingContext.getRepresentative(elementType_typevar_1228998160752), typeCheckingContext.getRepresentative(elementType_typevar_1228998160752), typeCheckingContext), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.YieldAllStatement";
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

  public static class QuotationClass_oliywx_a0a1a0 {
    public QuotationClass_oliywx_a0a1a0() {
    }

    public SNode createNode(Object parameter_11, Object parameter_12, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_6 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_7 = quotedNode_2;
          {
            quotedNode_4 = (SNode) parameter_11;
            SNode quotedNode1_8;
            if (_parameterValues_129834374.contains(quotedNode_4)) {
              quotedNode1_8 = HUtil.copyIfNecessary(quotedNode_4, typeCheckingContext);
            } else {
              _parameterValues_129834374.add(quotedNode_4);
              quotedNode1_8 = quotedNode_4;
            }
            if (quotedNode1_8 != null) {
              quotedNode_2.addChild("componentType", HUtil.copyIfNecessary(quotedNode1_8, typeCheckingContext));
            }
          }
          quotedNode_1.addChild("argument", quotedNode1_7);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_9 = quotedNode_3;
          {
            quotedNode_5 = (SNode) parameter_12;
            SNode quotedNode1_10;
            if (_parameterValues_129834374.contains(quotedNode_5)) {
              quotedNode1_10 = HUtil.copyIfNecessary(quotedNode_5, typeCheckingContext);
            } else {
              _parameterValues_129834374.add(quotedNode_5);
              quotedNode1_10 = quotedNode_5;
            }
            if (quotedNode1_10 != null) {
              quotedNode_3.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_10, typeCheckingContext));
            }
          }
          quotedNode_1.addChild("argument", quotedNode1_9);
        }
        result = quotedNode1_6;
      }
      return result;
    }

    public SNode createNode(Object parameter_11, Object parameter_12) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_6 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_7 = quotedNode_2;
          {
            quotedNode_4 = (SNode) parameter_11;
            SNode quotedNode1_8;
            if (_parameterValues_129834374.contains(quotedNode_4)) {
              quotedNode1_8 = HUtil.copyIfNecessary(quotedNode_4);
            } else {
              _parameterValues_129834374.add(quotedNode_4);
              quotedNode1_8 = quotedNode_4;
            }
            if (quotedNode1_8 != null) {
              quotedNode_2.addChild("componentType", HUtil.copyIfNecessary(quotedNode1_8));
            }
          }
          quotedNode_1.addChild("argument", quotedNode1_7);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_9 = quotedNode_3;
          {
            quotedNode_5 = (SNode) parameter_12;
            SNode quotedNode1_10;
            if (_parameterValues_129834374.contains(quotedNode_5)) {
              quotedNode1_10 = HUtil.copyIfNecessary(quotedNode_5);
            } else {
              _parameterValues_129834374.add(quotedNode_5);
              quotedNode1_10 = quotedNode_5;
            }
            if (quotedNode1_10 != null) {
              quotedNode_3.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_10));
            }
          }
          quotedNode_1.addChild("argument", quotedNode1_9);
        }
        result = quotedNode1_6;
      }
      return result;
    }
  }
}
