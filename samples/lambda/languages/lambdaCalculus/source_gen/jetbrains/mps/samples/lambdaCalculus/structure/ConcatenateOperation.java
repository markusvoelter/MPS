package jetbrains.mps.samples.lambdaCalculus.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConcatenateOperation extends BinaryStringOperation {
  public static final String concept = "jetbrains.mps.samples.lambdaCalculus.structure.ConcatenateOperation";

  public ConcatenateOperation(SNode node) {
    super(node);
  }

  public static ConcatenateOperation newInstance(SModel sm, boolean init) {
    return (ConcatenateOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.lambdaCalculus.structure.ConcatenateOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConcatenateOperation newInstance(SModel sm) {
    return ConcatenateOperation.newInstance(sm, false);
  }
}
