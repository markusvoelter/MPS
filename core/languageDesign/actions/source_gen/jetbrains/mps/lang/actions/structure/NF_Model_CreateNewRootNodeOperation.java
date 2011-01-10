package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.Model_CreateNewRootNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NF_Model_CreateNewRootNodeOperation extends Model_CreateNewRootNodeOperation {
  public static final String concept = "jetbrains.mps.lang.actions.structure.NF_Model_CreateNewRootNodeOperation";
  public static final String PROTOTYPE = "prototype";

  public NF_Model_CreateNewRootNodeOperation(SNode node) {
    super(node);
  }

  public Expression getPrototype() {
    return (Expression) this.getChild(Expression.class, NF_Model_CreateNewRootNodeOperation.PROTOTYPE);
  }

  public void setPrototype(Expression node) {
    super.setChild(NF_Model_CreateNewRootNodeOperation.PROTOTYPE, node);
  }

  public static NF_Model_CreateNewRootNodeOperation newInstance(SModel sm, boolean init) {
    return (NF_Model_CreateNewRootNodeOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.NF_Model_CreateNewRootNodeOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NF_Model_CreateNewRootNodeOperation newInstance(SModel sm) {
    return NF_Model_CreateNewRootNodeOperation.newInstance(sm, false);
  }
}
