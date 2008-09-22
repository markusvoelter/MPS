package jetbrains.mps.logging.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.IResolveInfo;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FinderReference extends BaseConcept implements IResolveInfo {
  public static final String concept = "jetbrains.mps.logging.refactoring.structure.FinderReference";
  public static String RESOLVE_INFO = "resolveInfo";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String FINDER_DECLARATION = "finderDeclaration";

  public FinderReference(SNode node) {
    super(node);
  }

  public String getResolveInfo() {
    return this.getProperty(FinderReference.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(FinderReference.RESOLVE_INFO, value);
  }

  public String getShortDescription() {
    return this.getProperty(FinderReference.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FinderReference.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FinderReference.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FinderReference.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FinderReference.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FinderReference.VIRTUAL_PACKAGE, value);
  }

  public FinderDeclaration getFinderDeclaration() {
    return (FinderDeclaration)this.getReferent(FinderReference.FINDER_DECLARATION);
  }

  public void setFinderDeclaration(FinderDeclaration node) {
    super.setReferent(FinderReference.FINDER_DECLARATION, node);
  }


  public static FinderReference newInstance(SModel sm, boolean init) {
    return (FinderReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.logging.refactoring.structure.FinderReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FinderReference newInstance(SModel sm) {
    return FinderReference.newInstance(sm, false);
  }

}
