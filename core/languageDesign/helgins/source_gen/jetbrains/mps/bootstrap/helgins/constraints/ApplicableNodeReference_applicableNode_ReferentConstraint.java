package jetbrains.mps.bootstrap.helgins.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class ApplicableNodeReference_applicableNode_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  ApplicableNodeReference_applicableNode_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeReference", "applicableNode", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeReference", "applicableNode");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    SNode rule = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.bootstrap.helgins.structure.AbstractRule", false, false);
    if(rule != null) {
      SNode appNode = SLinkOperations.getTarget(rule, "applicableNode", true);
      ListOperations.addElement(result, appNode);
      if(SNodeOperations.isInstanceOf(rule, "jetbrains.mps.bootstrap.helgins.structure.ComparisonRule")) {
        SNode appNode2 = SLinkOperations.getTarget(rule, "anotherNode", true);
        ListOperations.addElement(result, appNode2);
      }
      if(SNodeOperations.isInstanceOf(rule, "jetbrains.mps.bootstrap.helgins.structure.InequationReplacementRule")) {
        SNode appNode2 = SLinkOperations.getTarget(rule, "supertypeNode", true);
        ListOperations.addElement(result, appNode2);
      }
    }
    SNode coerceStatement = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.bootstrap.helgins.structure.CoerceStatement", false, false);
    while(coerceStatement != null) {
      ListOperations.addElement(result, SLinkOperations.getTarget(coerceStatement, "pattern", true));
      coerceStatement = SNodeOperations.getAncestor(coerceStatement, "jetbrains.mps.bootstrap.helgins.structure.CoerceStatement", false, false);
    }
    SNode matchStatementItem = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.bootstrap.helgins.structure.MatchStatementItem", false, false);
    while(matchStatementItem != null) {
      ListOperations.addElement(result, SLinkOperations.getTarget(matchStatementItem, "condition", true));
      matchStatementItem = SNodeOperations.getAncestor(matchStatementItem, "jetbrains.mps.bootstrap.helgins.structure.MatchStatementItem", false, false);
    }
    return new SimpleSearchScope(result);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
