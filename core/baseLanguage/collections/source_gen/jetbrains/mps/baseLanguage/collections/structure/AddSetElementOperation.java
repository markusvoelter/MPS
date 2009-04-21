package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AddSetElementOperation extends AbstractSetOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.AddSetElementOperation";
  public static final String ARGUMENT = "argument";

  public AddSetElementOperation(SNode node) {
    super(node);
  }

  public Expression getArgument() {
    return (Expression)this.getChild(Expression.class, AddSetElementOperation.ARGUMENT);
  }

  public void setArgument(Expression node) {
    super.setChild(AddSetElementOperation.ARGUMENT, node);
  }


  public static AddSetElementOperation newInstance(SModel sm, boolean init) {
    return (AddSetElementOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.AddSetElementOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AddSetElementOperation newInstance(SModel sm) {
    return AddSetElementOperation.newInstance(sm, false);
  }

}
