package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Statement_Behavior {
  private static Class[] PARAMETERS_1237547327995 = {SNode.class};
  private static Class[] PARAMETERS_5412515780383134223 = {SNode.class ,Set.class ,Boolean.TYPE};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isGuardClauseStatement_1237547327995(SNode thisNode) {
    return false;
  }

  public static Set<SNode> call_uncaughtThrowables_5412515780383108857(SNode thisNode, boolean ignoreMayBeThrowables) {
    Set<SNode> result = SetSequence.fromSet(new HashSet<SNode>());
    Statement_Behavior.call_collectUncaughtMethodThrowables_5412515780383134223(thisNode, result, ignoreMayBeThrowables);
    return result;
  }

  public static void virtual_collectUncaughtMethodThrowables_5412515780383134223(SNode thisNode, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
    if (ignoreMayBeThrowables) {
      return;
    }
    Statement_Behavior.collectUncaughtMethodThrowables_5412515780383112967(throwables, thisNode);
  }

  public static boolean call_isGuardClauseStatement_1237547327995(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Statement"), "virtual_isGuardClauseStatement_1237547327995", PARAMETERS_1237547327995);
  }

  public static void call_collectUncaughtMethodThrowables_5412515780383134223(SNode thisNode, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
    BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Statement"), "virtual_collectUncaughtMethodThrowables_5412515780383134223", PARAMETERS_5412515780383134223, throwables, ignoreMayBeThrowables);
  }

  public static boolean callSuper_isGuardClauseStatement_1237547327995(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Statement"), callerConceptFqName, "virtual_isGuardClauseStatement_1237547327995", PARAMETERS_1237547327995);
  }

  public static void callSuper_collectUncaughtMethodThrowables_5412515780383134223(SNode thisNode, String callerConceptFqName, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
    BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Statement"), callerConceptFqName, "virtual_collectUncaughtMethodThrowables_5412515780383134223", PARAMETERS_5412515780383134223, throwables, ignoreMayBeThrowables);
  }

  public static void collectUncaughtMethodThrowables_5412515780383112967(Set<SNode> throwables, SNode arg) {
    for (SNode methodCall : SNodeOperations.getDescendants(arg, "jetbrains.mps.baseLanguage.structure.IMethodCall", false, new String[]{})) {
      for (SNode throwable : SLinkOperations.getTargets(SLinkOperations.getTarget(methodCall, "baseMethodDeclaration", false), "throwsItem", true)) {
        if (SNodeOperations.isInstanceOf(throwable, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
          SetSequence.fromSet(throwables).addElement(SLinkOperations.getTarget(SNodeOperations.cast(throwable, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false));
        }
      }
    }
  }
}
