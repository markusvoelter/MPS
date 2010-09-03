package jetbrains.mps.baseLanguage.overloadedOperators.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OverloadedBinaryOperator extends ConceptFunction {
  public static final String concept = "jetbrains.mps.baseLanguage.overloadedOperators.structure.OverloadedBinaryOperator";
  public static final String COMMUTATIVE = "commutative";
  public static final String RETURN_TYPE = "returnType";
  public static final String LEFT_TYPE = "leftType";
  public static final String RIGHT_TYPE = "rightType";
  public static final String OPERATOR = "operator";

  public OverloadedBinaryOperator(SNode node) {
    super(node);
  }

  public boolean getCommutative() {
    return this.getBooleanProperty(OverloadedBinaryOperator.COMMUTATIVE);
  }

  public void setCommutative(boolean value) {
    this.setBooleanProperty(OverloadedBinaryOperator.COMMUTATIVE, value);
  }

  public Type getReturnType() {
    return (Type) this.getChild(Type.class, OverloadedBinaryOperator.RETURN_TYPE);
  }

  public void setReturnType(Type node) {
    super.setChild(OverloadedBinaryOperator.RETURN_TYPE, node);
  }

  public Type getLeftType() {
    return (Type) this.getChild(Type.class, OverloadedBinaryOperator.LEFT_TYPE);
  }

  public void setLeftType(Type node) {
    super.setChild(OverloadedBinaryOperator.LEFT_TYPE, node);
  }

  public Type getRightType() {
    return (Type) this.getChild(Type.class, OverloadedBinaryOperator.RIGHT_TYPE);
  }

  public void setRightType(Type node) {
    super.setChild(OverloadedBinaryOperator.RIGHT_TYPE, node);
  }

  public Operator getOperator() {
    return (Operator) this.getChild(Operator.class, OverloadedBinaryOperator.OPERATOR);
  }

  public void setOperator(Operator node) {
    super.setChild(OverloadedBinaryOperator.OPERATOR, node);
  }

  public static OverloadedBinaryOperator newInstance(SModel sm, boolean init) {
    return (OverloadedBinaryOperator) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.overloadedOperators.structure.OverloadedBinaryOperator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OverloadedBinaryOperator newInstance(SModel sm) {
    return OverloadedBinaryOperator.newInstance(sm, false);
  }
}
