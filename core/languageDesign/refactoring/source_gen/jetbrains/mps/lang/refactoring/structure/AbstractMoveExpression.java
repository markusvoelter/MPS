package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractMoveExpression extends jetbrains.mps.baseLanguage.structure.Expression {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.AbstractMoveExpression";
  public static final String WHAT_TO_MOVE = "whatToMove";
  public static final String DESTINATION = "destination";

  public AbstractMoveExpression(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getWhatToMove() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, AbstractMoveExpression.WHAT_TO_MOVE);
  }

  public void setWhatToMove(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(AbstractMoveExpression.WHAT_TO_MOVE, node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getDestination() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, AbstractMoveExpression.DESTINATION);
  }

  public void setDestination(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(AbstractMoveExpression.DESTINATION, node);
  }


  public static AbstractMoveExpression newInstance(SModel sm, boolean init) {
    return (AbstractMoveExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.AbstractMoveExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractMoveExpression newInstance(SModel sm) {
    return AbstractMoveExpression.newInstance(sm, false);
  }

}
