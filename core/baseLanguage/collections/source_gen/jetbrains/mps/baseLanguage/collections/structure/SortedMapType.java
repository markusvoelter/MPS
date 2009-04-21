package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SortedMapType extends MapType {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.SortedMapType";

  public SortedMapType(SNode node) {
    super(node);
  }

  public static SortedMapType newInstance(SModel sm, boolean init) {
    return (SortedMapType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedMapType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SortedMapType newInstance(SModel sm) {
    return SortedMapType.newInstance(sm, false);
  }

}
