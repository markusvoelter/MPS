package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class RegexpDeclarationReferenceRegexp_Behavior {
  private static Class[] PARAMETERS_1222437178336 = {SNode.class, List.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    return Regexp_Behavior.call_par_1222433790846(thisNode, Regexp_Behavior.call_getString_1222432436326(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "regexp", false), "regexp", true), vars));
  }

  public static String call_getString_1222437178336(SNode thisNode, List<SNode> vars) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp"), "virtual_getString_1222432436326", PARAMETERS_1222437178336, vars);
  }

  public static String callSuper_getString_1222437178336(SNode thisNode, String callerConceptFqName, List<SNode> vars) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp"), callerConceptFqName, "virtual_getString_1222432436326", PARAMETERS_1222437178336, vars);
  }
}
