package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class QueueType_Behavior {
  private static Class[] PARAMETERS_7602110602933345818 = {SNode.class ,SModel.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getAbstractCreators_7602110602933317830(SNode thisNode, SModel targetModel) {
    List<SNode> res = new ArrayList<SNode>();
    ListSequence.fromList(res).addElement(new _Quotations.QuotationClass_17().createNode(SLinkOperations.getTarget(thisNode, "elementType", true)));
    ListSequence.fromList(res).addElement(new _Quotations.QuotationClass_19().createNode(SLinkOperations.getTarget(thisNode, "elementType", true)));
    ListSequence.fromList(res).addSequence(Sequence.fromIterable(CustomContainersUtil.containerCreators(targetModel, thisNode)));
    return res;
  }

  public static List<SNode> call_getAbstractCreators_7602110602933345818(SNode thisNode, SModel targetModel) {
    return (List<SNode>)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.collections.structure.QueueType"), "virtual_getAbstractCreators_7602110602933317830", PARAMETERS_7602110602933345818, targetModel);
  }

  public static List<SNode> callSuper_getAbstractCreators_7602110602933345818(SNode thisNode, String callerConceptFqName, SModel targetModel) {
    return (List<SNode>)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.collections.structure.QueueType"), callerConceptFqName, "virtual_getAbstractCreators_7602110602933317830", PARAMETERS_7602110602933345818, targetModel);
  }
}
