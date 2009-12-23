package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IContainsStatementList_Behavior {
  private static Class[] PARAMETERS_1237546012856 = {SNode.class};
  private static Class[] PARAMETERS_1237546693016 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getStatementList_1237545932619(SNode thisNode) {
    return SNodeOperations.cast(ListSequence.fromList(SNodeOperations.getChildren(thisNode)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.StatementList");
      }
    }).first(), "jetbrains.mps.baseLanguage.structure.StatementList");
  }

  public static boolean virtual_isStatementListCompactable_1237546012856(SNode thisNode) {
    return false;
  }

  public static boolean virtual_isStatementListCompact_1237546693016(SNode thisNode) {
    return StatementList_Behavior.call_isOneLiner_1237538811451(IContainsStatementList_Behavior.call_getStatementList_1237545932619(thisNode));
  }

  public static boolean call_isStatementListCompactable_1237546012856(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IContainsStatementList"), "virtual_isStatementListCompactable_1237546012856", PARAMETERS_1237546012856);
  }

  public static boolean call_isStatementListCompact_1237546693016(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IContainsStatementList"), "virtual_isStatementListCompact_1237546693016", PARAMETERS_1237546693016);
  }

  public static boolean callSuper_isStatementListCompactable_1237546012856(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IContainsStatementList"), callerConceptFqName, "virtual_isStatementListCompactable_1237546012856", PARAMETERS_1237546012856);
  }

  public static boolean callSuper_isStatementListCompact_1237546693016(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IContainsStatementList"), callerConceptFqName, "virtual_isStatementListCompact_1237546693016", PARAMETERS_1237546693016);
  }
}
