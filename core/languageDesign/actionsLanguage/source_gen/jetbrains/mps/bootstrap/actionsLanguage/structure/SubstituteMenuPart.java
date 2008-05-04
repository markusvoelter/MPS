package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SubstituteMenuPart extends MenuPart {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.SubstituteMenuPart";

  public SubstituteMenuPart(SNode node) {
    super(node);
  }

  public static SubstituteMenuPart newInstance(SModel sm, boolean init) {
    return (SubstituteMenuPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.SubstituteMenuPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SubstituteMenuPart newInstance(SModel sm) {
    return SubstituteMenuPart.newInstance(sm, false);
  }

}
