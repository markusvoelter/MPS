package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypeOfExpression extends jetbrains.mps.baseLanguage.structure.Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.TypeOfExpression";
  public static final String SKIP_DEPENDENCY_ON_CURRENT = "skipDependencyOnCurrent";
  public static final String TERM = "term";

  public TypeOfExpression(SNode node) {
    super(node);
  }

  public boolean getSkipDependencyOnCurrent() {
    return this.getBooleanProperty(TypeOfExpression.SKIP_DEPENDENCY_ON_CURRENT);
  }

  public void setSkipDependencyOnCurrent(boolean value) {
    this.setBooleanProperty(TypeOfExpression.SKIP_DEPENDENCY_ON_CURRENT, value);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getTerm() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, TypeOfExpression.TERM);
  }

  public void setTerm(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(TypeOfExpression.TERM, node);
  }


  public static TypeOfExpression newInstance(SModel sm, boolean init) {
    return (TypeOfExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.TypeOfExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypeOfExpression newInstance(SModel sm) {
    return TypeOfExpression.newInstance(sm, false);
  }

}
