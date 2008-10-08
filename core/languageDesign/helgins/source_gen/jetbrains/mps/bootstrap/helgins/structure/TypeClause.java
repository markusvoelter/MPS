package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypeClause extends BaseConcept {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.TypeClause";

  public TypeClause(SNode node) {
    super(node);
  }

  public static TypeClause newInstance(SModel sm, boolean init) {
    return (TypeClause)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.TypeClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypeClause newInstance(SModel sm) {
    return TypeClause.newInstance(sm, false);
  }

}
