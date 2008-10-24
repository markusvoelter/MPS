package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SNodeTypeCastExpression extends Expression {
public    static final String concept = "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression";
public    static final String CONCEPT = "concept";
public    static final String LEFT_EXPRESSION = "leftExpression";

  public SNodeTypeCastExpression(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(SNodeTypeCastExpression.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(SNodeTypeCastExpression.CONCEPT, node);
  }

  public Expression getLeftExpression() {
    return (Expression)this.getChild(SNodeTypeCastExpression.LEFT_EXPRESSION);
  }

  public void setLeftExpression(Expression node) {
    super.setChild(SNodeTypeCastExpression.LEFT_EXPRESSION, node);
  }


  public static SNodeTypeCastExpression newInstance(SModel sm, boolean init) {
    return (SNodeTypeCastExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SNodeTypeCastExpression newInstance(SModel sm) {
    return SNodeTypeCastExpression.newInstance(sm, false);
  }

}
