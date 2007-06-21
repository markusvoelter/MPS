package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class TryStatement extends Statement {
  public static String BODY = "body";
  public static String FINALLY_BODY = "finallyBody";
  public static String CATCH_CLAUSE = "catchClause";

  public  TryStatement(SNode node) {
    super(node);
  }

  public static TryStatement newInstance(SModel sm, boolean init) {
    return (TryStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.TryStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static TryStatement newInstance(SModel sm) {
    return TryStatement.newInstance(sm, false);
  }

  public StatementList getBody() {
    return (StatementList)this.getChild(TryStatement.BODY);
  }
  public void setBody(StatementList node) {
    super.setChild(TryStatement.BODY, node);
  }
  public StatementList getFinallyBody() {
    return (StatementList)this.getChild(TryStatement.FINALLY_BODY);
  }
  public void setFinallyBody(StatementList node) {
    super.setChild(TryStatement.FINALLY_BODY, node);
  }
  public int getCatchClausesCount() {
    return this.getChildCount(TryStatement.CATCH_CLAUSE);
  }
  public Iterator<CatchClause> catchClauses() {
    return this.children(TryStatement.CATCH_CLAUSE);
  }
  public List<CatchClause> getCatchClauses() {
    return this.getChildren(TryStatement.CATCH_CLAUSE);
  }
  public void addCatchClause(CatchClause node) {
    this.addChild(TryStatement.CATCH_CLAUSE, node);
  }
  public void insertCatchClause(CatchClause prev, CatchClause node) {
    this.insertChild(prev, TryStatement.CATCH_CLAUSE, node);
  }
}
