package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FindFirstOperation extends jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.FindFirstOperation";

  public FindFirstOperation(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getFilter() {
    return this.ensureAdapter(Expression.class, "closure", this.getClosure());
  }

  public void setFilter(jetbrains.mps.baseLanguage.structure.Expression node) {
    this.setClosure(node);
  }


  public static FindFirstOperation newInstance(SModel sm, boolean init) {
    return (FindFirstOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.FindFirstOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FindFirstOperation newInstance(SModel sm) {
    return FindFirstOperation.newInstance(sm, false);
  }

}
