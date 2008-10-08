package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AllAttributesQualifier extends BaseConcept implements IAttributeAccessQualifier {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.AllAttributesQualifier";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public AllAttributesQualifier(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(AllAttributesQualifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AllAttributesQualifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AllAttributesQualifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AllAttributesQualifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AllAttributesQualifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AllAttributesQualifier.VIRTUAL_PACKAGE, value);
  }


  public static AllAttributesQualifier newInstance(SModel sm, boolean init) {
    return (AllAttributesQualifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.AllAttributesQualifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AllAttributesQualifier newInstance(SModel sm) {
    return AllAttributesQualifier.newInstance(sm, false);
  }

}
