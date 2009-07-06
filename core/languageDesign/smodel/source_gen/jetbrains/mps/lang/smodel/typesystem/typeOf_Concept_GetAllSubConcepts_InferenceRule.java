package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Concept_GetAllSubConcepts_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_Concept_GetAllSubConcepts_InferenceRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext) {
    if (SLinkOperations.getTarget(node, "scope", true) != null) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(node, "scope", true);
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207683977998", true), (SNode)new _Quotations.QuotationClass_77().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207683977996", false, 0, intentionProvider);
      }
    }
    if (SLinkOperations.getTarget(node, "smodel", true) != null) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(node, "smodel", true);
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207683989240", true), (SNode)new _Quotations.QuotationClass_78().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207683989238", false, 0, intentionProvider);
      }
    }
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(node);
    final SNode C_typevar_1225542306711 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = leftExpression;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225542311993", false), (SNode)new _Quotations.QuotationClass_79().createNode(typeCheckingContext.getEquationManager().getRepresentator(C_typevar_1225542306711), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225542319449", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = node;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225542362835", true), (SNode)new _Quotations.QuotationClass_80().createNode(typeCheckingContext.getEquationManager().getRepresentator(C_typevar_1225542306711), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225542362833", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Concept_GetAllSubConcepts";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
