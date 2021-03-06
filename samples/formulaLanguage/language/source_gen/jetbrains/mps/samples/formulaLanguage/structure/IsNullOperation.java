package jetbrains.mps.samples.formulaLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IsNullOperation extends Operation {
  public static final String concept = "jetbrains.mps.samples.formulaLanguage.structure.IsNullOperation";

  public IsNullOperation(SNode node) {
    super(node);
  }

  public static IsNullOperation newInstance(SModel sm, boolean init) {
    return (IsNullOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.formulaLanguage.structure.IsNullOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IsNullOperation newInstance(SModel sm) {
    return IsNullOperation.newInstance(sm, false);
  }
}
