package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AffectedNodesClause extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.AffectedNodesClause";

  public AffectedNodesClause(SNode node) {
    super(node);
  }

  public static AffectedNodesClause newInstance(SModel sm, boolean init) {
    return (AffectedNodesClause)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.AffectedNodesClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AffectedNodesClause newInstance(SModel sm) {
    return AffectedNodesClause.newInstance(sm, false);
  }
}
