package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.TypeDerivable;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.datesInternal.structure.IPeriodFormat;
import jetbrains.mps.baseLanguage.datesInternal.structure.Locale;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FormatPeriodExpression extends Expression implements TypeDerivable {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.FormatPeriodExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String FORMAT = "format";
  public static final String LOCALE = "locale";
  public static final String PERIOD = "period";

  public FormatPeriodExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(FormatPeriodExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FormatPeriodExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FormatPeriodExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FormatPeriodExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FormatPeriodExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FormatPeriodExpression.VIRTUAL_PACKAGE, value);
  }

  public IPeriodFormat getFormat() {
    return (IPeriodFormat)this.getReferent(IPeriodFormat.class, FormatPeriodExpression.FORMAT);
  }

  public void setFormat(IPeriodFormat node) {
    super.setReferent(FormatPeriodExpression.FORMAT, node);
  }

  public Locale getLocale() {
    return (Locale)this.getReferent(Locale.class, FormatPeriodExpression.LOCALE);
  }

  public void setLocale(Locale node) {
    super.setReferent(FormatPeriodExpression.LOCALE, node);
  }

  public Expression getPeriod() {
    return (Expression)this.getChild(Expression.class, FormatPeriodExpression.PERIOD);
  }

  public void setPeriod(Expression node) {
    super.setChild(FormatPeriodExpression.PERIOD, node);
  }

  public static FormatPeriodExpression newInstance(SModel sm, boolean init) {
    return (FormatPeriodExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.FormatPeriodExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FormatPeriodExpression newInstance(SModel sm) {
    return FormatPeriodExpression.newInstance(sm, false);
  }
}
