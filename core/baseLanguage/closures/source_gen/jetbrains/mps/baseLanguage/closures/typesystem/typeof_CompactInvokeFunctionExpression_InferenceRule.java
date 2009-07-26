package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_CompactInvokeFunctionExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_CompactInvokeFunctionExpression_InferenceRule() {
  }

  public void applyRule(final SNode invoke, final TypeCheckingContext typeCheckingContext) {
    List<SNode> ptypes1 = ListSequence.fromList(new ArrayList<SNode>());
    List<SNode> ptypes2 = ListSequence.fromList(new ArrayList<SNode>());
    for(SNode p : SLinkOperations.getTargets(invoke, "parameter", true)) {
      final SNode T_typevar_7246115176735293270 = typeCheckingContext.createNewRuntimeTypesVariable();
      ListSequence.fromList(ptypes1).addElement(typeCheckingContext.getEquationManager().getRepresentator(T_typevar_7246115176735293270));
      ListSequence.fromList(ptypes2).addElement(typeCheckingContext.getEquationManager().getRepresentator(T_typevar_7246115176735293270));
      {
        SNode _nodeToCheck_1029348928467 = p;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "7246115176735293285", true), (SNode)typeCheckingContext.getEquationManager().getRepresentator(T_typevar_7246115176735293270), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "7246115176735293281", false, 0, intentionProvider);
      }
    }
    final SNode ret_typevar_7246115176735293292 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode ret2_typevar_7246115176735293293 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = invoke;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "7246115176735293298", true), (SNode)typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_7246115176735293292), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "7246115176735293294", intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = invoke;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong((SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(invoke, "function", true), "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "7246115176735293302", true), (SNode)new _Quotations.QuotationClass_16().createNode(ptypes1, typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_7246115176735293292), ptypes2, typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_7246115176735293292), typeCheckingContext.getEquationManager().getRepresentator(ret2_typevar_7246115176735293293), typeCheckingContext), _nodeToCheck_1029348928467, "either return type or parameter types don't match", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "7246115176735293300", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
