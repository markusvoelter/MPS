package jetbrains.mps.runConfigurations.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.runConfigurations.behavior.RunConfiguration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.runConfigurations.behavior.RunConfigurationType_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNode;

public class QueriesGenerated {
  public static boolean createRootRule_Condition_7525857397534029038(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.runConfigurations.structure.RunConfigurationType")).isNotEmpty();
  }

  public static Object propertyMacro_GetPropertyValue_3754890006475666591(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return RunConfiguration_Behavior.call_getGeneratedClassName_3754890006475666596(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_7024026323278183387(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7024026323278183396(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_3754890006475720275(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return RunConfigurationType_Behavior.call_getGeneratedClassName_3754890006475720280(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_3754890006475707276(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return RunConfiguration_Behavior.call_getGeneratedClassName_3754890006475666596(SLinkOperations.getTarget(_context.getNode(), "runConfiguration", false)) + "_RunProfileState";
  }

  public static Object propertyMacro_GetPropertyValue_3754890006475823075(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return RunConfiguration_Behavior.call_getGeneratedClassName_3754890006475666596(_context.getNode()) + "_Editor";
  }

  public static Object propertyMacro_GetPropertyValue_7460665385311866838(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return RunConfiguration_Behavior.call_getGeneratedClassName_3754890006475666596(_context.getNode()) + "_Factory";
  }

  public static Object propertyMacro_GetPropertyValue_4064954644153047831(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_7460665385311866802(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToFactoryClass");
  }

  public static Object referenceMacro_GetReferent_8750596094204760158(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToEditorClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_3754890006475717601(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(RunConfiguration_Behavior.call_getExecutor_3754890006475713427(_context.getNode()), "ExecutorToClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_7024026323278238793(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToFactoryClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_3754890006475713383(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "runConfiguration", false), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_3754890006475713406(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "runConfiguration", false), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_3754890006475838084(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_3754890006475838097(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_3754890006475838106(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass");
  }

  public static Object referenceMacro_GetReferent_7460665385311866859(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "configurationType", false), "TypeToClass");
  }

  public static Object referenceMacro_GetReferent_7460665385311866816(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ConfigurationToClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_7525857397534005738(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "TypeToClass"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_7525857397534005828(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "TypeToClass");
  }

  public static Iterable sourceNodesQuery_7024026323278238803(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(SNodeOperations.getModel(_context.getNode()), "jetbrains.mps.runConfigurations.structure.RunConfiguration")).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SLinkOperations.getTarget(it, "configurationType", false) == _context.getNode();
      }
    });
  }

  public static Iterable sourceNodesQuery_8750596094204799295(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "editor", true), "contents", true);
  }

  public static Iterable sourceNodesQuery_7525857397534005720(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.runConfigurations.structure.RunConfigurationType");
  }

  public static Iterable sourceNodesQuery_7525857397534005811(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.runConfigurations.structure.RunConfigurationType");
  }
}
