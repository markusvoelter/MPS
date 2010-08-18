package jetbrains.mps.lang.pattern.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class QueriesGenerated {
  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_2879868312063095317(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.lang.pattern.structure.PatternExpression", false, false) != null;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_2879868312063092085(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.pattern.structure.OrPattern");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode orPattern = SConceptOperations.createNewNode("jetbrains.mps.lang.pattern.structure.OrPattern", null);
          SNodeOperations.replaceWithAnother(_context.getSourceNode(), orPattern);
          return SLinkOperations.setTarget(ListSequence.fromList(SLinkOperations.getTargets(orPattern, "clause", true)).first(), "patternNode", _context.getSourceNode(), true);
        }

        public String getMatchingText(String pattern) {
          return "|";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }
}
