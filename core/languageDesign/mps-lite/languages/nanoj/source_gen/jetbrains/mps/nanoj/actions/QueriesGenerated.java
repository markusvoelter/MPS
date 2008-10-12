package jetbrains.mps.nanoj.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.action.DefaultSimpleSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.IChildNodeSetter;
import jetbrains.mps.smodel.action.AbstractChildNodeSetter;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.action.ModelActions;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.nodeEditor.CellSide;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_ExpressionDotOperation_1197638405564(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getParentNode(), "leftPart", true)), "jetbrains.mps.nanoj.structure.ClassifierType");
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1197638405388(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.Expression");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            int value = Integer.parseInt(pattern);
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.nanoj.structure.NumberExpression", null);
            SPropertyOperations.set(result, "number", "" + (value));
            return result;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            return _PrecompiledPatterns.REGEXP0.matcher(pattern).matches();
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1197638405422(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode wrappedConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.LocalVariableDeclaration");
      IChildNodeSetter setter = new AbstractChildNodeSetter() {

        public SNode wrapNode(SNode nodeToWrap, SModel model) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.nanoj.structure.LocalVariableDeclarationStatement", null);
          SLinkOperations.setTarget(result, "declaration", nodeToWrap, true);
          return result;
        }

        public boolean returnSmallPart(SNode nodeToWrap) {
          return false;
        }

        public SNode doExecute(SNode pn, SNode oc, SNode nc, IScope sc) {
          SNode wrappedNode = this.wrapNode(nc, nc.getModel());
          _context.getChildSetter().execute(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedNode, operationContext.getScope());
          if (this.returnSmallPart(nc)) {
            return nc;
          } else
          {
            return wrappedNode;
          }
        }

      };
      result.addAll(ModelActions.createChildSubstituteActions(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedConcept, setter, operationContext));
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1197638405443(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode wrappedConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.Expression");
      IChildNodeSetter setter = new AbstractChildNodeSetter() {

        public SNode wrapNode(SNode nodeToWrap, SModel model) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.nanoj.structure.ExpressionStatement", null);
          SLinkOperations.setTarget(result, "expr", nodeToWrap, true);
          return result;
        }

        public boolean returnSmallPart(SNode nodeToWrap) {
          return false;
        }

        public SNode doExecute(SNode pn, SNode oc, SNode nc, IScope sc) {
          SNode wrappedNode = this.wrapNode(nc, nc.getModel());
          _context.getChildSetter().execute(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedNode, operationContext.getScope());
          if (this.returnSmallPart(nc)) {
            return nc;
          } else
          {
            return wrappedNode;
          }
        }

      };
      result.addAll(ModelActions.createChildSubstituteActions(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedConcept, setter, operationContext));
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_LocalVariableDeclaration_1197638405464(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode wrappedConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.Type");
      IChildNodeSetter setter = new AbstractChildNodeSetter() {

        public SNode wrapNode(SNode nodeToWrap, SModel model) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.nanoj.structure.LocalVariableDeclaration", null);
          SLinkOperations.setTarget(result, "type", nodeToWrap, true);
          return result;
        }

        public boolean returnSmallPart(SNode nodeToWrap) {
          return false;
        }

        public SNode doExecute(SNode pn, SNode oc, SNode nc, IScope sc) {
          SNode wrappedNode = this.wrapNode(nc, nc.getModel());
          _context.getChildSetter().execute(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedNode, operationContext.getScope());
          if (this.returnSmallPart(nc)) {
            return nc;
          } else
          {
            return wrappedNode;
          }
        }

      };
      result.addAll(ModelActions.createChildSubstituteActions(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedConcept, setter, operationContext));
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ParameterDeclaration_1197638405485(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode wrappedConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.Type");
      IChildNodeSetter setter = new AbstractChildNodeSetter() {

        public SNode wrapNode(SNode nodeToWrap, SModel model) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.nanoj.structure.ParameterDeclaration", null);
          SLinkOperations.setTarget(result, "type", nodeToWrap, true);
          return result;
        }

        public boolean returnSmallPart(SNode nodeToWrap) {
          return false;
        }

        public SNode doExecute(SNode pn, SNode oc, SNode nc, IScope sc) {
          SNode wrappedNode = this.wrapNode(nc, nc.getModel());
          _context.getChildSetter().execute(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedNode, operationContext.getScope());
          if (this.returnSmallPart(nc)) {
            return nc;
          } else
          {
            return wrappedNode;
          }
        }

      };
      result.addAll(ModelActions.createChildSubstituteActions(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedConcept, setter, operationContext));
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_FieldDeclaration_1197638405506(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode wrappedConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.Type");
      IChildNodeSetter setter = new AbstractChildNodeSetter() {

        public SNode wrapNode(SNode nodeToWrap, SModel model) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.nanoj.structure.FieldDeclaration", null);
          SLinkOperations.setTarget(result, "type", nodeToWrap, true);
          return result;
        }

        public boolean returnSmallPart(SNode nodeToWrap) {
          return false;
        }

        public SNode doExecute(SNode pn, SNode oc, SNode nc, IScope sc) {
          SNode wrappedNode = this.wrapNode(nc, nc.getModel());
          _context.getChildSetter().execute(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedNode, operationContext.getScope());
          if (this.returnSmallPart(nc)) {
            return nc;
          } else
          {
            return wrappedNode;
          }
        }

      };
      result.addAll(ModelActions.createChildSubstituteActions(_context.getParentNode(), _context.getCurrentTargetNode(), wrappedConcept, setter, operationContext));
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ExpressionDotOperation_1197638405562(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.ClassAccess");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1197638405527(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.DotExpression");
      result.add(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SNode dotConceptInstance = SConceptOperations.createNewNode("jetbrains.mps.nanoj.structure.DotExpression", null);
          SNodeOperations.replaceWithAnother(_context.getSourceNode(), dotConceptInstance);
          SLinkOperations.setTarget(dotConceptInstance, "leftPart", _context.getSourceNode(), true);
          return dotConceptInstance;
        }

        public String getMatchingText(String pattern) {
          return ". dot";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_ExpressionDotOperation_1197638405553(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return SNodeOperations.getParent(_context.getSourceNode());
        }

      };
      SNode node = (SNode)calc.calculate();
      result.addAll(ModelActions.createRightTransformHintSubstituteActions(node, CellSide.RIGHT, _context.getTransformationTag(), operationContext));
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1197638405577(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      final SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.BinaryExpression");
      Calculable calculable = new Calculable() {

        public Object calculate() {
          return SConceptOperations.getAllSubConcepts(SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.BinaryExpression"), _context.getModel(), operationContext.getScope());
        }

      };
      Iterable<SNode> parameterObjects = (Iterable<SNode>)calculable.calculate();
      assert parameterObjects != null;
      for(final SNode item : parameterObjects) {
        result.add(new AbstractSideTransformHintSubstituteAction(item, _context.getSourceNode()) {

          public SNode doSubstitute(String pattern) {
            SNode target = _context.getSourceNode();
            while (true) {
              if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(target), "jetbrains.mps.nanoj.structure.BinaryExpression")) {
                SNode concept = SNodeOperations.getConceptDeclaration(SNodeOperations.getParent(target));
                if (SConceptPropertyOperations.getInteger((item), "priority") < SConceptPropertyOperations.getInteger(concept, "priority")) {
                  target = SNodeOperations.getParent(target);
                } else
                {
                  break;
                }
              } else
              {
                break;
              }
            }
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName((item)), null);
            SNodeOperations.replaceWithAnother(target, result);
            SLinkOperations.setTarget(result, "leftPart", target, true);
            return result;
          }

          public SNode getOutputConcept() {
            return concept;
          }

          public String getMatchingText(String text) {
            return SConceptPropertyOperations.getString((item), "sign");
          }

          public String getVisibleMatchingText(String text) {
            return this.getMatchingText(text);
          }

          public String getDescriptionText(String text) {
            return "binary operation";
          }

        });
      }
    }
    return result;
  }

}
