package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ClassifierType extends Type {
public    static final String concept = "jetbrains.mps.baseLanguage.structure.ClassifierType";
public    static final String CLASSIFIER = "classifier";
public    static final String PARAMETER = "parameter";

  public ClassifierType(SNode node) {
    super(node);
  }

  public Classifier getClassifier() {
    return (Classifier)this.getReferent(ClassifierType.CLASSIFIER);
  }

  public void setClassifier(Classifier node) {
    super.setReferent(ClassifierType.CLASSIFIER, node);
  }

  public int getParametersCount() {
    return this.getChildCount(ClassifierType.PARAMETER);
  }

  public Iterator<Type> parameters() {
    return this.children(ClassifierType.PARAMETER);
  }

  public List<Type> getParameters() {
    return this.getChildren(ClassifierType.PARAMETER);
  }

  public void addParameter(Type node) {
    this.addChild(ClassifierType.PARAMETER, node);
  }

  public void insertParameter(Type prev, Type node) {
    this.insertChild(prev, ClassifierType.PARAMETER, node);
  }


  public static ClassifierType newInstance(SModel sm, boolean init) {
    return (ClassifierType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClassifierType newInstance(SModel sm) {
    return ClassifierType.newInstance(sm, false);
  }

}
