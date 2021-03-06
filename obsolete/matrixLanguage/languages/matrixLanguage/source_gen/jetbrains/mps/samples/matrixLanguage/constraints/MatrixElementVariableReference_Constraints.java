package jetbrains.mps.samples.matrixLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class MatrixElementVariableReference_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_5r9sz9_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c8959044f(jetbrains.mps.samples.matrixLanguage.constraints)", "1213107435732");

  public MatrixElementVariableReference_Constraints() {
    super("jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableReference");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("variableDeclaration", new BaseReferenceConstraintsDescriptor("variableDeclaration", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider() {
          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            List<SNode> nodes = SNodeOperations.getAncestors(_context.getEnclosingNode(), null, false);
            List<SNode> vars = new ArrayList<SNode>();
            for (SNode node : nodes) {
              if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.samples.matrixLanguage.structure.ForEachMatrixElement")) {
                ListSequence.fromList(vars).addElement(SLinkOperations.getTarget(SNodeOperations.cast(node, "jetbrains.mps.samples.matrixLanguage.structure.ForEachMatrixElement"), "element", true));
              }
            }
            SimpleSearchScope result = new SimpleSearchScope(vars);
            return result;
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_5r9sz9_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
