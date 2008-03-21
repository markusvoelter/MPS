package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SemanticDowncastExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_SemanticDowncastExpression_InferenceRule() {
  }

  public void applyRule(final SNode expr) {
    if((SLinkOperations.getTarget(expr, "leftExpression", true) != null)) {
      final SNode LeftType_typevar_1186060911559 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(expr, "leftExpression", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186060928458", true), SLinkOperations.getTarget(expr, "leftExpression", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186060923030");
      {
        final SNode _representatorVar5 = TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559);
        TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar5, new Runnable() {

          public void run() {
            if(SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.bootstrap.smodelLanguage.structure.SModelType")) {
              TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712100030", true), new QuotationClass_20().createNode(), expr, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712100028");
            } else
            if(SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType")) {
              TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712107222", true), new QuotationClass_21().createNode(), expr, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712107220");
            } else
            if(SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType")) {
              TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712110101", true), new QuotationClass_22().createNode(), expr, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712110099");
            } else
            if(SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT")) {
              TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206059653548", true), new QuotationClass_83().createNode(), expr, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206059653546");
            } else
            {
              TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206059626209", true), TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), expr, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206059626207");
            }
          }

        }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186061035207");
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
