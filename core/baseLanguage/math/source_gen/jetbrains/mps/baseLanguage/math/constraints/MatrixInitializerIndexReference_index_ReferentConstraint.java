package jetbrains.mps.baseLanguage.math.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNodePointer;

public class MatrixInitializerIndexReference_index_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public MatrixInitializerIndexReference_index_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.math.structure.MatrixInitializerIndexReference", "index", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.math.structure.MatrixInitializerIndexReference", "index");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode n = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.math.structure.MatrixOrVectorInitializer", true, false);
    List<SNode> indices = new ArrayList<SNode>();
    while (n != null) {
      do {
        SNode matchedNode_5upoaw_a0c0a0 = n;
        {
          boolean matches_5upoaw_a0a2a0a = false;
          {
            SNode matchingNode_5upoaw_a0a2a0a = n;
            if (matchingNode_5upoaw_a0a2a0a != null) {
              matches_5upoaw_a0a2a0a = SModelUtil_new.isAssignableConcept(matchingNode_5upoaw_a0a2a0a.getConceptFqName(), "jetbrains.mps.baseLanguage.math.structure.MatrixInitializer");
            }
          }
          if (matches_5upoaw_a0a2a0a) {
            ListSequence.fromList(indices).addElement(SLinkOperations.getTarget(matchedNode_5upoaw_a0c0a0, "colIndex", true));
            ListSequence.fromList(indices).addElement(SLinkOperations.getTarget(matchedNode_5upoaw_a0c0a0, "rowIndex", true));
            break;
          }
        }
        {
          boolean matches_5upoaw_b0a2a0a = false;
          {
            SNode matchingNode_5upoaw_b0a2a0a = n;
            if (matchingNode_5upoaw_b0a2a0a != null) {
              matches_5upoaw_b0a2a0a = SModelUtil_new.isAssignableConcept(matchingNode_5upoaw_b0a2a0a.getConceptFqName(), "jetbrains.mps.baseLanguage.math.structure.VectorInitializer");
            }
          }
          if (matches_5upoaw_b0a2a0a) {
            ListSequence.fromList(indices).addElement(SLinkOperations.getTarget(matchedNode_5upoaw_a0c0a0, "rowIndex", true));
            break;
          }
        }
      } while (false);
      n = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.math.structure.MatrixOrVectorInitializer", false, false);
    }
    return indices;
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:d37b3f1e-89c7-4936-a6de-207bf5ae7643(jetbrains.mps.baseLanguage.math.constraints)", "6219660258344759923");
  }
}
