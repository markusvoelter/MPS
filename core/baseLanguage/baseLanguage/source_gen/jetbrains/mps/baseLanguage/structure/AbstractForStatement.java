package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractForStatement extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AbstractForStatement";
  public static final String VARIABLE = "variable";

  public AbstractForStatement(SNode node) {
    super(node);
  }

  public INodeAdapter getVariable() {
    return (INodeAdapter)this.getChild(, AbstractForStatement.VARIABLE);
  }

  public void setVariable(INodeAdapter node) {
    super.setChild(AbstractForStatement.VARIABLE, node);
  }


  public static AbstractForStatement newInstance(SModel sm, boolean init) {
    return (AbstractForStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AbstractForStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractForStatement newInstance(SModel sm) {
    return AbstractForStatement.newInstance(sm, false);
  }

}
