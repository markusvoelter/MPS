package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_BaseMethodDeclaration_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_BaseMethodDeclaration_NonTypesystemRule() {
  }

  public void applyRule(final SNode baseMethodDeclaration, final TypeCheckingContext typeCheckingContext) {
    if (BaseMethodDeclaration_Behavior.call_isAbstract_1232982539764(baseMethodDeclaration) && SPropertyOperations.getBoolean(baseMethodDeclaration, "isSynchronized")) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(baseMethodDeclaration, "Abstract method can't be synchronized", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "4276006055364077562", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
