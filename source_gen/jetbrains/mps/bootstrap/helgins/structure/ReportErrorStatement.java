package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class ReportErrorStatement extends Statement {
  public static String ERROR_STRING = "errorString";
  public static String NODE_TO_REPORT = "nodeToReport";

  public  ReportErrorStatement(SNode node) {
    super(node);
  }

  public static ReportErrorStatement newInstance(SModel sm, boolean init) {
    return (ReportErrorStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ReportErrorStatement newInstance(SModel sm) {
    return ReportErrorStatement.newInstance(sm, false);
  }


  public Expression getErrorString() {
    return (Expression)this.getChild(ReportErrorStatement.ERROR_STRING);
  }

  public void setErrorString(Expression node) {
    super.setChild(ReportErrorStatement.ERROR_STRING, node);
  }

  public Expression getNodeToReport() {
    return (Expression)this.getChild(ReportErrorStatement.NODE_TO_REPORT);
  }

  public void setNodeToReport(Expression node) {
    super.setChild(ReportErrorStatement.NODE_TO_REPORT, node);
  }

}
