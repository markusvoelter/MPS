package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CheckDataFlowOperation extends NodeOperation {
  public static final String concept = "jetbrains.mps.lang.test.structure.CheckDataFlowOperation";

  public CheckDataFlowOperation(SNode node) {
    super(node);
  }

  public static CheckDataFlowOperation newInstance(SModel sm, boolean init) {
    return (CheckDataFlowOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.CheckDataFlowOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CheckDataFlowOperation newInstance(SModel sm) {
    return CheckDataFlowOperation.newInstance(sm, false);
  }
}
