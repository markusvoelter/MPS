package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CollectionType extends AbstractContainerType {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.CollectionType";

  public CollectionType(SNode node) {
    super(node);
  }

  public static CollectionType newInstance(SModel sm, boolean init) {
    return (CollectionType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.CollectionType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CollectionType newInstance(SModel sm) {
    return CollectionType.newInstance(sm, false);
  }
}
