package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InlineStyleDeclaration extends BaseConcept implements IStyleContainer {
  public static final String concept = "jetbrains.mps.lang.editor.structure.InlineStyleDeclaration";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PARENT_CLASS = "parentClass";
  public static final String STYLE_ITEM = "styleItem";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public InlineStyleDeclaration(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(InlineStyleDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InlineStyleDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InlineStyleDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InlineStyleDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InlineStyleDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InlineStyleDeclaration.VIRTUAL_PACKAGE, value);
  }

  public StyleSheetClass getParentClass() {
    return (StyleSheetClass) this.getReferent(StyleSheetClass.class, InlineStyleDeclaration.PARENT_CLASS);
  }

  public void setParentClass(StyleSheetClass node) {
    super.setReferent(InlineStyleDeclaration.PARENT_CLASS, node);
  }

  public int getStyleItemsCount() {
    return this.getChildCount(InlineStyleDeclaration.STYLE_ITEM);
  }

  public Iterator<StyleClassItem> styleItems() {
    return this.children(StyleClassItem.class, InlineStyleDeclaration.STYLE_ITEM);
  }

  public List<StyleClassItem> getStyleItems() {
    return this.getChildren(StyleClassItem.class, InlineStyleDeclaration.STYLE_ITEM);
  }

  public void addStyleItem(StyleClassItem node) {
    this.addChild(InlineStyleDeclaration.STYLE_ITEM, node);
  }

  public void insertStyleItem(StyleClassItem prev, StyleClassItem node) {
    this.insertChild(prev, InlineStyleDeclaration.STYLE_ITEM, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(InlineStyleDeclaration.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, InlineStyleDeclaration.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, InlineStyleDeclaration.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(InlineStyleDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, InlineStyleDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public static InlineStyleDeclaration newInstance(SModel sm, boolean init) {
    return (InlineStyleDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.InlineStyleDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InlineStyleDeclaration newInstance(SModel sm) {
    return InlineStyleDeclaration.newInstance(sm, false);
  }
}
