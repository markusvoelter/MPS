package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ListCreatorWithInit extends AbstractContainerCreator {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit";

  public ListCreatorWithInit(SNode node) {
    super(node);
  }

  public static ListCreatorWithInit newInstance(SModel sm, boolean init) {
    return (ListCreatorWithInit)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ListCreatorWithInit newInstance(SModel sm) {
    return ListCreatorWithInit.newInstance(sm, false);
  }

}
