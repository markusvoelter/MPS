package jetbrains.mps.make.script.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.IWillBeClassifier_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_4629164904928210736(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "resource", true)), new QueriesGenerated.QuotationClass_x583g4_a1a0a0a().createNode());
  }

  public static boolean baseMappingRule_Condition_4629164904928188304(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SEnumOperations.getEnumMemberValue(SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)", "Result"), "success")).equals(SPropertyOperations.getString_def(_context.getNode(), "result", "SUCCESS"));
  }

  public static Object propertyMacro_GetPropertyValue_3916013743093752790(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName(_context.getTemplateValue(), _context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_7877690107352956507(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "presentation", true), "text");
  }

  public static Object propertyMacro_GetPropertyValue_7877690107352956468(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), "name"), SNodeOperations.getParent(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_7877690107352906539(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IWillBeClassifier_Behavior.call_classifierName_4609636120081351397(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_8486446835277382806(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IWillBeClassifier_Behavior.call_classifierName_4609636120081351397(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_4629164904928210751(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.script.structure.JobDefinition", false, false), "JobDefinition_output");
  }

  public static Object referenceMacro_GetReferent_4629164904928210765(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.script.structure.JobDefinition", false, false), "JobDefinition_output");
  }

  public static Object referenceMacro_GetReferent_4629164904928210800(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.script.structure.JobDefinition", false, false), "JobDefinition_output");
  }

  public static Object referenceMacro_GetReferent_4629164904928210814(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.script.structure.JobDefinition", false, false), "JobDefinition_output");
  }

  public static Object referenceMacro_GetReferent_4629164904928188411(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.script.structure.JobDefinition", false, false), "JobDefinition_output");
  }

  public static Object referenceMacro_GetReferent_4629164904928188437(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.script.structure.JobDefinition", false, false), "JobDefinition_output");
  }

  public static Object referenceMacro_GetReferent_8853708281362198780(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(_context.getNode(), "option", false)), "jetbrains.mps.make.script.structure.ExpectedOption"), "ExpectedOption_enum");
  }

  public static Object referenceMacro_GetReferent_8853708281362199681(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "option", false), "Option_enum_const");
  }

  public static Object referenceMacro_GetReferent_8486446835277438627(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "query", false), "QueryDefinition_class"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_8486446835277438599(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "query", false), "expected", true), "jetbrains.mps.make.script.structure.ExpectedOption"), "ExpectedOption_enum");
  }

  public static Object referenceMacro_GetReferent_8486446835277407047(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "expected", true), "jetbrains.mps.make.script.structure.ExpectedOption"), "ExpectedOption_enum");
  }

  public static boolean ifMacro_Condition_3916013743093752785(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_8486446835277438612(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "query", false), "expected", true), "jetbrains.mps.make.script.structure.ExpectedOption");
  }

  public static boolean ifMacro_Condition_8486446835277407067(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "expected", true), "jetbrains.mps.make.script.structure.ExpectedOption");
  }

  public static SNode sourceNodeQuery_505095865854384140(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "job", true);
  }

  public static SNode sourceNodeQuery_4629164904928210894(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "resource", true);
  }

  public static SNode sourceNodeQuery_4629164904928210828(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "resource", true);
  }

  public static Iterable sourceNodesQuery_3916013743093752800(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_7877690107352923852(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "option", true);
  }

  public static class QuotationClass_x583g4_a1a0a0a {
    public QuotationClass_x583g4_a1a0a0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.script.structure.ResourceType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
