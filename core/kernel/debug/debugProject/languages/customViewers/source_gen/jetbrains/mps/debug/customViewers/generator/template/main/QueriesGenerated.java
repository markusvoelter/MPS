package jetbrains.mps.debug.customViewers.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.debug.evaluation.transform.TransformationUtil;
import jetbrains.mps.debug.customViewers.behavior.HighLevelCustomViewer_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.MapSrcMacroPostProcContext;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.generator.template.MappingScriptContext;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.debug.evaluation.transform.Transformator;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class QueriesGenerated {
  public static boolean createRootRule_Condition_2844414625304365060(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.debug.customViewers.structure.CustomViewer")).isNotEmpty() || ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.debug.customViewers.structure.HighLevelCustomViewer")).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_8236382033128530265(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false), "jetbrains.mps.debug.customViewers.structure.CanWrapValue_ConceptFunction");
  }

  public static boolean baseMappingRule_Condition_8236382033128508143(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false), "jetbrains.mps.debug.customViewers.structure.CanWrapValue_ConceptFunction"));
  }

  public static Object propertyMacro_GetPropertyValue_4089989733346841405(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "_Wrapper";
  }

  public static Object propertyMacro_GetPropertyValue_4089989733346841391(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "_Factory";
  }

  public static Object propertyMacro_GetPropertyValue_4089989733346843322(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_399126674726715728(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "MyWatchable_" + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_4089989733346843071(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_4089989733346844063(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "watchable", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_264293128390879124(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "Wrapper";
  }

  public static Object propertyMacro_GetPropertyValue_6283731996530117461(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TransformationUtil.getJniSignatureFromType(HighLevelCustomViewer_Behavior.call_getValueTypeCopy_43370322128260022(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_264293128390879201(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "_WrapperFactory";
  }

  public static Object propertyMacro_GetPropertyValue_8275758777999533495(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "watchable", false), "name");
  }

  public static Object referenceMacro_GetReferent_4089989733346844078(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "watchable", false), "watchable"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_2844414625304421797(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "viewer"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_9127371268473651354(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "highLevelViewer"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_264293128390879084(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "highLevelViewer"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_8275758777999533505(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "watchable", false), "watchable"), "constructor", true)).first();
  }

  public static boolean ifMacro_Condition_4089989733346839759(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "getPresentation", true) != null);
  }

  public static boolean ifMacro_Condition_4089989733346843275(final IOperationContext operationContext, final IfMacroContext _context) {
    return StringUtils.isNotEmpty(SPropertyOperations.getString(_context.getNode(), "iconPath"));
  }

  public static boolean ifMacro_Condition_264293128390879160(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "getPresentation", true) != null);
  }

  public static boolean ifMacro_Condition_7785669630792594441(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "getPresentation", true) != null);
  }

  public static boolean ifMacro_Condition_2685024263846566714(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canWrap", true) != null);
  }

  public static boolean ifMacro_Condition_2685024263846493110(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canWrap", true) != null);
  }

  public static SNode sourceNodeQuery_4089989733346809281(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "getWatchables", true), "body", true);
  }

  public static SNode sourceNodeQuery_4089989733346839743(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "getPresentation", true), "body", true);
  }

  public static SNode sourceNodeQuery_4089989733346839798(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canWrapBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_4089989733346842901(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "index", true);
  }

  public static SNode sourceNodeQuery_4089989733346842928(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "fieldName", true);
  }

  public static SNode sourceNodeQuery_2608445015225430991(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "value", true);
  }

  public static SNode sourceNodeQuery_1843851250586701083(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "startIndex", true);
  }

  public static SNode sourceNodeQuery_1843851250586701097(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "endIndex", true);
  }

  public static SNode sourceNodeQuery_7744028807303024898(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "methodName", true);
  }

  public static SNode sourceNodeQuery_7744028807303028965(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "signature", true);
  }

  public static SNode sourceNodeQuery_8358947785871508152(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_111018263013073627(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "className", true);
  }

  public static SNode sourceNodeQuery_3798344557789646276(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TransformationUtil.getValueProxyTypeFromType(HighLevelCustomViewer_Behavior.call_getValueTypeCopy_43370322128260022(_context.getNode()));
  }

  public static SNode sourceNodeQuery_6588495380858422615(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "getWatchables", true), "body", true);
  }

  public static SNode sourceNodeQuery_6588495380858423210(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TransformationUtil.getValueProxyTypeFromType(HighLevelCustomViewer_Behavior.call_getValueTypeCopy_43370322128260022(_context.getNode()));
  }

  public static SNode sourceNodeQuery_7785669630792626876(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TransformationUtil.getValueProxyTypeFromType(HighLevelCustomViewer_Behavior.call_getValueTypeCopy_43370322128260022(_context.getNode()));
  }

  public static SNode sourceNodeQuery_7785669630792594432(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TransformationUtil.getValueProxyTypeFromType(HighLevelCustomViewer_Behavior.call_getValueTypeCopy_43370322128260022(_context.getNode()));
  }

  public static SNode sourceNodeQuery_7785669630792594457(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "getPresentation", true), "body", true);
  }

  public static SNode sourceNodeQuery_4061114533381592593(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TransformationUtil.getValueProxyTypeFromType(HighLevelCustomViewer_Behavior.call_getValueTypeCopy_43370322128260022(_context.getNode()));
  }

  public static SNode sourceNodeQuery_2685024263846491797(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TransformationUtil.getValueProxyTypeFromType(HighLevelCustomViewer_Behavior.call_getValueTypeCopy_43370322128260022(_context.getNode()));
  }

  public static SNode sourceNodeQuery_2685024263846491806(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canWrap", true), "body", true);
  }

  public static SNode sourceNodeQuery_8275758777999550705(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "value", true);
  }

  public static Iterable sourceNodesQuery_4089989733346843285(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "watchable", true);
  }

  public static Iterable sourceNodesQuery_2844414625304366120(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.debug.customViewers.structure.CustomViewer");
  }

  public static Iterable sourceNodesQuery_9127371268473651371(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.debug.customViewers.structure.HighLevelCustomViewer");
  }

  public static Iterable sourceNodesQuery_7744028807303024912(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "arguments", true);
  }

  public static Iterable sourceNodesQuery_264293128390879101(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.debug.customViewers.structure.HighLevelCustomViewer");
  }

  public static void mapSrcMacro_post_mapper_721063219978405017(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("toProcessMethod"), "jetbrains.mps.debug.customViewers.structure.ToProcessMethod");
  }

  public static void mapSrcMacro_post_mapper_721063219978405039(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("toProcessMethod"), "jetbrains.mps.debug.customViewers.structure.ToProcessMethod");
  }

  public static void mapSrcMacro_post_mapper_721063219978402837(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("toProcessMethod"), "jetbrains.mps.debug.customViewers.structure.ToProcessMethod");
  }

  public static void mapSrcMacro_post_mapper_1123500463147192694(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("doNotTransformAnnotation"), "jetbrains.mps.debug.evaluation.structure.DoNotTransformAnnotation");
  }

  public static void mapSrcMacro_post_mapper_5639218245806456017(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("doNotTransformAnnotation"), "jetbrains.mps.debug.evaluation.structure.DoNotTransformAnnotation");
  }

  public static void mapSrcMacro_post_mapper_6772833964096462904(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("doNotTransformAnnotation"), "jetbrains.mps.debug.evaluation.structure.DoNotTransformAnnotation");
  }

  public static void mapSrcMacro_post_mapper_5639218245806455992(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("doNotTransformAnnotation"), "jetbrains.mps.debug.evaluation.structure.DoNotTransformAnnotation");
  }

  public static void mapSrcMacro_post_mapper_5639218245806446718(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("doNotTransformAnnotation"), "jetbrains.mps.debug.evaluation.structure.DoNotTransformAnnotation");
  }

  public static void mapSrcMacro_post_mapper_1464575230816145950(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("doNotTransformAnnotation"), "jetbrains.mps.debug.evaluation.structure.DoNotTransformAnnotation");
  }

  public static void mapSrcMacro_post_mapper_8256349518541671180(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("doNotTransformAnnotation"), "jetbrains.mps.debug.evaluation.structure.DoNotTransformAnnotation");
    ListSequence.fromList(SNodeOperations.getDescendants(_context.getOutputNode(), null, false, new String[]{})).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        SLinkOperations.setNewChild(it, AttributesRolesUtil.childRoleFromAttributeRole("doNotTransformAnnotation"), "jetbrains.mps.debug.evaluation.structure.DoNotTransformAnnotation");
      }
    });
  }

  public static void mapSrcMacro_post_mapper_1855642807426525752(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setNewChild(_context.getOutputNode(), AttributesRolesUtil.childRoleFromAttributeRole("doNotTransformAnnotation"), "jetbrains.mps.debug.evaluation.structure.DoNotTransformAnnotation");
  }

  public static void mappingScript_CodeBlock_264293128390891135(final IOperationContext operationContext, final MappingScriptContext _context) {
    for (SNode classConcept : ListSequence.fromList(SModelOperations.getRoots(_context.getModel(), "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
      if (eq_x583g4_a0a0a0a26(SLinkOperations.getTarget(SLinkOperations.getTarget(classConcept, "superclass", true), "classifier", false), SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a0a0a0a26().createNode(), "classifier", false)) && SPropertyOperations.getString(classConcept, "name").endsWith("_WrapperFactory")) {
        for (SNode method : ListSequence.fromList(SNodeOperations.getDescendants(classConcept, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, new String[]{})).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, AttributesRolesUtil.childRoleFromAttributeRole("toProcessMethod"), true) != null);
          }
        })) {
          if ((method == null)) {
            continue;
          }
          new Transformator(method, false).transform();
        }
      }
    }
  }

  private static boolean eq_x583g4_a0a0a0a26(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  public static class QuotationClass_x583g4_a0a0a0a0a26 {
    public QuotationClass_x583g4_a0a0a0a0a26() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.debug.runtime.java.programState.proxies(jetbrains.mps.debug.runtime.java.programState.proxies@java_stub)"), SNodeId.fromString("~ValueWrapperFactory")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
