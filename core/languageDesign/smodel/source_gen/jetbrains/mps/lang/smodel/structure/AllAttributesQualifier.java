package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AllAttributesQualifier extends jetbrains.mps.lang.core.structure.BaseConcept implements jetbrains.mps.lang.smodel.structure.IAttributeAccessQualifier {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.AllAttributesQualifier";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

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
    return (AllAttributesQualifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.AllAttributesQualifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AllAttributesQualifier newInstance(SModel sm) {
    return AllAttributesQualifier.newInstance(sm, false);
  }

}
