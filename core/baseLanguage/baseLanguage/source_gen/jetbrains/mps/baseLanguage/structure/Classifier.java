package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Visibility;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.AnnotationInstance;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Classifier extends jetbrains.mps.baseLanguage.structure.GenericDeclaration implements jetbrains.mps.baseLanguage.structure.HasAnnotation, jetbrains.mps.baseLanguage.structure.IMemberContainer, jetbrains.mps.lang.core.structure.IResolveInfo, jetbrains.mps.baseLanguage.structure.IValidIdentifier, jetbrains.mps.baseLanguage.structure.IVisible, jetbrains.mps.lang.core.structure.IContainer {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.Classifier";
  public static final String NESTED_NAME = "nestedName";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RESOLVE_INFO = "resolveInfo";
  public static final String NAME = "name";
  public static final String IS_DEPRECATED = "isDeprecated";
  public static final String VISIBILITY = "visibility";
  public static final String STATIC_FIELD = "staticField";
  public static final String METHOD = "method";
  public static final String ANNOTATION = "annotation";

  public Classifier(SNode node) {
    super(node);
  }

  public String getNestedName() {
    return this.getProperty(Classifier.NESTED_NAME);
  }

  public void setNestedName(String value) {
    this.setProperty(Classifier.NESTED_NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Classifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Classifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Classifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Classifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Classifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Classifier.VIRTUAL_PACKAGE, value);
  }

  public String getResolveInfo() {
    return this.getProperty(Classifier.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(Classifier.RESOLVE_INFO, value);
  }

  public String getName() {
    return this.getProperty(Classifier.NAME);
  }

  public void setName(String value) {
    this.setProperty(Classifier.NAME, value);
  }

  public boolean getIsDeprecated() {
    return this.getBooleanProperty(Classifier.IS_DEPRECATED);
  }

  public void setIsDeprecated(boolean value) {
    this.setBooleanProperty(Classifier.IS_DEPRECATED, value);
  }

  public jetbrains.mps.baseLanguage.structure.Visibility getVisibility() {
    return (jetbrains.mps.baseLanguage.structure.Visibility)this.getChild(Visibility.class, Classifier.VISIBILITY);
  }

  public void setVisibility(jetbrains.mps.baseLanguage.structure.Visibility node) {
    super.setChild(Classifier.VISIBILITY, node);
  }

  public int getStaticFieldsCount() {
    return this.getChildCount(Classifier.STATIC_FIELD);
  }

  public Iterator<jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration> staticFields() {
    return this.children(StaticFieldDeclaration.class, Classifier.STATIC_FIELD);
  }

  public List<jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration> getStaticFields() {
    return this.getChildren(StaticFieldDeclaration.class, Classifier.STATIC_FIELD);
  }

  public void addStaticField(jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration node) {
    this.addChild(Classifier.STATIC_FIELD, node);
  }

  public void insertStaticField(jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration prev, jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration node) {
    this.insertChild(prev, Classifier.STATIC_FIELD, node);
  }

  public int getMethodsCount() {
    return this.getChildCount(Classifier.METHOD);
  }

  public Iterator<jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration> methods() {
    return this.children(InstanceMethodDeclaration.class, Classifier.METHOD);
  }

  public List<jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration> getMethods() {
    return this.getChildren(InstanceMethodDeclaration.class, Classifier.METHOD);
  }

  public void addMethod(jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration node) {
    this.addChild(Classifier.METHOD, node);
  }

  public void insertMethod(jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration prev, jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration node) {
    this.insertChild(prev, Classifier.METHOD, node);
  }

  public int getAnnotationsCount() {
    return this.getChildCount(Classifier.ANNOTATION);
  }

  public Iterator<jetbrains.mps.baseLanguage.structure.AnnotationInstance> annotations() {
    return this.children(AnnotationInstance.class, Classifier.ANNOTATION);
  }

  public List<jetbrains.mps.baseLanguage.structure.AnnotationInstance> getAnnotations() {
    return this.getChildren(AnnotationInstance.class, Classifier.ANNOTATION);
  }

  public void addAnnotation(jetbrains.mps.baseLanguage.structure.AnnotationInstance node) {
    this.addChild(Classifier.ANNOTATION, node);
  }

  public void insertAnnotation(jetbrains.mps.baseLanguage.structure.AnnotationInstance prev, jetbrains.mps.baseLanguage.structure.AnnotationInstance node) {
    this.insertChild(prev, Classifier.ANNOTATION, node);
  }


  public static Classifier newInstance(SModel sm, boolean init) {
    return (Classifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Classifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Classifier newInstance(SModel sm) {
    return Classifier.newInstance(sm, false);
  }

}
