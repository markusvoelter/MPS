package jetbrains.mps.lang.structure.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class IConceptAspect_Behavior {
  private static Class[] PARAMETERS_2621449412040133768 = {SNode.class};
  private static Class[] PARAMETERS_5270353093116013036 = {SNode.class};
  private static Class[] PARAMETERS_6261424444345963020 = {SNode.class ,SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getBaseConcept_2621449412040133768(SNode thisNode) {
    return null;
  }

  public static List<SNode> virtual_getBaseConceptCollection_5270353093116013036(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    SNode node = IConceptAspect_Behavior.call_getBaseConcept_2621449412040133768(thisNode);
    if ((node != null)) {
      ListSequence.fromList(result).addElement(IConceptAspect_Behavior.call_getBaseConcept_2621449412040133768(thisNode));
    }
    return result;
  }

  public static void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
  }

  public static SNode call_getBaseConcept_2621449412040133768(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.IConceptAspect"), "virtual_getBaseConcept_2621449412040133768", PARAMETERS_2621449412040133768);
  }

  public static List<SNode> call_getBaseConceptCollection_5270353093116013036(SNode thisNode) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.IConceptAspect"), "virtual_getBaseConceptCollection_5270353093116013036", PARAMETERS_5270353093116013036);
  }

  public static void call_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.IConceptAspect"), "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345963020, baseConcept);
  }

  public static SNode callSuper_getBaseConcept_2621449412040133768(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.IConceptAspect"), callerConceptFqName, "virtual_getBaseConcept_2621449412040133768", PARAMETERS_2621449412040133768);
  }

  public static List<SNode> callSuper_getBaseConceptCollection_5270353093116013036(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.IConceptAspect"), callerConceptFqName, "virtual_getBaseConceptCollection_5270353093116013036", PARAMETERS_5270353093116013036);
  }

  public static void callSuper_setBaseConcept_6261424444345963020(SNode thisNode, String callerConceptFqName, SNode baseConcept) {
    BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.IConceptAspect"), callerConceptFqName, "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345963020, baseConcept);
  }
}
