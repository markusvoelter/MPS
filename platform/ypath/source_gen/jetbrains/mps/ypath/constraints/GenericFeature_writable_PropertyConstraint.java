package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertySetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;

public class GenericFeature_writable_PropertyConstraint implements IModelConstraints, INodePropertySetter {
  public GenericFeature_writable_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertySetter("jetbrains.mps.ypath.structure.GenericFeature", "writable", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertySetter("jetbrains.mps.ypath.structure.GenericFeature", "writable");
  }

  public void execPropertySet(final SNode node, final String propertyName, final String propertyValue, final IScope scope) {
    // nothing to do, it's a read-only property 
  }
}
