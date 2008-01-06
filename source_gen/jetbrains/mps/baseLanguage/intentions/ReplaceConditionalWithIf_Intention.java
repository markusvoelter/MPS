package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;

public class ReplaceConditionalWithIf_Intention extends BaseIntention implements Intention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Replace conditional with if";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    SNode stmtNode = (SNode) SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
    if (stmtNode == null) {
      return false;
    }
    return true;
  }

  public void execute(SNode node, EditorContext editorContext) {
    // variable initialization case - split or you'll loose this var from scope
    SNode stmtNode = (SNode) SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
    if (SNodeOperations.isInstanceOf(stmtNode, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")) {
      SNode variableDeclaration = SLinkOperations.getTarget(((SNode) stmtNode), "localVariableDeclaration", true);
      SNode eStatement = SModelOperations.createNewNode(SNodeOperations.getModel(variableDeclaration), "jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
      SNode assignment = SLinkOperations.setNewChild(eStatement, "expression", "jetbrains.mps.baseLanguage.structure.AssignmentExpression");
      SLinkOperations.setTarget(assignment, "rValue", SLinkOperations.getTarget(variableDeclaration, "initializer", true), true);
      SNode local = SLinkOperations.setNewChild(assignment, "lValue", "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
      SLinkOperations.setTarget(local, "variableDeclaration", variableDeclaration, false);
      SNodeOperations.insertNextSiblingChild(stmtNode, eStatement);
      stmtNode = (SNode) SNodeOperations.getNextSibling(stmtNode);
    }
    // Get used nodes
    SNode nodeParent = SNodeOperations.getParent(node, null, false, false);
    int nodeIndex = SequenceOperations.indexOf(SNodeOperations.getChildren(nodeParent), node);
    SNode nodeCopy = SNodeOperations.copyNode(node);
    // make + node
    SNodeOperations.replaceWithAnother(ListOperations.getElement(SNodeOperations.getChildren(nodeParent), nodeIndex), SLinkOperations.getTarget(nodeCopy, "ifTrue", true));
    SNode trueStmt = SNodeOperations.copyNode(stmtNode);
    // make - node
    SNodeOperations.replaceWithAnother(ListOperations.getElement(SNodeOperations.getChildren(nodeParent), nodeIndex), SLinkOperations.getTarget(nodeCopy, "ifFalse", true));
    SNode falseStmt = SNodeOperations.copyNode(stmtNode);
    // make the best - block ever
    SNode falseBlockStmt = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.BlockStatement", null);
    SLinkOperations.setNewChild(falseBlockStmt, "statements", "jetbrains.mps.baseLanguage.structure.StatementList");
    SLinkOperations.insertChildFirst(SLinkOperations.getTarget(falseBlockStmt, "statements", true), "statement", SNodeOperations.copyNode(stmtNode));
    // make if-statement and replace
    SNode ifNode = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.IfStatement", null);
    SLinkOperations.setTarget(ifNode, "condition", SLinkOperations.getTarget(node, "condition", true), true);
    SLinkOperations.setNewChild(ifNode, "ifTrue", "jetbrains.mps.baseLanguage.structure.StatementList");
    SLinkOperations.insertChildFirst(SLinkOperations.getTarget(ifNode, "ifTrue", true), "statement", trueStmt);
    SLinkOperations.setTarget(ifNode, "ifFalseStatement", falseBlockStmt, true);
    SNodeOperations.replaceWithAnother(stmtNode, ifNode);
  }

}
