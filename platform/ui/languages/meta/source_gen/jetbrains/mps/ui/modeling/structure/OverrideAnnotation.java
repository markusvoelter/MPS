package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OverrideAnnotation extends BaseConcept {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.OverrideAnnotation";

  public OverrideAnnotation(SNode node) {
    super(node);
  }

  public static OverrideAnnotation newInstance(SModel sm, boolean init) {
    return (OverrideAnnotation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.OverrideAnnotation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OverrideAnnotation newInstance(SModel sm) {
    return OverrideAnnotation.newInstance(sm, false);
  }
}
