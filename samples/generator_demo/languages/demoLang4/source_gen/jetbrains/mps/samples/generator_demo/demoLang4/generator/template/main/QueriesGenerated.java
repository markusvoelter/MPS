package jetbrains.mps.samples.generator_demo.demoLang4.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1228678752684(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name").equals("button");
  }

  public static boolean baseMappingRule_Condition_1228678752716(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name").equals("label");
  }

  public static boolean baseMappingRule_Condition_1228679746328(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name").equals("panel");
  }

  public static Object propertyMacro_GetPropertyValue_1228678752604(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value").equals("true");
  }

  public static Object propertyMacro_GetPropertyValue_1228678752743(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("text");
      }
    }), "value");
  }

  public static Object propertyMacro_GetPropertyValue_1228678752793(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName(_context.getTemplateValue(), null);
  }

  public static Object propertyMacro_GetPropertyValue_1228678752860(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("text");
      }
    }), "value");
  }

  public static Object propertyMacro_GetPropertyValue_1228678752910(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName(_context.getTemplateValue(), null);
  }

  public static Object propertyMacro_GetPropertyValue_1228679651679(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName(_context.getTemplateValue(), null);
  }

  public static Object referenceMacro_GetReferent_1228678752646(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value");
  }

  public static Object referenceMacro_GetReferent_1228680490546(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "factory_method");
  }

  public static boolean ifMacro_Condition_1228678752765(final IOperationContext operationContext, final IfMacroContext _context) {
    return (ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("text");
      }
    }) != null);
  }

  public static boolean ifMacro_Condition_1228678752882(final IOperationContext operationContext, final IfMacroContext _context) {
    return (ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("text");
      }
    }) != null);
  }

  public static SNode sourceNodeQuery_1228680307376(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rootElement", true);
  }

  public static SNode sourceNodeQuery_1228678752614(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("enabled");
      }
    });
  }

  public static SNode sourceNodeQuery_1228678752653(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("background");
      }
    });
  }

  public static SNode sourceNodeQuery_1228681296807(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static Iterable sourceNodesQuery_1228680239721(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.sampleXML.structure.Document");
  }

  public static Iterable sourceNodesQuery_1228681296814(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "content", true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1228678752678(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByMappingLabel("main_class");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1228678752695(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByMappingLabel("main_class");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1228679746322(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByMappingLabel("main_class");
  }
}
