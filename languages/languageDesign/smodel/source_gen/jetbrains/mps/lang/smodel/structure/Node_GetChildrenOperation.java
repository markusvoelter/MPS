package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_GetChildrenOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_GetChildrenOperation";

  public Node_GetChildrenOperation(SNode node) {
    super(node);
  }

  public static Node_GetChildrenOperation newInstance(SModel sm, boolean init) {
    return (Node_GetChildrenOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_GetChildrenOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_GetChildrenOperation newInstance(SModel sm) {
    return Node_GetChildrenOperation.newInstance(sm, false);
  }
}
