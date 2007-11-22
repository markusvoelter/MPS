package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TreePathAspect_InferenceRule implements InferenceRule_Runtime {

  public  typeof_TreePathAspect_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.ypath.helgins", "1184578634207", true), SLinkOperations.getTarget(argument, "treePathType", true), argument, null, "jetbrains.mps.ypath.helgins", "1184578634206");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathAspect";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
