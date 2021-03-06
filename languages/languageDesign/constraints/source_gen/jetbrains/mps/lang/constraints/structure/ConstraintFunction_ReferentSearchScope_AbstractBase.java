package jetbrains.mps.lang.constraints.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConstraintFunction_ReferentSearchScope_AbstractBase extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_AbstractBase";

  public ConstraintFunction_ReferentSearchScope_AbstractBase(SNode node) {
    super(node);
  }

  public static ConstraintFunction_ReferentSearchScope_AbstractBase newInstance(SModel sm, boolean init) {
    return (ConstraintFunction_ReferentSearchScope_AbstractBase) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_AbstractBase", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConstraintFunction_ReferentSearchScope_AbstractBase newInstance(SModel sm) {
    return ConstraintFunction_ReferentSearchScope_AbstractBase.newInstance(sm, false);
  }
}
