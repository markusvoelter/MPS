package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TreePathType extends Type implements INamedConcept {
  public static final String concept = "jetbrains.mps.ypath.structure.TreePathType";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String NODE_TYPE = "nodeType";

  public TreePathType(SNode node) {
    super(node);
  }

  public static TreePathType newInstance(SModel sm, boolean init) {
    return (TreePathType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.TreePathType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TreePathType newInstance(SModel sm) {
    return TreePathType.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(TreePathType.NAME);
  }

  public void setName(String value) {
    this.setProperty(TreePathType.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TreePathType.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TreePathType.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TreePathType.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TreePathType.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TreePathType.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TreePathType.VIRTUAL_PACKAGE, value);
  }

  public Type getNodeType() {
    return (Type)this.getChild(TreePathType.NODE_TYPE);
  }

  public void setNodeType(Type node) {
    super.setChild(TreePathType.NODE_TYPE, node);
  }

}
