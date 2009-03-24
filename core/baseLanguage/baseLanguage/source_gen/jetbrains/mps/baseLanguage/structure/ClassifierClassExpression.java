package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ClassifierClassExpression extends jetbrains.mps.baseLanguage.structure.Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ClassifierClassExpression";
  public static final String CLASSIFIER = "classifier";

  public ClassifierClassExpression(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.Classifier getClassifier() {
    return (jetbrains.mps.baseLanguage.structure.Classifier)this.getReferent(Classifier.class, ClassifierClassExpression.CLASSIFIER);
  }

  public void setClassifier(jetbrains.mps.baseLanguage.structure.Classifier node) {
    super.setReferent(ClassifierClassExpression.CLASSIFIER, node);
  }


  public static ClassifierClassExpression newInstance(SModel sm, boolean init) {
    return (ClassifierClassExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClassifierClassExpression newInstance(SModel sm) {
    return ClassifierClassExpression.newInstance(sm, false);
  }

}
