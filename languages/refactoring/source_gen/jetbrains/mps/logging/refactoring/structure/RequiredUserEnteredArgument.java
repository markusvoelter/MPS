package jetbrains.mps.logging.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RequiredUserEnteredArgument extends RequiredAdditionalArgument {
  public static final String concept = "jetbrains.mps.logging.refactoring.structure.RequiredUserEnteredArgument";
  public static String FILTER_CLAUSE = "filterClause";
  public static String CHOOSE_COMPONENT_CLAUSE = "chooseComponentClause";
  public static String INITIAL_VALUE = "initialValue";

  public  RequiredUserEnteredArgument(SNode node) {
    super(node);
  }

  public static RequiredUserEnteredArgument newInstance(SModel sm, boolean init) {
    return (RequiredUserEnteredArgument)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.logging.refactoring.structure.RequiredUserEnteredArgument", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RequiredUserEnteredArgument newInstance(SModel sm) {
    return RequiredUserEnteredArgument.newInstance(sm, false);
  }


  public FilterArgumentClause getFilterClause() {
    return (FilterArgumentClause)this.getChild(RequiredUserEnteredArgument.FILTER_CLAUSE);
  }

  public void setFilterClause(FilterArgumentClause node) {
    super.setChild(RequiredUserEnteredArgument.FILTER_CLAUSE, node);
  }

  public ChooseComponentClause getChooseComponentClause() {
    return (ChooseComponentClause)this.getChild(RequiredUserEnteredArgument.CHOOSE_COMPONENT_CLAUSE);
  }

  public void setChooseComponentClause(ChooseComponentClause node) {
    super.setChild(RequiredUserEnteredArgument.CHOOSE_COMPONENT_CLAUSE, node);
  }

  public InitialValueClause getInitialValue() {
    return (InitialValueClause)this.getChild(RequiredUserEnteredArgument.INITIAL_VALUE);
  }

  public void setInitialValue(InitialValueClause node) {
    super.setChild(RequiredUserEnteredArgument.INITIAL_VALUE, node);
  }

}
