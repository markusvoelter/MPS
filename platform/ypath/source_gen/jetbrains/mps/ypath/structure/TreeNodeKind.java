package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TreeNodeKind extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.ypath.structure.TreeNodeKind";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String TRIGGER = "trigger";
  public static String PROPERTIES = "properties";

  public TreeNodeKind(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(TreeNodeKind.NAME);
  }

  public void setName(String value) {
    this.setProperty(TreeNodeKind.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TreeNodeKind.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TreeNodeKind.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TreeNodeKind.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TreeNodeKind.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TreeNodeKind.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TreeNodeKind.VIRTUAL_PACKAGE, value);
  }

  public KindBlock getTrigger() {
    return (KindBlock)this.getChild(TreeNodeKind.TRIGGER);
  }

  public void setTrigger(KindBlock node) {
    super.setChild(TreeNodeKind.TRIGGER, node);
  }

  public int getPropertiesesCount() {
    return this.getChildCount(TreeNodeKind.PROPERTIES);
  }

  public Iterator<TreeNodeKindProperty> propertieses() {
    return this.children(TreeNodeKind.PROPERTIES);
  }

  public List<TreeNodeKindProperty> getPropertieses() {
    return this.getChildren(TreeNodeKind.PROPERTIES);
  }

  public void addProperties(TreeNodeKindProperty node) {
    this.addChild(TreeNodeKind.PROPERTIES, node);
  }

  public void insertProperties(TreeNodeKindProperty prev, TreeNodeKindProperty node) {
    this.insertChild(prev, TreeNodeKind.PROPERTIES, node);
  }


  public static TreeNodeKind newInstance(SModel sm, boolean init) {
    return (TreeNodeKind)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.TreeNodeKind", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TreeNodeKind newInstance(SModel sm) {
    return TreeNodeKind.newInstance(sm, false);
  }

}
