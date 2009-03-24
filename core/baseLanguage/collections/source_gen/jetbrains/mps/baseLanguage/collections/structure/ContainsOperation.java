package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ContainsOperation extends jetbrains.mps.baseLanguage.collections.structure.SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.ContainsOperation";
  public static final String ARGUMENT = "argument";

  public ContainsOperation(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getArgument() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, ContainsOperation.ARGUMENT);
  }

  public void setArgument(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(ContainsOperation.ARGUMENT, node);
  }


  public static ContainsOperation newInstance(SModel sm, boolean init) {
    return (ContainsOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ContainsOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ContainsOperation newInstance(SModel sm) {
    return ContainsOperation.newInstance(sm, false);
  }

}
