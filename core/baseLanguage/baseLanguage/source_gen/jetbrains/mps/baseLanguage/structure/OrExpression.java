package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OrExpression extends jetbrains.mps.baseLanguage.structure.BinaryOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.OrExpression";

  public OrExpression(SNode node) {
    super(node);
  }

  public static OrExpression newInstance(SModel sm, boolean init) {
    return (OrExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.OrExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OrExpression newInstance(SModel sm) {
    return OrExpression.newInstance(sm, false);
  }

}
