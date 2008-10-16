package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_BreakStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public check_BreakStatement_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    if (!(SPropertyOperations.hasValue(nodeToCheck, "label", null))) {
      final String lbl = SPropertyOperations.getString(nodeToCheck, "label");
      Iterable<SNode> matchingLoops = ListSequence.fromList(SNodeOperations.getAncestors(nodeToCheck, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", false)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return lbl.equals(SPropertyOperations.getString(it, "label"));
        }

      });
      if (!(Sequence.fromIterable(matchingLoops).isNotEmpty())) {
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.reportTypeError(nodeToCheck, "No such label", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1199469904373", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BreakStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
