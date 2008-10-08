package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AnnotationInstanceValue extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue";
  public static String KEY = "key";
  public static String VALUE = "value";

  public AnnotationInstanceValue(SNode node) {
    super(node);
  }

  public AnnotationMethodDeclaration getKey() {
    return (AnnotationMethodDeclaration)this.getReferent(AnnotationInstanceValue.KEY);
  }

  public void setKey(AnnotationMethodDeclaration node) {
    super.setReferent(AnnotationInstanceValue.KEY, node);
  }

  public Expression getValue() {
    return (Expression)this.getChild(AnnotationInstanceValue.VALUE);
  }

  public void setValue(Expression node) {
    super.setChild(AnnotationInstanceValue.VALUE, node);
  }


  public static AnnotationInstanceValue newInstance(SModel sm, boolean init) {
    return (AnnotationInstanceValue)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AnnotationInstanceValue newInstance(SModel sm) {
    return AnnotationInstanceValue.newInstance(sm, false);
  }

}
