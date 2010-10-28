package jetbrains.mps.baseLanguageInternal.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.List;
import jetbrains.mps.baseLanguageInternal.behavior.ExtractStaticMethod_CallExpression_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ExtractStaticMethodCall_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_ExtractStaticMethodCall_NonTypesystemRule() {
  }

  public void applyRule(final SNode callStatic, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    List<SNode> available = ExtractStaticMethod_CallExpression_Behavior.getMethods_5857910569715993654(callStatic);
    if (!(ListSequence.fromList(available).contains(SLinkOperations.getTarget(callStatic, "baseMethodDeclaration", false)))) {
      {
        BaseQuickFixProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(callStatic, "This method can't be called from the current context", "r:00000000-0000-4000-0000-011c895903ab(jetbrains.mps.baseLanguageInternal.typesystem)", "8881995820265138588", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethod_CallExpression";
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
