package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IntersectOperation extends BinaryOperation {

  public  IntersectOperation(SNode node) {
    super(node);
  }

  public static IntersectOperation newInstance(SModel sm, boolean init) {
    return (IntersectOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.IntersectOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static IntersectOperation newInstance(SModel sm) {
    return IntersectOperation.newInstance(sm, false);
  }
}
