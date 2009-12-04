package jetbrains.mps.xmlQuery.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.xmlSchema.structure.ElementDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AccessChildrenOperation extends XMLElementOperation {
  public static final String concept = "jetbrains.mps.xmlQuery.structure.AccessChildrenOperation";
  public static final String ELEMENT_DECLARATION = "elementDeclaration";

  public AccessChildrenOperation(SNode node) {
    super(node);
  }

  public ElementDeclaration getElementDeclaration() {
    return (ElementDeclaration)this.getReferent(ElementDeclaration.class, AccessChildrenOperation.ELEMENT_DECLARATION);
  }

  public void setElementDeclaration(ElementDeclaration node) {
    super.setReferent(AccessChildrenOperation.ELEMENT_DECLARATION, node);
  }

  public static AccessChildrenOperation newInstance(SModel sm, boolean init) {
    return (AccessChildrenOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlQuery.structure.AccessChildrenOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AccessChildrenOperation newInstance(SModel sm) {
    return AccessChildrenOperation.newInstance(sm, false);
  }
}
