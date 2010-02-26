package jetbrains.mps.baseLanguage.dates.typesystem;

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

public class typeof_MathDateTimeOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_MathDateTimeOperation_InferenceRule() {
  }

  public void applyRule(final SNode mathOperation, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(mathOperation, "leftExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "2644539331224368530", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "2644539331224368532", true), (SNode) new typeof_MathDateTimeOperation_InferenceRule.QuotationClass_a82tzq_a0a0a0().createNode(typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(mathOperation, "rightExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "2644539331224421752", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "2644539331224421754", true), (SNode) new typeof_MathDateTimeOperation_InferenceRule.QuotationClass_a82tzq_a0a1a0().createNode(typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(mathOperation, "leftExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "2644539331224424992", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "2644539331224424984", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(mathOperation, "rightExpression", true), "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "2644539331224424997", true), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = mathOperation;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "1238249548697", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "1238249542975", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(mathOperation, "leftExpression", true), "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "2644539331224306337", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.dates.structure.MathDateTimeOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_a82tzq_a0a0a0 {
    public QuotationClass_a82tzq_a0a0a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_a82tzq_a0a0a0 = null;
      SNode quotedNode_a82tzq_a0a0a0a = null;
      SNode quotedNode_a82tzq_b0a0a0a = null;
      {
        quotedNode_a82tzq_a0a0a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_a82tzq_a0a0a0 = quotedNode_a82tzq_a0a0a0;
        {
          quotedNode_a82tzq_a0a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_a82tzq_a0a0a0a = quotedNode_a82tzq_a0a0a0a;
          quotedNode_a82tzq_a0a0a0.addChild("argument", quotedNode1_a82tzq_a0a0a0a);
        }
        {
          quotedNode_a82tzq_b0a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_a82tzq_b0a0a0a = quotedNode_a82tzq_b0a0a0a;
          quotedNode_a82tzq_a0a0a0.addChild("argument", quotedNode1_a82tzq_b0a0a0a);
        }
        result = quotedNode1_a82tzq_a0a0a0;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_a82tzq_a0a0a0 = null;
      SNode quotedNode_a82tzq_a0a0a0a = null;
      SNode quotedNode_a82tzq_b0a0a0a = null;
      {
        quotedNode_a82tzq_a0a0a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_a82tzq_a0a0a0 = quotedNode_a82tzq_a0a0a0;
        {
          quotedNode_a82tzq_a0a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_a82tzq_a0a0a0a = quotedNode_a82tzq_a0a0a0a;
          quotedNode_a82tzq_a0a0a0.addChild("argument", quotedNode1_a82tzq_a0a0a0a);
        }
        {
          quotedNode_a82tzq_b0a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_a82tzq_b0a0a0a = quotedNode_a82tzq_b0a0a0a;
          quotedNode_a82tzq_a0a0a0.addChild("argument", quotedNode1_a82tzq_b0a0a0a);
        }
        result = quotedNode1_a82tzq_a0a0a0;
      }
      return result;
    }
  }

  public static class QuotationClass_a82tzq_a0a1a0 {
    public QuotationClass_a82tzq_a0a1a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_a82tzq_a0a1a0 = null;
      SNode quotedNode_a82tzq_a0a0b0a = null;
      SNode quotedNode_a82tzq_b0a0b0a = null;
      {
        quotedNode_a82tzq_a0a1a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_a82tzq_a0a1a0 = quotedNode_a82tzq_a0a1a0;
        {
          quotedNode_a82tzq_a0a0b0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_a82tzq_a0a0b0a = quotedNode_a82tzq_a0a0b0a;
          quotedNode_a82tzq_a0a1a0.addChild("argument", quotedNode1_a82tzq_a0a0b0a);
        }
        {
          quotedNode_a82tzq_b0a0b0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_a82tzq_b0a0b0a = quotedNode_a82tzq_b0a0b0a;
          quotedNode_a82tzq_a0a1a0.addChild("argument", quotedNode1_a82tzq_b0a0b0a);
        }
        result = quotedNode1_a82tzq_a0a1a0;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_a82tzq_a0a1a0 = null;
      SNode quotedNode_a82tzq_a0a0b0a = null;
      SNode quotedNode_a82tzq_b0a0b0a = null;
      {
        quotedNode_a82tzq_a0a1a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_a82tzq_a0a1a0 = quotedNode_a82tzq_a0a1a0;
        {
          quotedNode_a82tzq_a0a0b0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_a82tzq_a0a0b0a = quotedNode_a82tzq_a0a0b0a;
          quotedNode_a82tzq_a0a1a0.addChild("argument", quotedNode1_a82tzq_a0a0b0a);
        }
        {
          quotedNode_a82tzq_b0a0b0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_a82tzq_b0a0b0a = quotedNode_a82tzq_b0a0b0a;
          quotedNode_a82tzq_a0a1a0.addChild("argument", quotedNode1_a82tzq_b0a0b0a);
        }
        result = quotedNode1_a82tzq_a0a1a0;
      }
      return result;
    }
  }
}
