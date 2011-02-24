package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.structure.IValidIdentifier;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StyleSheetClass extends BaseConcept implements INamedConcept, IValidIdentifier, IStyleContainer {
  public static final String concept = "jetbrains.mps.lang.editor.structure.StyleSheetClass";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXTENDED_CLASS = "extendedClass";
  public static final String _$ATTRIBUTE = "_$attribute";
  public static final String STYLE_ITEM = "styleItem";

  public StyleSheetClass(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(StyleSheetClass.NAME);
  }

  public void setName(String value) {
    this.setProperty(StyleSheetClass.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(StyleSheetClass.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(StyleSheetClass.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(StyleSheetClass.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(StyleSheetClass.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(StyleSheetClass.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(StyleSheetClass.VIRTUAL_PACKAGE, value);
  }

  public StyleSheetClassReference getExtendedClass() {
    return (StyleSheetClassReference) this.getChild(StyleSheetClassReference.class, StyleSheetClass.EXTENDED_CLASS);
  }

  public void setExtendedClass(StyleSheetClassReference node) {
    super.setChild(StyleSheetClass.EXTENDED_CLASS, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(StyleSheetClass._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, StyleSheetClass._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, StyleSheetClass._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(StyleSheetClass._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, StyleSheetClass._$ATTRIBUTE, node);
  }

  public int getStyleItemsCount() {
    return this.getChildCount(StyleSheetClass.STYLE_ITEM);
  }

  public Iterator<StyleClassItem> styleItems() {
    return this.children(StyleClassItem.class, StyleSheetClass.STYLE_ITEM);
  }

  public List<StyleClassItem> getStyleItems() {
    return this.getChildren(StyleClassItem.class, StyleSheetClass.STYLE_ITEM);
  }

  public void addStyleItem(StyleClassItem node) {
    this.addChild(StyleSheetClass.STYLE_ITEM, node);
  }

  public void insertStyleItem(StyleClassItem prev, StyleClassItem node) {
    this.insertChild(prev, StyleSheetClass.STYLE_ITEM, node);
  }

  public static StyleSheetClass newInstance(SModel sm, boolean init) {
    return (StyleSheetClass) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.StyleSheetClass", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StyleSheetClass newInstance(SModel sm) {
    return StyleSheetClass.newInstance(sm, false);
  }
}
