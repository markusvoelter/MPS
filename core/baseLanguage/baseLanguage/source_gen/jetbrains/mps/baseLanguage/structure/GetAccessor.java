package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetAccessor extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.GetAccessor";
  public static String STATEMENT_LIST = "statementList";

  public GetAccessor(SNode node) {
    super(node);
  }

  public StatementList getStatementList() {
    return (StatementList)this.getChild(GetAccessor.STATEMENT_LIST);
  }

  public void setStatementList(StatementList node) {
    super.setChild(GetAccessor.STATEMENT_LIST, node);
  }


  public static GetAccessor newInstance(SModel sm, boolean init) {
    return (GetAccessor)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.GetAccessor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetAccessor newInstance(SModel sm) {
    return GetAccessor.newInstance(sm, false);
  }

}
