package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PeriodFormatsTable extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.PeriodFormatsTable";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PERIOD_FORMAT = "periodFormat";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public PeriodFormatsTable(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(PeriodFormatsTable.NAME);
  }

  public void setName(String value) {
    this.setProperty(PeriodFormatsTable.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(PeriodFormatsTable.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PeriodFormatsTable.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PeriodFormatsTable.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PeriodFormatsTable.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PeriodFormatsTable.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PeriodFormatsTable.VIRTUAL_PACKAGE, value);
  }

  public int getPeriodFormatsCount() {
    return this.getChildCount(PeriodFormatsTable.PERIOD_FORMAT);
  }

  public Iterator<PeriodFormat> periodFormats() {
    return this.children(PeriodFormat.class, PeriodFormatsTable.PERIOD_FORMAT);
  }

  public List<PeriodFormat> getPeriodFormats() {
    return this.getChildren(PeriodFormat.class, PeriodFormatsTable.PERIOD_FORMAT);
  }

  public void addPeriodFormat(PeriodFormat node) {
    this.addChild(PeriodFormatsTable.PERIOD_FORMAT, node);
  }

  public void insertPeriodFormat(PeriodFormat prev, PeriodFormat node) {
    this.insertChild(prev, PeriodFormatsTable.PERIOD_FORMAT, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(PeriodFormatsTable.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, PeriodFormatsTable.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, PeriodFormatsTable.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(PeriodFormatsTable.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, PeriodFormatsTable.SMODEL_ATTRIBUTE, node);
  }

  public static PeriodFormatsTable newInstance(SModel sm, boolean init) {
    return (PeriodFormatsTable) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodFormatsTable", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PeriodFormatsTable newInstance(SModel sm) {
    return PeriodFormatsTable.newInstance(sm, false);
  }
}
