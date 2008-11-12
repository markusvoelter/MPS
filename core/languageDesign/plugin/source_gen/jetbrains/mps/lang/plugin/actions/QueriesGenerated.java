package jetbrains.mps.lang.plugin.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

import java.util.List;

import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;

import java.util.ArrayList;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.behavior.ClassConcept_Behavior;
import jetbrains.mps.smodel.action.RemoveSubstituteActionByConditionContext;

import java.util.Iterator;

import jetbrains.mps.util.Condition;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_Type_1217414480519(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.lang.plugin.structure.ActionParameterDeclaration", true, false) != null;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Type_1217414463812(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ActionParameter_1218807115883(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionParameter");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return ListSequence.<SNode>fromArray(new _Quotations.QuotationClass_0().createNode(), new _Quotations.QuotationClass_1().createNode(), new _Quotations.QuotationClass_2().createNode());
          }

        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            result.add(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.plugin.structure.ActionParameterDeclaration", null);
                SLinkOperations.setTarget(result, "type", (item), true);
                return result;
              }

              public String getDescriptionText(String pattern) {
                if (SNodeOperations.isInstanceOf((item), "jetbrains.mps.lang.smodel.structure.SNodeType")) {
                  return "current node";
                } else if (SNodeOperations.isInstanceOf((item), "jetbrains.mps.lang.smodel.structure.SNodeListType")) {
                  return "current nodes";
                } else if (SNodeOperations.isInstanceOf((item), "jetbrains.mps.lang.smodel.structure.SModelType")) {
                  return "current model";
                }
                return "";
              }

            });
          }
        }
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionParameter");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return SLinkOperations.getTargets(SLinkOperations.getTarget(new _Quotations.QuotationClass_3().createNode(), "classifier", false), "staticField", true);
          }

        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            result.add(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.plugin.structure.ActionDataParameterDeclaration", null);
                SLinkOperations.setTarget(result, "key", (item), false);
                return result;
              }

              public String getDescriptionText(String pattern) {
                SNode annotation = ListSequence.fromList(SLinkOperations.getTargets((item), "annotation", true)).where(new IWhereFilter<SNode>() {

                  public boolean accept(SNode it) {
                    return SPropertyOperations.getString(SLinkOperations.getTarget(it, "annotation", false), "name").equals(SPropertyOperations.getString(SLinkOperations.getTarget(new _Quotations.QuotationClass_4().createNode(), "classifier", false), "name"));
                  }

                }).first();
                if (annotation == null) {
                  return "";
                }
                SNode value = ListSequence.fromList(SLinkOperations.getTargets(annotation, "value", true)).where(new IWhereFilter<SNode>() {

                  public boolean accept(SNode it) {
                    return SPropertyOperations.getString(SLinkOperations.getTarget(it, "key", false), "name").equals("description");
                  }

                }).first();
                if (value == null) {
                  return "";
                }
                return SPropertyOperations.getString(SLinkOperations.getTarget(value, "value", true), "value");
              }

            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ActionGroupMember_1218809043213(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.Separator");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.ExtentionPoint");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionReference");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return SModelOperations.getRootsIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.lang.plugin.structure.ActionDeclaration");
          }

        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            result.add(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.plugin.structure.ActionReference", null);
                SLinkOperations.setTarget(result, "action", (item), false);
                return result;
              }

            });
          }
        }
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.ParameterizedActionCreator");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            List<SNode> correntNodes = new ArrayList<SNode>();
            for (SNode classNode : Sequence.fromIterable(SModelOperations.getRootsIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
              if (ClassConcept_Behavior.call_isDescendant_1213877355812(classNode, SLinkOperations.getTarget(new _Quotations.QuotationClass_5().createNode(), "classifier", false))) {
                ListSequence.fromList(correntNodes).addSequence(ListSequence.fromList(SLinkOperations.getTargets(classNode, "constructor", true)));
              }
            }
            return correntNodes;
          }

        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            result.add(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.plugin.structure.ParameterizedActionCreator", null);
                SLinkOperations.setTarget(result, "constructorDeclaration", (item), false);
                return result;
              }

            });
          }
        }
      }
    }
    return result;
  }

  public static void removeActionsByCondition_1217414474266(final IOperationContext operationContext, final RemoveSubstituteActionByConditionContext _context) {
    Iterator<INodeSubstituteAction> actions = _context.getActions();
    while (actions.hasNext()) {
      INodeSubstituteAction current = actions.next();
      final SNode concept = current.getOutputConcept();
      SNode applicableConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Type");
      Condition cond = new Condition() {

        public boolean met(Object object) {
          boolean isNode = SConceptOperations.isExactly(concept, "jetbrains.mps.lang.smodel.structure.SNodeType");
          boolean isNList = SConceptOperations.isExactly(concept, "jetbrains.mps.lang.smodel.structure.SNodeListType");
          boolean isModel = SConceptOperations.isExactly(concept, "jetbrains.mps.lang.smodel.structure.SModelType");
          return !(isNode || isNList || isModel);
        }

      };
      if (SConceptOperations.isSuperConceptOf(applicableConcept, NameUtil.nodeFQName(concept)) && cond.met(concept)) {
        actions.remove();
      }
    }
  }

}
