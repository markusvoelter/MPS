package jetbrains.mps.baseLanguage.datesInternal.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.datesInternal.structure.DateTimePropertyConfiguration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimeIntPropertyFormatConfiguration extends DateTimePropertyConfiguration {
  public static final String concept = "jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeIntPropertyFormatConfiguration";
  public static final String DATE_TIME_PROPERTY = "dateTimeProperty";

  public DateTimeIntPropertyFormatConfiguration(SNode node) {
    super(node);
  }

  public DateTimeProperty getDateTimeProperty() {
    return (DateTimeProperty)this.getReferent(DateTimeProperty.class, DateTimeIntPropertyFormatConfiguration.DATE_TIME_PROPERTY);
  }

  public void setDateTimeProperty(DateTimeProperty node) {
    super.setReferent(DateTimeIntPropertyFormatConfiguration.DATE_TIME_PROPERTY, node);
  }


  public static DateTimeIntPropertyFormatConfiguration newInstance(SModel sm, boolean init) {
    return (DateTimeIntPropertyFormatConfiguration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeIntPropertyFormatConfiguration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimeIntPropertyFormatConfiguration newInstance(SModel sm) {
    return DateTimeIntPropertyFormatConfiguration.newInstance(sm, false);
  }

}
