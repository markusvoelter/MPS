package jetbrains.mps.baseLanguage.collections.typesystem;

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

public class typeof_ForEachStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ForEachStatement_InferenceRule() {
  }

  public void applyRule(final SNode forEachStatement, final TypeCheckingContext typeCheckingContext) {
    SNode variable = SLinkOperations.getTarget(forEachStatement, "variable", true);
    SNode inputSequence = SLinkOperations.getTarget(forEachStatement, "inputSequence", true);
    if ((inputSequence != null) && (variable != null)) {
      final SNode elementType_typevar_1184771826645 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = inputSequence;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184772149777", 0, intentionProvider);
        _info_12389875345.setInequationGroup("default");
        typeCheckingContext.createGreaterThanInequation((SNode) new typeof_ForEachStatement_InferenceRule.QuotationClass_0423_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184771826645), typeCheckingContext), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184772149783", true), false, _info_12389875345);
      }
      {
        SNode _nodeToCheck_1029348928467 = variable;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184772002733", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184771942551", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184771826645), _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ForEachStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_0423_0 {
    public QuotationClass_0423_0() {
    }

    public SNode createNode(Object parameter_0423_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0423_0 = null;
      SNode quotedNode_0423_1 = null;
      {
        quotedNode_0423_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0423_0 = quotedNode_0423_0;
        {
          quotedNode_0423_1 = (SNode) parameter_0423_0;
          SNode quotedNode1_3;
          if (_parameterValues_129834374.contains(quotedNode_0423_1)) {
            quotedNode1_3 = CopyUtil.copy(quotedNode_0423_1);
          } else {
            _parameterValues_129834374.add(quotedNode_0423_1);
            quotedNode1_3 = quotedNode_0423_1;
          }
          if (quotedNode1_3 != null) {
            quotedNode_0423_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_3, typeCheckingContext));
          }
        }
        result = quotedNode1_0423_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_0423_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0423_0 = null;
      SNode quotedNode_0423_1 = null;
      {
        quotedNode_0423_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0423_0 = quotedNode_0423_0;
        {
          quotedNode_0423_1 = (SNode) parameter_0423_0;
          SNode quotedNode1_3;
          if (_parameterValues_129834374.contains(quotedNode_0423_1)) {
            quotedNode1_3 = CopyUtil.copy(quotedNode_0423_1);
          } else {
            _parameterValues_129834374.add(quotedNode_0423_1);
            quotedNode1_3 = quotedNode_0423_1;
          }
          if (quotedNode1_3 != null) {
            quotedNode_0423_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_3));
          }
        }
        result = quotedNode1_0423_0;
      }
      return result;
    }
  }
}
