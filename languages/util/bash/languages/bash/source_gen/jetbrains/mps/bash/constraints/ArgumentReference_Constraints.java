package jetbrains.mps.bash.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bash.behavior.ExternalCommandCall_Behavior;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.runtime.impl.ProviderGeneratedSearchScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class ArgumentReference_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_xbl5ia_a0a2a0a0a1a0b0a1a0 = new SNodePointer("r:32c4fb44-9e66-4976-aa43-e37da5fe27dd(jetbrains.mps.bash.constraints)", "3411949499900739977");

  public ArgumentReference_Constraints() {
    super("jetbrains.mps.bash.structure.ArgumentReference");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("arg", new BaseReferenceConstraintsDescriptor("arg", this) {
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
            SNode call = SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.bash.structure.ExternalCommandCall");
            return ExternalCommandCall_Behavior.call_getUnusedArguments_3263637656466355284(call);
          }

          @Override
          public ISearchScope createSearchScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            return new ProviderGeneratedSearchScope(this, operationContext, _context) {
              public boolean isInScope(SNode checkedNode) {
                SNode call = SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.bash.structure.ExternalCommandCall");
                Iterable<SNode> argumentReferences = ListSequence.fromList(SLinkOperations.getTargets(call, "refToOptions", true)).where(new IWhereFilter<SNode>() {
                  public boolean accept(SNode it) {
                    return SNodeOperations.isInstanceOf(it, "jetbrains.mps.bash.structure.ArgumentReference");
                  }
                });
                return (int) Sequence.fromIterable(argumentReferences).select(new ISelector<SNode, SNode>() {
                  public SNode select(SNode it) {
                    return SLinkOperations.getTarget(SNodeOperations.cast(it, "jetbrains.mps.bash.structure.ArgumentReference"), "arg", false);
                  }
                }).distinct().count() == (int) Sequence.fromIterable(argumentReferences).count();
              }
            };
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_xbl5ia_a0a2a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
