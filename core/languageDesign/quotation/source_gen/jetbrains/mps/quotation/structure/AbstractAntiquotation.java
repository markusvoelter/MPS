package jetbrains.mps.quotation.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class AbstractAntiquotation extends BaseConcept {
  public static final String concept = "jetbrains.mps.quotation.structure.AbstractAntiquotation";
  public static String EXPRESSION = "expression";

  public  AbstractAntiquotation(SNode node) {
    super(node);
  }

  public static AbstractAntiquotation newInstance(SModel sm, boolean init) {
    return (AbstractAntiquotation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.quotation.structure.AbstractAntiquotation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractAntiquotation newInstance(SModel sm) {
    return AbstractAntiquotation.newInstance(sm, false);
  }


  public Expression getExpression() {
    return (Expression)this.getChild(AbstractAntiquotation.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(AbstractAntiquotation.EXPRESSION, node);
  }

}
