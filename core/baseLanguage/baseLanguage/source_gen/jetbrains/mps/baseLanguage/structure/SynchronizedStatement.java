package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SynchronizedStatement extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.SynchronizedStatement";
  public static final String EXPRESSION = "expression";
  public static final String BLOCK = "block";

  public SynchronizedStatement(SNode node) {
    super(node);
  }

  public INodeAdapter getExpression() {
    return (INodeAdapter)this.getChild(, SynchronizedStatement.EXPRESSION);
  }

  public void setExpression(INodeAdapter node) {
    super.setChild(SynchronizedStatement.EXPRESSION, node);
  }

  public INodeAdapter getBlock() {
    return (INodeAdapter)this.getChild(, SynchronizedStatement.BLOCK);
  }

  public void setBlock(INodeAdapter node) {
    super.setChild(SynchronizedStatement.BLOCK, node);
  }


  public static SynchronizedStatement newInstance(SModel sm, boolean init) {
    return (SynchronizedStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.SynchronizedStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SynchronizedStatement newInstance(SModel sm) {
    return SynchronizedStatement.newInstance(sm, false);
  }

}
