package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_GetChildrenOperation extends SNodeOperation {

  public  Node_GetChildrenOperation(SNode node) {
    super(node);
  }

  public static Node_GetChildrenOperation newInstance(SModel sm, boolean init) {
    return (Node_GetChildrenOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Node_GetChildrenOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static Node_GetChildrenOperation newInstance(SModel sm) {
    return Node_GetChildrenOperation.newInstance(sm, false);
  }
}
