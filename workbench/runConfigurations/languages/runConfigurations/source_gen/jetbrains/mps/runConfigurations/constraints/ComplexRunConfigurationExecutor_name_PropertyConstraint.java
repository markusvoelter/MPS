package jetbrains.mps.runConfigurations.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ComplexRunConfigurationExecutor_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {
  public ComplexRunConfigurationExecutor_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.runConfigurations.structure.ComplexRunConfigurationExecutor", "name", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.runConfigurations.structure.ComplexRunConfigurationExecutor", "name");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    if (SLinkOperations.getTarget(node, "configuration", false) != null) {
      return SPropertyOperations.getString(SLinkOperations.getTarget(node, "configuration", false), "name") + " Executor";
    }
    return null;
  }
}
