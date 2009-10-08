package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class SNodeType_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    SNode concept = SLinkOperations.getTarget(thisNode, "concept", false);
    if (concept == null) {
      return "node< >";
    }
    return "node<" + SPropertyOperations.getString(concept, "name") + ">";
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    List<String> variableSuffixes = ListSequence.fromListAndArray(new ArrayList<String>(), "node");
    if (SLinkOperations.getTarget(thisNode, "concept", false) != null) {
      String name = NameUtil.decapitalize(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "concept", false), "name"));
      ListSequence.fromList(variableSuffixes).addSequence(ListSequence.fromList(NameUtil.splitByCamels(name)));
    }
    return variableSuffixes;
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    SNode creator = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SNodeCreator", null);
    SLinkOperations.setTarget(creator, "createdType", SNodeOperations.copyNode(thisNode), true);
    return creator;
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return new _Quotations.QuotationClass_1().createNode();
  }

  public static boolean virtual_hasMissingParameters_3508583411997314206(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, "concept", false) == null);
  }

  public static String virtual_getErasureSignature_1213877337313(SNode thisNode) {
    return "jetbrains.mps.smodel.SNode";
  }
}
