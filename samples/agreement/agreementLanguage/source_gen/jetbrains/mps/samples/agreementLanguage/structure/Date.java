package jetbrains.mps.samples.agreementLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Date extends BaseConcept {
  public static final String concept = "jetbrains.mps.samples.agreementLanguage.structure.Date";
  public static final String YEAR = "year";
  public static final String MONTH = "month";
  public static final String DAY = "day";

  public Date(SNode node) {
    super(node);
  }

  public int getYear() {
    return this.getIntegerProperty(Date.YEAR);
  }

  public void setYear(int value) {
    this.setIntegerProperty(Date.YEAR, value);
  }

  public int getMonth() {
    return this.getIntegerProperty(Date.MONTH);
  }

  public void setMonth(int value) {
    this.setIntegerProperty(Date.MONTH, value);
  }

  public int getDay() {
    return this.getIntegerProperty(Date.DAY);
  }

  public void setDay(int value) {
    this.setIntegerProperty(Date.DAY, value);
  }

  public static Date newInstance(SModel sm, boolean init) {
    return (Date) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.agreementLanguage.structure.Date", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Date newInstance(SModel sm) {
    return Date.newInstance(sm, false);
  }
}
