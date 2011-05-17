package jetbrains.mps.execution.commands.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class CommandParameterDeclaration_Behavior {
  private static Class[] PARAMETERS_8478830098674441876 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_generateField_8478830098674441876(SNode thisNode) {
    return true;
  }

  public static String call_getSetterName_7327337331549086044(SNode thisNode) {
    return "set" + CommandParameterDeclaration_Behavior.call_getUpperCaseName_7327337331549086061(thisNode);
  }

  public static String call_getUpperCaseName_7327337331549086061(SNode thisNode) {
    return CommandParameterDeclaration_Behavior.getUpperCaseName_7327337331549086070(SPropertyOperations.getString(thisNode, "name"));
  }

  public static String call_getFieldName_7327337331549117850(SNode thisNode) {
    return CommandParameterDeclaration_Behavior.getFieldName_7327337331549086089(SPropertyOperations.getString(thisNode, "name"));
  }

  public static boolean call_generateField_8478830098674441876(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandParameterDeclaration"), "virtual_generateField_8478830098674441876", PARAMETERS_8478830098674441876);
  }

  public static boolean callSuper_generateField_8478830098674441876(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandParameterDeclaration"), callerConceptFqName, "virtual_generateField_8478830098674441876", PARAMETERS_8478830098674441876);
  }

  public static String getUpperCaseName_7327337331549086070(String name) {
    return name.substring(0, 1).toUpperCase() + name.substring(1);
  }

  public static String getFieldName_7327337331549086089(String name) {
    return "my" + CommandParameterDeclaration_Behavior.getUpperCaseName_7327337331549086070(name);
  }
}
