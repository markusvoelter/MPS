package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_ParametersList extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.editor.structure.QueryFunction_ParametersList";

  public QueryFunction_ParametersList(SNode node) {
    super(node);
  }

  public static QueryFunction_ParametersList newInstance(SModel sm, boolean init) {
    return (QueryFunction_ParametersList) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.QueryFunction_ParametersList", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_ParametersList newInstance(SModel sm) {
    return QueryFunction_ParametersList.newInstance(sm, false);
  }
}
