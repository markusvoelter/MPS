package jetbrains.mps.logging.refactoring.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRule_ParameterObject;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacro_ParameterObject;
import jetbrains.mps.bootstrap.editorLanguage.constraints.CellKeyMapKeystroke_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import java.util.ArrayList;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1189763520881(final IOperationContext operationContext, final BaseMappingRule_ParameterObject _parameterObject) {
    SNode parent = SNodeOperations.getParent(_parameterObject.getNode(), null, false, false);
    if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.AssignmentExpression")) {
      return !(SLinkOperations.getTarget(parent, "lValue", true) == _parameterObject.getNode());
    }
    return true;
  }

  public static boolean baseMappingRule_Condition_1189763354452(final IOperationContext operationContext, final BaseMappingRule_ParameterObject _parameterObject) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_parameterObject.getNode(), "lValue", true), "jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference");
  }

  public static Object propertyMacro_GetPropertyValue_1199462157225(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return CellKeyMapKeystroke_Behavior.call_getKeyStroke_1199461571140(SLinkOperations.getTarget(_parameterObject.getNode(), "keystroke", true));
  }

  public static Object propertyMacro_GetPropertyValue_1199462256696(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode overriden = SLinkOperations.getTarget(_parameterObject.getNode(), "overrides", false);
    return SNodeOperations.getModel(overriden) + "." + SPropertyOperations.getString(overriden, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1199464161444(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode conceptDeclaration = SLinkOperations.getTarget(_parameterObject.getNode(), "applicableConcept", false);
    return SNodeOperations.getModel(conceptDeclaration) + "." + SPropertyOperations.getString(conceptDeclaration, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1199464123907(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode overriden = SLinkOperations.getTarget(_parameterObject.getNode(), "overrides", false);
    return SNodeOperations.getModel(overriden) + "." + SPropertyOperations.getString(overriden, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1198673899511(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return "My_" + SPropertyOperations.getString(_parameterObject.getNode(), "name") + "_Condition";
  }

  public static Object propertyMacro_GetPropertyValue_1189698210116(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189776889452(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189698215259(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189776896095(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1191238748328(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "userFriendlyName");
  }

  public static Object propertyMacro_GetPropertyValue_1191238835892(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SNodeOperations.getModel(_parameterObject.getNode()).toString() + "#" + _parameterObject.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1199466527696(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode conceptDeclaration = SLinkOperations.getTarget(_parameterObject.getNode(), "applicableConcept", false);
    return SNodeOperations.getModel(conceptDeclaration) + "." + SPropertyOperations.getString(conceptDeclaration, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1199468168869(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode overriden = SLinkOperations.getTarget(_parameterObject.getNode(), "overrides", false);
    return SNodeOperations.getModel(overriden) + "." + SPropertyOperations.getString(overriden, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1197993525530(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name") + "_componentCreator";
  }

  public static Object propertyMacro_GetPropertyValue_1198600574129(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name") + "_initialValue";
  }

  public static Object propertyMacro_GetPropertyValue_1197994374982(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1197995256221(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "presentation");
  }

  public static Object propertyMacro_GetPropertyValue_1197995260130(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1197995518443(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "presentation");
  }

  public static Object propertyMacro_GetPropertyValue_1197995534452(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1197995546008(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    {
      Pattern_ pattern_1199960776568 = new Pattern_();
      SNode coercedNode_1199960776567 = TypeChecker.getInstance().getRuntimeSupport().coerce(SLinkOperations.getTarget(_parameterObject.getNode(), "argumentType", true), pattern_1199960776568);
      if(coercedNode_1199960776567 != null) {
        SNode abstractConceptDeclaration = (SNode)pattern_1199960776568.PatternVar;
        return SNodeOperations.getModel(abstractConceptDeclaration).toString() + "." + SPropertyOperations.getString(abstractConceptDeclaration, "name");
      }
    }
    return null;
  }

  public static Object propertyMacro_GetPropertyValue_1197995918045(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "presentation");
  }

  public static Object propertyMacro_GetPropertyValue_1197995918053(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1198681826059(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "presentation");
  }

  public static Object propertyMacro_GetPropertyValue_1198681826082(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189697560065(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1190733623863(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "lValue", true), "argument", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1198175268210(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_parameterObject.getNode(), "argument", false), "name");
  }

  public static Object referenceMacro_GetReferent_1197996022708(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "componentCreator");
  }

  public static Object referenceMacro_GetReferent_1198600564705(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "initialValue");
  }

  public static Object referenceMacro_GetReferent_1198674119034(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "conditionConstructor");
  }

  public static Object referenceMacro_GetReferent_1189764427569(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode conceptFunction = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
    SNode method = (SNode)generator.findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(conceptFunction, "body", true), "methodBody").getParent().getParent().getParent();
    return ListOperations.getElement(SLinkOperations.getTargets(method, "parameter", true), 1);
  }

  public static Object referenceMacro_GetReferent_1198175268220(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode conceptFunction = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
    SNode method = (SNode)generator.findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(conceptFunction, "body", true), "methodBody").getParent().getParent().getParent();
    return ListOperations.getElement(SLinkOperations.getTargets(method, "parameter", true), 1);
  }

  public static boolean ifMacro_Condition_1199462382860(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "overrides", false) == null) && (SLinkOperations.getTarget(node, "keystroke", true) == null);
  }

  public static boolean ifMacro_Condition_1199462333157(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "overrides", false) == null) && (SLinkOperations.getTarget(node, "keystroke", true) != null);
  }

  public static boolean ifMacro_Condition_1199462335285(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "overrides", false) != null);
  }

  public static boolean ifMacro_Condition_1199464602796(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "overrides", false) == null);
  }

  public static boolean ifMacro_Condition_1199464637201(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "overrides", false) != null);
  }

  public static boolean ifMacro_Condition_1198674172362(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return true;
  }

  public static boolean ifMacro_Condition_1199467946000(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "overrides", false) == null);
  }

  public static boolean ifMacro_Condition_1199468168888(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "overrides", false) != null);
  }

  public static boolean ifMacro_Condition_1190725064806(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "isApplicableClause", true) != null);
  }

  public static boolean ifMacro_Condition_1190725026904(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "isApplicableClause", true) == null);
  }

  public static boolean ifMacro_Condition_1190724959339(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "doRefactorClause", true) != null);
  }

  public static boolean ifMacro_Condition_1191592317472(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "getModelsToGenerateClause", true) != null);
  }

  public static boolean ifMacro_Condition_1191592504958(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "getModelsToGenerateClause", true) == null);
  }

  public static boolean ifMacro_Condition_1190724916731(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "updateModelClause", true) != null);
  }

  public static boolean ifMacro_Condition_1197994957884(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "chooseComponentClause", true) != null);
  }

  public static boolean ifMacro_Condition_1197995119274(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(node, "argumentType", true), new QuotationClass_().createNode());
  }

  public static boolean ifMacro_Condition_1197995457201(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(node, "argumentType", true), new QuotationClass_1().createNode());
  }

  public static boolean ifMacro_Condition_1197995925126(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(node, "argumentType", true), new QuotationClass_2().createNode());
  }

  public static boolean ifMacro_Condition_1198681835123(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(node, "argumentType", true), new QuotationClass_3().createNode());
  }

  public static boolean ifMacro_Condition_1198600531754(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "initialValue", true) != null);
  }

  public static boolean ifMacro_Condition_1198674102459(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "filterClause", true) != null);
  }

  public static boolean ifMacro_Condition_1192803873886(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "filterClause", true) != null);
  }

  public static boolean ifMacro_Condition_1192803930628(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "filterClause", true) == null);
  }

  public static List sourceNodesQuery_1198673830801(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> requiredUserEnteredArguments = SLinkOperations.getTargets(node, "arguments", true);
    for(SNode argument : requiredUserEnteredArguments) {
      if((SLinkOperations.getTarget(argument, "filterClause", true) != null)) {
        ListOperations.addElement(result, argument);
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1189698183859(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "arguments", true);
  }

  public static List sourceNodesQuery_1189698208144(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "internalArguments", true);
  }

  public static List sourceNodesQuery_1197992301257(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> requiredUserEnteredArguments = SLinkOperations.getTargets(node, "arguments", true);
    for(SNode argument : requiredUserEnteredArguments) {
      if((SLinkOperations.getTarget(argument, "chooseComponentClause", true) != null)) {
        ListOperations.addElement(result, argument);
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1198600029014(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> requiredUserEnteredArguments = SLinkOperations.getTargets(node, "arguments", true);
    for(SNode argument : requiredUserEnteredArguments) {
      if((SLinkOperations.getTarget(argument, "initialValue", true) != null)) {
        ListOperations.addElement(result, argument);
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1197986353964(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "arguments", true);
  }

  public static SNode sourceNodeQuery_1198673965458(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1198674072178(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1198674859451(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "filterClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1198674956266(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1190725081382(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "isApplicableClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1190724963405(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "doRefactorClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1191592317463(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "getModelsToGenerateClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1190724923720(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "updateModelClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1197993779521(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1197992605929(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "chooseComponentClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1198600035299(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1198600088963(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "initialValue", true), "body", true);
  }

  public static SNode sourceNodeQuery_1197991695093(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1197994329816(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1197373531048(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "rValue", true);
  }

  public static SNode sourceNodeQuery_1198175268252(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "argument", false), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1192804088431(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1192804118336(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1192803833747(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "filterClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1197387263078(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "feature", true);
  }

  public static SNode sourceNodeQuery_1197387243573(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "newConceptFQName", true);
  }

  public static SNode sourceNodeQuery_1197387243581(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "newFeatureName", true);
  }

  public static SNode sourceNodeQuery_1198577826555(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argument", true);
  }

  public static SNode sourceNodeQuery_1199623494551(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199623490797(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "destination", true);
  }

  public static SNode sourceNodeQuery_1199623613817(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199623611204(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "roleInTarget", true);
  }

  public static SNode sourceNodeQuery_1199623608450(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "destination", true);
  }

  public static SNode sourceNodeQuery_1199623733861(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199623737069(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "destination", true);
  }

  public static SNode sourceNodeQuery_1199623873330(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199625039959(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "roleInTarget", true);
  }

  public static SNode sourceNodeQuery_1199623869841(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "destination", true);
  }

}
