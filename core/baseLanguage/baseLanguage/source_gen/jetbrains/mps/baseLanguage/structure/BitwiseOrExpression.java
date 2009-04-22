package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BitwiseOrExpression extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BitwiseOrExpression";

  public BitwiseOrExpression(SNode node) {
    super(node);
  }

  public static BitwiseOrExpression newInstance(SModel sm, boolean init) {
    return (BitwiseOrExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BitwiseOrExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BitwiseOrExpression newInstance(SModel sm) {
    return BitwiseOrExpression.newInstance(sm, false);
  }

}
