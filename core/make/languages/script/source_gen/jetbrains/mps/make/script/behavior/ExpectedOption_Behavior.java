package jetbrains.mps.make.script.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ExpectedOption_Behavior {
  private static Class[] PARAMETERS_8853708281362145858 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_classifierName_4609636120081351397(SNode thisNode) {
    return NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_" + SConceptPropertyOperations.getString(thisNode, "alias");
  }

  public static String call_classifierName_8853708281362145858(SNode thisNode) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.make.script.structure.ExpectedOption"), "virtual_classifierName_4609636120081351397", PARAMETERS_8853708281362145858);
  }

  public static String callSuper_classifierName_8853708281362145858(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.make.script.structure.ExpectedOption"), callerConceptFqName, "virtual_classifierName_4609636120081351397", PARAMETERS_8853708281362145858);
  }
}
