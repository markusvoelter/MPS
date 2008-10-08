package jetbrains.mps.baseLanguage.dates.internal.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimePropertyFormatType extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.internal.structure.DateTimePropertyFormatType";
  public static String LETTER = "letter";
  public static String MEANING = "meaning";
  public static String EXAMPLES = "examples";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String DATE_TIME_PROPERTY_CARDINALITY = "dateTimePropertyCardinality";

  public DateTimePropertyFormatType(SNode node) {
    super(node);
  }

  public String getLetter() {
    return this.getProperty(DateTimePropertyFormatType.LETTER);
  }

  public void setLetter(String value) {
    this.setProperty(DateTimePropertyFormatType.LETTER, value);
  }

  public String getMeaning() {
    return this.getProperty(DateTimePropertyFormatType.MEANING);
  }

  public void setMeaning(String value) {
    this.setProperty(DateTimePropertyFormatType.MEANING, value);
  }

  public String getExamples() {
    return this.getProperty(DateTimePropertyFormatType.EXAMPLES);
  }

  public void setExamples(String value) {
    this.setProperty(DateTimePropertyFormatType.EXAMPLES, value);
  }

  public String getName() {
    return this.getProperty(DateTimePropertyFormatType.NAME);
  }

  public void setName(String value) {
    this.setProperty(DateTimePropertyFormatType.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(DateTimePropertyFormatType.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DateTimePropertyFormatType.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DateTimePropertyFormatType.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DateTimePropertyFormatType.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DateTimePropertyFormatType.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DateTimePropertyFormatType.VIRTUAL_PACKAGE, value);
  }

  public DateTimePropertyCardinality getDateTimePropertyCardinality() {
    return (DateTimePropertyCardinality)this.getReferent(DateTimePropertyFormatType.DATE_TIME_PROPERTY_CARDINALITY);
  }

  public void setDateTimePropertyCardinality(DateTimePropertyCardinality node) {
    super.setReferent(DateTimePropertyFormatType.DATE_TIME_PROPERTY_CARDINALITY, node);
  }


  public static DateTimePropertyFormatType newInstance(SModel sm, boolean init) {
    return (DateTimePropertyFormatType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.internal.structure.DateTimePropertyFormatType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimePropertyFormatType newInstance(SModel sm) {
    return DateTimePropertyFormatType.newInstance(sm, false);
  }

}
