package model2;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;

public class TestAttr {
  public void aaa(SNode node) {
    AttributeOperations.getAttribute(node, new IAttributeDescriptor.PropertyAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.PropertyMacro"), "sourceCardinality"));
    AttributeOperations.getAttributeList(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.NodeMacro")));
    AttributeOperations.getAttribute(node, new IAttributeDescriptor.PropertyAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.PropertyMacro"), AAA.class));
    AttributeOperations.getAttribute(node, new IAttributeDescriptor.PropertyAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.PropertyMacro"), SPropertyOperations.getString(node, "role")));
    String aaa = AAA.class;
    SNode ccc;
    SPropertyOperations.getString(node, "alias");
  }

  public void bbb(SNode node) {
    SNode macro = AttributeOperations.getAttribute(node, new IAttributeDescriptor.LinkAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.ReferenceMacro"), SPropertyOperations.getString(node, "alias")));
    AttributeOperations.setAttribute(node, new IAttributeDescriptor.LinkAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.ReferenceMacro"), "aaa"), SConceptOperations.createNewNode("jetbrains.mps.lang.generator.structure.ReferenceMacro", null));
    ListSequence.fromList(AttributeOperations.getAttributeList(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.NodeMacro")))).addElement(SConceptOperations.createNewNode("jetbrains.mps.lang.generator.structure.NodeMacro", null));
    SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.IMemberContainer", false, false);
    SLinkOperations.getTarget(node, "baseMethodDeclaration", false);
  }

  public void ccc(SNode node) {
    AttributeOperations.setAttribute(node, new IAttributeDescriptor.PropertyAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.PropertyMacro"), "metaClass"), SConceptOperations.createNewNode("jetbrains.mps.lang.generator.structure.PropertyMacro", null));
    Iterable<SNode> macros1 = AttributeOperations.getAttributeList(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.NodeMacro")));
    List<SNode> ;
    List<SNode> macros = ((List<SNode>) macros1);
    SNode macro = AttributeOperations.getAttribute(node, new IAttributeDescriptor.PropertyAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.PropertyMacro"), "alias"));
    List<SNode> nodes = ListSequence.fromList(AttributeOperations.getAttributeList(node, new IAttributeDescriptor.AllAttributes())).addElement(null);
  }
}
