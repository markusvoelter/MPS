package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypePart extends ChildPart {
  public static final String concept = "jetbrains.mpslite.structure.TypePart";

  public TypePart(SNode node) {
    super(node);
  }

  public static TypePart newInstance(SModel sm, boolean init) {
    return (TypePart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.TypePart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypePart newInstance(SModel sm) {
    return TypePart.newInstance(sm, false);
  }
}
