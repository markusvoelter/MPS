package jetbrains.mps.ui.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.ui.modeling.behavior.UIObject_Behavior;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueriesGenerated {
  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_5776545240965874273(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(_context.getSourceNode()), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.ui.structure.UIObjectType"), true) != null);
  }

  public static void nodeFactory_NodeSetup_ValidateBlock_5224413709453691752(final IOperationContext operationContext, final NodeSetupContext _context) {
    SNode fpd = SConceptOperations.createNewNode("jetbrains.mps.ui.structure.FunctionParameterDeclaration", null);
    SPropertyOperations.set(fpd, "name", "newValue");
    SLinkOperations.addChild(_context.getNewNode(), "parameter", fpd);
  }

  public static void nodeFactory_NodeSetup_EventHandingBlock_5224413709454317395(final IOperationContext operationContext, final NodeSetupContext _context) {
    SNode fpd = SConceptOperations.createNewNode("jetbrains.mps.ui.structure.FunctionParameterDeclaration", null);
    SPropertyOperations.set(fpd, "name", "event");
    SLinkOperations.addChild(_context.getNewNode(), "parameter", fpd);
  }

  public static void nodeFactory_NodeSetup_UIObjectStatement_1576918603589068320(final IOperationContext operationContext, final NodeSetupContext _context) {
    if ((_context.getSampleNode() != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "viewBinding", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode vb) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "viewBinding", true)).addElement(SNodeOperations.detachNode(vb));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "controllerBinding", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode cb) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "controllerBinding", true)).addElement(SNodeOperations.detachNode(cb));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "compartment", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode cm) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "compartment", true)).addElement(SNodeOperations.detachNode(cm));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "aspect", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode as) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "aspect", true)).addElement(SNodeOperations.detachNode(as));
        }
      });
      SLinkOperations.setTarget(_context.getNewNode(), "uiObject", SLinkOperations.getTarget(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "uiObject", false), false);
    }
  }

  public static void nodeFactory_NodeSetup_CreateUIObjectStatement_6261739386029037453(final IOperationContext operationContext, final NodeSetupContext _context) {
    if ((_context.getSampleNode() != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "viewBinding", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode vb) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "viewBinding", true)).addElement(SNodeOperations.detachNode(vb));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "controllerBinding", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode cb) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "controllerBinding", true)).addElement(SNodeOperations.detachNode(cb));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "compartment", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode cm) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "compartment", true)).addElement(SNodeOperations.detachNode(cm));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "aspect", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode as) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "aspect", true)).addElement(SNodeOperations.detachNode(as));
        }
      });
      SLinkOperations.setTarget(_context.getNewNode(), "uiObject", SLinkOperations.getTarget(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "uiObject", false), false);
    }
  }

  public static void nodeFactory_NodeSetup_AppendUIObjectStatement_1576918603589090122(final IOperationContext operationContext, final NodeSetupContext _context) {
    if ((_context.getSampleNode() != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "viewBinding", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode vb) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "viewBinding", true)).addElement(SNodeOperations.detachNode(vb));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "controllerBinding", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode cb) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "controllerBinding", true)).addElement(SNodeOperations.detachNode(cb));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "compartment", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode cm) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "compartment", true)).addElement(SNodeOperations.detachNode(cm));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "aspect", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode as) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "aspect", true)).addElement(SNodeOperations.detachNode(as));
        }
      });
      SLinkOperations.setTarget(_context.getNewNode(), "uiObject", SLinkOperations.getTarget(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "uiObject", false), false);
    }
  }

  public static void nodeFactory_NodeSetup_InsertUIObjectStatement_3091159734392475680(final IOperationContext operationContext, final NodeSetupContext _context) {
    if ((_context.getSampleNode() != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "viewBinding", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode vb) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "viewBinding", true)).addElement(SNodeOperations.detachNode(vb));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "controllerBinding", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode cb) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "controllerBinding", true)).addElement(SNodeOperations.detachNode(cb));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "compartment", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode cm) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "compartment", true)).addElement(SNodeOperations.detachNode(cm));
        }
      });
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "aspect", true)).toListSequence().visitAll(new IVisitor<SNode>() {
        public void visit(SNode as) {
          ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "aspect", true)).addElement(SNodeOperations.detachNode(as));
        }
      });
      SLinkOperations.setTarget(_context.getNewNode(), "uiObject", SLinkOperations.getTarget(SNodeOperations.as(_context.getSampleNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "uiObject", false), false);
    }
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_8381258131358549267(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    final List<SNode> availableObjects;
    {
      Calculable calc = new Calculable() {
        public Object calculate() {
          final SNode ctx = SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.ui.structure.UIObjectStatement", "jetbrains.mps.baseLanguage.structure.IStatementListContainer"}, true, false);
          if (SNodeOperations.isInstanceOf(ctx, "jetbrains.mps.ui.structure.UIObjectStatement")) {
            return ListSequence.fromList(SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.ui.modeling.structure.UIObject")).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode uio) {
                return !(SPropertyOperations.getBoolean(uio, "abstract")) && ((UIObject_Behavior.call_actuallyBelongsTo_1719339442171687163(uio) == null) || Sequence.fromIterable(UIObject_Behavior.call_allExtends_8115675450774407592(SLinkOperations.getTarget(SNodeOperations.as(ctx, "jetbrains.mps.ui.structure.UIObjectStatement"), "uiObject", false))).contains(UIObject_Behavior.call_actuallyBelongsTo_1719339442171687163(uio)));
              }
            }).toListSequence();
          } else {
            return ListSequence.fromList(SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.ui.modeling.structure.UIObject")).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode uio) {
                return !(SPropertyOperations.getBoolean(uio, "abstract"));
              }
            }).toListSequence();
          }
        }
      };
      availableObjects = (List<SNode>) calc.calculate();
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.structure.CreateUIObjectStatement");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return availableObjects;
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode uios = SConceptOperations.createNewNode("jetbrains.mps.ui.structure.CreateUIObjectStatement", null);
                SLinkOperations.setTarget(uios, "uiObject", (item), false);
                return uios;
              }

              public String getMatchingText(String pattern) {
                return SConceptPropertyOperations.getString(SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.structure.CreateUIObjectStatement"), "alias") + " " + SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.structure.AppendUIObjectStatement");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return availableObjects;
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode auios = SConceptOperations.createNewNode("jetbrains.mps.ui.structure.AppendUIObjectStatement", null);
                SLinkOperations.setTarget(auios, "uiObject", (item), false);
                return auios;
              }

              public String getMatchingText(String pattern) {
                return SConceptPropertyOperations.getString(SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.structure.AppendUIObjectStatement"), "alias") + " " + SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.structure.InsertUIObjectStatement");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return availableObjects;
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode iuios = SConceptOperations.createNewNode("jetbrains.mps.ui.structure.InsertUIObjectStatement", null);
                SLinkOperations.setTarget(iuios, "uiObject", (item), false);
                return iuios;
              }

              public String getMatchingText(String pattern) {
                return SConceptPropertyOperations.getString(SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.structure.InsertUIObjectStatement"), "alias") + "... " + SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_5776545240965874272(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      final SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.structure.CompartmentReferenceExpression");
      Calculable calculable = new Calculable() {
        public Object calculate() {
          return Sequence.fromIterable(UIObject_Behavior.call_allExtends_8115675450774407592(SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(_context.getSourceNode()), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.ui.structure.UIObjectType"), true), "uiObject", false))).translate(new ITranslator2<SNode, SNode>() {
            public Iterable<SNode> translate(SNode o) {
              return SLinkOperations.getTargets(o, "compartment", true);
            }
          }).toListSequence();
        }
      };
      Iterable<SNode> parameterObjects = (Iterable<SNode>) calculable.calculate();
      assert parameterObjects != null;
      for (final SNode item : parameterObjects) {
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(item, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            return SNodeOperations.replaceWithAnother(_context.getSourceNode(), new QueriesGenerated.QuotationClass_x583g4_a0a0a0a0a0a0a0e0a0b0i().createNode(_context.getSourceNode(), (item)));
          }

          public SNode getOutputConcept() {
            return concept;
          }

          public String getMatchingText(String text) {
            return "/" + SPropertyOperations.getString((item), "name");
          }

          public String getVisibleMatchingText(String text) {
            return this.getMatchingText(text);
          }
        });
      }
    }
    return result;
  }

  public static class QuotationClass_x583g4_a0a0a0a0a0a0a0e0a0b0i {
    public QuotationClass_x583g4_a0a0a0a0a0a0a0e0a0b0i() {
    }

    public SNode createNode(Object parameter_5, Object parameter_6) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.CompartmentReferenceExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("container", (SNode) parameter_6);
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("uiObject", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
