package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.textGen.TraceInfoGenerationUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.traceable.behavior.ScopeConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class StatementList_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    if (getBuffer().hasPositionsSupport()) {
      TraceInfoGenerationUtil.createScopeInfo(this, node);
    }
    int size = ListSequence.fromList(SLinkOperations.getTargets(node, "statement", true)).count();
    for (int i = 0; i < size; i++) {
      SNode statement = ListSequence.fromList(ListSequence.fromList(SLinkOperations.getTargets(node, "statement", true)).toListSequence()).getElement(i);
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), statement, this.getSNode());
    }
    if (getBuffer().hasPositionsSupport()) {
      TraceInfoGenerationUtil.fillScopeInfo(this, node, ScopeConcept_Behavior.call_getScopeVariables_5067982036267369894(SNodeOperations.cast(node, "jetbrains.mps.lang.traceable.structure.ScopeConcept")));
    }
  }
}
