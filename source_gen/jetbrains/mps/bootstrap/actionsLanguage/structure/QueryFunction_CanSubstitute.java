package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_CanSubstitute extends ConceptFunction {

  public  QueryFunction_CanSubstitute(SNode node) {
    super(node);
  }

  public static QueryFunction_CanSubstitute newInstance(SModel sm, boolean init) {
    return (QueryFunction_CanSubstitute)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_CanSubstitute", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static QueryFunction_CanSubstitute newInstance(SModel sm) {
    return QueryFunction_CanSubstitute.newInstance(sm, false);
  }
}
