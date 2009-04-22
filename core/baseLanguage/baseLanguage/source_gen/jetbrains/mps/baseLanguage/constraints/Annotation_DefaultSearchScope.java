package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.baseLanguage.search.VisibleClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class Annotation_DefaultSearchScope extends BaseNodeReferenceSearchScopeProvider {

  public Annotation_DefaultSearchScope() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeDefaultSearchScopeProvider("jetbrains.mps.baseLanguage.structure.Annotation", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeDefaultSearchScopeProvider("jetbrains.mps.baseLanguage.structure.Annotation");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return new VisibleClassifiersScope(, IClassifiersSearchScope.ANNOTATION, operationContext.getScope());
  }

}
