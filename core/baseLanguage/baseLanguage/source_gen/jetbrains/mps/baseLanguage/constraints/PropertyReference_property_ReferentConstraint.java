package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.DotExpression_Behavior;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.search.ClassifierAndSuperClassifiersScope;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.search.VisibilityUtil;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class PropertyReference_property_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public PropertyReference_property_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.PropertyReference", "property", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.PropertyReference", "property");
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    if (!(SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"))) {
      return null;
    }
    SNode opClassifier = DotExpression_Behavior.call_getClassifier_1213877410697(_context.getEnclosingNode());
    if (opClassifier == null) {
      return null;
    }
    List<SNode> resultProperties = ListSequence.<SNode>fromArray();
    List<SNode> classifiers = new ClassifierAndSuperClassifiersScope(((Classifier)SNodeOperations.getAdapter(opClassifier))).getClassifierNodes();
    for(SNode classifier : classifiers) {
      if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
        SNode classConcept = classifier;
        List<SNode> properties = SLinkOperations.getTargets(classConcept, "property", true);
        for(SNode property : properties) {
          if (VisibilityUtil.isVisible(_context.getEnclosingNode(), property)) {
            ListSequence.fromList(resultProperties).addElement(property);
          }
        }
      }
    }
    return new SimpleSearchScope(resultProperties);
  }

}
