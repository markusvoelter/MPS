package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class Classifier_nestedName_PropertyConstraint implements IModelConstraints, INodePropertyGetter {

  public Classifier_nestedName_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.baseLanguage.structure.Classifier", "nestedName", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.baseLanguage.structure.Classifier", "nestedName");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    SNode enclosing = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    if (enclosing != null) {
      return SPropertyOperations.getString(enclosing, "nestedName") + "." + SPropertyOperations.getString(node, "name");
    }
    return SPropertyOperations.getString(node, "name");
  }

}
