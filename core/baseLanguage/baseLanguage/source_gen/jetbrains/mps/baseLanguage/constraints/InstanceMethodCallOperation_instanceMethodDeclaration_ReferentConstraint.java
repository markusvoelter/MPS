package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.structure.DotExpression;

public class InstanceMethodCallOperation_instanceMethodDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  InstanceMethodCallOperation_instanceMethodDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", "baseMethodDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", "baseMethodDeclaration");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode operand = SLinkOperations.getTarget(_context.getEnclosingNode(), "operand", true);
    if(operand == null) {
      return false;
    }
    SNode classifierType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(operand), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
    return classifierType != null;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode instance = SLinkOperations.getTarget(_context.getEnclosingNode(), "operand", true);
    SNode classifierType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(instance), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
    return new InstanceMethodCall_InstanceMethodScope(((ClassifierType)SNodeOperations.getAdapter(classifierType)), ((DotExpression)SNodeOperations.getAdapter(_context.getEnclosingNode())));
  }

  public String getNodeReferentSearchScopeDescription() {
    return "methods declared in hierarhy of class specified by left expression. only applicable to expressions of classifier-type";
  }

}
