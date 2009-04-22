package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BitwiseXorExpression extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BitwiseXorExpression";

  public BitwiseXorExpression(SNode node) {
    super(node);
  }

  public static BitwiseXorExpression newInstance(SModel sm, boolean init) {
    return (BitwiseXorExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BitwiseXorExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BitwiseXorExpression newInstance(SModel sm) {
    return BitwiseXorExpression.newInstance(sm, false);
  }

}
