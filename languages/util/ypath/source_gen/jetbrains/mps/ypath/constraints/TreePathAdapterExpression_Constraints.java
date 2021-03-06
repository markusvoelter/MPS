package jetbrains.mps.ypath.constraints;

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
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ypath.actions.TreePathAspectUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class TreePathAdapterExpression_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_dk7qst_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905a8(jetbrains.mps.ypath.constraints)", "1213104858654");

  public TreePathAdapterExpression_Constraints() {
    super("jetbrains.mps.ypath.structure.TreePathAdapterExpression");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("treepathAspect", new BaseReferenceConstraintsDescriptor("treepathAspect", this) {
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
            SNode tpae = _context.getReferenceNode();
            return TreePathAspectUtil.getTreePathAspects(SLinkOperations.getTarget(tpae, "expression", true), operationContext.getScope());
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_dk7qst_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
