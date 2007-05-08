package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.PrimitiveType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VoidType extends PrimitiveType {

  public  VoidType(SNode node) {
    super(node);
  }

  public static VoidType newInstance(SModel sm, boolean init) {
    return (VoidType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.VoidType", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static VoidType newInstance(SModel sm) {
    return VoidType.newInstance(sm, false);
  }
}
