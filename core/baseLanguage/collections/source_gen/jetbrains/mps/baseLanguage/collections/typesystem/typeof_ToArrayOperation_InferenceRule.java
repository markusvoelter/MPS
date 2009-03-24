package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.collections.typesystem.RulesFunctions_Collections;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.baseLanguage.collections.typesystem._Quotations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ToArrayOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ToArrayOperation_InferenceRule() {
  }

  public void applyRule(final SNode toArrayOperation, final TypeCheckingContext typeCheckingContext) {
    SNode input = RulesFunctions_Collections.getInput(typeCheckingContext, toArrayOperation);
    final SNode elementType_typevar_1184970400760 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = toArrayOperation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(input, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184970400767", true), new _Quotations.QuotationClass_44().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184970400760), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184970400761", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = toArrayOperation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(toArrayOperation, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1215607319886", true), new _Quotations.QuotationClass_45().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184970400760), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1215607319884", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ToArrayOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
