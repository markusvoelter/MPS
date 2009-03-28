package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_GetIndexInParentOperation extends jetbrains.mps.lang.smodel.structure.SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_GetIndexInParentOperation";

  public Node_GetIndexInParentOperation(SNode node) {
    super(node);
  }

  public static Node_GetIndexInParentOperation newInstance(SModel sm, boolean init) {
    return (Node_GetIndexInParentOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_GetIndexInParentOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_GetIndexInParentOperation newInstance(SModel sm) {
    return Node_GetIndexInParentOperation.newInstance(sm, false);
  }

}
