package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ShortType extends PrimitiveType {

  public  ShortType(SNode node) {
    super(node);
  }

  public static ShortType newInstance(SModel sm, boolean init) {
    return (ShortType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ShortType", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ShortType newInstance(SModel sm) {
    return ShortType.newInstance(sm, false);
  }
}
