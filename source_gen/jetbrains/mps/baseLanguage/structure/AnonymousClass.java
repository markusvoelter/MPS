package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.Classifier;

public class AnonymousClass extends ClassConcept {
  public static String PARAMETER = "parameter";
  public static String CLASSIFIER = "classifier";

  public  AnonymousClass(SNode node) {
    super(node);
  }

  public static AnonymousClass newInstance(SModel sm, boolean init) {
    return (AnonymousClass)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.AnonymousClass", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static AnonymousClass newInstance(SModel sm) {
    return AnonymousClass.newInstance(sm, false);
  }

  public int getParametersCount() {
    return this.getChildCount(AnonymousClass.PARAMETER);
  }
  public Iterator<Expression> parameters() {
    return this.children(AnonymousClass.PARAMETER);
  }
  public List<Expression> getParameters() {
    return this.getChildren(AnonymousClass.PARAMETER);
  }
  public void addParameter(Expression node) {
    this.addChild(AnonymousClass.PARAMETER, node);
  }
  public void insertParameter(Expression prev, Expression node) {
    this.insertChild(prev, AnonymousClass.PARAMETER, node);
  }
  public Classifier getClassifier() {
    return (Classifier)this.getReferent(AnonymousClass.CLASSIFIER);
  }
  public void setClassifier(Classifier node) {
    super.setReferent(AnonymousClass.CLASSIFIER, node);
  }
}
