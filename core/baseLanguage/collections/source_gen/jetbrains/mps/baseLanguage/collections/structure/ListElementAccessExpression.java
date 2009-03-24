package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ListElementAccessExpression extends jetbrains.mps.baseLanguage.structure.Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.ListElementAccessExpression";
  public static final String LIST = "list";
  public static final String INDEX = "index";

  public ListElementAccessExpression(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getList() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, ListElementAccessExpression.LIST);
  }

  public void setList(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(ListElementAccessExpression.LIST, node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getIndex() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, ListElementAccessExpression.INDEX);
  }

  public void setIndex(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(ListElementAccessExpression.INDEX, node);
  }


  public static ListElementAccessExpression newInstance(SModel sm, boolean init) {
    return (ListElementAccessExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListElementAccessExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ListElementAccessExpression newInstance(SModel sm) {
    return ListElementAccessExpression.newInstance(sm, false);
  }

}
