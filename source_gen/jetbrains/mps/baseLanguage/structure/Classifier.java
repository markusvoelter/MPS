package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class Classifier extends GenericDeclaration implements Annotable, IMemberContainer {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.Classifier";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String VISIBILITY = "visibility";
  public static String STATIC_FIELD = "staticField";
  public static String METHOD = "method";
  public static String ANNOTATION = "annotation";

  public  Classifier(SNode node) {
    super(node);
  }

  public static Classifier newInstance(SModel sm, boolean init) {
    return (Classifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Classifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Classifier newInstance(SModel sm) {
    return Classifier.newInstance(sm, false);
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

  public Visibility getVisibility() {
    return (Visibility)this.getChild(Classifier.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(Classifier.VISIBILITY, node);
  }

  public int getStaticFieldsCount() {
    return this.getChildCount(Classifier.STATIC_FIELD);
  }

  public Iterator<StaticFieldDeclaration> staticFields() {
    return this.children(Classifier.STATIC_FIELD);
  }

  public List<StaticFieldDeclaration> getStaticFields() {
    return this.getChildren(Classifier.STATIC_FIELD);
  }

  public void addStaticField(StaticFieldDeclaration node) {
    this.addChild(Classifier.STATIC_FIELD, node);
  }

  public void insertStaticField(StaticFieldDeclaration prev, StaticFieldDeclaration node) {
    this.insertChild(prev, Classifier.STATIC_FIELD, node);
  }

  public int getMethodsCount() {
    return this.getChildCount(Classifier.METHOD);
  }

  public Iterator<InstanceMethodDeclaration> methods() {
    return this.children(Classifier.METHOD);
  }

  public List<InstanceMethodDeclaration> getMethods() {
    return this.getChildren(Classifier.METHOD);
  }

  public void addMethod(InstanceMethodDeclaration node) {
    this.addChild(Classifier.METHOD, node);
  }

  public void insertMethod(InstanceMethodDeclaration prev, InstanceMethodDeclaration node) {
    this.insertChild(prev, Classifier.METHOD, node);
  }

  public int getAnnotationsCount() {
    return this.getChildCount(Classifier.ANNOTATION);
  }

  public Iterator<AnnotationInstance> annotations() {
    return this.children(Classifier.ANNOTATION);
  }

  public List<AnnotationInstance> getAnnotations() {
    return this.getChildren(Classifier.ANNOTATION);
  }

  public void addAnnotation(AnnotationInstance node) {
    this.addChild(Classifier.ANNOTATION, node);
  }

  public void insertAnnotation(AnnotationInstance prev, AnnotationInstance node) {
    this.insertChild(prev, Classifier.ANNOTATION, node);
  }

}
