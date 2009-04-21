package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TailMapOperation extends SortedMapOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.TailMapOperation";
  public static final String FROM_KEY = "fromKey";

  public TailMapOperation(SNode node) {
    super(node);
  }

  public Expression getFromKey() {
    return (Expression)this.getChild(Expression.class, TailMapOperation.FROM_KEY);
  }

  public void setFromKey(Expression node) {
    super.setChild(TailMapOperation.FROM_KEY, node);
  }


  public static TailMapOperation newInstance(SModel sm, boolean init) {
    return (TailMapOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.TailMapOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TailMapOperation newInstance(SModel sm) {
    return TailMapOperation.newInstance(sm, false);
  }

}
