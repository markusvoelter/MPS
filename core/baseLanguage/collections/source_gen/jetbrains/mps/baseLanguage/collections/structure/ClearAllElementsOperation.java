package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ClearAllElementsOperation extends jetbrains.mps.baseLanguage.collections.structure.AbstractListOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.ClearAllElementsOperation";

  public ClearAllElementsOperation(SNode node) {
    super(node);
  }

  public static ClearAllElementsOperation newInstance(SModel sm, boolean init) {
    return (ClearAllElementsOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ClearAllElementsOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClearAllElementsOperation newInstance(SModel sm) {
    return ClearAllElementsOperation.newInstance(sm, false);
  }

}
