package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IntegerType extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.IntegerType";

  public IntegerType(SNode node) {
    super(node);
  }

  public static IntegerType newInstance(SModel sm, boolean init) {
    return (IntegerType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IntegerType newInstance(SModel sm) {
    return IntegerType.newInstance(sm, false);
  }

}
