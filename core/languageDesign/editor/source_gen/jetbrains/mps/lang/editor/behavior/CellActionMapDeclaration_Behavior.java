package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CellActionMapDeclaration_Behavior {
  private static Class[] PARAMETERS_5270353093116096517 = {SNode.class};
  private static Class[] PARAMETERS_6261424444345978736 = {SNode.class ,SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getBaseConcept_2621449412040133768(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "applicableConcept", false);
  }

  public static void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    SLinkOperations.setTarget(thisNode, "applicableConcept", baseConcept, false);
  }

  public static SNode call_getBaseConcept_5270353093116096517(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.CellActionMapDeclaration"), "virtual_getBaseConcept_2621449412040133768", PARAMETERS_5270353093116096517);
  }

  public static void call_setBaseConcept_6261424444345978736(SNode thisNode, SNode baseConcept) {
    BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.CellActionMapDeclaration"), "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345978736, baseConcept);
  }

  public static SNode callSuper_getBaseConcept_5270353093116096517(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.CellActionMapDeclaration"), callerConceptFqName, "virtual_getBaseConcept_2621449412040133768", PARAMETERS_5270353093116096517);
  }

  public static void callSuper_setBaseConcept_6261424444345978736(SNode thisNode, String callerConceptFqName, SNode baseConcept) {
    BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.CellActionMapDeclaration"), callerConceptFqName, "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345978736, baseConcept);
  }
}
