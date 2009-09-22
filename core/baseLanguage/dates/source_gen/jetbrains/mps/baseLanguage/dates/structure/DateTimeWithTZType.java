package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimeWithTZType extends Type {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType";

  public DateTimeWithTZType(SNode node) {
    super(node);
  }

  public static DateTimeWithTZType newInstance(SModel sm, boolean init) {
    return (DateTimeWithTZType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimeWithTZType newInstance(SModel sm) {
    return DateTimeWithTZType.newInstance(sm, false);
  }
}
