package jetbrains.mps.baseLanguage.dates.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.EmptySearchScope;
import java.util.List;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class DateTimePropertyFormatToken_dateTimePropertyFormatType_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public DateTimePropertyFormatToken_dateTimePropertyFormatType_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.dates.structure.DateTimePropertyFormatToken", "dateTimePropertyFormatType", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.dates.structure.DateTimePropertyFormatToken", "dateTimePropertyFormatType");
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    Object searchScopeOrListOfNodes = this.createSearchScopeOrListOfNodes(operationContext, _context);
    if (searchScopeOrListOfNodes == null) {
      return new EmptySearchScope();
    }
    if (searchScopeOrListOfNodes instanceof ISearchScope) {
      return (ISearchScope)searchScopeOrListOfNodes;
    }
    if (searchScopeOrListOfNodes instanceof List) {
      return new SimpleSearchScope((List)searchScopeOrListOfNodes);
    }
    if (searchScopeOrListOfNodes instanceof Iterable) {
      return new SimpleSearchScope(CollectionUtil.asList((Iterable)searchScopeOrListOfNodes));
    }
    throw new RuntimeException("unexpected type in search-scope provider " + searchScopeOrListOfNodes.getClass());
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return new SimpleSearchScope(SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getReferenceNode(), "dateTimePropertyFormatConfiguration", false), "dateTimePropertyFormatType", true));
  }

}
