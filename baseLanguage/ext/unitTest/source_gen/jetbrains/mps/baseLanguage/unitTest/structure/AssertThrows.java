package jetbrains.mps.baseLanguage.unitTest.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.ClassifierType;

public class AssertThrows extends Statement implements MessageHolder {
  public static String STATEMENT = "statement";
  public static String EXCEPTION_TYPE = "exceptionType";
  public static String MESSAGE = "message";

  public  AssertThrows(SNode node) {
    super(node);
  }

  public static AssertThrows newInstance(SModel sm, boolean init) {
    return (AssertThrows)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.AssertThrows", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static AssertThrows newInstance(SModel sm) {
    return AssertThrows.newInstance(sm, false);
  }

  public Statement getStatement() {
    return (Statement)this.getChild(AssertThrows.STATEMENT);
  }
  public void setStatement(Statement node) {
    super.setChild(AssertThrows.STATEMENT, node);
  }
  public ClassifierType getExceptionType() {
    return (ClassifierType)this.getChild(AssertThrows.EXCEPTION_TYPE);
  }
  public void setExceptionType(ClassifierType node) {
    super.setChild(AssertThrows.EXCEPTION_TYPE, node);
  }
  public Message getMessage() {
    return (Message)this.getChild(AssertThrows.MESSAGE);
  }
  public void setMessage(Message node) {
    super.setChild(AssertThrows.MESSAGE, node);
  }
}
