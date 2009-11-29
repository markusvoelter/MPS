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

public class TryCatchFinally_Intention extends SurroundWithIntention {
  public TryCatchFinally_Intention() {
  }

  public String getDescription(SNode p0, EditorContext p1) {
    return "Try / Catch / Finally";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode tryStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.TryStatement", null);
    List<SNode> selectedNodes = editorContext.getSelectedNodes();
    SNodeOperations.insertNextSiblingChild(node, tryStatement);
    for (SNode selectedNode : ListSequence.fromList(selectedNodes)) {
      SLinkOperations.addChild(SLinkOperations.getTarget(tryStatement, "body", true), "statement", SNodeOperations.getAncestor(selectedNode, "jetbrains.mps.baseLanguage.structure.Statement", true, false));
    }
    SLinkOperations.addNewChild(tryStatement, "catchClause", "jetbrains.mps.baseLanguage.structure.CatchClause");
    editorContext.select(SLinkOperations.getTarget(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(tryStatement, "catchClause", true)).first(), "throwable", true), "type", true));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Statement";
  }
}
