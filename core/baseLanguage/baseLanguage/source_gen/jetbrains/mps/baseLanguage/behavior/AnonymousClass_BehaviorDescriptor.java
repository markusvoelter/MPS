package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.traceable.behavior.UnitConcept_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import java.util.List;

public class AnonymousClass_BehaviorDescriptor extends ClassConcept_BehaviorDescriptor implements IMethodCall_BehaviorDescriptor, IAnonymousClass_BehaviorDescriptor, IControlFlowInterrupter_BehaviorDescriptor, UnitConcept_BehaviorDescriptor {
  public AnonymousClass_BehaviorDescriptor() {
  }

  public SNode virtual_getTypeAnnotation_1233920952262(SNode thisNode) {
    return IMethodCall_Behavior.virtual_getTypeAnnotation_1233920952262(thisNode);
  }

  public SNode virtual_deriveType_1213877435747(SNode thisNode, SNode expression) {
    return IMethodCall_Behavior.virtual_deriveType_1213877435747(thisNode, expression);
  }

  public Map<SNode, SNode> virtual_getTypesByTypeVars_851115533308208851(SNode thisNode) {
    return IMethodCall_Behavior.virtual_getTypesByTypeVars_851115533308208851(thisNode);
  }

  public String virtual_getUnitName_5067982036267369911(SNode thisNode) {
    return AnonymousClass_Behavior.virtual_getUnitName_5067982036267369911(thisNode);
  }

  public String virtual_getNestedName_8540045600162184125(SNode thisNode) {
    return AnonymousClass_Behavior.virtual_getNestedName_8540045600162184125(thisNode);
  }

  public SNode virtual_deriveType_4555537781928374706(SNode thisNode, SNode expression, SNode link) {
    return TypeDerivable_Behavior.virtual_deriveType_4555537781928374706(thisNode, expression, link);
  }

  public List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    return AnonymousClass_Behavior.virtual_getAvailableMethodDeclarations_5776618742611315379(thisNode, methodName);
  }

  public SNode virtual_getSuperclass_1240936569950(SNode thisNode) {
    return AnonymousClass_Behavior.virtual_getSuperclass_1240936569950(thisNode);
  }

  public SNode virtual_getInstanceType_8008512149545154471(SNode thisNode) {
    return IMethodCall_Behavior.virtual_getInstanceType_8008512149545154471(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return AnonymousClass_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.AnonymousClass";
  }
}
