package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import java.util.ArrayList;

public class ActionDataParameterDeclaration_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getType_1171743928471337193(SNode thisNode) {
    return SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "key", false), "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true)).first(), "jetbrains.mps.baseLanguage.structure.ClassifierType");
  }

  public static SNode virtual_getFieldDeclaration_1171743928471867409(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "key", false);
  }

  public static List<SNode> getVariants_1227641865136() {
    List<SNode> dataKeys = new ArrayList<SNode>();
    ListSequence.fromList(dataKeys).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "staticField", true)));
    ListSequence.fromList(dataKeys).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SLinkOperations.getTarget(new _Quotations.QuotationClass_2().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "staticField", true)));
    ListSequence.fromList(dataKeys).removeElement(SLinkOperations.getTarget(new _Quotations.QuotationClass_8().createNode(), "variableDeclaration", false));
    ListSequence.fromList(dataKeys).removeElement(SLinkOperations.getTarget(new _Quotations.QuotationClass_9().createNode(), "variableDeclaration", false));
    return dataKeys;
  }

}
