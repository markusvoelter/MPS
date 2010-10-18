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
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

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
    List<String> variableSuffixes = ListSequence.fromListAndArray(new ArrayList<String>(), "nodes");
    if ((SLinkOperations.getTarget(thisNode, "elementConcept", false) != null)) {
      String name = NameUtil.pluralize(NameUtil.decapitalize(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "elementConcept", false), "name")));
      ListSequence.fromList(variableSuffixes).addSequence(ListSequence.fromList(NameUtil.splitByCamels(name)));
    }
    return variableSuffixes;
  }

  public static boolean virtual_hasPluralVariableSuffixes_1447667470349154499(SNode thisNode) {
    return true;
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    SNode creator = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SNodeListCreator", null);
    SLinkOperations.setTarget(creator, "createdType", SNodeOperations.copyNode(thisNode), true);
    return creator;
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return new SNodeListType_Behavior.QuotationClass_r176b6_a0a0f().createNode();
  }

  public static boolean virtual_hasMissingParameters_3508583411997314206(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, "elementConcept", false) == null);
  }

  public static class QuotationClass_r176b6_a0a0f {
    public QuotationClass_r176b6_a0a0f() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.util(java.util@java_stub)"), SNodeId.fromString("~List")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
