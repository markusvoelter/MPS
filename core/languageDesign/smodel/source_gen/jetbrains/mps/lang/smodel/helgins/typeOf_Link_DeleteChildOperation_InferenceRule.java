package jetbrains.mps.lang.smodel.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Link_DeleteChildOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_Link_DeleteChildOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    RulesUtil.checkAppliedTo_LinkAccess_aggregation(typeCheckingContext, op);
    final SNode Concept_typevar_1206099630117 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConcept(typeCheckingContext, op, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1206099630117));
    {
      final SNode C = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1206099630117);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(C, new Runnable() {

        public void run() {
          {
            SNode _nodeToCheck_1029348928467 = op;
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createEquation(typeCheckingContext.typeOf(op, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.helgins)", "1205528931094", true), new QuotationClass_64().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(C)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.helgins)", "1205528931092", intentionProvider);
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.helgins)", "1205528931049");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Link_DeleteChildOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
