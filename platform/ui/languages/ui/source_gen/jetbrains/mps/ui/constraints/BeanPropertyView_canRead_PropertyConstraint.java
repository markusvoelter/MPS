package jetbrains.mps.ui.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class BeanPropertyView_canRead_PropertyConstraint implements IModelConstraints, INodePropertyGetter {
  public BeanPropertyView_canRead_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.ui.structure.BeanPropertyView", "canRead", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.ui.structure.BeanPropertyView", "canRead");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return (SLinkOperations.getTarget(node, "getter", false) != null);
  }
}
