package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_GetAllSiblingsOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_GetAllSiblingsOperation";

  public Node_GetAllSiblingsOperation(SNode node) {
    super(node);
  }

  public static Node_GetAllSiblingsOperation newInstance(SModel sm, boolean init) {
    return (Node_GetAllSiblingsOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_GetAllSiblingsOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_GetAllSiblingsOperation newInstance(SModel sm) {
    return Node_GetAllSiblingsOperation.newInstance(sm, false);
  }
}
