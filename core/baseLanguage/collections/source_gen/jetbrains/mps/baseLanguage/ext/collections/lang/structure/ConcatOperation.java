package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConcatOperation extends BinaryOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ConcatOperation";

  public ConcatOperation(SNode node) {
    super(node);
  }

  public static ConcatOperation newInstance(SModel sm, boolean init) {
    return (ConcatOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.ConcatOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConcatOperation newInstance(SModel sm) {
    return ConcatOperation.newInstance(sm, false);
  }

}
