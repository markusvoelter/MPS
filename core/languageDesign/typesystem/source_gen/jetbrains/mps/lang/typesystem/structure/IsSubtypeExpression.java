package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IsSubtypeExpression extends jetbrains.mps.baseLanguage.structure.Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.IsSubtypeExpression";
  public static final String SUBTYPE_EXPRESSION = "subtypeExpression";
  public static final String SUPERTYPE_EXPRESSION = "supertypeExpression";

  public IsSubtypeExpression(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getSubtypeExpression() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, IsSubtypeExpression.SUBTYPE_EXPRESSION);
  }

  public void setSubtypeExpression(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(IsSubtypeExpression.SUBTYPE_EXPRESSION, node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getSupertypeExpression() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, IsSubtypeExpression.SUPERTYPE_EXPRESSION);
  }

  public void setSupertypeExpression(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(IsSubtypeExpression.SUPERTYPE_EXPRESSION, node);
  }


  public static IsSubtypeExpression newInstance(SModel sm, boolean init) {
    return (IsSubtypeExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.IsSubtypeExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IsSubtypeExpression newInstance(SModel sm) {
    return IsSubtypeExpression.newInstance(sm, false);
  }

}
