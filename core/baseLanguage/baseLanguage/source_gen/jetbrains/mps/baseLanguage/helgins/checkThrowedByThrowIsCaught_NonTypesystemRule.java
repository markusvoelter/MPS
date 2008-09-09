package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class checkThrowedByThrowIsCaught_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public checkThrowedByThrowIsCaught_NonTypesystemRule() {
  }

  public void applyRule(final SNode throwStatement) {
    SNode throwable = SLinkOperations.getTarget(throwStatement, "throwable", true);
    if ((throwable == null)) {
      return;
    }
    {
      final SNode ThrowableType = TypeChecker.getInstance().getRuntimeSupport().typeOf(throwable, "jetbrains.mps.baseLanguage.helgins", "1210182461919", true);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(ThrowableType, new Runnable() {

        public void run() {
          Set<SNode> throwables = new HashSet<SNode>();
          throwables.add(TypeChecker.getInstance().getEquationManager().getRepresentator(ThrowableType));
          if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(ThrowableType), "jetbrains.mps.baseLanguage.structure.Type")) {
            RulesFunctions_BaseLanguage.check(throwables, throwStatement);
          }
        }

      }, "jetbrains.mps.baseLanguage.helgins@3_0", "1220964293933");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ThrowStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
