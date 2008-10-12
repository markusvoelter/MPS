package jetbrains.mps.lang.smodel.constraints;

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
import jetbrains.mps.lang.smodel.behavior.SModelLanguageUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation_Behavior;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;

public class SConceptLinkAccess_conceptLinkDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public SConceptLinkAccess_conceptLinkDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.SConceptLinkAccess", "conceptLinkDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.SConceptLinkAccess", "conceptLinkDeclaration");
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
    // concept links from hierarchy
    SNode operandConcept = SModelLanguageUtil.getConcept(SLinkOperations.getTarget(_context.getEnclosingNode(), "operand", true));
    if ((operandConcept == null)) {
      SNode leftType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getEnclosingNode(), "operand", true));
      if (SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.lang.smodel.structure.SConceptType")) {
        operandConcept = SLinkOperations.getTarget(leftType, "conceptDeclaraton", false);
      } else
      {
        operandConcept = SNodeOperation_Behavior.getLeftNodeConcept_1213877508847(_context.getEnclosingNode());
      }
    }
    return new SimpleSearchScope(AbstractConceptDeclaration_Behavior.call_getConceptLinkDeclarations_1213877394578(operandConcept));
  }

}
