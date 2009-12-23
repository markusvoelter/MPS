package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleStaticMembersScope;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class StaticFieldReference_staticFieldDeclaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public StaticFieldReference_staticFieldDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "variableDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "variableDeclaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    // static fields from hierarchy of specified class 
    return new ClassifierVisibleStaticMembersScope(((Classifier) SNodeOperations.getAdapter(SLinkOperations.getTarget(_context.getReferenceNode(), "classifier", false))), _context.getReferenceNode(), IClassifiersSearchScope.STATIC_FIELD);
  }
}
