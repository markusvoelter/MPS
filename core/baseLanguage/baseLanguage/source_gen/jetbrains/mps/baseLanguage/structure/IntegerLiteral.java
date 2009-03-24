package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IntegerLiteral extends jetbrains.mps.baseLanguage.structure.Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.IntegerLiteral";

  public IntegerLiteral(SNode node) {
    super(node);
  }

  public static IntegerLiteral newInstance(SModel sm, boolean init) {
    return (IntegerLiteral)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IntegerLiteral newInstance(SModel sm) {
    return IntegerLiteral.newInstance(sm, false);
  }

}
