package jetbrains.mps.uiLanguage.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.RTransformPreconditionContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;

import java.util.List;

import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.RTActionsBuilderContext;

import java.util.ArrayList;

import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.action.AbstractRTransformHintSubstituteAction;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class QueriesGenerated {

  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1208095090953(final IOperationContext operationContext, final RTransformPreconditionContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(_context.getSourceNode()), "jetbrains.mps.uiLanguage.structure.EventType");
  }

  public static List<INodeSubstituteAction> rightTransform_ActionsFactory_Expression_1208095077171(final IOperationContext operationContext, final RTActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.uiLanguage.structure.AddListenerOperation", operationContext.getScope());
      result.add(new AbstractRTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SNode oNode = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.uiLanguage.structure.AddListenerOperation", null);
          SNodeOperations.replaceWithAnother(_context.getSourceNode(), oNode);
          SLinkOperations.setTarget(oNode, "event", _context.getSourceNode(), true);
          return oNode;
        }

        public String getMatchingText(String pattern) {
          return "";
        }

        public String getDescriptionText(String pattern) {
          return "Add listener operation";
        }

      });
    }
    {
      AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.uiLanguage.structure.RemoveListenerOperation", operationContext.getScope());
      result.add(new AbstractRTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SNode oNode = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.uiLanguage.structure.RemoveListenerOperation", null);
          SNodeOperations.replaceWithAnother(_context.getSourceNode(), oNode);
          SLinkOperations.setTarget(oNode, "event", _context.getSourceNode(), true);
          return oNode;
        }

        public String getMatchingText(String pattern) {
          return "";
        }

        public String getDescriptionText(String pattern) {
          return "Remove listener operation";
        }

      });
    }
    {
      AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.uiLanguage.structure.RaiseOperation", operationContext.getScope());
      result.add(new AbstractRTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SNode oNode = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.uiLanguage.structure.RaiseOperation", null);
          SNodeOperations.replaceWithAnother(_context.getSourceNode(), oNode);
          SLinkOperations.setTarget(oNode, "event", _context.getSourceNode(), true);
          return oNode;
        }

        public String getMatchingText(String pattern) {
          return "";
        }

        public String getDescriptionText(String pattern) {
          return "Raise event";
        }

      });
    }
    return result;
  }

}
