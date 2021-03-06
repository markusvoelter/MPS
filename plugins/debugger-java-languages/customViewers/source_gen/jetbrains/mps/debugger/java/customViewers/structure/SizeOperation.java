package jetbrains.mps.debugger.java.customViewers.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SizeOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.debugger.java.customViewers.structure.SizeOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public SizeOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(SizeOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SizeOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SizeOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SizeOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SizeOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SizeOperation.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(SizeOperation.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, SizeOperation.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, SizeOperation.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(SizeOperation.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, SizeOperation.SMODEL_ATTRIBUTE, node);
  }

  public static SizeOperation newInstance(SModel sm, boolean init) {
    return (SizeOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debugger.java.customViewers.structure.SizeOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SizeOperation newInstance(SModel sm) {
    return SizeOperation.newInstance(sm, false);
  }
}
