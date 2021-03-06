package jetbrains.mps.baseLanguage.constraints;

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
import jetbrains.mps.baseLanguage.search.ClassifierVisibleStaticMembersScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class StaticMethodCall_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_8qp2eq_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)", "1213104837312");

  public StaticMethodCall_Constraints() {
    super("jetbrains.mps.baseLanguage.structure.StaticMethodCall");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("baseMethodDeclaration", new BaseReferenceConstraintsDescriptor("baseMethodDeclaration", this) {
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
            return new ClassifierVisibleStaticMembersScope(SLinkOperations.getTarget(_context.getReferenceNode(), "classConcept", false), ((_context.getReferenceNode() == null) ?
              _context.getEnclosingNode() :
              _context.getReferenceNode()
            ), IClassifiersSearchScope.STATIC_METHOD);
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_8qp2eq_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
