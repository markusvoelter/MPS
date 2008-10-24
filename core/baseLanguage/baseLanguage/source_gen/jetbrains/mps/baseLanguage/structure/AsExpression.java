package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AsExpression extends Expression {
public    static final String concept = "jetbrains.mps.baseLanguage.structure.AsExpression";
public    static final String EXPRESSION = "expression";
public    static final String CLASSIFIER_TYPE = "classifierType";

  public AsExpression(SNode node) {
    super(node);
  }

  public Expression getExpression() {
    return (Expression)this.getChild(AsExpression.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(AsExpression.EXPRESSION, node);
  }

  public ClassifierType getClassifierType() {
    return (ClassifierType)this.getChild(AsExpression.CLASSIFIER_TYPE);
  }

  public void setClassifierType(ClassifierType node) {
    super.setChild(AsExpression.CLASSIFIER_TYPE, node);
  }


  public static AsExpression newInstance(SModel sm, boolean init) {
    return (AsExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AsExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AsExpression newInstance(SModel sm) {
    return AsExpression.newInstance(sm, false);
  }

}
