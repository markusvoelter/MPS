package jetbrains.mps.lang.refactoring.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.behavior.CellKeyMapKeystroke_Behavior;
import jetbrains.mps.lang.findUsages.behavior.FinderDeclaration_Behavior;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.refactoring.behavior.RequiredAdditionalArgument_Behavior;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1189763354452(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "jetbrains.mps.lang.refactoring.structure.RequiredAdditionalArgumentReference");
  }

  public static boolean baseMappingRule_Condition_1189763520881(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    SNode parent = SNodeOperations.getParent(_context.getNode());
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.AssignmentExpression")) {
      return !(SLinkOperations.getTarget(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.structure.AssignmentExpression"), "lValue", true) == _context.getNode());
    }
    return true;
  }

  public static Object propertyMacro_GetPropertyValue_1189697560065(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189698210116(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189698215259(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189776889452(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189776896095(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1190733623863(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "jetbrains.mps.lang.refactoring.structure.RequiredAdditionalArgumentReference"), "argument", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1191238748328(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "userFriendlyName");
  }

  public static Object propertyMacro_GetPropertyValue_1197993525530(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "_componentCreator";
  }

  public static Object propertyMacro_GetPropertyValue_1198600574129(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "_initialValue";
  }

  public static Object propertyMacro_GetPropertyValue_1198673899511(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "My_" + SPropertyOperations.getString(_context.getNode(), "name") + "_Condition";
  }

  public static Object propertyMacro_GetPropertyValue_1199462157225(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return CellKeyMapKeystroke_Behavior.call_getKeyStroke_1213877273475(SLinkOperations.getTarget(_context.getNode(), "keystroke", true));
  }

  public static Object propertyMacro_GetPropertyValue_1199462256696(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode overriden = SLinkOperations.getTarget(_context.getNode(), "overrides", false);
    if (overriden == null) {
      return null;
    }
    return SNodeOperations.getModel(overriden).getSModelFqName() + "." + SPropertyOperations.getString(overriden, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1199466527696(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode conceptDeclaration = SLinkOperations.getTarget(_context.getNode(), "applicableConcept", false);
    if (conceptDeclaration == null) {
      return null;
    }
    return SNodeOperations.getModel(conceptDeclaration).getSModelFqName() + "." + SPropertyOperations.getString(conceptDeclaration, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1200921209509(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "updateModelClause", true) != null);
  }

  public static Object propertyMacro_GetPropertyValue_1200932997723(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "affectedNodesClause", true) != null);
  }

  public static Object propertyMacro_GetPropertyValue_1210941980901(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "refactorImmediatelyIfNoUsages");
  }

  public static Object propertyMacro_GetPropertyValue_1212245181527(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return FinderDeclaration_Behavior.call_getGeneratedClassLongName_1213877240120(SLinkOperations.getTarget(_context.getNode(), "finderDeclaration", false));
  }

  public static Object propertyMacro_GetPropertyValue_1215507182433(final IOperationContext operationContext, final PropertyMacroContext _context) {
    {
      _Patterns.Pattern_0 pattern_0 = new _Patterns.Pattern_0();
      SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(SLinkOperations.getTarget(_context.getNode(), "argumentType", true), pattern_0);
      if (coercedNode_0 != null) {
        SNode abstractConceptDeclaration = SNodeOperations.cast(pattern_0.PatternVar0, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
        return SNodeOperations.getModel(abstractConceptDeclaration).getSModelFqName() + "." + SPropertyOperations.getString(abstractConceptDeclaration, "name");
      } else
      {
      }
    }
    return null;
  }

  public static Object propertyMacro_GetPropertyValue_1215507182585(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1215507182597(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "presentation");
  }

  public static Object propertyMacro_GetPropertyValue_1217265953059(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "argument", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1238608564731(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_6630638345814759932(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode overriden = SLinkOperations.getTarget(_context.getNode(), "overrides", false);
    if (overriden == null) {
      return null;
    }
    return SNodeOperations.getModel(overriden).getSModelFqName() + "." + SPropertyOperations.getString(overriden, "name");
  }

  public static Object referenceMacro_GetReferent_1200935757745(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode classifierType = TypeChecker.getInstance().getRuntimeSupport().coerce_(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "argument", false), "argumentType", true), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true);
    return SLinkOperations.getTarget(classifierType, "classifier", false);
  }

  public static Object referenceMacro_GetReferent_1215507182386(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "componentCreator");
  }

  public static Object referenceMacro_GetReferent_1215507182539(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "initialValue");
  }

  public static Object referenceMacro_GetReferent_1215507182563(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "conditionConstructor");
  }

  public static Object referenceMacro_GetReferent_1217265352992(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode conceptFunction = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
    SNode method = SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(conceptFunction, "body", true), "methodBody").getParent().getParent().getParent(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
    return ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).first();
  }

  public static Object referenceMacro_GetReferent_6630638345814607149(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "applicableConcept", false);
  }

  public static boolean ifMacro_Condition_1190724916731(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "updateModelClause", true) != null);
  }

  public static boolean ifMacro_Condition_1190724959339(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "doRefactorClause", true) != null);
  }

  public static boolean ifMacro_Condition_1190725026904(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "isApplicableClause", true) == null);
  }

  public static boolean ifMacro_Condition_1190725064806(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "isApplicableClause", true) != null);
  }

  public static boolean ifMacro_Condition_1191592317472(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "getModelsToGenerateClause", true) != null);
  }

  public static boolean ifMacro_Condition_1191592504958(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "getModelsToGenerateClause", true) == null);
  }

  public static boolean ifMacro_Condition_1192803873886(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "filterClause", true) != null);
  }

  public static boolean ifMacro_Condition_1192803930628(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "filterClause", true) == null);
  }

  public static boolean ifMacro_Condition_1198674172362(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_1199462333157(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) == null) && (SLinkOperations.getTarget(_context.getNode(), "keystroke", true) != null);
  }

  public static boolean ifMacro_Condition_1199462335285(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) != null);
  }

  public static boolean ifMacro_Condition_1199462382860(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) == null) && (SLinkOperations.getTarget(_context.getNode(), "keystroke", true) == null);
  }

  public static boolean ifMacro_Condition_1200668711127(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "arguments", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_1200668775327(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "arguments", true)).isEmpty();
  }

  public static boolean ifMacro_Condition_1200933057671(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "affectedNodesClause", true) == null);
  }

  public static boolean ifMacro_Condition_1200933180919(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "affectedNodesClause", true) != null);
  }

  public static boolean ifMacro_Condition_1209560967976(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "isApplicableToModelClause", true) != null);
  }

  public static boolean ifMacro_Condition_1209560974488(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "isApplicableToModelClause", true) == null);
  }

  public static boolean ifMacro_Condition_1210084889430(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "refactoringTargetKind", "devkit", null);
  }

  public static boolean ifMacro_Condition_1210084897687(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "refactoringTargetKind", null, null);
  }

  public static boolean ifMacro_Condition_1210084899878(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "refactoringTargetKind", "model", null);
  }

  public static boolean ifMacro_Condition_1210084902709(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "refactoringTargetKind", "language", null);
  }

  public static boolean ifMacro_Condition_1210084904853(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "refactoringTargetKind", "solution", null);
  }

  public static boolean ifMacro_Condition_1210942147593(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "getModelsToUpdateClause", true) != null);
  }

  public static boolean ifMacro_Condition_1210942147607(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "getModelsToUpdateClause", true) == null);
  }

  public static boolean ifMacro_Condition_1212243788664(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "searchNode", true) == null;
  }

  public static boolean ifMacro_Condition_1212243800827(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "searchScope", true) == null;
  }

  public static boolean ifMacro_Condition_1213094585848(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "nodesToOpenClause", true) != null);
  }

  public static boolean ifMacro_Condition_1213100396504(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "nodesToOpenClause", true) == null);
  }

  public static boolean ifMacro_Condition_1215507182395(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true) != null);
  }

  public static boolean ifMacro_Condition_1215507182409(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(_context.getNode(), "argumentType", true), new _Quotations.QuotationClass_0().createNode());
  }

  public static boolean ifMacro_Condition_1215507182466(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(_context.getNode(), "argumentType", true), new _Quotations.QuotationClass_1().createNode());
  }

  public static boolean ifMacro_Condition_1215507182490(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(_context.getNode(), "argumentType", true), new _Quotations.QuotationClass_2().createNode());
  }

  public static boolean ifMacro_Condition_1215507182514(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(_context.getNode(), "argumentType", true), new _Quotations.QuotationClass_3().createNode());
  }

  public static boolean ifMacro_Condition_1215507182547(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "initialValue", true) != null);
  }

  public static boolean ifMacro_Condition_1215507182571(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "filterClause", true) != null);
  }

  public static boolean ifMacro_Condition_6630638345814759962(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) != null);
  }

  public static SNode sourceNodeQuery_1190724923720(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "updateModelClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1190724963405(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "doRefactorClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1190725081382(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "isApplicableClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1191592317463(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "getModelsToGenerateClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1192803833747(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "filterClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1192804088431(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1192804118336(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1197373531048(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rValue", true);
  }

  public static SNode sourceNodeQuery_1197387243573(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "newConceptFQName", true);
  }

  public static SNode sourceNodeQuery_1197387243581(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "newFeatureName", true);
  }

  public static SNode sourceNodeQuery_1197387263078(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "feature", true);
  }

  public static SNode sourceNodeQuery_1197992605929(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1197993779521(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1198577826555(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argument", true);
  }

  public static SNode sourceNodeQuery_1198600035299(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1198600088963(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "initialValue", true), "body", true);
  }

  public static SNode sourceNodeQuery_1198673965458(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1198674072178(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1198674859451(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "filterClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1198674956266(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1199623490797(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "destination", true);
  }

  public static SNode sourceNodeQuery_1199623494551(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199623608450(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "destination", true);
  }

  public static SNode sourceNodeQuery_1199623611204(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "roleInTarget", true);
  }

  public static SNode sourceNodeQuery_1199623613817(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199623733861(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199623737069(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "destination", true);
  }

  public static SNode sourceNodeQuery_1199623869841(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "destination", true);
  }

  public static SNode sourceNodeQuery_1199623873330(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199625039959(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "roleInTarget", true);
  }

  public static SNode sourceNodeQuery_1200933082201(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "affectedNodesClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1204723894467(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "feature", true);
  }

  public static SNode sourceNodeQuery_1209560967967(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "isApplicableToModelClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1210942147584(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "getModelsToUpdateClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1212243848033(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "searchNode", true);
  }

  public static SNode sourceNodeQuery_1212243880040(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "searchScope", true);
  }

  public static SNode sourceNodeQuery_1213094470425(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "nodesToOpenClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1215507182372(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static Iterable sourceNodesQuery_1189698183859(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "arguments", true);
  }

  public static Iterable sourceNodesQuery_1189698208144(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "internalArguments", true);
  }

  public static Iterable sourceNodesQuery_1197992301257(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> requiredUserEnteredArguments = SLinkOperations.getTargets(_context.getNode(), "arguments", true);
    for(SNode argument : requiredUserEnteredArguments) {
      if ((SLinkOperations.getTarget(argument, "chooseComponentClause", true) != null)) {
        ListSequence.fromList(result).addElement(argument);
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1198600029014(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> requiredUserEnteredArguments = SLinkOperations.getTargets(_context.getNode(), "arguments", true);
    for(SNode argument : requiredUserEnteredArguments) {
      if ((SLinkOperations.getTarget(argument, "initialValue", true) != null)) {
        ListSequence.fromList(result).addElement(argument);
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1198673830801(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> requiredUserEnteredArguments = SLinkOperations.getTargets(_context.getNode(), "arguments", true);
    for(SNode argument : requiredUserEnteredArguments) {
      if ((SLinkOperations.getTarget(argument, "filterClause", true) != null)) {
        ListSequence.fromList(result).addElement(argument);
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1201177824403(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    for(SNode argument : SLinkOperations.getTargets(_context.getNode(), "arguments", true)) {
      if (RequiredAdditionalArgument_Behavior.call_isTransient_1213877343864(argument)) {
        ListSequence.fromList(result).addElement(argument);
      }
    }
    for(SNode argument : SLinkOperations.getTargets(_context.getNode(), "internalArguments", true)) {
      if (RequiredAdditionalArgument_Behavior.call_isTransient_1213877343864(argument)) {
        ListSequence.fromList(result).addElement(argument);
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1212245202911(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "finders", true);
  }

  public static Iterable sourceNodesQuery_1215507182613(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "arguments", true);
  }

}
