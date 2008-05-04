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
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class PropertyAttributeAccessQualifier_annotationLink_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public PropertyAttributeAccessQualifier_annotationLink_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyAttributeAccessQualifier", "annotationLink", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyAttributeAccessQualifier", "annotationLink");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode ald = SConceptOperations.findConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.structure.AnnotationLinkDeclaration");
    List<SNode> annotationLinks = SConceptOperations.findConceptInstances(ald, operationContext.getScope());
    List<SNode> propertyAttrLinks = ListSequence.fromList(annotationLinks).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(it, "stereotype", "property", "node");
      }

    }).toListSequence();
    return new SimpleSearchScope(propertyAttrLinks);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "all 'property' annotation links";
  }

}
