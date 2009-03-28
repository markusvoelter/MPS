package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LinkRefQualifier extends jetbrains.mps.lang.core.structure.BaseConcept implements jetbrains.mps.lang.smodel.structure.ILinkAccessQualifier {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.LinkRefQualifier";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String LINK = "link";

  public LinkRefQualifier(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(LinkRefQualifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(LinkRefQualifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(LinkRefQualifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(LinkRefQualifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(LinkRefQualifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(LinkRefQualifier.VIRTUAL_PACKAGE, value);
  }

  public jetbrains.mps.lang.structure.structure.LinkDeclaration getLink() {
    return (jetbrains.mps.lang.structure.structure.LinkDeclaration)this.getReferent(LinkDeclaration.class, LinkRefQualifier.LINK);
  }

  public void setLink(jetbrains.mps.lang.structure.structure.LinkDeclaration node) {
    super.setReferent(LinkRefQualifier.LINK, node);
  }


  public static LinkRefQualifier newInstance(SModel sm, boolean init) {
    return (LinkRefQualifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.LinkRefQualifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LinkRefQualifier newInstance(SModel sm) {
    return LinkRefQualifier.newInstance(sm, false);
  }

}
