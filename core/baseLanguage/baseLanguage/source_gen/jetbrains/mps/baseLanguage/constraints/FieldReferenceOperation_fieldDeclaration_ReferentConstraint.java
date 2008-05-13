package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleMembersScope;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class FieldReferenceOperation_fieldDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public FieldReferenceOperation_fieldDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", "fieldDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", "fieldDeclaration");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode instance = SLinkOperations.getTarget(_context.getEnclosingNode(), "operand", true);
    SNode classifierType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(instance), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
    return new ClassifierVisibleMembersScope(((ClassifierType)SNodeOperations.getAdapter(classifierType)), _context.getEnclosingNode(), IClassifiersSearchScope.INSTANCE_FIELD);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "fields declared in hierarhy of class specified by left expression. only applicable to expressions of classifier-type";
  }

}
