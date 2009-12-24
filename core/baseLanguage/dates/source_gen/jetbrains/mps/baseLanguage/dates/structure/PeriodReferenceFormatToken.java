package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.datesInternal.structure.IPeriodFormat;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PeriodReferenceFormatToken extends PeriodFormatToken {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.PeriodReferenceFormatToken";
  public static final String FORMAT = "format";

  public PeriodReferenceFormatToken(SNode node) {
    super(node);
  }

  public IPeriodFormat getFormat() {
    return (IPeriodFormat) this.getReferent(IPeriodFormat.class, PeriodReferenceFormatToken.FORMAT);
  }

  public void setFormat(IPeriodFormat node) {
    super.setReferent(PeriodReferenceFormatToken.FORMAT, node);
  }

  public static PeriodReferenceFormatToken newInstance(SModel sm, boolean init) {
    return (PeriodReferenceFormatToken) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodReferenceFormatToken", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PeriodReferenceFormatToken newInstance(SModel sm) {
    return PeriodReferenceFormatToken.newInstance(sm, false);
  }
}
