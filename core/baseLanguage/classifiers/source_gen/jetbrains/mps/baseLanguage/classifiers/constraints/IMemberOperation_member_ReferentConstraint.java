package jetbrains.mps.baseLanguage.classifiers.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.classifiers.behavior.BaseClassifierType_Behavior;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class IMemberOperation_member_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public IMemberOperation_member_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation", "member", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation", "member");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode operand = SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
    List<SNode> applicableMembers = new ArrayList<SNode>();
    {
      IMatchingPattern pattern_0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType");
      SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(operand), pattern_0);
      if (coercedNode_0 != null) {
        for (SNode member : BaseClassifierType_Behavior.call_getMembers_1213877402148(coercedNode_0, _context.getEnclosingNode())) {
          if (SNodeOperations.isInstanceOf(member, NameUtil.nodeFQName(_context.getLinkTarget()))) {
            ListSequence.fromList(applicableMembers).addElement(member);
          }
        }
      } else {
      }
    }
    return applicableMembers;
  }
}
