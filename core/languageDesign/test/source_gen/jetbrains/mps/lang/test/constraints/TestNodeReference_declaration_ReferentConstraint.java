package jetbrains.mps.lang.test.constraints;

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
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class TestNodeReference_declaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public TestNodeReference_declaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.test.structure.TestNodeReference", "declaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.test.structure.TestNodeReference", "declaration");
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
      return new SimpleSearchScope(CollectionUtil.iterableAsList((Iterable)searchScopeOrListOfNodes));
    }
    throw new RuntimeException("unexpected type in search-scope provider " + searchScopeOrListOfNodes.getClass());
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode test = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.test.structure.NodesTestCase", true, false);
    List<SNode> result = new ArrayList<SNode>();
    if (test != null) {
      for(SNode node : Sequence.fromIterable(SNodeOperations.getDescendants(test, "jetbrains.mps.lang.test.structure.TestNodeAnnotation", true))) {
        ListSequence.fromList(result).addElement(node);
      }
    }
    return new SimpleSearchScope(result);
  }

}
