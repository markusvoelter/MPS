package jetbrains.mps.bootstrap.smodelLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class SNodeListType_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    SNode conceptDeclaration = SLinkOperations.getTarget(thisNode, "elementConcept", false);
    return (conceptDeclaration == null ?
      "nlist< >" :
      "nlist<" + SPropertyOperations.getString(conceptDeclaration, "name") + ">"
    );
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    List<String> variableSuffixes = ListSequence.<String>fromArray("nodes");
    if ((SLinkOperations.getTarget(thisNode, "elementConcept", false) != null)) {
      String name = NameUtil.pluralize(NameUtil.decapitalize(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "elementConcept", false), "name")));
      ListSequence.fromList(variableSuffixes).addSequence(ListSequence.fromList(NameUtil.splitByCamels(name)));
    }
    return variableSuffixes;
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    SNode creator = SConceptOperations.createNewNode("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator", null);
    SLinkOperations.setTarget(creator, "createdType", SNodeOperations.copyNode(thisNode), true);
    return creator;
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return new QuotationClass_().createNode();
  }

  public static boolean virtual_selectOnVariableCreation_1213877337352(SNode thisNode) {
    return true;
  }

}
