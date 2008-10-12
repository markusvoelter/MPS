package jetbrains.mps.baseLanguage.collections.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_RemoveAllElementsOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_RemoveAllElementsOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    SNode input = RulesFunctions_Collections.getInput(typeCheckingContext, op);
    final SNode elementType_typevar_1184856319398 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    final SNode expectedElementType_typevar_1184856319399 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(input, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856319407", true), new QuotationClass_29().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1184856319398)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856319401", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(SLinkOperations.getTarget(op, "argument", true), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856319415", true), new QuotationClass_30().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(expectedElementType_typevar_1184856319399)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856319409", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(expectedElementType_typevar_1184856319399), TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1184856319398), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856319417", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(op, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184851894367", true), new QuotationClass_31().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184851898840", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.RemoveAllElementsOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
