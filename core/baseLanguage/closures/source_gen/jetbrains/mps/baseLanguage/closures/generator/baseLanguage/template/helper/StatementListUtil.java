package jetbrains.mps.baseLanguage.closures.generator.baseLanguage.template.helper;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Collections;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class StatementListUtil {

  public static List<SNode> selectStatementsUntilControlStatement(SNode slist) {
    if (SLinkOperations.getCount(slist, "statement") > 0) {
      return selectStatementsUntilControlStatement(slist, ListSequence.fromList(((List<SNode>)SLinkOperations.getTargets(slist, "statement", true))).getElement(0));
    }
    return Collections.emptyList();
  }

  public static List<SNode> selectStatementsUntilControlStatement(SNode slist, SNode start) {
    List<SNode> res = ListSequence.<SNode>fromArray();
    boolean foundStart = false;
    for(SNode stmt : ((List<SNode>)SLinkOperations.getTargets(slist, "statement", true))) {
      if (stmt == start) {
        foundStart = true;
      }
      if (foundStart) {
        if (isControlStatement(stmt)) {
          break;
        }
        if (!(isIgnoredStatement(stmt))) {
          ListSequence.fromList(res).addElement(stmt);
        }
      }
    }
    return res;
  }

  public static SNode nextSibling(SNode stmt) {
    SNode nextSibling = SNodeOperations.getNextSibling(stmt);
    while ((nextSibling != null) && isIgnoredStatement(nextSibling)) {
      nextSibling = SNodeOperations.getNextSibling(nextSibling);
    }
    return nextSibling;
  }

  public static boolean isControlStatement(SNode stmt) {
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.WhileStatement")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.DoWhileStatement")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ForStatement")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ForeachStatement")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.SwitchStatement")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.IfStatement")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.closures.structure.YieldStatement")) {
      return true;
    }
    return false;
  }

  public static boolean isIgnoredStatement(SNode stmt) {
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.BlockStatement")) {
      return true;
    }
    return false;
  }

}
