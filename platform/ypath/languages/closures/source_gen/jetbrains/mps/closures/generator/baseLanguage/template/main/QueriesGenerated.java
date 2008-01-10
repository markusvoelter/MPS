package jetbrains.mps.closures.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRule_ParameterObject;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.PropertyMacro_ParameterObject;
import jetbrains.mps.closures.constraints.FunctionType_Behavior;
import jetbrains.mps.generator.JavaNameUtil;
import jetbrains.mps.generator.template.ReferenceMacro_ParameterObject;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacro_Node_ParameterObject;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacro_Nodes_ParameterObject;
import java.util.Collections;
import java.util.Comparator;
import java.text.Collator;
import java.util.Iterator;

public class QueriesGenerated {

  public static boolean createRootRule_Condition_1199624188477(final IOperationContext operationContext, final CreateRootRule_ParameterObject _parameterObject) {
    return !(SequenceOperations.isEmpty(SModelOperations.getNodes(_parameterObject.getSourceModel(), "jetbrains.mps.closures.structure.ClosureLiteral")));
  }

  public static Object propertyMacro_GetPropertyValue_1199652367054(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    String shortName = "_FunctionTypes." + FunctionType_Behavior.call_getSignature_1199633062014(_parameterObject.getNode());
    return JavaNameUtil.fqClassName(_parameterObject.getSourceModel(), shortName);
  }

  public static Object propertyMacro_GetPropertyValue_1199624292228(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return FunctionType_Behavior.call_getSignature_1199633062014(_parameterObject.getNode());
  }

  public static Object referenceMacro_GetReferent_1199624866931(final IOperationContext operationContext, final ReferenceMacro_ParameterObject _parameterObject) {
    final zClosureContext _zClosureContext = new zClosureContext();
    _zClosureContext.sig = FunctionType_Behavior.call_getSignature_1199633062014(TypeChecker.getInstance().getTypeOf(_parameterObject.getNode()));
    SNode fts = _parameterObject.getGenerator().getOutputModel().getRootByName("_FunctionTypes");
    return SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getChildren(fts), new zPredicate(null, _zClosureContext)));
  }

  public static SNode sourceNodeQuery_1199644437387(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_parameterObject.getNode(), "function", true)), "resultType", true);
  }

  public static SNode sourceNodeQuery_1199646374717(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "function", true);
  }

  public static SNode sourceNodeQuery_1199712173382(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(SNodeOperations.getAncestor(_parameterObject.getNode(), "jetbrains.mps.closures.structure.ClosureLiteral", false, false)), "resultType", true);
  }

  public static SNode sourceNodeQuery_1199712173395(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode sourceNodeQuery_1199638621010(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "resultType", true);
  }

  public static SNode sourceNodeQuery_1199624915150(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(_parameterObject.getNode()), "resultType", true);
  }

  public static SNode sourceNodeQuery_1199625045481(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "body", true);
  }

  public static List sourceNodesQuery_1199644424783(final IOperationContext operationContext, final SourceSubstituteMacro_Nodes_ParameterObject _parameterObject) {
    return SLinkOperations.getTargets(_parameterObject.getNode(), "parameter", true);
  }

  public static List sourceNodesQuery_1199712173374(final IOperationContext operationContext, final SourceSubstituteMacro_Nodes_ParameterObject _parameterObject) {
    return SLinkOperations.getTargets(_parameterObject.getNode(), "parameter", true);
  }

  public static List sourceNodesQuery_1199638584204(final IOperationContext operationContext, final SourceSubstituteMacro_Nodes_ParameterObject _parameterObject) {
    final zClosureContext1 _zClosureContext1 = new zClosureContext1();
    _zClosureContext1.idx = 1;
    return SequenceOperations.toList(SequenceOperations.select(SLinkOperations.getTargets(_parameterObject.getNode(), "parameterType", true), new zSelector(null, _zClosureContext1)));
  }

  public static List sourceNodesQuery_1199624603942(final IOperationContext operationContext, final SourceSubstituteMacro_Nodes_ParameterObject _parameterObject) {
    Iterable<SNode> clTypes = SequenceOperations.select(SModelOperations.getNodes(_parameterObject.getSourceModel(), "jetbrains.mps.closures.structure.ClosureLiteral"), new zSelector1(null, null));
    List<SNode> funTypes = SModelOperations.getNodes(_parameterObject.getSourceModel(), "jetbrains.mps.closures.structure.FunctionType");
    List<SNode> typesList = SequenceOperations.toList(SequenceOperations.union(clTypes, funTypes));
    Collections.sort(typesList, new Comparator() {

      public int compare(Object x, Object y) {
        return Collator.getInstance().compare(FunctionType_Behavior.call_getSignature_1199633062014(((SNode)x)), FunctionType_Behavior.call_getSignature_1199633062014(((SNode)y)));
      }

    });
    SNode prev = null;
    for(Iterator it = ((List)typesList).iterator() ; it.hasNext() ; ) {
      SNode next = ((SNode)it.next());
      if(Collator.getInstance().compare(FunctionType_Behavior.call_getSignature_1199633062014(((SNode)prev)), FunctionType_Behavior.call_getSignature_1199633062014(((SNode)next))) == 0) {
        it.remove();
      } else
      {
        prev = next;
      }
    }
    return typesList;
  }

  public static List sourceNodesQuery_1199624932349(final IOperationContext operationContext, final SourceSubstituteMacro_Nodes_ParameterObject _parameterObject) {
    return SLinkOperations.getTargets(_parameterObject.getNode(), "parameter", true);
  }

}
