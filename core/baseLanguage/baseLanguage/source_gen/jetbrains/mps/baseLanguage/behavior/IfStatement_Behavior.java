package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Set;

public class IfStatement_Behavior {
  public static void init(SNode thisNode) {
  }

  public static void call_convertElseToElseIf_1217845914183(SNode thisNode) {
    SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ElsifClause", null);
    SNode ifFalseStatement = SLinkOperations.getTarget(thisNode, "ifFalseStatement", true);
    if (SNodeOperations.isInstanceOf(ifFalseStatement, "jetbrains.mps.baseLanguage.structure.BlockStatement")) {
      SLinkOperations.setTarget(result, "statementList", SNodeOperations.copyNode(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "ifFalseStatement", true), "jetbrains.mps.baseLanguage.structure.BlockStatement"), "statements", true)), true);
    } else {
      SLinkOperations.addChild(SLinkOperations.getTarget(result, "statementList", true), "statement", SNodeOperations.copyNode(ifFalseStatement));
    }
    SNodeOperations.detachNode(SLinkOperations.getTarget(thisNode, "ifFalseStatement", true));
    SLinkOperations.addChild(thisNode, "elsifClauses", result);
  }

  public static boolean call_isGuardIf_1237547453258(SNode thisNode) {
    if ((SLinkOperations.getTarget(thisNode, "ifFalseStatement", true) != null) || ListSequence.fromList(SLinkOperations.getTargets(thisNode, "elsifClauses", true)).isNotEmpty()) {
      return false;
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "ifTrue", true), "statement", true)).count() != 1) {
      return false;
    }

    if (SPropertyOperations.getBoolean(thisNode, "forceMultiLine")) {
      return false;
    }
    if (SPropertyOperations.getBoolean(thisNode, "forceOneLine")) {
      return true;
    }

    SNode onlyStatement = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "ifTrue", true), "statement", true)).first();
    return Statement_Behavior.call_isGuardClauseStatement_1237547327995(onlyStatement);
  }

  public static boolean virtual_isStatementListCompactable_1237546012856(SNode thisNode) {
    return IfStatement_Behavior.call_isGuardIf_1237547453258(thisNode);
  }

  public static void virtual_collectUncaughtMethodThrowables_5412515780383134223(SNode thisNode, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
    if ((SLinkOperations.getTarget(thisNode, "ifTrue", true) != null)) {
      StatementList_Behavior.call_collectUncatchedThrowables_5412515780383134474(SLinkOperations.getTarget(thisNode, "ifTrue", true), throwables, ignoreMayBeThrowables);
    }
    if ((SLinkOperations.getTarget(thisNode, "ifFalseStatement", true) != null)) {
      Statement_Behavior.call_collectUncaughtMethodThrowables_5412515780383134223(SLinkOperations.getTarget(thisNode, "ifFalseStatement", true), throwables, ignoreMayBeThrowables);
    }
    for (SNode elseIfClause : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "elsifClauses", true))) {
      StatementList_Behavior.call_collectUncatchedThrowables_5412515780383134474(SLinkOperations.getTarget(elseIfClause, "statementList", true), throwables, ignoreMayBeThrowables);
      if (!(ignoreMayBeThrowables)) {
        Statement_Behavior.collectUncaughtMethodThrowables_5412515780383112967(throwables, SLinkOperations.getTarget(elseIfClause, "condition", true));
      }
    }
    if (!(ignoreMayBeThrowables)) {
      Statement_Behavior.collectUncaughtMethodThrowables_5412515780383112967(throwables, SLinkOperations.getTarget(thisNode, "condition", true));
    }
  }
}
