package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IntLiteral extends PropertyValueExpression {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.IntLiteral";
  public static String VALUE = "value";

  public IntLiteral(SNode node) {
    super(node);
  }

  public static IntLiteral newInstance(SModel sm, boolean init) {
    return (IntLiteral)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.IntLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IntLiteral newInstance(SModel sm) {
    return IntLiteral.newInstance(sm, false);
  }


  public int getValue() {
    return this.getIntegerProperty(IntLiteral.VALUE);
  }

  public void setValue(int value) {
    this.setIntegerProperty(IntLiteral.VALUE, value);
  }

}
