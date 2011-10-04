package jetbrains.mps.build.packaging.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;

public class Antcall_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_adydoe_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895904d4(jetbrains.mps.build.packaging.constraints)", "1224178316888");

  public Antcall_Constraints() {
    super("jetbrains.mps.build.packaging.structure.Antcall");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("targetDeclaration", new BaseReferenceConstraintsDescriptor("targetDeclaration", this) {
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
            if ((SLinkOperations.getTarget(_context.getReferenceNode(), "project", false) == null)) {
              return Sequence.fromIterable(Collections.<SNode>emptyList());
            }
            return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getReferenceNode(), "project", false), "target", true);
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_adydoe_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    references.put("project", new BaseReferenceConstraintsDescriptor("project", this) {
      @Override
      public boolean hasOwnOnReferenceSetHandler() {
        return true;
      }

      @Override
      public boolean validate(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode, final IScope scope) {
        return true;
      }

      @Override
      public void onReferenceSet(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode, final IScope scope) {
        if (oldReferentNode != newReferentNode) {
          SLinkOperations.setTarget(referenceNode, "targetDeclaration", null, false);
        }
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider();
      }
    });
    return references;
  }
}
