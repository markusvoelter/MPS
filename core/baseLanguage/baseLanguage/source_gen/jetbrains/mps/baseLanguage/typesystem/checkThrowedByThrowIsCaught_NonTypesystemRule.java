package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class checkThrowedByThrowIsCaught_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public checkThrowedByThrowIsCaught_NonTypesystemRule() {
  }

  public void applyRule(final SNode throwStatement, final TypeCheckingContext typeCheckingContext) {
    SNode throwable = SLinkOperations.getTarget(throwStatement, "throwable", true);
    if ((throwable == null)) {
      return;
    }
    SNode throwableType = TypeChecker.getInstance().getTypeOf(throwable);
    Set<SNode> throwables = new HashSet<SNode>();
    SetSequence.fromSet(throwables).addElement(throwableType);
    if (SNodeOperations.isInstanceOf(throwableType, "jetbrains.mps.baseLanguage.structure.Type")) {
      RulesFunctions_BaseLanguage.check(typeCheckingContext, throwables, throwStatement);
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
