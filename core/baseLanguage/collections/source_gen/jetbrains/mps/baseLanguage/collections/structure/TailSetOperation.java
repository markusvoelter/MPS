package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TailSetOperation extends SortedSetOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.TailSetOperation";
  public static final String FROM_ELEMENT = "fromElement";

  public TailSetOperation(SNode node) {
    super(node);
  }

  public Expression getFromElement() {
    return (Expression)this.getChild(Expression.class, TailSetOperation.FROM_ELEMENT);
  }

  public void setFromElement(Expression node) {
    super.setChild(TailSetOperation.FROM_ELEMENT, node);
  }


  public static TailSetOperation newInstance(SModel sm, boolean init) {
    return (TailSetOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.TailSetOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TailSetOperation newInstance(SModel sm) {
    return TailSetOperation.newInstance(sm, false);
  }

}
