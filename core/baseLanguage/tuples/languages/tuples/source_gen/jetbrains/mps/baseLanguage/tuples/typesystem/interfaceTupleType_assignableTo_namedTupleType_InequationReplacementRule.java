package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;

public class interfaceTupleType_assignableTo_namedTupleType_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public interfaceTupleType_assignableTo_namedTupleType_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext, IsApplicable2Status status) {
    if (!(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(supertype, "classifier", false), "extends", true)).contains(SLinkOperations.getTarget(subtype, "iface", false)))) {
      BaseQuickFixProvider intentionProvider = null;
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), "incompatible types", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1240707042401", intentionProvider, errorTarget);
      HUtil.addAdditionalRuleIdsFromInfo(_reporter_2309309498, equationInfo);
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, IsApplicable2Status status) {
    boolean result_14532009 = true;
    if (!(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(supertype, "classifier", false), "extends", true)).contains(SLinkOperations.getTarget(subtype, "iface", false)))) {
      result_14532009 = false;
    }
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public IsApplicableStatus isApplicableSubtypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public IsApplicableStatus isApplicableSupertypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.InterfaceTupleType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType";
  }
}
