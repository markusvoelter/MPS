package jetbrains.mps.closures.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class InvokeExpression extends Expression {
  public static final String concept = "jetbrains.mps.closures.structure.InvokeExpression";
  public static String PARAMETER = "parameter";

  public InvokeExpression(SNode node) {
    super(node);
  }

  public static InvokeExpression newInstance(SModel sm, boolean init) {
    return (InvokeExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.closures.structure.InvokeExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InvokeExpression newInstance(SModel sm) {
    return InvokeExpression.newInstance(sm, false);
  }


  public int getParametersCount() {
    return this.getChildCount(InvokeExpression.PARAMETER);
  }

  public Iterator<Expression> parameters() {
    return this.children(InvokeExpression.PARAMETER);
  }

  public List<Expression> getParameters() {
    return this.getChildren(InvokeExpression.PARAMETER);
  }

  public void addParameter(Expression node) {
    this.addChild(InvokeExpression.PARAMETER, node);
  }

  public void insertParameter(Expression prev, Expression node) {
    this.insertChild(prev, InvokeExpression.PARAMETER, node);
  }

}
