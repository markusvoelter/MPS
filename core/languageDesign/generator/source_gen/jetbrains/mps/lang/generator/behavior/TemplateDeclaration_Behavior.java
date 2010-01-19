package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TemplateDeclaration_Behavior {
  private static Class[] PARAMETERS_8952337903384729127 = {SNode.class};
  private static Class[] PARAMETERS_390427525177435267 = {SNode.class ,SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getBaseConcept_2621449412040133768(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "applicableConcept", false);
  }

  public static void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    SLinkOperations.setTarget(thisNode, "applicableConcept", baseConcept, false);
    SPropertyOperations.set(thisNode, "name", "reduce_" + SPropertyOperations.getString(baseConcept, "name"));
  }

  public static SNode call_getBaseConcept_8952337903384729127(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.TemplateDeclaration"), "virtual_getBaseConcept_2621449412040133768", PARAMETERS_8952337903384729127);
  }

  public static void call_setBaseConcept_390427525177435267(SNode thisNode, SNode baseConcept) {
    BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.TemplateDeclaration"), "virtual_setBaseConcept_6261424444345963020", PARAMETERS_390427525177435267, baseConcept);
  }

  public static SNode callSuper_getBaseConcept_8952337903384729127(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.TemplateDeclaration"), callerConceptFqName, "virtual_getBaseConcept_2621449412040133768", PARAMETERS_8952337903384729127);
  }

  public static void callSuper_setBaseConcept_390427525177435267(SNode thisNode, String callerConceptFqName, SNode baseConcept) {
    BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.TemplateDeclaration"), callerConceptFqName, "virtual_setBaseConcept_6261424444345963020", PARAMETERS_390427525177435267, baseConcept);
  }
}
