package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConvertToDurationOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.ConvertToDurationOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public ConvertToDurationOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ConvertToDurationOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConvertToDurationOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConvertToDurationOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConvertToDurationOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConvertToDurationOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConvertToDurationOperation.VIRTUAL_PACKAGE, value);
  }

  public static ConvertToDurationOperation newInstance(SModel sm, boolean init) {
    return (ConvertToDurationOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.ConvertToDurationOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConvertToDurationOperation newInstance(SModel sm) {
    return ConvertToDurationOperation.newInstance(sm, false);
  }
}
