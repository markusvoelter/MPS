package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Link_DeleteChildOperation extends SNodeOperation {

  public  Link_DeleteChildOperation(SNode node) {
    super(node);
  }

  public static Link_DeleteChildOperation newInstance(SModel sm, boolean init) {
    return (Link_DeleteChildOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Link_DeleteChildOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static Link_DeleteChildOperation newInstance(SModel sm) {
    return Link_DeleteChildOperation.newInstance(sm, false);
  }
}
