package jetbrains.mps.bootstrap.smodelLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class LinkAttributeAccessQualifier_annotationLink_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  LinkAttributeAccessQualifier_annotationLink_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.LinkAttributeAccessQualifier", "annotationLink", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.LinkAttributeAccessQualifier", "annotationLink");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode ald = SConceptOperations.findConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.structure.AnnotationLinkDeclaration");
    List<SNode> annotationLinks = SConceptOperations.findConceptInstances(ald, operationContext.getScope());
    List<SNode> linkAttrLinks = SequenceOperations.toList(SequenceOperations.where(annotationLinks, new zPredicate2(null, null)));
    return new SimpleSearchScope(linkAttrLinks);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "all 'link' annotation links";
  }

}
