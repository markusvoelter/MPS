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

public class SortedMapType_Behavior {
  private static Class[] PARAMETERS_7602110602933345941 = {SNode.class ,SModel.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getAbstractCreators_7602110602933317830(SNode thisNode, SModel targetModel) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addElement(new _Quotations.QuotationClass_7().createNode(SLinkOperations.getTarget(thisNode, "keyType", true), SLinkOperations.getTarget(thisNode, "valueType", true)));
    ListSequence.fromList(result).addSequence(Sequence.fromIterable(CustomContainersUtil.containerCreators(targetModel, thisNode)));
    return result;
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return new _Quotations.QuotationClass_15().createNode();
  }

  public static List<SNode> call_getAbstractCreators_7602110602933345941(SNode thisNode, SModel targetModel) {
    return (List<SNode>)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.collections.structure.SortedMapType"), "virtual_getAbstractCreators_7602110602933317830", PARAMETERS_7602110602933345941, targetModel);
  }

  public static List<SNode> callSuper_getAbstractCreators_7602110602933345941(SNode thisNode, String callerConceptFqName, SModel targetModel) {
    return (List<SNode>)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.collections.structure.SortedMapType"), callerConceptFqName, "virtual_getAbstractCreators_7602110602933317830", PARAMETERS_7602110602933345941, targetModel);
  }
}
