package jetbrains.mps.build.custommps.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.packaging.behavior.IStringExpression_Behavior;

public class MPSBuild_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {
  public MPSBuild_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.build.custommps.structure.MPSBuild", "name", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.build.custommps.structure.MPSBuild", "name");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    if ((SLinkOperations.getTarget(node, "title", true) == null)) {
      return "";
    }
    return IStringExpression_Behavior.call_getValue_1213877173054(SLinkOperations.getTarget(node, "title", true));
  }
}
