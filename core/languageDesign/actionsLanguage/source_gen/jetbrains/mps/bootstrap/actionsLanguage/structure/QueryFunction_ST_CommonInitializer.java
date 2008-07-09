package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_ST_CommonInitializer extends ConceptFunction {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_ST_CommonInitializer";

  public QueryFunction_ST_CommonInitializer(SNode node) {
    super(node);
  }

  public static QueryFunction_ST_CommonInitializer newInstance(SModel sm, boolean init) {
    return (QueryFunction_ST_CommonInitializer)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_ST_CommonInitializer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_ST_CommonInitializer newInstance(SModel sm) {
    return QueryFunction_ST_CommonInitializer.newInstance(sm, false);
  }

}
