package smodelLanguage.samples;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.core.constraints.BaseConcept_Behavior;
import jetbrains.mps.smodel.SNode;

import java.util.List;

/* package */class Children {

  /* package */void accessToChildren_1(SNode statementList) {
    BaseConcept_Behavior.call_getPresentation_1180102203531(statementList);
    int count1 = SLinkOperations.getCount(statementList, "statement");
    List<SNode> statements = SLinkOperations.getTargets(statementList, "statement", true);
    int count2 = SequenceOperations.getSize(statements);
    int count3 = ((List<SNode>)statements).size();
  }
  /* package */void accessToChildren_2(SNode statementList1, SNode statementList2) {
    SLinkOperations.addNewChild(statementList1, "statement", "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement");
    SLinkOperations.addNewChild(statementList1, "statement", "jetbrains.mps.baseLanguage.structure.IfStatement");
    SLinkOperations.addNewChild(statementList1, "statement", "jetbrains.mps.baseLanguage.structure.ReturnStatement");
    for(SNode statement : SLinkOperations.getTargets(statementList1, "statement", true)) {
      SLinkOperations.addChild(statementList2, "statement", SNodeOperations.copyNode(statement));
    }
    for(SNode statement : SLinkOperations.getTargets(statementList1, "statement", true)) {
      SLinkOperations.addChild(statementList2, "statement", SNodeOperations.copyNode(statement));
    }
    for(SNode statement : SLinkOperations.getTargets(statementList1, "statement", true)) {
      SLinkOperations.addChild(statementList2, "statement", SNodeOperations.copyNode(statement));
    }
  }
  /* package */void accessToChildren_3(SNode statement) {
    List<SNode> children1 = SNodeOperations.getDescendants(SLinkOperations.getTarget(statement, "expression", true), null, false);
    List<SNode> children2 = SNodeOperations.getDescendants(statement, "jetbrains.mps.baseLanguage.structure.BooleanConstant", false);
    List<SNode> children3 = SNodeOperations.getDescendants(statement, "jetbrains.mps.baseLanguage.structure.BooleanConstant", true);
    Iterable<SNode> children4 = SequenceOperations.where(SNodeOperations.getDescendants(statement, "jetbrains.mps.baseLanguage.structure.BooleanConstant", false), new zPredicate(Children.this, null));
  }
  /* package */void accessToChildren_4(SNode statement) {
    List<SNode> children1 = SNodeOperations.getDescendantsWhereConceptInList(SLinkOperations.getTarget(statement, "expression", true), new String[]{"jetbrains.mps.baseLanguage.structure.BooleanConstant","jetbrains.mps.baseLanguage.structure.IntegerConstant"}, false);
    List<SNode> children2 = SNodeOperations.getDescendantsWhereConceptInList(SLinkOperations.getTarget(statement, "expression", true), new String[]{"jetbrains.mps.baseLanguage.structure.BooleanConstant","jetbrains.mps.baseLanguage.structure.IntegerConstant"}, true);
  }
}
