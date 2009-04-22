package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AnonymousClass extends ClassConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AnonymousClass";
  public static final String CLASSIFIER = "classifier";
  public static final String PARAMETER = "parameter";
  public static final String TYPE_PARAMETER = "typeParameter";

  public AnonymousClass(SNode node) {
    super(node);
  }

  public Classifier getClassifier() {
    return (Classifier)this.getReferent(Classifier.class, AnonymousClass.CLASSIFIER);
  }

  public void setClassifier(Classifier node) {
    super.setReferent(AnonymousClass.CLASSIFIER, node);
  }

  public int getParametersCount() {
    return this.getChildCount(AnonymousClass.PARAMETER);
  }

  public Iterator<Expression> parameters() {
    return this.children(Expression.class, AnonymousClass.PARAMETER);
  }

  public List<Expression> getParameters() {
    return this.getChildren(Expression.class, AnonymousClass.PARAMETER);
  }

  public void addParameter(Expression node) {
    this.addChild(AnonymousClass.PARAMETER, node);
  }

  public void insertParameter(Expression prev, Expression node) {
    this.insertChild(prev, AnonymousClass.PARAMETER, node);
  }

  public int getTypeParametersCount() {
    return this.getChildCount(AnonymousClass.TYPE_PARAMETER);
  }

  public Iterator<Type> typeParameters() {
    return this.children(Type.class, AnonymousClass.TYPE_PARAMETER);
  }

  public List<Type> getTypeParameters() {
    return this.getChildren(Type.class, AnonymousClass.TYPE_PARAMETER);
  }

  public void addTypeParameter(Type node) {
    this.addChild(AnonymousClass.TYPE_PARAMETER, node);
  }

  public void insertTypeParameter(Type prev, Type node) {
    this.insertChild(prev, AnonymousClass.TYPE_PARAMETER, node);
  }


  public static AnonymousClass newInstance(SModel sm, boolean init) {
    return (AnonymousClass)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnonymousClass", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AnonymousClass newInstance(SModel sm) {
    return AnonymousClass.newInstance(sm, false);
  }

}
