package jetbrains.mps.lang.core.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.INodePropertySetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class BaseConcept_virtualPackage_PropertyConstraint implements IModelConstraints, INodePropertyGetter, INodePropertySetter {
  public BaseConcept_virtualPackage_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.lang.core.structure.BaseConcept", "virtualPackage", this);
    manager.registerNodePropertySetter("jetbrains.mps.lang.core.structure.BaseConcept", "virtualPackage", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.lang.core.structure.BaseConcept", "virtualPackage");
    manager.unRegisterNodePropertySetter("jetbrains.mps.lang.core.structure.BaseConcept", "virtualPackage");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return node.getProperty(SModelTreeNode.PACK);
  }

  public void execPropertySet(final SNode node, final String propertyName, final String propertyValue, final IScope scope) {
    node.setProperty(SModelTreeNode.PACK, (SPropertyOperations.getString(propertyValue)));
  }
}
