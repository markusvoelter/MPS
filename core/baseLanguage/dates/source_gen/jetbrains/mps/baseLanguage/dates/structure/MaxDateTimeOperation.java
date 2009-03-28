package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.dates.structure.MathDateTimeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MaxDateTimeOperation extends MathDateTimeOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.MaxDateTimeOperation";

  public MaxDateTimeOperation(SNode node) {
    super(node);
  }

  public static MaxDateTimeOperation newInstance(SModel sm, boolean init) {
    return (MaxDateTimeOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.MaxDateTimeOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MaxDateTimeOperation newInstance(SModel sm) {
    return MaxDateTimeOperation.newInstance(sm, false);
  }

}
