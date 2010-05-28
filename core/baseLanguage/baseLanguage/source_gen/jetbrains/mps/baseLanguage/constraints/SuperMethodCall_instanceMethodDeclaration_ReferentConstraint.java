package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.baseLanguage.behavior.ClassConcept_Behavior;
import jetbrains.mps.smodel.SNodePointer;

public class SuperMethodCall_instanceMethodDeclaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public SuperMethodCall_instanceMethodDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.SuperMethodCall", "baseMethodDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.SuperMethodCall", "baseMethodDeclaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode enclosingClass = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", true, false);
    return new SuperMethodCall_InstanceMethodScope(((ClassifierType) SNodeOperations.getAdapter(ClassConcept_Behavior.call_getSuperclass_1240936569950(enclosingClass))), _context.getEnclosingNode());
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)", "1213104855714");
  }
}
