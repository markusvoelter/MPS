package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IsApplicableClause extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.IsApplicableClause";

  public IsApplicableClause(SNode node) {
    super(node);
  }

  public static IsApplicableClause newInstance(SModel sm, boolean init) {
    return (IsApplicableClause)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.IsApplicableClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IsApplicableClause newInstance(SModel sm) {
    return IsApplicableClause.newInstance(sm, false);
  }
}
