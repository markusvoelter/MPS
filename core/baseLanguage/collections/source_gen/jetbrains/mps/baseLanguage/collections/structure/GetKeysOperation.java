package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetKeysOperation extends jetbrains.mps.baseLanguage.collections.structure.MapOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.GetKeysOperation";

  public GetKeysOperation(SNode node) {
    super(node);
  }

  public static GetKeysOperation newInstance(SModel sm, boolean init) {
    return (GetKeysOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.GetKeysOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetKeysOperation newInstance(SModel sm) {
    return GetKeysOperation.newInstance(sm, false);
  }

}
