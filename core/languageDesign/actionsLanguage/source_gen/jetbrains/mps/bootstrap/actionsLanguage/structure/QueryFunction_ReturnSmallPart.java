package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_ReturnSmallPart extends ConceptFunction {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_ReturnSmallPart";

  public  QueryFunction_ReturnSmallPart(SNode node) {
    super(node);
  }

  public static QueryFunction_ReturnSmallPart newInstance(SModel sm, boolean init) {
    return (QueryFunction_ReturnSmallPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_ReturnSmallPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_ReturnSmallPart newInstance(SModel sm) {
    return QueryFunction_ReturnSmallPart.newInstance(sm, false);
  }

}
