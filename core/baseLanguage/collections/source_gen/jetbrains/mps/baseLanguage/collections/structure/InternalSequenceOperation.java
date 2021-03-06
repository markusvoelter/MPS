package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InternalSequenceOperation extends SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation";
  public static final String CLOSURE = "closure";

  public InternalSequenceOperation(SNode node) {
    super(node);
  }

  public Expression getClosure() {
    return (Expression) this.getChild(Expression.class, InternalSequenceOperation.CLOSURE);
  }

  public void setClosure(Expression node) {
    super.setChild(InternalSequenceOperation.CLOSURE, node);
  }

  public static InternalSequenceOperation newInstance(SModel sm, boolean init) {
    return (InternalSequenceOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InternalSequenceOperation newInstance(SModel sm) {
    return InternalSequenceOperation.newInstance(sm, false);
  }
}
