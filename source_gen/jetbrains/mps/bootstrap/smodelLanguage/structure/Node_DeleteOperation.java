package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_DeleteOperation extends SNodeOperation {

  public  Node_DeleteOperation(SNode node) {
    super(node);
  }

  public static Node_DeleteOperation newInstance(SModel sm, boolean init) {
    return (Node_DeleteOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static Node_DeleteOperation newInstance(SModel sm) {
    return Node_DeleteOperation.newInstance(sm, false);
  }
}
