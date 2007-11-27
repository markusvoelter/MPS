package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TreePathAdapterExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_TreePathAdapterExpression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    final SNode ExpType_typevar_1190288659521 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(ExpType_typevar_1190288659521), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "expression", true), "jetbrains.mps.ypath.helgins", "1190288685890", true), SLinkOperations.getTarget(argument, "expression", true), null, "jetbrains.mps.ypath.helgins", "1190288669877");
    TypeChecker.getInstance().getRuntimeSupport().whenConcrete(TypeChecker.getInstance().getEquationManager().getRepresentator(ExpType_typevar_1190288659521), new Runnable() {

      public void run() {
        final SNode treePathType = SLinkOperations.getTarget(SLinkOperations.getTarget(argument, "treepathAspect", false), "treePathType", true);
        if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(ExpType_typevar_1190288659521), SLinkOperations.getTarget(treePathType, "nodeType", true)))) {
          TypeChecker.getInstance().reportTypeError(SLinkOperations.getTarget(argument, "expression", true), "Incompatible type", "jetbrains.mps.ypath.helgins", "1196166858319");
        }
        TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(treePathType, "nodeType", true))), argument, "jetbrains.mps.ypath.helgins", "1190288701293");
      }

    }, "jetbrains.mps.ypath.helgins", "1190288695814");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathAdapterExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
