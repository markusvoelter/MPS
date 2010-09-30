package jetbrains.mps.lang.typesystem.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_NodeTypeOperation_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_NodeTypeOperation_NonTypesystemRule() {
  }

  public void applyRule(final SNode node_TypeOperation, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (!(!(RulesUtil.withinInferenceItem(node_TypeOperation)))) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node_TypeOperation, "don't use typeOperation within inference rules", "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.typesystem)", "6359146168314207369", intentionProvider, errorTarget);
    }
    if (!(!(RulesUtil.withinTypeManagingItem(node_TypeOperation)))) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node_TypeOperation, "don't use typeOperation within such rules", "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.typesystem)", "1135966777630207247", intentionProvider, errorTarget);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.typesystem.structure.Node_TypeOperation";
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
