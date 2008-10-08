package jetbrains.mps.quickQueryLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseQuery extends BaseConcept {
  public static final String concept = "jetbrains.mps.quickQueryLanguage.structure.BaseQuery";
  public static String CONCEPT_DECLARATION = "conceptDeclaration";
  public static String CONDITION = "condition";

  public BaseQuery(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConceptDeclaration() {
    return (AbstractConceptDeclaration)this.getReferent(BaseQuery.CONCEPT_DECLARATION);
  }

  public void setConceptDeclaration(AbstractConceptDeclaration node) {
    super.setReferent(BaseQuery.CONCEPT_DECLARATION, node);
  }

  public QueryCondition getCondition() {
    return (QueryCondition)this.getChild(BaseQuery.CONDITION);
  }

  public void setCondition(QueryCondition node) {
    super.setChild(BaseQuery.CONDITION, node);
  }


  public static BaseQuery newInstance(SModel sm, boolean init) {
    return (BaseQuery)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.quickQueryLanguage.structure.BaseQuery", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseQuery newInstance(SModel sm) {
    return BaseQuery.newInstance(sm, false);
  }

}
