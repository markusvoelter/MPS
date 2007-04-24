package jetbrains.mps.baseLanguage.actions;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.BaseLanguageSearchUtil_new;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.baseLanguage.structure.ArrayType;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.types.BaseLanguageTypesUtil_new;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.*;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.generator.JavaModelUtil_new;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.action.*;
import jetbrains.mps.smodel.presentation.NodePresentationUtil;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.util.Calculable;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_1177400765736(SNode parentNode, IScope scope, IOperationContext operationContext) {
    SNode parent = SNodeOperations.getAncestorWhereConceptInList(parentNode, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractLoopStatement","jetbrains.mps.baseLanguage.structure.Closure"}, false, false);
    if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement")) {
      return true;
    }
    parent = SNodeOperations.getAncestorWhereConceptInList(parentNode, new String[]{"jetbrains.mps.baseLanguage.structure.SwitchStatement"}, false, false);
    if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.SwitchStatement")) {
      return true;
    }
    return false;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1158965431412(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    ClassifierType ct = BaseLanguageTypesUtil_new.tryObtain_ClassifierType(((Expression)SNodeOperations.getAdapter(sourceNode)));
    return ct != null;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1173186369008(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    TypeChecker typeChecker = operationContext.getComponent(TypeChecker.class);
    return BaseAdapter.fromNode(typeChecker.getTypeOf(sourceNode)) instanceof ArrayType;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1173186583931(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    TypeChecker typeChecker = operationContext.getComponent(TypeChecker.class);
    return BaseAdapter.fromNode(typeChecker.getTypeOf(sourceNode)) instanceof ArrayType;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_VariableDeclaration_1158969943216(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    if(SLinkOperations.getTarget(sourceNode, "initializer", true) != null) {
      return false;
    }
    if(SNodeOperations.isInstanceOf(sourceNode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") || SNodeOperations.isInstanceOf(sourceNode, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) {
      return true;
    }
    if(SNodeOperations.isInstanceOf(sourceNode, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration")) {
      SNode parent = SNodeOperations.getParent(sourceNode, null, false, false);
      if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement") || SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.ForStatement")) {
        return true;
      }
    }
    return false;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_ClassifierType_1158972050511(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getCount(sourceNode, "parameter") == 0;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_GenericDeclaration_1159200256287(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getCount(sourceNode, "typeVariableDeclaration") == 0;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_NewExpression_1159200493867(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getCount(sourceNode, "typeParameter") == 0;
  }
  public static void nodeFactory_NodeSetup_InstanceMethodDeclaration_1158793299786(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    SLinkOperations.setNewChild(newNode, "returnType", "jetbrains.mps.baseLanguage.structure.VoidType");
  }
  public static void nodeFactory_NodeSetup_BinaryOperation_1158797366355(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.BinaryOperation")) {
      SLinkOperations.setTarget(newNode, "leftExpression", SLinkOperations.getTarget(sampleNode, "leftExpression", true), true);
      SLinkOperations.setTarget(newNode, "rightExpression", SLinkOperations.getTarget(sampleNode, "rightExpression", true), true);
    }
  }
  public static void nodeFactory_NodeSetup_ParenthesizedExpression_1158857529259(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.Expression")) {
      SLinkOperations.setTarget(newNode, "expression", SNodeOperations.copyNode(sampleNode), true);
    }
  }
  public static void nodeFactory_NodeSetup_CastExpression_1158871408598(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.Expression")) {
      SLinkOperations.setTarget(newNode, "expression", SNodeOperations.copyNode(sampleNode), true);
      SNode castType = CastExpression_FactoryUtil.computeCastType(sampleNode);
      SLinkOperations.setTarget(newNode, "type", castType, true);
    }
  }
  public static void nodeFactory_NodeSetup_ReturnStatement_1158938591702(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
      SLinkOperations.setTarget(newNode, "expression", SNodeOperations.copyNode(SLinkOperations.getTarget(sampleNode, "expression", true)), true);
    }
  }
  public static void nodeFactory_NodeSetup_NotExpression_1159218040861(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.Expression")) {
      SLinkOperations.setTarget(newNode, "expression", SNodeOperations.copyNode(sampleNode), true);
    }
  }
  public static void nodeFactory_NodeSetup_SuperConstructorInvocation_1175861783127(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    SNode cls = SNodeOperations.getAncestor(enclosingNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    SNode extendedClass = JavaModelUtil_new.findClassifier(Object.class).getNode();
    if(SLinkOperations.getTarget(SLinkOperations.getTarget(cls, "superclass", true), "classifier", false) != null) {
      extendedClass = SLinkOperations.getTarget(SLinkOperations.getTarget(cls, "superclass", true), "classifier", false);
    }
    {
      ICursor<SNode> _zCursor = CursorFactory.createCursor(SLinkOperations.getTargets(extendedClass, "constructor", true));
      try {
        while(_zCursor.moveToNext()) {
          SNode constructor = _zCursor.getCurrent();
          if(SequenceOperations.isEmpty(SLinkOperations.getTargets(constructor, "parameter", true))) {
            SLinkOperations.setTarget(newNode, "constructorDeclaration", constructor, false);
            return;
          }
        }
      } finally {
        _zCursor.release();
      }
    }
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1177334764520(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode boolConst = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.IntegerConstant");
          SPropertyOperations.set(boolConst, "value", "" + (Integer.parseInt(pattern)));
          return boolConst;
        }
        public boolean hasSubstitute() {
          return true;
        }
        public boolean canSubstitute_internal(String pattern) {
          {
            Pattern _pattern_0 = Pattern.compile("(?:\\d)+", 0);
            Matcher _matcher_0 = _pattern_0.matcher(pattern);
            if(_matcher_0.matches()) {
              return true;
            }
          }
          return false;
        }
      });
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode integerConst = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.BooleanConstant");
          SPropertyOperations.set(integerConst, "value", "" + (true));
          return integerConst;
        }
        public String getMatchingText(String pattern) {
          return "true";
        }
      });
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode boolConst = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.BooleanConstant");
          SPropertyOperations.set(boolConst, "value", "" + (false));
          return boolConst;
        }
        public String getMatchingText(String pattern) {
          return "false";
        }
      });
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.FloatingPointConstant", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode boolConst = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.FloatingPointConstant");
          SPropertyOperations.set(boolConst, "value", pattern);
          return boolConst;
        }
        public boolean hasSubstitute() {
          return true;
        }
        public boolean canSubstitute_internal(String pattern) {
          {
            Pattern _pattern_0 = Pattern.compile("(?:(?:(?:-)?))(?:(?:(?:\\d)+)(?:(?:\\.)(?:(?:\\d)*)))", 0);
            Matcher _matcher_0 = _pattern_0.matcher(pattern);
            if(_matcher_0.matches()) {
              return true;
            }
          }
          return false;
        }
      });
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1177361135564(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReference", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          SNode classConcept = SNodeOperations.getAncestor(parentNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
          List<SNode> result = ListOperations.createList(new SNode[]{});
          List<SNode> alreadyVisited = ListOperations.createList(new SNode[]{});
          while(classConcept != null && !(SequenceOperations.contains(alreadyVisited, classConcept))) {
            ListOperations.addAllElements(result, SLinkOperations.getTargets(classConcept, "field", true));
            ListOperations.addElement(alreadyVisited, classConcept);
            classConcept = SLinkOperations.getTarget(SLinkOperations.getTarget(classConcept, "superclass", true), "classifier", false);
          }
          return result;
        }
      };
      List<SNode> queryResult = (List)calc.calculate();
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode ref = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.FieldReference");
            SLinkOperations.setTarget(ref, "variableDeclaration", ((SNode)this.getParameterObject()), false);
            SLinkOperations.setTarget(ref, "instance", SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ThisExpression"), true);
            return ref;
          }
        });
      }
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1177362994569(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCall", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          SNode classConcept = SNodeOperations.getAncestor(parentNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
          List<SNode> result = ListOperations.createList(new SNode[]{});
          List<SNode> alreadyVisited = ListOperations.createList(new SNode[]{});
          while(classConcept != null && !(SequenceOperations.contains(alreadyVisited, classConcept))) {
            ListOperations.addAllElements(result, SLinkOperations.getTargets(classConcept, "method", true));
            ListOperations.addElement(alreadyVisited, classConcept);
            classConcept = SLinkOperations.getTarget(SLinkOperations.getTarget(classConcept, "superclass", true), "classifier", false);
          }
          return result;
        }
      };
      List<SNode> queryResult = (List)calc.calculate();
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode call = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.InstanceMethodCall");
            SLinkOperations.setTarget(call, "instance", SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ThisExpression"), true);
            SLinkOperations.setTarget(call, "baseMethodDeclaration", ((SNode)this.getParameterObject()), false);
            return call;
          }
        });
      }
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1177396179719(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          ISearchScope searchScope = BaseLanguageSearchUtil_new.createVisibleClassifiersScope(SNodeOperations.getModel(parentNode), IClassifiersSearchScope.CLASSIFFIER, operationContext.getScope());
          List<SNode> classifiers = new ArrayList<SNode>();
          for(SNode node : searchScope.getNodes()) {
            if(!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Classifier"))) {
              continue;
            }
            SNode cls = node;
            if(SequenceOperations.getSize(SLinkOperations.getTargets(cls, "staticField", true)) > 0) {
              ListOperations.addElement(classifiers, cls);
              continue;
            }
            if(SNodeOperations.isInstanceOf(cls, "jetbrains.mps.baseLanguage.structure.ClassConcept") && SequenceOperations.getSize(SLinkOperations.getTargets(cls, "staticMethod", true)) > 0) {
              ListOperations.addElement(classifiers, cls);
              continue;
            }
            if(SNodeOperations.isInstanceOf(cls, "jetbrains.mps.baseLanguage.structure.EnumClass") && SequenceOperations.getSize(SLinkOperations.getTargets(cls, "enumConstant", true)) > 0) {
              ListOperations.addElement(classifiers, cls);
              continue;
            }
          }
          return classifiers;
        }
      };
      List<SNode> queryResult = (List)calc.calculate();
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.StaticFieldReference");
            SLinkOperations.setTarget(result, "classifier", ((SNode)this.getParameterObject()), false);
            return result;
          }
          public String getMatchingText(String pattern) {
            return SPropertyOperations.getString(((SNode)this.getParameterObject()), "name") + ".";
          }
          public String getDescriptionText(String pattern) {
            return NodePresentationUtil.descriptionText(((SNode)this.getParameterObject())) + " static access";
          }
        });
      }
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1177397791368(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          SNode parentFunction = SNodeOperations.getAncestor(parentNode, "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
          List<SNode> result = new ArrayList<SNode>();
          if(parentFunction == null) {
            return result;
          }
          ListOperations.addAllElements(result, parentFunction.getConceptLinkTargets("conceptFunctionParameter", true, operationContext.getScope()));
          ListOperations.addAllElements(result, parentFunction.getConceptLinkTargets("applicableConceptFunctionParameter", true, operationContext.getScope()));
          return result;
        }
      };
      List queryResult = (List)calc.calculate();
      for(Object item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()));
      }
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1177400765735(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Statement", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          List<SNode> concepts = new ArrayList<SNode>();
          ListOperations.addElement(concepts, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BreakStatement"));
          ListOperations.addElement(concepts, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ContinueStatement"));
          return concepts;
        }
      };
      List queryResult = (List)calc.calculate();
      for(Object item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()));
      }
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1177403614729(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", operationContext.getScope());
      ConceptDeclaration wrappedConcept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression", operationContext.getScope());
      IChildNodeSetter setter = new AbstractChildNodeSetter() {

        public SNode wrapNode(SNode nodeToWrap, SModel model) {
          SNode result = SModelOperations.createNewNode(SNodeOperations.getModel(nodeToWrap), "jetbrains.mps.baseLanguage.structure.ExpressionStatement");
          SLinkOperations.setTarget(result, "expression", nodeToWrap, true);
          return result;
        }
        public void doExecute(SNode pn, SNode oc, SNode nc, IScope sc) {
          childSetter.execute(parentNode, currentTargetNode, this.wrapNode(nc, nc.getModel()), operationContext.getScope());
        }
      };
      result.addAll(ModelActions.createChildSubstituteActions(parentNode, currentTargetNode, wrappedConcept, setter, operationContext));
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1177406371457(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", operationContext.getScope());
      ConceptDeclaration wrappedConcept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Type", operationContext.getScope());
      IChildNodeSetter setter = new AbstractChildNodeSetter() {

        public SNode wrapNode(SNode nodeToWrap, SModel model) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement");
          SNode var = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
          SLinkOperations.setTarget(var, "type", nodeToWrap, true);
          SLinkOperations.setTarget(result, "localVariableDeclaration", var, true);
          return result;
        }
        public void doExecute(SNode pn, SNode oc, SNode nc, IScope sc) {
          childSetter.execute(parentNode, currentTargetNode, this.wrapNode(nc, nc.getModel()), operationContext.getScope());
        }
      };
      result.addAll(ModelActions.createChildSubstituteActions(parentNode, currentTargetNode, wrappedConcept, setter, operationContext));
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1177406968279(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", operationContext.getScope());
      ConceptDeclaration wrappedConcept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", operationContext.getScope());
      IChildNodeSetter setter = new AbstractChildNodeSetter() {

        public SNode wrapNode(SNode nodeToWrap, SModel model) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement");
          SLinkOperations.setTarget(result, "localVariableDeclaration", nodeToWrap, true);
          return result;
        }
        public void doExecute(SNode pn, SNode oc, SNode nc, IScope sc) {
          childSetter.execute(parentNode, currentTargetNode, this.wrapNode(nc, nc.getModel()), operationContext.getScope());
        }
      };
      result.addAll(ModelActions.createChildSubstituteActions(parentNode, currentTargetNode, wrappedConcept, setter, operationContext));
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ParameterDeclaration_1177408380007(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", operationContext.getScope());
      ConceptDeclaration wrappedConcept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Type", operationContext.getScope());
      IChildNodeSetter setter = new AbstractChildNodeSetter() {

        public SNode wrapNode(SNode nodeToWrap, SModel model) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration");
          SLinkOperations.setTarget(result, "type", nodeToWrap, true);
          return result;
        }
        public void doExecute(SNode pn, SNode oc, SNode nc, IScope sc) {
          childSetter.execute(parentNode, currentTargetNode, this.wrapNode(nc, nc.getModel()), operationContext.getScope());
        }
      };
      result.addAll(ModelActions.createChildSubstituteActions(parentNode, currentTargetNode, wrappedConcept, setter, operationContext));
    }
    return result;
  }
}
