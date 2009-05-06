package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_TupleComponentIsInScope_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_TupleComponentIsInScope_NonTypesystemRule() {
  }

  public void applyRule(final SNode namedTupleLiteral, final TypeCheckingContext typeCheckingContext) {
    List<SNode> tupleComponents = SLinkOperations.getTargets(SLinkOperations.getTarget(namedTupleLiteral, "tupleDeclaration", false), "component", true);
    for(SNode ref : SLinkOperations.getTargets(namedTupleLiteral, "componentRef", true)) {
      SNode tupleComponent = SLinkOperations.getTarget(ref, "componentDeclaration", false);
      if (!(ListSequence.fromList(tupleComponents).contains(tupleComponent))) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(ref, "tuple component is out of scope", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "8197465398807016917", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleLiteral";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
