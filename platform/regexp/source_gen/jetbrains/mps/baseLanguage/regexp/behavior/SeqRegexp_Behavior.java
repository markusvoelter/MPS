package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class SeqRegexp_Behavior {
  private static Class[] PARAMETERS_1222436755347 = {SNode.class ,List.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    return Regexp_Behavior.call_par_1222433790846(thisNode, Regexp_Behavior.call_getString_1222432436326(SLinkOperations.getTarget(thisNode, "left", true), vars)) + Regexp_Behavior.call_par_1222433790846(thisNode, Regexp_Behavior.call_getString_1222432436326(SLinkOperations.getTarget(thisNode, "right", true), vars));
  }

  public static String call_getString_1222436755347(SNode thisNode, List<SNode> vars) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp"), "virtual_getString_1222432436326", PARAMETERS_1222436755347, vars);
  }

  public static String callSuper_getString_1222436755347(SNode thisNode, String callerConceptFqName, List<SNode> vars) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp"), callerConceptFqName, "virtual_getString_1222432436326", PARAMETERS_1222436755347, vars);
  }
}
