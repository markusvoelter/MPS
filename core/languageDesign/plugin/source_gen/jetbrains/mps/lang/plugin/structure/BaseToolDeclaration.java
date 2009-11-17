package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifier;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration;
import java.util.List;
import jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseToolDeclaration extends BaseConcept implements IClassifier, ICheckedNamePolicy {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.BaseToolDeclaration";
  public static final String CAPTION = "caption";
  public static final String NUMBER = "number";
  public static final String ICON = "icon";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String METHOD_DECLARATION = "methodDeclaration";
  public static final String FIELD_DECLARATION = "fieldDeclaration";

  public BaseToolDeclaration(SNode node) {
    super(node);
  }

  public String getCaption() {
    return this.getProperty(BaseToolDeclaration.CAPTION);
  }

  public void setCaption(String value) {
    this.setProperty(BaseToolDeclaration.CAPTION, value);
  }

  public String getNumber() {
    return this.getProperty(BaseToolDeclaration.NUMBER);
  }

  public void setNumber(String value) {
    this.setProperty(BaseToolDeclaration.NUMBER, value);
  }

  public String getIcon() {
    return this.getProperty(BaseToolDeclaration.ICON);
  }

  public void setIcon(String value) {
    this.setProperty(BaseToolDeclaration.ICON, value);
  }

  public String getName() {
    return this.getProperty(BaseToolDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(BaseToolDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(BaseToolDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BaseToolDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BaseToolDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BaseToolDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BaseToolDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BaseToolDeclaration.VIRTUAL_PACKAGE, value);
  }

  public int getMethodDeclarationsCount() {
    return this.getChildCount(BaseToolDeclaration.METHOD_DECLARATION);
  }

  public Iterator<DefaultClassifierMethodDeclaration> methodDeclarations() {
    return this.children(DefaultClassifierMethodDeclaration.class, BaseToolDeclaration.METHOD_DECLARATION);
  }

  public List<DefaultClassifierMethodDeclaration> getMethodDeclarations() {
    return this.getChildren(DefaultClassifierMethodDeclaration.class, BaseToolDeclaration.METHOD_DECLARATION);
  }

  public void addMethodDeclaration(DefaultClassifierMethodDeclaration node) {
    this.addChild(BaseToolDeclaration.METHOD_DECLARATION, node);
  }

  public void insertMethodDeclaration(DefaultClassifierMethodDeclaration prev, DefaultClassifierMethodDeclaration node) {
    this.insertChild(prev, BaseToolDeclaration.METHOD_DECLARATION, node);
  }

  public int getFieldDeclarationsCount() {
    return this.getChildCount(BaseToolDeclaration.FIELD_DECLARATION);
  }

  public Iterator<DefaultClassifierFieldDeclaration> fieldDeclarations() {
    return this.children(DefaultClassifierFieldDeclaration.class, BaseToolDeclaration.FIELD_DECLARATION);
  }

  public List<DefaultClassifierFieldDeclaration> getFieldDeclarations() {
    return this.getChildren(DefaultClassifierFieldDeclaration.class, BaseToolDeclaration.FIELD_DECLARATION);
  }

  public void addFieldDeclaration(DefaultClassifierFieldDeclaration node) {
    this.addChild(BaseToolDeclaration.FIELD_DECLARATION, node);
  }

  public void insertFieldDeclaration(DefaultClassifierFieldDeclaration prev, DefaultClassifierFieldDeclaration node) {
    this.insertChild(prev, BaseToolDeclaration.FIELD_DECLARATION, node);
  }

  public static BaseToolDeclaration newInstance(SModel sm, boolean init) {
    return (BaseToolDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.BaseToolDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseToolDeclaration newInstance(SModel sm) {
    return BaseToolDeclaration.newInstance(sm, false);
  }
}
