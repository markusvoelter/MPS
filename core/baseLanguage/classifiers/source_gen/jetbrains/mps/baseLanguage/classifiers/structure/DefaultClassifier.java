package jetbrains.mps.baseLanguage.classifiers.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DefaultClassifier extends BaseConcept implements IClassifier {
  public static final String concept = "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String FIELD = "field";
  public static final String METHOD = "method";

  public DefaultClassifier(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(DefaultClassifier.NAME);
  }

  public void setName(String value) {
    this.setProperty(DefaultClassifier.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(DefaultClassifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DefaultClassifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DefaultClassifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DefaultClassifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DefaultClassifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DefaultClassifier.VIRTUAL_PACKAGE, value);
  }

  public int getFieldsCount() {
    return this.getChildCount(DefaultClassifier.FIELD);
  }

  public Iterator<DefaultClassifierFieldDeclaration> fields() {
    return this.children(DefaultClassifierFieldDeclaration.class, DefaultClassifier.FIELD);
  }

  public List<DefaultClassifierFieldDeclaration> getFields() {
    return this.getChildren(DefaultClassifierFieldDeclaration.class, DefaultClassifier.FIELD);
  }

  public void addField(DefaultClassifierFieldDeclaration node) {
    this.addChild(DefaultClassifier.FIELD, node);
  }

  public void insertField(DefaultClassifierFieldDeclaration prev, DefaultClassifierFieldDeclaration node) {
    this.insertChild(prev, DefaultClassifier.FIELD, node);
  }

  public int getMethodsCount() {
    return this.getChildCount(DefaultClassifier.METHOD);
  }

  public Iterator<DefaultClassifierMethodDeclaration> methods() {
    return this.children(DefaultClassifierMethodDeclaration.class, DefaultClassifier.METHOD);
  }

  public List<DefaultClassifierMethodDeclaration> getMethods() {
    return this.getChildren(DefaultClassifierMethodDeclaration.class, DefaultClassifier.METHOD);
  }

  public void addMethod(DefaultClassifierMethodDeclaration node) {
    this.addChild(DefaultClassifier.METHOD, node);
  }

  public void insertMethod(DefaultClassifierMethodDeclaration prev, DefaultClassifierMethodDeclaration node) {
    this.insertChild(prev, DefaultClassifier.METHOD, node);
  }

  public static DefaultClassifier newInstance(SModel sm, boolean init) {
    return (DefaultClassifier) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DefaultClassifier newInstance(SModel sm) {
    return DefaultClassifier.newInstance(sm, false);
  }
}
