package jetbrains.mps.baseLanguage.ext.collections.lang.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.action.IChildNodeSetter;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.action.DefaultSimpleSubstituteAction;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_1160672994889(SNode parentNode, IScope scope, IOperationContext operationContext) {
    SNode block = SNodeOperations.getAncestorWhereConceptInList(parentNode, new String[]{"jetbrains.mps.baseLanguage.ext.collections.lang.structure.ValueSupplierBlock","jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapperBlock","jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachBlock","jetbrains.mps.baseLanguage.ext.collections.lang.structure.SortBlock"}, false, false);
    return block != null;
  }
  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_1178286539824(SNode parentNode, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SortOperation");
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1161719130431(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    SNode type = TypeChecker.getInstance().getTypeOf(sourceNode);
    SNode sequenceType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType"), false);
    return (sequenceType != null);
  }
  public static void nodeFactory_NodeSetup_DefaultInputElement_1174261447073(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    SPropertyOperations.set(newNode, "name", "it");
  }
  public static void nodeFactory_NodeSetup_SortOperation_1178286959323(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    SPropertyOperations.set(SLinkOperations.setNewChild(newNode, "order", "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SortDirection"), "value", "" + (true));
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1152144005896(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Statement", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          boolean yieldAllowed = false;
          boolean stopAllowed = false;
          boolean skipAllowed = false;
          SNode parentClosure = SNodeOperations.getAncestor(parentNode, "jetbrains.mps.baseLanguage.structure.Closure", false, false);
          if(SNodeOperations.isInstanceOf(parentClosure, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ValueSupplierBlock")) {
            yieldAllowed = true;
            stopAllowed = true;
          }
          if(SNodeOperations.isInstanceOf(parentClosure, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapperBlock")) {
            yieldAllowed = true;
            stopAllowed = true;
            skipAllowed = true;
          }
          if(SNodeOperations.isInstanceOf(parentClosure, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachBlock")) {
            stopAllowed = true;
            skipAllowed = true;
          }
          List<SNode> concepts = new ArrayList<SNode>();
          if(yieldAllowed) {
            concepts.add(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.TraversalYieldStatement"));
          }
          if(stopAllowed) {
            concepts.add(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.TraversalStopStatement"));
          }
          if(skipAllowed) {
            concepts.add(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.TraversalSkipStatement"));
          }
          return concepts;
        }
      };
      Iterable queryResult = (Iterable)calc.calculate();
      for(Object item : queryResult) {
        List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions((ConceptDeclaration)BaseAdapter.fromNode((SNode)item), parentNode, currentTargetNode, childSetter, operationContext.getScope());
        result.addAll(defaultActions);
      }
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1178286508713(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SortDirection", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode direction = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SortDirection", currentTargetNode);
          SPropertyOperations.set(direction, "value", "" + (true));
          return direction;
        }
        public String getDescriptionText(String pattern) {
          return "Sort in ascending order";
        }
        public String getMatchingText(String pattern) {
          return "asc";
        }
      });
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SortDirection", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode direction = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SortDirection", currentTargetNode);
          SPropertyOperations.set(direction, "value", "" + (false));
          return direction;
        }
        public String getDescriptionText(String pattern) {
          return "Sort in descending order";
        }
        public String getMatchingText(String pattern) {
          return "desc";
        }
      });
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SequenceOperation_1160663024951(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    return result;
  }
  public static boolean removeConceptByCondition_1177414262137(SNode concept, SNode parentNode, SNode currentChild, SNode childConcept, IOperationContext operationContext) {
    boolean applicableToSequence = false;
    boolean applicableToList = false;
    if(SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression")) {
      SNode leftExpression = SLinkOperations.getTarget(parentNode, "leftExpression", true);
      SNode leftType = TypeChecker.getInstance().getTypeOf(leftExpression);
      if(TypeChecker.getInstance().getRuntimeSupport().coerce(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType"), false) != null) {
        applicableToSequence = true;
      }
      if(TypeChecker.getInstance().getRuntimeSupport().coerce(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType"), false) != null) {
        applicableToList = true;
      }
    }
    if(!(applicableToSequence)) {
      return true;
    }
    if(applicableToList) {
      return false;
    }
    return SConceptOperations.isSubConceptOf(concept, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.AbstractListOperation");
  }
}
