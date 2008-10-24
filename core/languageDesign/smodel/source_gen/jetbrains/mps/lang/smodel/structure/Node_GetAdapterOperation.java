package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_GetAdapterOperation extends SNodeOperation {
public    static final String concept = "jetbrains.mps.lang.smodel.structure.Node_GetAdapterOperation";

  public Node_GetAdapterOperation(SNode node) {
    super(node);
  }

  public static Node_GetAdapterOperation newInstance(SModel sm, boolean init) {
    return (Node_GetAdapterOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_GetAdapterOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_GetAdapterOperation newInstance(SModel sm) {
    return Node_GetAdapterOperation.newInstance(sm, false);
  }

}
