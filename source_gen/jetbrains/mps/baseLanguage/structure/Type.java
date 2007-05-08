package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.NamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Type extends NamedConcept {

  public  Type(SNode node) {
    super(node);
  }

  public static Type newInstance(SModel sm, boolean init) {
    return (Type)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.Type", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static Type newInstance(SModel sm) {
    return Type.newInstance(sm, false);
  }
}
