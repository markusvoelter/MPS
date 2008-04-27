package jetbrains.mps.closures.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class InvokeFunctionExpression extends Expression {
  public static final String concept = "jetbrains.mps.closures.structure.InvokeFunctionExpression";
  public static String FUNCTION = "function";
  public static String PARAMETER = "parameter";

  public InvokeFunctionExpression(SNode node) {
    super(node);
  }

  public static InvokeFunctionExpression newInstance(SModel sm, boolean init) {
    return (InvokeFunctionExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.closures.structure.InvokeFunctionExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InvokeFunctionExpression newInstance(SModel sm) {
    return InvokeFunctionExpression.newInstance(sm, false);
  }


  public Expression getFunction() {
    return (Expression)this.getChild(InvokeFunctionExpression.FUNCTION);
  }

  public void setFunction(Expression node) {
    super.setChild(InvokeFunctionExpression.FUNCTION, node);
  }

  public int getParametersCount() {
    return this.getChildCount(InvokeFunctionExpression.PARAMETER);
  }

  public Iterator<Expression> parameters() {
    return this.children(InvokeFunctionExpression.PARAMETER);
  }

  public List<Expression> getParameters() {
    return this.getChildren(InvokeFunctionExpression.PARAMETER);
  }

  public void addParameter(Expression node) {
    this.addChild(InvokeFunctionExpression.PARAMETER, node);
  }

  public void insertParameter(Expression prev, Expression node) {
    this.insertChild(prev, InvokeFunctionExpression.PARAMETER, node);
  }

}
