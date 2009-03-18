package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.io.File;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class Jar_Behavior {

  public static void init(SNode thisNode) {
    SLinkOperations.setTarget(thisNode, "delete", SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Delete", null), true);
  }

  public static String call_getTemporalDir_1213877485659(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "name") + ".tmp";
  }

  public static String virtual_getChildrenTargetDir_1237389224202(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent")) {
      return IAbstractCompositeComponent_Behavior.call_getChildrenTargetDir_1237389224202(((SNode)SNodeOperations.getParent(thisNode))) + File.separator + Jar_Behavior.call_getTemporalDir_1213877485659(thisNode);
    }
    return Jar_Behavior.call_getTemporalDir_1213877485659(thisNode);
  }

  public static List<SNode> virtual_getPostProcessingTasks_1213877333861(SNode thisNode) {
    return ListSequence.<SNode>fromArray(SLinkOperations.getTarget(thisNode, "delete", true));
  }

}
