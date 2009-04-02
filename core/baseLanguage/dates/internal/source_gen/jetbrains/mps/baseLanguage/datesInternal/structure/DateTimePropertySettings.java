package jetbrains.mps.baseLanguage.datesInternal.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty;
import java.util.List;
import jetbrains.mps.baseLanguage.datesInternal.structure.DurationType;
import jetbrains.mps.baseLanguage.datesInternal.structure.Locale;
import jetbrains.mps.baseLanguage.datesInternal.structure.Month;
import jetbrains.mps.baseLanguage.datesInternal.structure.SchedulePeriod;
import jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeZone;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimePropertySettings extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.datesInternal.structure.DateTimePropertySettings";
  public static final String DATE_TIME_PROPERTY = "dateTimeProperty";
  public static final String DURATION_TYPE = "durationType";
  public static final String LOCALE = "locale";
  public static final String MONTH = "month";
  public static final String SCHEDULE_PERIOD = "schedulePeriod";
  public static final String ZONE = "zone";

  public DateTimePropertySettings(SNode node) {
    super(node);
  }

  public int getDateTimePropertiesCount() {
    return this.getChildCount(DateTimePropertySettings.DATE_TIME_PROPERTY);
  }

  public Iterator<DateTimeProperty> dateTimeProperties() {
    return this.children(DateTimeProperty.class, DateTimePropertySettings.DATE_TIME_PROPERTY);
  }

  public List<DateTimeProperty> getDateTimeProperties() {
    return this.getChildren(DateTimeProperty.class, DateTimePropertySettings.DATE_TIME_PROPERTY);
  }

  public void addDateTimeProperty(DateTimeProperty node) {
    this.addChild(DateTimePropertySettings.DATE_TIME_PROPERTY, node);
  }

  public void insertDateTimeProperty(DateTimeProperty prev, DateTimeProperty node) {
    this.insertChild(prev, DateTimePropertySettings.DATE_TIME_PROPERTY, node);
  }

  public int getDurationTypesCount() {
    return this.getChildCount(DateTimePropertySettings.DURATION_TYPE);
  }

  public Iterator<DurationType> durationTypes() {
    return this.children(DurationType.class, DateTimePropertySettings.DURATION_TYPE);
  }

  public List<DurationType> getDurationTypes() {
    return this.getChildren(DurationType.class, DateTimePropertySettings.DURATION_TYPE);
  }

  public void addDurationType(DurationType node) {
    this.addChild(DateTimePropertySettings.DURATION_TYPE, node);
  }

  public void insertDurationType(DurationType prev, DurationType node) {
    this.insertChild(prev, DateTimePropertySettings.DURATION_TYPE, node);
  }

  public int getLocalesCount() {
    return this.getChildCount(DateTimePropertySettings.LOCALE);
  }

  public Iterator<Locale> locales() {
    return this.children(Locale.class, DateTimePropertySettings.LOCALE);
  }

  public List<Locale> getLocales() {
    return this.getChildren(Locale.class, DateTimePropertySettings.LOCALE);
  }

  public void addLocale(Locale node) {
    this.addChild(DateTimePropertySettings.LOCALE, node);
  }

  public void insertLocale(Locale prev, Locale node) {
    this.insertChild(prev, DateTimePropertySettings.LOCALE, node);
  }

  public int getMonthsCount() {
    return this.getChildCount(DateTimePropertySettings.MONTH);
  }

  public Iterator<Month> months() {
    return this.children(Month.class, DateTimePropertySettings.MONTH);
  }

  public List<Month> getMonths() {
    return this.getChildren(Month.class, DateTimePropertySettings.MONTH);
  }

  public void addMonth(Month node) {
    this.addChild(DateTimePropertySettings.MONTH, node);
  }

  public void insertMonth(Month prev, Month node) {
    this.insertChild(prev, DateTimePropertySettings.MONTH, node);
  }

  public int getSchedulePeriodsCount() {
    return this.getChildCount(DateTimePropertySettings.SCHEDULE_PERIOD);
  }

  public Iterator<SchedulePeriod> schedulePeriods() {
    return this.children(SchedulePeriod.class, DateTimePropertySettings.SCHEDULE_PERIOD);
  }

  public List<SchedulePeriod> getSchedulePeriods() {
    return this.getChildren(SchedulePeriod.class, DateTimePropertySettings.SCHEDULE_PERIOD);
  }

  public void addSchedulePeriod(SchedulePeriod node) {
    this.addChild(DateTimePropertySettings.SCHEDULE_PERIOD, node);
  }

  public void insertSchedulePeriod(SchedulePeriod prev, SchedulePeriod node) {
    this.insertChild(prev, DateTimePropertySettings.SCHEDULE_PERIOD, node);
  }

  public int getZonesCount() {
    return this.getChildCount(DateTimePropertySettings.ZONE);
  }

  public Iterator<DateTimeZone> zones() {
    return this.children(DateTimeZone.class, DateTimePropertySettings.ZONE);
  }

  public List<DateTimeZone> getZones() {
    return this.getChildren(DateTimeZone.class, DateTimePropertySettings.ZONE);
  }

  public void addZone(DateTimeZone node) {
    this.addChild(DateTimePropertySettings.ZONE, node);
  }

  public void insertZone(DateTimeZone prev, DateTimeZone node) {
    this.insertChild(prev, DateTimePropertySettings.ZONE, node);
  }


  public static DateTimePropertySettings newInstance(SModel sm, boolean init) {
    return (DateTimePropertySettings)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.datesInternal.structure.DateTimePropertySettings", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimePropertySettings newInstance(SModel sm) {
    return DateTimePropertySettings.newInstance(sm, false);
  }

}
