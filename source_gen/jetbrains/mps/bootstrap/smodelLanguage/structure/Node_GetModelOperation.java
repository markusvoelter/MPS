package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class Node_GetModelOperation extends SNodeOperation {

  public  Node_GetModelOperation(SNode node) {
    super(node);
  }

  public static Node_GetModelOperation newInstance(SModel sm) {
    return (Node_GetModelOperation)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation", sm, GlobalScope.getInstance()).getAdaptor();
  }
}
