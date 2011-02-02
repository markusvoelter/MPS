package jetbrains.mps.lang.core.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LinkAttribute extends Attribute {
  public static final String concept = "jetbrains.mps.lang.core.structure.LinkAttribute";
  public static final String LINK = "link";

  public LinkAttribute(SNode node) {
    super(node);
  }

  public LinkDeclaration getLink() {
    return (LinkDeclaration) this.getReferent(LinkDeclaration.class, LinkAttribute.LINK);
  }

  public void setLink(LinkDeclaration node) {
    super.setReferent(LinkAttribute.LINK, node);
  }

  public static LinkAttribute newInstance(SModel sm, boolean init) {
    return (LinkAttribute) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.core.structure.LinkAttribute", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LinkAttribute newInstance(SModel sm) {
    return LinkAttribute.newInstance(sm, false);
  }
}
