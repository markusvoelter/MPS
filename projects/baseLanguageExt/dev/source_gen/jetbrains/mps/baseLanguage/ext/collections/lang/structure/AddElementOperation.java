package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.ext.collections.lang.structure.AbstractListOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class AddElementOperation extends AbstractListOperation {
  public static String ARGUMENT = "argument";

  public  AddElementOperation(SNode node) {
    super(node);
  }

  public static AddElementOperation newInstance(SModel sm, boolean init) {
    return (AddElementOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.AddElementOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static AddElementOperation newInstance(SModel sm) {
    return AddElementOperation.newInstance(sm, false);
  }

  public Expression getArgument() {
    return (Expression)this.getChild(AddElementOperation.ARGUMENT);
  }
  public void setArgument(Expression node) {
    super.setChild(AddElementOperation.ARGUMENT, node);
  }
}
