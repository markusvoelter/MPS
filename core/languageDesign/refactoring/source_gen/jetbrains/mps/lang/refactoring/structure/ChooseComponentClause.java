package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ChooseComponentClause extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.ChooseComponentClause";

  public ChooseComponentClause(SNode node) {
    super(node);
  }

  public static ChooseComponentClause newInstance(SModel sm, boolean init) {
    return (ChooseComponentClause)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ChooseComponentClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ChooseComponentClause newInstance(SModel sm) {
    return ChooseComponentClause.newInstance(sm, false);
  }
}
