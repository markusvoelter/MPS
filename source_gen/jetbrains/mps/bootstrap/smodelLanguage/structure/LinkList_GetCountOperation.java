package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class LinkList_GetCountOperation extends SNodeOperation {

  public  LinkList_GetCountOperation(SNode node) {
    super(node);
  }

  public static LinkList_GetCountOperation newInstance(SModel sm) {
    return (LinkList_GetCountOperation)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation", sm, GlobalScope.getInstance()).getAdaptor();
  }
}
