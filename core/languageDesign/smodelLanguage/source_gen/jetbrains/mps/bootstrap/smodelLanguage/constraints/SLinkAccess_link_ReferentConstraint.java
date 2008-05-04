package jetbrains.mps.bootstrap.smodelLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.constraints.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.bootstrap.structureLanguage.constraints.LinkDeclaration_Behavior;

public class SLinkAccess_link_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public SLinkAccess_link_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess", "link", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess", "link");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode dotOperandConcept = SNodeOperation_Behavior.getLeftNodeConcept_1208193558130(_context.getEnclosingNode());
    List<SNode> links = AbstractConceptDeclaration_Behavior.call_getLinkDeclarationsExcludingOverridden_1196820678380(dotOperandConcept);
    return new SimpleSearchScope(ListSequence.fromList(links).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return LinkDeclaration_Behavior.call_isSingular_1205275061212(it);
      }

    }).toListSequence());
  }

  public String getNodeReferentSearchScopeDescription() {
    return "links with cardinality 1 or 0..1";
  }

}
