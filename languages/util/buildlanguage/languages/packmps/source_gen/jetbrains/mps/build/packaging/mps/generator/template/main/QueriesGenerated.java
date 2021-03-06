package jetbrains.mps.build.packaging.mps.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.build.packaging.mps.generator.template.util.CheckUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.ClasspathReader;
import jetbrains.mps.build.packaging.behavior.CompositePathComponent_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.MappingScriptContext;

public class QueriesGenerated {
  public static boolean createRootRule_Condition_3583849467507868254(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return CheckUtil.isInMpsAutobuild(_context.getOriginalInputModel());
  }

  public static Object propertyMacro_GetPropertyValue_5428983789738234566(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ":" + ClasspathReader.ClassType.CORE.getTypeString();
  }

  public static Object propertyMacro_GetPropertyValue_8037435193861318521(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return CompositePathComponent_Behavior.call_getPath_1220983419344(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.as(_context.getNode(), "jetbrains.mps.build.packaging.structure.Copy"), "sourcePath", true), "compositePathComponent", true));
  }

  public static Object propertyMacro_GetPropertyValue_5428983789737856614(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return CompositePathComponent_Behavior.call_getPath_1220983419344(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.as(_context.getNode(), "jetbrains.mps.build.packaging.structure.Copy"), "sourcePath", true), "compositePathComponent", true));
  }

  public static Object propertyMacro_GetPropertyValue_5428983789738262461(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ":" + ClasspathReader.ClassType.EDITOR.getTypeString();
  }

  public static Object propertyMacro_GetPropertyValue_5428983789737856663(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return CompositePathComponent_Behavior.call_getPath_1220983419344(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.as(_context.getNode(), "jetbrains.mps.build.packaging.structure.Copy"), "sourcePath", true), "compositePathComponent", true));
  }

  public static Object propertyMacro_GetPropertyValue_5428983789738262478(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ":" + ClasspathReader.ClassType.WORKBENCH.getTypeString();
  }

  public static Object propertyMacro_GetPropertyValue_5428983789737856709(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return CompositePathComponent_Behavior.call_getPath_1220983419344(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.as(_context.getNode(), "jetbrains.mps.build.packaging.structure.Copy"), "sourcePath", true), "compositePathComponent", true));
  }

  public static Object propertyMacro_GetPropertyValue_6700426045796524728(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return CompositePathComponent_Behavior.call_getPath_1220983419344(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.as(_context.getNode(), "jetbrains.mps.build.packaging.structure.Copy"), "sourcePath", true), "compositePathComponent", true));
  }

  public static Iterable sourceNodesQuery_8037435193861318531(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "8431776905956472694"), "entry", true)).first(), "jetbrains.mps.build.packaging.structure.ICompositeComponent"), "entry", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.packaging.structure.Copy");
      }
    });
  }

  public static Iterable sourceNodesQuery_5428983789737856626(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "8431776905956472723"), "entry", true)).first(), "jetbrains.mps.build.packaging.structure.ICompositeComponent"), "entry", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.packaging.structure.Copy");
      }
    });
  }

  public static Iterable sourceNodesQuery_5428983789737856675(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "5428983789737854768"), "entry", true)).first(), "jetbrains.mps.build.packaging.structure.ICompositeComponent"), "entry", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.packaging.structure.Copy");
      }
    });
  }

  public static Iterable sourceNodesQuery_5428983789737856721(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "5428983789737854526"), "entry", true)).first(), "jetbrains.mps.build.packaging.structure.ICompositeComponent"), "entry", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.packaging.structure.Copy");
      }
    });
  }

  public static Iterable sourceNodesQuery_6700426045796524740(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "6700426045796013947"), "entry", true)).first(), "jetbrains.mps.build.packaging.structure.ICompositeComponent"), "entry", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.packaging.structure.Copy");
      }
    });
  }

  public static void mappingScript_CodeBlock_3583849467508042413(final IOperationContext operationContext, final MappingScriptContext _context) {
    if (!(CheckUtil.isInMpsAutobuild(_context.getOriginalInputModel()))) {
      return;
    }
    CheckUtil.checkCoreRuntimeDeps();
    // do not check included langs: it gives us a list of test languages, which should not be included in build 
    // <node> 
    CheckUtil.checkSamples();
  }
}
