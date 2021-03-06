package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_DetachOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_DetachOperation";

  public Node_DetachOperation(SNode node) {
    super(node);
  }

  public static Node_DetachOperation newInstance(SModel sm, boolean init) {
    return (Node_DetachOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_DetachOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_DetachOperation newInstance(SModel sm) {
    return Node_DetachOperation.newInstance(sm, false);
  }
}
