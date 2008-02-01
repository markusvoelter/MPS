package webr.xml.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import webr.xmlSchema.constraints.ElementDeclaration_Behavior;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.DefaultSimpleSubstituteAction;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import webr.xmlSchema.constraints.TypeExpression_Behavior;
import jetbrains.mps.smodel.action.RemoveSubstituteActionByConditionContext;
import java.util.Iterator;
import jetbrains.mps.util.Condition;

public class QueriesGenerated {

  public static void nodeFactory_NodeSetup_ComplexText_1178622222481(final IOperationContext operationContext, final NodeSetupContext _context) {
    if(SNodeOperations.isInstanceOf(_context.getSampleNode(), "webr.xml.structure.BaseText")) {
      SLinkOperations.addChild(_context.getNewNode(), "text", _context.getSampleNode());
    }
  }

  public static void nodeFactory_NodeSetup_ContentList_1178622500723(final IOperationContext operationContext, final NodeSetupContext _context) {
    if(SNodeOperations.isInstanceOf(_context.getSampleNode(), "webr.xml.structure.Content")) {
      SLinkOperations.addChild(_context.getNewNode(), "content", _context.getSampleNode());
    }
  }

  public static void nodeFactory_NodeSetup_Element_1188911043247(final IOperationContext operationContext, final NodeSetupContext _context) {
    if(SNodeOperations.isInstanceOf(_context.getSampleNode(), "webr.xml.structure.Content")) {
      SLinkOperations.addChild(SLinkOperations.getTarget(_context.getNewNode(), "contentList", true), "content", _context.getSampleNode());
    }
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_BaseAttribute_1167699332639(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("webr.xml.structure.Attribute", operationContext.getScope());
      SNode childConcept = (SNode)_context.getChildConcept();
      if(SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName((SNode)concept.getNode()))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            List<SNode> attributeDeclarations = new ArrayList<SNode>();
            SNode parentElementDeclaration = ElementUtil.getParentElementDeclaration(_context.getParentNode(), operationContext.getScope());
            if((parentElementDeclaration != null)) {
              ListOperations.addAllElements(attributeDeclarations, ElementDeclaration_Behavior.call_getAttributeDeclarations_1183587644932(parentElementDeclaration));
            }
            return attributeDeclarations;
          }

        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        assert queryResult != null;
        for(SNode item : queryResult) {
          result.add(new DefaultChildNodeSubstituteAction(item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

            public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
              SNode attribute = SModelOperations.createNewNode(model, "webr.xml.structure.Attribute", _context.getCurrentTargetNode());
              SLinkOperations.setTarget(attribute, "attributeDeclaration", ((SNode)this.getParameterObject()), false);
              SLinkOperations.setNewChild(attribute, "value", "webr.xml.structure.Text");
              return attribute;
            }

            public String getMatchingText(String pattern) {
              return SPropertyOperations.getString(((SNode)this.getParameterObject()), "attributeName");
            }

          });
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Content_1201903366642(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("webr.xml.structure.Text", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode text = SConceptOperations.createNewNode("webr.xml.structure.Text", _context.getCurrentTargetNode());
          if(!(pattern.isEmpty())) {
            SPropertyOperations.set(text, "text", pattern.substring(1));
          }
          return text;
        }

        public boolean hasSubstitute() {
          return true;
        }

        public boolean canSubstitute_internal(String pattern) {
          return pattern.startsWith("/") || pattern.isEmpty();
        }

        public String getDescriptionText(String pattern) {
          return SConceptPropertyOperations.getString(SConceptOperations.findConceptDeclaration("webr.xml.structure.Text"), "short_description");
        }

        public String getMatchingText(String pattern) {
          return (pattern.isEmpty() ?
            "/text" :
            pattern
          );
        }

      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Content_1167757687265(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    final SNode parentElement;
    final boolean isMixed;
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return ElementUtil.getParentElementDeclaration(_context.getParentNode(), operationContext.getScope());
        }

      };
      parentElement = (SNode)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return (parentElement == null) || TypeExpression_Behavior.call_isMixed_1183649029971(parentElement);
        }

      };
      isMixed = (Boolean)calc.calculate();
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("webr.xml.structure.Element", operationContext.getScope());
      SNode childConcept = (SNode)_context.getChildConcept();
      if(SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName((SNode)concept.getNode()))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return ElementUtil.getElementDeclarations(parentElement, _context.getParentNode(), operationContext.getScope());
          }

        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        assert queryResult != null;
        for(SNode item : queryResult) {
          result.add(new DefaultChildNodeSubstituteAction(item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

            public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
              SNode element = SModelOperations.createNewNode(model, "webr.xml.structure.Element", _context.getCurrentTargetNode());
              SLinkOperations.setTarget(element, "elementDeclaration", ((SNode)this.getParameterObject()), false);
              SPropertyOperations.set(element, "isEmpty", "" + (ElementDeclaration_Behavior.call_isEmpty_1183642787202(((SNode)this.getParameterObject()))));
              return element;
            }

            public String getMatchingText(String pattern) {
              return "<" + SPropertyOperations.getString(((SNode)this.getParameterObject()), "elementName");
            }

          });
        }
      }
    }
    return result;
  }

  public static void removeActionsByCondition_1177863610304(final IOperationContext operationContext, final RemoveSubstituteActionByConditionContext _context) {
    final SNode parentElement;
    final boolean isMixed;
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return ElementUtil.getParentElementDeclaration(_context.getParentNode(), operationContext.getScope());
        }

      };
      parentElement = (SNode)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return (parentElement == null) || TypeExpression_Behavior.call_isMixed_1183649029971(parentElement);
        }

      };
      isMixed = (Boolean)calc.calculate();
    }
    Iterator<INodeSubstituteAction> actions = _context.getActions();
    while(actions.hasNext()) {
      INodeSubstituteAction current = actions.next();
      if(!(current.getParameterObject() instanceof SNode)) {
        continue;
      }
      final SNode concept = (SNode)current.getParameterObject();
      Condition cond = new Condition() {

        public boolean met(Object object) {
          return SConceptOperations.isExactly(_context.getChildConcept(), "webr.xml.structure.Content") && SConceptOperations.isAssignableFrom(SConceptOperations.findConceptDeclaration("webr.xml.structure.BaseText"), concept) && !(isMixed);
        }

      };
      if(cond.met(null)) {
        actions.remove();
      }
    }
  }

}
