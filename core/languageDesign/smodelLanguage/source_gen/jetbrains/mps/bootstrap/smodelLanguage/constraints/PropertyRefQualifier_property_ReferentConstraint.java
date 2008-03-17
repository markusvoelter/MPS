package jetbrains.mps.bootstrap.smodelLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.constraints.IOperation_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.bootstrap.structureLanguage.constraints.AbstractConceptDeclaration_Behavior;

public class PropertyRefQualifier_property_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  PropertyRefQualifier_property_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyRefQualifier", "property", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyRefQualifier", "property");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode dotOperand = IOperation_Behavior.call_getOperand_1197028596169(SNodeOperations.getParent(_context.getEnclosingNode(), null, false, false));
    SNode nodeType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(dotOperand), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), true);
    if(nodeType == null) {
      return null;
    }
    SNode dotOperandConcept = SLinkOperations.getTarget(nodeType, "concept", false);
    if(dotOperandConcept == null) {
      dotOperandConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.BaseConcept");
    }
    return new SimpleSearchScope(AbstractConceptDeclaration_Behavior.call_getPropertyDeclarationsExcludingOverridden_1203539034160(dotOperandConcept));
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
