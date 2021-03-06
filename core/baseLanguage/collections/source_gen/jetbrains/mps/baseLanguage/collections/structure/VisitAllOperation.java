package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VisitAllOperation extends InternalSequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.VisitAllOperation";

  public VisitAllOperation(SNode node) {
    super(node);
  }

  public Expression getVisitor() {
    return this.ensureAdapter(Expression.class, "closure", this.getClosure());
  }

  public void setVisitor(Expression node) {
    this.setClosure(node);
  }

  public static VisitAllOperation newInstance(SModel sm, boolean init) {
    return (VisitAllOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.VisitAllOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static VisitAllOperation newInstance(SModel sm) {
    return VisitAllOperation.newInstance(sm, false);
  }
}
