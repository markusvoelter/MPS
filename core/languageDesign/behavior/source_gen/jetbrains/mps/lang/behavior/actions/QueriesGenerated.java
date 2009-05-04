package jetbrains.mps.lang.behavior.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_1238617792474(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    if (SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.lang.behavior.structure.ConceptBehavior", true, false) == null) {
      return false;
    }
    if (SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration","jetbrains.mps.lang.behavior.structure.ConceptConstructorDeclaration"}, true, false) == null) {
      return false;
    }
    return true;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_1238617792565(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration","jetbrains.mps.lang.behavior.structure.ConceptConstructorDeclaration"}, true, false) != null;
  }

  public static void nodeFactory_NodeSetup_ConceptMethodDeclaration_1238617792579(final IOperationContext operationContext, final NodeSetupContext _context) {
    SNode behaviour = SNodeOperations.cast(SNodeOperations.getContainingRoot(_context.getEnclosingNode()), "jetbrains.mps.lang.behavior.structure.ConceptBehavior");
    SLinkOperations.setNewChild(_context.getNewNode(), "visibility", "jetbrains.mps.baseLanguage.structure.PublicVisibility");
    if (SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(behaviour, "concept", false)) == SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
      SPropertyOperations.set(_context.getNewNode(), "isAbstract", "" + (true));
      SPropertyOperations.set(_context.getNewNode(), "isVirtual", "" + (true));
    }
  }

  public static void nodeFactory_NodeSetup_StaticConceptMethodDeclaration_1238617792618(final IOperationContext operationContext, final NodeSetupContext _context) {
    SLinkOperations.setNewChild(_context.getNewNode(), "visibility", "jetbrains.mps.baseLanguage.structure.PublicVisibility");
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1238617792471(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.behavior.structure.ThisNodeExpression");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
    }
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.behavior.structure.SuperNodeExpression");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1238617792506(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            SNode behavior = SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.lang.behavior.structure.ConceptBehavior", true, false);
            return AbstractConceptDeclaration_Behavior.call_getAvailableConceptMethods_1213877394200(SLinkOperations.getTarget(behavior, "concept", false), _context.getParentNode(), operationContext.getScope());
          }
        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode expr = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.DotExpression", null);
                SLinkOperations.setNewChild(expr, "operand", "jetbrains.mps.lang.behavior.structure.ThisNodeExpression");
                SNode call = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall", null);
                SLinkOperations.setTarget(call, "baseMethodDeclaration", (item), false);
                SLinkOperations.setTarget(expr, "operation", call, true);
                return expr;
              }
            });
          }
        }
      }
    }
    return result;
  }

}
