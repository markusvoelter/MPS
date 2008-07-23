package jetbrains.mps.ide.uiLanguage.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.classifiers.behavior.ThisClassifierExpresson_Behavior;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.uiLanguage.constraints.DialogUtil;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.uiLanguage.behavior.ComponentDeclaration_Behavior;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.MappingScriptContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1203594167922(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "root", true), "jetbrains.mps.ide.uiLanguage.structure.IDEDialog");
  }

  public static boolean baseMappingRule_Condition_1203594226944(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "root", true), "jetbrains.mps.ide.uiLanguage.structure.IDEDialog");
  }

  public static boolean baseMappingRule_Condition_1203594239097(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "root", true), "jetbrains.mps.ide.uiLanguage.structure.IDEDialog");
  }

  public static boolean baseMappingRule_Condition_1203595929964(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "component", false), "root", true), "jetbrains.mps.ide.uiLanguage.structure.IDEDialog");
  }

  public static boolean baseMappingRule_Condition_1203599879180(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    // todo find a better way to express this
    return ThisClassifierExpresson_Behavior.call_getClassifier_1213877512819(_context.getNode()) == null;
  }

  public static Object propertyMacro_GetPropertyValue_1203593674593(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "ContentPane";
  }

  public static Object propertyMacro_GetPropertyValue_1203596505561(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "text");
  }

  public static Object propertyMacro_GetPropertyValue_1203596689255(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SNodeOperations.getIndexInParent(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1203596700092(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "isDefault");
  }

  public static Object propertyMacro_GetPropertyValue_1203596854674(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getGenerator().getGeneratorSessionContext().createUniqueName("buttonMethod");
  }

  public static Object propertyMacro_GetPropertyValue_1203598695864(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1203598826106(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "root", true), "title");
  }

  public static Object propertyMacro_GetPropertyValue_1203601110084(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.getGetterName(SPropertyOperations.getString(_context.getNode(), "name"));
  }

  public static Object propertyMacro_GetPropertyValue_1203601130793(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.getSetterName(SPropertyOperations.getString(_context.getNode(), "name"));
  }

  public static Object propertyMacro_GetPropertyValue_1203604432239(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(SLinkOperations.getTarget(_context.getNode(), "root", true), "stretch");
  }

  public static Object referenceMacro_GetReferent_1203607249398(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode contextComponent = DialogUtil.getContextComponent(_context.getNode());
    return _context.getOutputNodeByInputNodeAndMappingLabel(contextComponent, "dialogAttribute");
  }

  public static Object referenceMacro_GetReferent_1203607703422(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode contextComponent = DialogUtil.getContextComponent(_context.getNode());
    return _context.getOutputNodeByInputNodeAndMappingLabel(contextComponent, "dialogAttribute");
  }

  public static Object referenceMacro_GetReferent_1203610749607(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode contextComponent = DialogUtil.getContextComponent(_context.getNode());
    return _context.getOutputNodeByInputNodeAndMappingLabel(contextComponent, "dialogAttribute");
  }

  public static boolean ifMacro_Condition_1203596134290(final IOperationContext operationContext, final IfMacroContext _context) {
    return ComponentDeclaration_Behavior.call_getConstructor_1213877495346(_context.getNode()) != null;
  }

  public static boolean ifMacro_Condition_1203596721114(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "handler", true) != null;
  }

  public static SNode sourceNodeQuery_1203593394388(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "root", true), "contentPane", true);
  }

  public static SNode sourceNodeQuery_1203596175049(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(ComponentDeclaration_Behavior.call_getConstructor_1213877495346(_context.getNode()), "body", true);
  }

  public static SNode sourceNodeQuery_1203596713463(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "handler", true);
  }

  public static SNode sourceNodeQuery_1203600929409(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1203600954272(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1203607719721(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "errorText", true);
  }

  public static List sourceNodesQuery_1203593881811(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ComponentDeclaration_Behavior.call_getDeclaredMethods_1213877495451(_context.getNode());
  }

  public static List sourceNodesQuery_1203593896904(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ComponentDeclaration_Behavior.call_getDeclaredAttributes_1213877495390(_context.getNode());
  }

  public static List sourceNodesQuery_1203596481953(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "root", true), "button", true);
  }

  public static List sourceNodesQuery_1203600911916(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ComponentDeclaration_Behavior.call_getDeclaredAttributes_1213877495390(_context.getNode());
  }

  public static List sourceNodesQuery_1203600943591(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ComponentDeclaration_Behavior.call_getDeclaredAttributes_1213877495390(_context.getNode());
  }

  public static void mappingScript_CodeBlock_1203594547726(final IOperationContext operationContext, final MappingScriptContext _context) {
    for(SNode cc : SModelOperations.getRoots(_context.getModel(), "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      if ("_ToRemove".equals(SPropertyOperations.getString(cc, "name"))) {
        SNodeOperations.deleteNode(cc);
      }
    }
  }

}
