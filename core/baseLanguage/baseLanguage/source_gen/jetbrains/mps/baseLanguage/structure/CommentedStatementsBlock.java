package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommentedStatementsBlock extends Statement {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock";
  public static final String STATEMENT = "statement";

  public CommentedStatementsBlock(SNode node) {
    super(node);
  }

  public int getStatementsCount() {
    return this.getChildCount(CommentedStatementsBlock.STATEMENT);
  }

  public Iterator<Statement> statements() {
    return this.children(Statement.class, CommentedStatementsBlock.STATEMENT);
  }

  public List<Statement> getStatements() {
    return this.getChildren(Statement.class, CommentedStatementsBlock.STATEMENT);
  }

  public void addStatement(Statement node) {
    this.addChild(CommentedStatementsBlock.STATEMENT, node);
  }

  public void insertStatement(Statement prev, Statement node) {
    this.insertChild(prev, CommentedStatementsBlock.STATEMENT, node);
  }


  public static CommentedStatementsBlock newInstance(SModel sm, boolean init) {
    return (CommentedStatementsBlock)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommentedStatementsBlock newInstance(SModel sm) {
    return CommentedStatementsBlock.newInstance(sm, false);
  }

}
