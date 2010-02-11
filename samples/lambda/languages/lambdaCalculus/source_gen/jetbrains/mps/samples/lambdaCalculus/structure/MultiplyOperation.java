package jetbrains.mps.samples.lambdaCalculus.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MultiplyOperation extends BinaryOperation {
  public static final String concept = "jetbrains.mps.samples.lambdaCalculus.structure.MultiplyOperation";

  public MultiplyOperation(SNode node) {
    super(node);
  }

  public static MultiplyOperation newInstance(SModel sm, boolean init) {
    return (MultiplyOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.lambdaCalculus.structure.MultiplyOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MultiplyOperation newInstance(SModel sm) {
    return MultiplyOperation.newInstance(sm, false);
  }
}
