package jetbrains.mps.lang.core.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class PropertyAttribute_Behavior {
  private static Class[] PARAMETERS_6407023681583031135 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getOldAttributeRole_6407023681583030897(SNode thisNode) {
    return AttributesRolesUtil.childRoleFromPropertyAttributeRole(SConceptPropertyOperations.getString(thisNode, "role"), SPropertyOperations.getString(thisNode, "propertyName"));
  }

  public static String call_getOldAttributeRole_6407023681583031135(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    if (descriptor instanceof PropertyAttribute_BehaviorDescriptor) {
      PropertyAttribute_BehaviorDescriptor casted = (PropertyAttribute_BehaviorDescriptor) descriptor;
      return casted.virtual_getOldAttributeRole_6407023681583030897(thisNode);
    }
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.PropertyAttribute"), "virtual_getOldAttributeRole_6407023681583030897", PARAMETERS_6407023681583031135);
  }

  public static String callSuper_getOldAttributeRole_6407023681583031135(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.PropertyAttribute"), callerConceptFqName, "virtual_getOldAttributeRole_6407023681583030897", PARAMETERS_6407023681583031135);
  }
}
