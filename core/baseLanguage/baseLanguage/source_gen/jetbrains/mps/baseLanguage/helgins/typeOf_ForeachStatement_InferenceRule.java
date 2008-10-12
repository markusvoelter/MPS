package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ForeachStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_ForeachStatement_InferenceRule() {
  }

  public void applyRule(final SNode foreachStatement, final TypeCheckingContext typeCheckingContext) {
    final SNode T_typevar_1176561507041 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(foreachStatement, "iterable", true);
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(SLinkOperations.getTarget(foreachStatement, "iterable", true), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1207147193776", true), new QuotationClass_74().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(T_typevar_1176561507041), TypeChecker.getInstance().getEquationManager().getRepresentator(T_typevar_1176561507041)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1207147198311", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(foreachStatement, "variable", true);
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createGreaterThanInequation(typeCheckingContext.typeOf(SLinkOperations.getTarget(foreachStatement, "variable", true), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1183457358397", true), TypeChecker.getInstance().getEquationManager().getRepresentator(T_typevar_1176561507041), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1183457358399", false, 1, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ForeachStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
