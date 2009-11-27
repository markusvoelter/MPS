package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.SurroundWithIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class SurroundWithSynchronized_Intention extends SurroundWithIntention {
  public SurroundWithSynchronized_Intention() {
  }

  public String getDescription(SNode p0, EditorContext p1) {
    return "Synchronized";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode synchronizedStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.SynchronizedStatement", null);
    List<SNode> selectedNodes = editorContext.getSelectedNodes();
    SNodeOperations.insertNextSiblingChild(ListSequence.fromList(selectedNodes).last(), synchronizedStatement);
    for (SNode n : ListSequence.fromList(selectedNodes)) {
      SLinkOperations.addChild(SLinkOperations.getTarget(synchronizedStatement, "block", true), "statement", SNodeOperations.cast(n, "jetbrains.mps.baseLanguage.structure.Statement"));
    }
    editorContext.select(SLinkOperations.getTarget(synchronizedStatement, "expression", true));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Statement";
  }
}
