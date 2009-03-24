package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.constraints._Quotations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class SuperConstructorInvocation_constructorDeclaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {

  public SuperConstructorInvocation_constructorDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation", "constructorDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation", "constructorDeclaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    //      just insure that dynamic reference resolve won't scan all models
    SNode thisConcept = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", true, false);
    SNode superClass = SLinkOperations.getTarget(SLinkOperations.getTarget(thisConcept, "superclass", true), "classifier", false);
    if (superClass == null) {
      superClass = SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "classifier", false);
    }
    return new SimpleSearchScope(SLinkOperations.getTargets(superClass, "constructor", true));
  }

}
