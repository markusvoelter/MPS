package jetbrains.mps.analyzers.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.analyzers.behavior.Rule_Behavior;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class checkDuplicatedRules_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public checkDuplicatedRules_NonTypesystemRule() {
  }

  public void applyRule(final SNode analyzer, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    Set<String> names = SetSequence.fromSet(new HashSet());
    for (SNode ruleRef : SLinkOperations.getTargets(analyzer, "ruleReference", true)) {
      if (ruleRef == null || SLinkOperations.getTarget(ruleRef, "rule", false) == null) {
        continue;
      }
      if (SetSequence.fromSet(names).contains(Rule_Behavior.call_getFqName_8716397433969716516(SLinkOperations.getTarget(ruleRef, "rule", false)))) {
        {
          BaseQuickFixProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(ruleRef, "Data flow constructor name duplication", "r:139daa25-c5a7-4ac9-85a2-eb14d22e8f56(jetbrains.mps.analyzers.typesystem)", "1483902774837535780", intentionProvider, errorTarget);
        }
      } else {
        SetSequence.fromSet(names).addElement(Rule_Behavior.call_getFqName_8716397433969716516(SLinkOperations.getTarget(ruleRef, "rule", false)));
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.analyzers.structure.Analyzer";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
