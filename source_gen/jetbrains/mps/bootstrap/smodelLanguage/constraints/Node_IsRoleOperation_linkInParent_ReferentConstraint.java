package jetbrains.mps.bootstrap.smodelLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import java.util.List;
import jetbrains.mps.smodel.search.SModelSearchUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.INodeAdapter;

public class Node_IsRoleOperation_linkInParent_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  Node_IsRoleOperation_linkInParent_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation", "linkInParent", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation", "linkInParent");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return (SLinkOperations.getTarget(referenceNode, "conceptOfParent", false) != null);
  }

  public ISearchScope createNodeReferentSearchScope(final SModel model, final SNode enclosingNode, final SNode referenceNode, final IScope scope) {
    SNode conceptOfParent = SLinkOperations.getTarget(referenceNode, "conceptOfParent", false);
    List links = SModelSearchUtil_new.getAggregationLinkDeclarationsExcludingOverridden(((AbstractConceptDeclaration)SNodeOperations.getAdapter(conceptOfParent)));
    return new SimpleSearchScope(BaseAdapter.toNodes((List<? extends INodeAdapter>)links));
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
