package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.dates.structure.FormatToken;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.datesInternal.structure.Locale;
import jetbrains.mps.baseLanguage.datesInternal.structure.IDateFormat;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FixedLocaleFormatToken extends FormatToken {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.FixedLocaleFormatToken";
  public static final String LOCALE = "locale";
  public static final String DATE_FORMAT = "dateFormat";

  public FixedLocaleFormatToken(SNode node) {
    super(node);
  }

  public Locale getLocale() {
    return (Locale)this.getReferent(Locale.class, FixedLocaleFormatToken.LOCALE);
  }

  public void setLocale(Locale node) {
    super.setReferent(FixedLocaleFormatToken.LOCALE, node);
  }

  public IDateFormat getDateFormat() {
    return (IDateFormat)this.getReferent(IDateFormat.class, FixedLocaleFormatToken.DATE_FORMAT);
  }

  public void setDateFormat(IDateFormat node) {
    super.setReferent(FixedLocaleFormatToken.DATE_FORMAT, node);
  }


  public static FixedLocaleFormatToken newInstance(SModel sm, boolean init) {
    return (FixedLocaleFormatToken)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.FixedLocaleFormatToken", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FixedLocaleFormatToken newInstance(SModel sm) {
    return FixedLocaleFormatToken.newInstance(sm, false);
  }

}
