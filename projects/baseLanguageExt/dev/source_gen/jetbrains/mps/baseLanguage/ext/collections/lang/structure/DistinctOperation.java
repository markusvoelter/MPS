package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DistinctOperation extends SequenceOperation {

  public  DistinctOperation(SNode node) {
    super(node);
  }

  public static DistinctOperation newInstance(SModel sm, boolean init) {
    return (DistinctOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.DistinctOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static DistinctOperation newInstance(SModel sm) {
    return DistinctOperation.newInstance(sm, false);
  }
}
