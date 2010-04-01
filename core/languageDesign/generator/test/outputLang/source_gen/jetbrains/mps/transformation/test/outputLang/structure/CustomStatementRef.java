package jetbrains.mps.transformation.test.outputLang.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CustomStatementRef extends Expression {
  public static final String concept = "jetbrains.mps.transformation.test.outputLang.structure.CustomStatementRef";
  public static final String II = "ii";
  public static final String MY_STATEMENT = "myStatement";

  public CustomStatementRef(SNode node) {
    super(node);
  }

  public int getIi() {
    return this.getIntegerProperty(CustomStatementRef.II);
  }

  public void setIi(int value) {
    this.setIntegerProperty(CustomStatementRef.II, value);
  }

  public CustomStatement getMyStatement() {
    return (CustomStatement) this.getReferent(CustomStatement.class, CustomStatementRef.MY_STATEMENT);
  }

  public void setMyStatement(CustomStatement node) {
    super.setReferent(CustomStatementRef.MY_STATEMENT, node);
  }

  public static CustomStatementRef newInstance(SModel sm, boolean init) {
    return (CustomStatementRef) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.test.outputLang.structure.CustomStatementRef", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CustomStatementRef newInstance(SModel sm) {
    return CustomStatementRef.newInstance(sm, false);
  }
}
