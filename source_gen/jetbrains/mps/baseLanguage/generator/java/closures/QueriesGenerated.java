package jetbrains.mps.baseLanguage.generator.java.closures;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.VariableDeclaration;
import java.util.List;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1170282608160(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return ClosuresUtil.hasVariablesUsedInClosure(node, generator);
  }
  public static boolean baseMappingRule_Condition_1170282061477(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    if(!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Closure"))) {
      return ClosuresUtil.hasVariablesUsedInClosure(node, generator);
    }
    return false;
  }
  public static boolean baseMappingRule_Condition_1170198286262(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode parent = SNodeOperations.getParent(node, null, false, false);
    if(ClosuresUtil.isClosureContextOwner(parent)) {
      return ClosuresUtil.hasVariablesUsedInClosure(parent, generator);
    }
    return false;
  }
  public static boolean baseMappingRule_Condition_1170198485461(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getParent(node, "jetbrains.mps.baseLanguage.structure.Closure", false, false) != null;
  }
  public static boolean baseMappingRule_Condition_1170198665539(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode var = SLinkOperations.getTarget(node, "variableDeclaration", false);
    SNode contextOwner = ClosuresUtil.findEnclosingClosureContextOwner(var);
    if(contextOwner != null) {
      return ClosuresUtil.isVariableUsedInClosure(contextOwner, (VariableDeclaration)var, generator);
    }
    return false;
  }
  public static boolean baseMappingRule_Condition_1170198858690(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode var = SLinkOperations.getTarget(node, "variableDeclaration", false);
    SNode contextOwner = ClosuresUtil.findEnclosingClosureContextOwner(var);
    if(contextOwner != null) {
      return ClosuresUtil.isVariableUsedInClosure(contextOwner, (VariableDeclaration)var, generator);
    }
    return false;
  }
  public static boolean baseMappingRule_Condition_1170199119856(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode var = SLinkOperations.getTarget(node, "localVariableDeclaration", true);
    if(SLinkOperations.getTarget(var, "initializer", true) != null) {
      SNode enclosingMethod = SNodeOperations.getParent(var, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
      if(enclosingMethod != null) {
        return ClosuresUtil.isVariableUsedInClosure(enclosingMethod, (VariableDeclaration)var, generator);
      }
    }
    return false;
  }
  public static String propertyMacro_GetPropertyValue_1170347597854(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.getString_VariableDeclaration_nameInClosureContext(node, generator);
  }
  public static String propertyMacro_GetPropertyValue_1170707207731(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zClosureContext");
  }
  public static String propertyMacro_GetPropertyValue_1170707554571(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("_zClosureContext");
  }
  public static SNode referenceMacro_GetReferent_1170294467354(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.find_ContextOwner_ClosureContext_generatedClass(node, generator);
  }
  public static SNode referenceMacro_GetReferent_1170295650824(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.resolve_MethodParm_CopyOfParm(node, templateNode, generator);
  }
  public static SNode referenceMacro_GetReferent_1170295049904(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.find_ContextOwner_ClosureContext_generatedClass_constructor(node, generator);
  }
  public static SNode referenceMacro_GetReferent_1170288297219(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.find_EnclosingContextOwner_ClosureContext_generatedClass(node, generator);
  }
  public static SNode referenceMacro_GetReferent_1170287949033(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.find_EnclosingContextOwner_ClosureContext_generatedClass(node, generator);
  }
  public static SNode referenceMacro_GetReferent_1170350646244(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.resolve_VariableReference_Variable_ClosureContext_generatedField(node, generator);
  }
  public static SNode referenceMacro_GetReferent_1170348563863(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.resolve_VariableDeclStmt_Variable_ClosureContext_generatedField(node, generator);
  }
  public static SNode referenceMacro_GetReferent_1170288676089(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.find_Closure_generatedClosureAdapter_constructor(node, generator);
  }
  public static SNode referenceMacro_GetReferent_1170293907670(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.resolve_ClosureParameterReference(node, templateNode, generator);
  }
  public static List sourceNodesQuery_1170347787985(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List list = _QueriesUtil.getList_ContextOwner_ifMethod_ParmsUsedInClosure(node, generator);
    return (List<SNode>)list;
  }
  public static List sourceNodesQuery_1170347696338(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List list = _QueriesUtil.getList_ContextOwner_ifMethod_ParmsUsedInClosure(node, generator);
    return (List<SNode>)list;
  }
  public static List sourceNodesQuery_1170347169279(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List list = _QueriesUtil.getList_ContextOwner_VariablesUsedInClosure(node, generator);
    return (List<SNode>)list;
  }
  public static List sourceNodesQuery_1170295259476(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> list = _QueriesUtil.getList_ContextOwner_ifMethod_ParmsUsedInClosure(node, generator);
    return (List<SNode>)list;
  }
  public static List sourceNodesQuery_1170294170225(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "statement", true);
  }
  public static SNode sourceNodeQuery_1170347410888(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1170294125679(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getParent(node, null, false, false);
  }
  public static SNode sourceNodeQuery_1170348623270(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "localVariableDeclaration", true), "initializer", true);
  }
}
