package jetbrains.mps.buildlanguage.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.RTransformPreconditionContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.action.DefaultSimpleSubstituteAction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.smodel.action.RTActionsBuilderContext;
import jetbrains.mps.smodel.action.AbstractRTransformHintSubstituteAction;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_PropertyValueExpression_1201708668619(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return Util.checkNodeType(_context.getParentNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.BooleanType"));
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_PropertyValueExpression_1201708881512(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return Util.checkNodeType(_context.getParentNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.CallReferenceType"));
  }

  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_ICommented_1201259678301(final IOperationContext operationContext, final RTransformPreconditionContext _context) {
    return SPropertyOperations.getString(_context.getSourceNode(), "shortDescription") == null;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_PropertyValueExpression_1196869262792(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.BooleanLiteral", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.buildlanguage.structure.BooleanLiteral", null);
          SPropertyOperations.set(result, "value", "" + (true));
          return result;
        }

        public String getDescriptionText(String pattern) {
          return "true literal";
        }

        public String getMatchingText(String pattern) {
          return "true";
        }

      });
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.BooleanLiteral", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.buildlanguage.structure.BooleanLiteral", null);
          SPropertyOperations.set(result, "value", "" + (false));
          return result;
        }

        public String getDescriptionText(String pattern) {
          return "false literal";
        }

        public String getMatchingText(String pattern) {
          return "false";
        }

      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_PropertyValueExpression_1197476868571(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.IntLiteral", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode newNode = SConceptOperations.createNewNode("jetbrains.mps.buildlanguage.structure.IntLiteral", null);
          SPropertyOperations.set(newNode, "value", "" + (Integer.parseInt(pattern)));
          return newNode;
        }

        public boolean hasSubstitute() {
          return true;
        }

        public boolean canSubstitute_internal(String pattern) {
          return _PrecompiledPatterns.REGEXP.matcher(pattern).matches();
        }

        public String getMatchingText(String pattern) {
          return pattern;
        }

      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_PropertyValueExpression_1201708832142(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.TagetReferencePropertyValueExpression", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.CallReference", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.StringLiteral", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    return result;
  }

  public static List<INodeSubstituteAction> rightTransform_ActionsFactory_PropertyValueExpression_1197109326624(final IOperationContext operationContext, final RTActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.PlusOperation", operationContext.getScope());
      result.add(new AbstractRTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SNode newNode = SConceptOperations.createNewNode("jetbrains.mps.buildlanguage.structure.PlusOperation", null);
          SNodeOperations.replaceWithAnother(_context.getSourceNode(), newNode);
          SLinkOperations.setTarget(newNode, "left", _context.getSourceNode(), true);
          return newNode;
        }

        public String getMatchingText(String pattern) {
          return "+";
        }

        public String getDescriptionText(String pattern) {
          return "plus operation";
        }

      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> rightTransform_ActionsFactory_ICommented_1201259672003(final IOperationContext operationContext, final RTActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.ICommented", operationContext.getScope());
      result.add(new AbstractRTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SPropertyOperations.set(_context.getSourceNode(), "shortDescription", "");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "//";
        }

        public String getDescriptionText(String pattern) {
          return "comment";
        }

      });
    }
    return result;
  }

}
