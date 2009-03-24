package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mpslite.structure.LineList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MPSLiteConceptDeclaration extends jetbrains.mps.lang.core.structure.BaseConcept implements jetbrains.mps.lang.core.structure.INamedConcept {
  public static final String concept = "jetbrains.mpslite.structure.MPSLiteConceptDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ROOT = "root";
  public static final String ABSTRACT = "abstract";
  public static final String EXTENDS = "extends";
  public static final String LINE_LIST = "lineList";

  public MPSLiteConceptDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(MPSLiteConceptDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(MPSLiteConceptDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(MPSLiteConceptDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(MPSLiteConceptDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(MPSLiteConceptDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(MPSLiteConceptDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(MPSLiteConceptDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(MPSLiteConceptDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getRoot() {
    return this.getBooleanProperty(MPSLiteConceptDeclaration.ROOT);
  }

  public void setRoot(boolean value) {
    this.setBooleanProperty(MPSLiteConceptDeclaration.ROOT, value);
  }

  public boolean getAbstract() {
    return this.getBooleanProperty(MPSLiteConceptDeclaration.ABSTRACT);
  }

  public void setAbstract(boolean value) {
    this.setBooleanProperty(MPSLiteConceptDeclaration.ABSTRACT, value);
  }

  public jetbrains.mpslite.structure.MPSLiteConceptDeclaration getExtends() {
    return (jetbrains.mpslite.structure.MPSLiteConceptDeclaration)this.getReferent(MPSLiteConceptDeclaration.class, MPSLiteConceptDeclaration.EXTENDS);
  }

  public void setExtends(jetbrains.mpslite.structure.MPSLiteConceptDeclaration node) {
    super.setReferent(MPSLiteConceptDeclaration.EXTENDS, node);
  }

  public jetbrains.mpslite.structure.LineList getLineList() {
    return (jetbrains.mpslite.structure.LineList)this.getChild(LineList.class, MPSLiteConceptDeclaration.LINE_LIST);
  }

  public void setLineList(jetbrains.mpslite.structure.LineList node) {
    super.setChild(MPSLiteConceptDeclaration.LINE_LIST, node);
  }


  public static MPSLiteConceptDeclaration newInstance(SModel sm, boolean init) {
    return (MPSLiteConceptDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.MPSLiteConceptDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MPSLiteConceptDeclaration newInstance(SModel sm) {
    return MPSLiteConceptDeclaration.newInstance(sm, false);
  }

}
