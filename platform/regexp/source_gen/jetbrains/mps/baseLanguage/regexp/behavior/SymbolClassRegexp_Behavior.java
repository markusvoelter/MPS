package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class SymbolClassRegexp_Behavior {
  private static Class[] PARAMETERS_1222857578599 = {SNode.class, List.class};
  private static Class[] PARAMETERS_8173814113624650627 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    return SymbolClassRegexpAndPart_Behavior.call_getRepresentation_8173814113624650482(thisNode);
  }

  public static String virtual_getRepresentation_8173814113624650482(SNode thisNode) {
    return SConceptPropertyOperations.getString(thisNode, "alias") + SymbolClassRegexp_Behavior.call_partsToString_1222857748873(thisNode, SLinkOperations.getTargets(thisNode, "part", true)) + "]";
  }

  public static String call_partsToString_1222857748873(SNode thisNode, List<SNode> parts) {
    StringBuilder result = new StringBuilder();
    for (SNode part : parts) {
      result.append(SymbolClassRegexpAndPart_Behavior.call_getRepresentation_8173814113624650482(part));
    }
    return result.toString();
  }

  public static String call_getString_1222857578599(SNode thisNode, List<SNode> vars) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp"), "virtual_getString_1222432436326", PARAMETERS_1222857578599, vars);
  }

  public static String call_getRepresentation_8173814113624650627(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp"), "virtual_getRepresentation_8173814113624650482", PARAMETERS_8173814113624650627);
  }

  public static String callSuper_getString_1222857578599(SNode thisNode, String callerConceptFqName, List<SNode> vars) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp"), callerConceptFqName, "virtual_getString_1222432436326", PARAMETERS_1222857578599, vars);
  }

  public static String callSuper_getRepresentation_8173814113624650627(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp"), callerConceptFqName, "virtual_getRepresentation_8173814113624650482", PARAMETERS_8173814113624650627);
  }
}
