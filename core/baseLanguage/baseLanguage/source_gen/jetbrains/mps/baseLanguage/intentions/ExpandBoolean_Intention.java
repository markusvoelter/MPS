package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class ExpandBoolean_Intention extends BaseIntention implements Intention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.VariableReference";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Expand boolean";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "variableDeclaration", false), "type", true), "jetbrains.mps.baseLanguage.structure.BooleanType"))) {
      return false;
    }
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.StatementList", false, false) == null) {
      return false;
    }
    return true;
  }

  public void execute(SNode node, EditorContext editorContext) {
    final zClosureContext1 _zClosureContext1 = new zClosureContext1();
    SNode statementNode = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
    // null
    SNode ifNode = SNodeOperations.insertNewPrevSiblingChild(statementNode, "jetbrains.mps.baseLanguage.structure.IfStatement");
    SNode ifTrue = SLinkOperations.setNewChild(ifNode, "ifTrue", "jetbrains.mps.baseLanguage.structure.StatementList");
    SNode ifFalse = SLinkOperations.setNewChild(SLinkOperations.setNewChild(ifNode, "ifFalseStatement", "jetbrains.mps.baseLanguage.structure.BlockStatement"), "statements", "jetbrains.mps.baseLanguage.structure.StatementList");
    // null
    SLinkOperations.setTarget(ifNode, "condition", SNodeOperations.copyNode(node), true);
    // null
    SLinkOperations.insertChildFirst(ifTrue, "statement", SNodeOperations.copyNode(statementNode));
    SLinkOperations.insertChildFirst(ifFalse, "statement", SNodeOperations.copyNode(statementNode));
    // null
    _zClosureContext1.fake_node = node;
    Iterable<SNode> refs;
    refs = SequenceOperations.where(SNodeOperations.getDescendants(SequenceOperations.getFirst(SLinkOperations.getTargets(ifTrue, "statement", true)), null, false), new zPredicate1(null, _zClosureContext1));
    SequenceOperations.forEach(refs, new zForEach1(null, _zClosureContext1));
    refs = SequenceOperations.where(SNodeOperations.getDescendants(SequenceOperations.getFirst(SLinkOperations.getTargets(ifFalse, "statement", true)), null, false), new zPredicate2(null, _zClosureContext1));
    SequenceOperations.forEach(refs, new zForEach2(null, _zClosureContext1));
    // null
    SNodeOperations.deleteNode(statementNode);
  }

}
