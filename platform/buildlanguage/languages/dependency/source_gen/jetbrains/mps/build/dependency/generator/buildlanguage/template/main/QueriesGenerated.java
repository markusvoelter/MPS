package jetbrains.mps.build.dependency.generator.buildlanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_1219773202905(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1216910654589(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + ".classes";
  }

  public static Object propertyMacro_GetPropertyValue_1216907163430(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + ".src";
  }

  public static Object propertyMacro_GetPropertyValue_1216908261231(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + ".classpaths";
  }

  public static Object propertyMacro_GetPropertyValue_1216908364134(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "compile." + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1216906986545(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7857794759872021243(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "basedir");
  }

  public static Object propertyMacro_GetPropertyValue_1219772533883(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "path").replace("\\", "/");
  }

  public static Object propertyMacro_GetPropertyValue_1219772582497(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "path").replace("\\", "/");
  }

  public static Object referenceMacro_GetReferent_1217528713106(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CyclesToTargets");
  }

  public static Object referenceMacro_GetReferent_763186553349438290(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "moduleDescription", true)).first(), "ModuleToClassesProperty");
  }

  public static Object referenceMacro_GetReferent_763186553349590557(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ModuleToClassesProperty");
  }

  public static Object referenceMacro_GetReferent_1216908641562(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CyclesToClasspaths");
  }

  public static Object referenceMacro_GetReferent_1216908738117(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CyclesToSourcePaths");
  }

  public static Object referenceMacro_GetReferent_763186553349438310(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.dependency.structure.Cycle", false, false), "CyclesToClasspaths");
  }

  public static Object referenceMacro_GetReferent_763186553349438390(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ModuleToClassesProperty");
  }

  public static Object referenceMacro_GetReferent_2397028098139205289(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.build.dependency.structure.ModuleDescription"), "ModuleToClassesProperty");
  }

  public static Object referenceMacro_GetReferent_1216913346656(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "cycle", false), "CyclesToTargets");
  }

  public static Object referenceMacro_GetReferent_1235489624447(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ModuleToClassesProperty");
  }

  public static Object referenceMacro_GetReferent_1219772509208(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "macro", false), "MacroToExternalProperty");
  }

  public static Object referenceMacro_GetReferent_1224775901838(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "description", false), "DescriptionToProject");
  }

  public static boolean ifMacro_Condition_7857794759871997503(final IOperationContext operationContext, final IfMacroContext _context) {
    return StringUtils.isNotEmpty(SPropertyOperations.getString(_context.getNode(), "basedir"));
  }

  public static boolean ifMacro_Condition_1219772493889(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "macro", false) != null);
  }

  public static SNode sourceNodeQuery_3791907277386824349(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "classes", true);
  }

  public static SNode sourceNodeQuery_1219772645177(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1219772677482(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1219772732042(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1219772811030(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1219772868989(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_763186553349438419(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_2397028098139226672(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static Iterable sourceNodesQuery_1219773202898(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "macro", true);
  }

  public static Iterable sourceNodesQuery_1216910640246(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.dependency.structure.ModuleDescription", false, new String[]{})).sort(new ISelector<SNode, Comparable<?>>() {
      public Comparable<?> select(SNode it) {
        return SPropertyOperations.getString(it, "name");
      }
    }, true);
  }

  public static Iterable sourceNodesQuery_1218716231753(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "commonClasspath", true);
  }

  public static Iterable sourceNodesQuery_1216907170433(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "cycle", true);
  }

  public static Iterable sourceNodesQuery_1216908116516(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "moduleDescription", true);
  }

  public static Iterable sourceNodesQuery_1216908217084(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "sources", true);
  }

  public static Iterable sourceNodesQuery_1216908261240(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "cycle", true);
  }

  public static Iterable sourceNodesQuery_1216908261258(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "moduleDescription", true);
  }

  public static Iterable sourceNodesQuery_1216908261265(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "classpath", true);
  }

  public static Iterable sourceNodesQuery_1218648827660(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "classpath", true);
  }

  public static Iterable sourceNodesQuery_1217528708608(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "cycle", true);
  }

  public static Iterable sourceNodesQuery_1218639224324(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "moduleDescription", true);
  }

  public static Iterable sourceNodesQuery_1218639231742(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "sources", true);
  }

  public static Iterable sourceNodesQuery_763186553349590539(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "moduleDescription", true);
  }

  public static Iterable sourceNodesQuery_763186553349438424(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "sources", true);
  }

  public static Iterable sourceNodesQuery_763186553349438320(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "moduleDescription", true);
  }

  public static Iterable sourceNodesQuery_2397028098139205280(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "moduleDescription", true);
  }

  public static Iterable sourceNodesQuery_2397028098139205304(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "sources", true);
  }

  public static Iterable sourceNodesQuery_1216908353399(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "cycle", true);
  }

  public static Iterable sourceNodesQuery_1216913286054(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "dependency", true);
  }

  public static Iterable sourceNodesQuery_1235489482146(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "cycle", true);
  }

  public static Iterable sourceNodesQuery_1235489497642(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "moduleDescription", true);
  }
}
