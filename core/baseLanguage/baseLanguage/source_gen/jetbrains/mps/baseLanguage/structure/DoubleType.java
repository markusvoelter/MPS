package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DoubleType extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.DoubleType";

  public DoubleType(SNode node) {
    super(node);
  }

  public static DoubleType newInstance(SModel sm, boolean init) {
    return (DoubleType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DoubleType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DoubleType newInstance(SModel sm) {
    return DoubleType.newInstance(sm, false);
  }

}
