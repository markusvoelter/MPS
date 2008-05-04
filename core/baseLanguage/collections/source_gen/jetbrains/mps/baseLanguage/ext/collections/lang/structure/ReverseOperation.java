package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ReverseOperation extends AbstractListOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ReverseOperation";

  public ReverseOperation(SNode node) {
    super(node);
  }

  public static ReverseOperation newInstance(SModel sm, boolean init) {
    return (ReverseOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.ReverseOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ReverseOperation newInstance(SModel sm) {
    return ReverseOperation.newInstance(sm, false);
  }

}
