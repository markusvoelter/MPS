package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.datesInternal.structure.IPeriodFormat;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PeriodFormat extends BaseConcept implements IPeriodFormat {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.PeriodFormat";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String IS_PUBLIC = "isPublic";
  public static final String VISIBILITY = "visibility";
  public static final String TOKEN = "token";

  public PeriodFormat(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(PeriodFormat.NAME);
  }

  public void setName(String value) {
    this.setProperty(PeriodFormat.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(PeriodFormat.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PeriodFormat.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PeriodFormat.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PeriodFormat.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PeriodFormat.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PeriodFormat.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsPublic() {
    return this.getBooleanProperty(PeriodFormat.IS_PUBLIC);
  }

  public void setIsPublic(boolean value) {
    this.setBooleanProperty(PeriodFormat.IS_PUBLIC, value);
  }

  public DateFormatVisibility getVisibility() {
    String value = super.getProperty(PeriodFormat.VISIBILITY);
    return DateFormatVisibility.parseValue(value);
  }

  public void setVisibility(DateFormatVisibility value) {
    super.setProperty(PeriodFormat.VISIBILITY, value.getValueAsString());
  }

  public int getTokensCount() {
    return this.getChildCount(PeriodFormat.TOKEN);
  }

  public Iterator<PeriodFormatToken> tokens() {
    return this.children(PeriodFormatToken.class, PeriodFormat.TOKEN);
  }

  public List<PeriodFormatToken> getTokens() {
    return this.getChildren(PeriodFormatToken.class, PeriodFormat.TOKEN);
  }

  public void addToken(PeriodFormatToken node) {
    this.addChild(PeriodFormat.TOKEN, node);
  }

  public void insertToken(PeriodFormatToken prev, PeriodFormatToken node) {
    this.insertChild(prev, PeriodFormat.TOKEN, node);
  }

  public static PeriodFormat newInstance(SModel sm, boolean init) {
    return (PeriodFormat) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodFormat", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PeriodFormat newInstance(SModel sm) {
    return PeriodFormat.newInstance(sm, false);
  }
}
