package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.INodeAdapter;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TryCatchStatement extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.TryCatchStatement";
  public static final String BODY = "body";
  public static final String CATCH_CLAUSE = "catchClause";

  public TryCatchStatement(SNode node) {
    super(node);
  }

  public INodeAdapter getBody() {
    return (INodeAdapter)this.getChild(, TryCatchStatement.BODY);
  }

  public void setBody(INodeAdapter node) {
    super.setChild(TryCatchStatement.BODY, node);
  }

  public int getCatchClausesCount() {
    return this.getChildCount(TryCatchStatement.CATCH_CLAUSE);
  }

  public Iterator<INodeAdapter> catchClauses() {
    return this.children(, TryCatchStatement.CATCH_CLAUSE);
  }

  public List<INodeAdapter> getCatchClauses() {
    return this.getChildren(, TryCatchStatement.CATCH_CLAUSE);
  }

  public void addCatchClause(INodeAdapter node) {
    this.addChild(TryCatchStatement.CATCH_CLAUSE, node);
  }

  public void insertCatchClause(INodeAdapter prev, INodeAdapter node) {
    this.insertChild(prev, TryCatchStatement.CATCH_CLAUSE, node);
  }


  public static TryCatchStatement newInstance(SModel sm, boolean init) {
    return (TryCatchStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TryCatchStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TryCatchStatement newInstance(SModel sm) {
    return TryCatchStatement.newInstance(sm, false);
  }

}
