package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SLinkListAccess extends SNodeOperation {
public    static final String concept = "jetbrains.mps.lang.smodel.structure.SLinkListAccess";
public    static final String LINK = "link";

  public SLinkListAccess(SNode node) {
    super(node);
  }

  public LinkDeclaration getLink() {
    return (LinkDeclaration)this.getReferent(SLinkListAccess.LINK);
  }

  public void setLink(LinkDeclaration node) {
    super.setReferent(SLinkListAccess.LINK, node);
  }


  public static SLinkListAccess newInstance(SModel sm, boolean init) {
    return (SLinkListAccess)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SLinkListAccess", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SLinkListAccess newInstance(SModel sm) {
    return SLinkListAccess.newInstance(sm, false);
  }

}
