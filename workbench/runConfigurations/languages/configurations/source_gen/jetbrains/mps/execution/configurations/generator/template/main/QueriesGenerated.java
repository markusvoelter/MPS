package jetbrains.mps.execution.configurations.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.execution.common.behavior.IGeneratedToClass_Behavior;
import jetbrains.mps.execution.configurations.behavior.RunConfigurationExecutor_Behavior;
import jetbrains.mps.util.NodeNameUtil;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.execution.configurations.behavior.RunConfiguration_Behavior;
import jetbrains.mps.execution.settings.behavior.PersistentPropertyDeclaration_Behavior;
import jetbrains.mps.execution.settings.behavior.PersistentConfiguration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.execution.configurations.behavior.ConfigurationFromExecutorReference_Behavior;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.execution.configurations.behavior.ComplexRunConfigurationExecutor_Behavior;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;

public class QueriesGenerated {
  public static boolean createRootRule_Condition_7525857397534029038(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.execution.configurations.structure.RunConfigurationKind")).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_5812151570929690797(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.execution.configurations.structure.RunConfiguration", false, false) != null);
  }

  public static boolean baseMappingRule_Condition_5812151570929690817(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.execution.configurations.structure.ExecuteConfiguration_Function", false, false) != null);
  }

  public static boolean baseMappingRule_Condition_7244675116808105168(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getContainingRoot(_context.getNode()), "jetbrains.mps.execution.configurations.structure.RunConfiguration") || SNodeOperations.isInstanceOf(SNodeOperations.getContainingRoot(_context.getNode()), "jetbrains.mps.execution.configurations.structure.RunConfigurationKind");
  }

  public static Object propertyMacro_GetPropertyValue_7024026323278183387(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7024026323278183396(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_3754890006475720275(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IGeneratedToClass_Behavior.call_getGeneratedClassName_946964771156905488(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_7806358006983618075(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return RunConfigurationExecutor_Behavior.call_getCanExecuteMethodName_7806358006983616236(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_7806358006983709820(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "configurationName");
  }

  public static Object propertyMacro_GetPropertyValue_3754890006475707276(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IGeneratedToClass_Behavior.call_getGeneratedClassName_946964771156905488(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_7460665385311866838(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IGeneratedToClass_Behavior.call_getGeneratedClassName_946964771156905488(_context.getNode()) + "_Factory";
  }

  public static Object propertyMacro_GetPropertyValue_4064954644153047831(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7806358006983619352(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NodeNameUtil.getNamespace(INamedConcept_Behavior.call_getFqName_1213877404258(RunConfiguration_Behavior.call_getExecutor_3754890006475713427(_context.getNode()))) + "." + IGeneratedToClass_Behavior.call_getGeneratedClassName_946964771156905488(RunConfiguration_Behavior.call_getExecutor_3754890006475713427(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_7806358006983619390(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return RunConfigurationExecutor_Behavior.call_getCanExecuteMethodName_7806358006983616236(RunConfiguration_Behavior.call_getExecutor_3754890006475713427(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_7684700299064368377(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return PersistentPropertyDeclaration_Behavior.call_getTypeEditorFqName_946964771156066917(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_7684700299064368403(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return PersistentPropertyDeclaration_Behavior.removeMyPrefix_946964771156066836(SPropertyOperations.getString(_context.getNode(), "name"));
  }

  public static Object propertyMacro_GetPropertyValue_7684700299064368420(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return PersistentConfiguration_Behavior.call_getGeneratedEditorName_946964771156066479(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_4042467058397505479(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IGeneratedToClass_Behavior.call_getFullName_946964771156905503(SLinkOperations.getTarget(_context.getNode(), "configurationKind", false));
  }

  public static Object propertyMacro_GetPropertyValue_4042467058397509259(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IGeneratedToClass_Behavior.call_getFullName_946964771156905503(SLinkOperations.getTarget(_context.getNode(), "configurationKind", false));
  }

  public static Object propertyMacro_GetPropertyValue_7244675116808105226(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String fullPath = SPropertyOperations.getString(_context.getNode(), "path");
    return fullPath.substring(fullPath.lastIndexOf("/") + 1);
  }

  public static Object referenceMacro_GetReferent_7024026323278238793(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToFactoryClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_7244675116808105346(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "icon", true), "IconResourceToIconField");
  }

  public static Object referenceMacro_GetReferent_3754890006475713383(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "configuration", false), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_3754890006475713406(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "configuration", false), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_7460665385311866859(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "configurationKind", false), "KindToClass");
  }

  public static Object referenceMacro_GetReferent_7460665385311866816(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_666608846720191882(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToFactoryClass");
  }

  public static Object referenceMacro_GetReferent_666608846720191990(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(RunConfiguration_Behavior.call_getExecutor_3754890006475713427(_context.getNode()), "ExecutorToClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_1735048880741920085(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_1735048880741931626(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_143080135592837973(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_143080135592820140(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_143080135592858654(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToEditorClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_6139196002333142831(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "PersistentPropertyToField");
  }

  public static Object referenceMacro_GetReferent_1754312393816976168(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "icon", true), "IconResourceToIconField");
  }

  public static Object referenceMacro_GetReferent_3257967158569773573(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "PersitentTemplatePropertyToEditorParameter");
  }

  public static Object referenceMacro_GetReferent_3257967158569773543(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "PersitentTemplatePropertyToEditorFieldDeclaration");
  }

  public static Object referenceMacro_GetReferent_5812151570929690853(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.cast(SNodeOperations.getContainingRoot(_context.getNode()), "jetbrains.mps.execution.configurations.structure.RunConfigurationExecutor"), "ExecutorToConfigurationField");
  }

  public static Object referenceMacro_GetReferent_7806358006983771923(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(ConfigurationFromExecutorReference_Behavior.call_getExecutor_7806358006983757897(_context.getNode()), "ExecutorToConfigurationField");
  }

  public static Object referenceMacro_GetReferent_3945544195318608478(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "KindToClass");
  }

  public static Object referenceMacro_GetReferent_3945544195318608463(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "KindToClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_4042467058397509269(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToFactoryClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_8147019390234496484(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode configurationType = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(_context.getNode()), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.execution.settings.structure.PersistentConfigurationType"), true);
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(configurationType, "persistentConfiguration", false), "ConfigurationToClass");
  }

  public static boolean ifMacro_Condition_7806358006983617849(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "canRun");
  }

  public static boolean ifMacro_Condition_7806358006983617866(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "debuggerConfiguration", true) != null);
  }

  public static boolean ifMacro_Condition_2363787617167802334(final IOperationContext operationContext, final IfMacroContext _context) {
    return ComplexRunConfigurationExecutor_Behavior.call_isDebuggable_442015021861764808(_context.getNode());
  }

  public static boolean ifMacro_Condition_4371737370140155778(final IOperationContext operationContext, final IfMacroContext _context) {
    return ComplexRunConfigurationExecutor_Behavior.call_isDebuggable_442015021861764808(_context.getNode());
  }

  public static boolean ifMacro_Condition_1754312393816976127(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "icon", true) != null) && StringUtils.isNotEmpty(SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "icon", true), "path"));
  }

  public static boolean ifMacro_Condition_7244675116808166482(final IOperationContext operationContext, final IfMacroContext _context) {
    return StringUtils.isNotEmpty(SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "icon", true), "path"));
  }

  public static boolean ifMacro_Condition_4042467058397505421(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.execution.configurations.structure.RunConfiguration")).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return RunConfiguration_Behavior.call_isForeign_4042467058397504911(it);
      }
    }).isNotEmpty();
  }

  public static boolean ifMacro_Condition_7244675116808105247(final IOperationContext operationContext, final IfMacroContext _context) {
    return StringUtils.isNotEmpty(SPropertyOperations.getString(_context.getNode(), "path"));
  }

  public static SNode sourceNodeQuery_7244675116808105286(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "icon", true);
  }

  public static SNode sourceNodeQuery_2363787617167837005(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "debuggerConfiguration", true);
  }

  public static SNode sourceNodeQuery_7244675116808166467(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "icon", true);
  }

  public static SNode sourceNodeQuery_4762811064051426913(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "process", true);
  }

  public static Iterable sourceNodesQuery_7024026323278238803(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(SNodeOperations.getModel(_context.getNode()), "jetbrains.mps.execution.configurations.structure.RunConfiguration")).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SLinkOperations.getTarget(it, "configurationKind", false) == _context.getNode();
      }
    });
  }

  public static Iterable sourceNodesQuery_5812151570929671916(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "execute", true), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_6139196002333142804(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "persistentProperty", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return PersistentPropertyDeclaration_Behavior.call_isTemplate_946964771156066860(it);
      }
    });
  }

  public static Iterable sourceNodesQuery_7684700299064368359(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return PersistentConfiguration_Behavior.call_getTemplateProperties_946964771156066510(_context.getNode());
  }

  public static Iterable sourceNodesQuery_3257967158569773517(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return PersistentConfiguration_Behavior.call_getTemplateProperties_946964771156066510(_context.getNode());
  }

  public static Iterable sourceNodesQuery_3945544195318608418(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.execution.configurations.structure.RunConfigurationKind");
  }

  public static Iterable sourceNodesQuery_4042467058397505459(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.execution.configurations.structure.RunConfiguration")).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return RunConfiguration_Behavior.call_isForeign_4042467058397504911(it);
      }
    });
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_666608846720189931(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_666608846720191914(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_666608846720246034(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1754312393816976185(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_7684700299064340036(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToEditorClass");
  }
}
