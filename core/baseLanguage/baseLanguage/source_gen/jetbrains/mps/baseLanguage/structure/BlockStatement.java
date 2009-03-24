package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BlockStatement extends jetbrains.mps.baseLanguage.structure.Statement {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BlockStatement";
  public static final String STATEMENTS = "statements";

  public BlockStatement(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.StatementList getStatements() {
    return (jetbrains.mps.baseLanguage.structure.StatementList)this.getChild(StatementList.class, BlockStatement.STATEMENTS);
  }

  public void setStatements(jetbrains.mps.baseLanguage.structure.StatementList node) {
    super.setChild(BlockStatement.STATEMENTS, node);
  }


  public static BlockStatement newInstance(SModel sm, boolean init) {
    return (BlockStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BlockStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BlockStatement newInstance(SModel sm) {
    return BlockStatement.newInstance(sm, false);
  }

}
