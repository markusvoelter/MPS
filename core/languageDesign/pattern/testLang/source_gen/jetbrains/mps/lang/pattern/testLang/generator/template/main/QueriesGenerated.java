package jetbrains.mps.lang.pattern.testLang.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.test.generator.baseLanguage.template.util.TestsUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_602731281382641311(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "test" + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1563914226484903755(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "PatternVar_" + SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "variable", true), "declaration", false), "varName");
  }

  public static Object propertyMacro_GetPropertyValue_1563914226484925040(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "PatternVar_" + SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "variable", true), "declaration", false), "varName");
  }

  public static Object propertyMacro_GetPropertyValue_1563914226484968044(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "PatternVar_" + SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "variable", true), "listPattern", false), "varName");
  }

  public static Object propertyMacro_GetPropertyValue_602731281382637730(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TestsUtil.getProjectPath(SNodeOperations.getModel(_context.getNode()), operationContext);
  }

  public static Object propertyMacro_GetPropertyValue_602731281382637740(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getSModelReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_602731281382637757(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SModelOperations.getModelName(SNodeOperations.getModel(_context.getNode())) + ".PatternTest_" + SPropertyOperations.getString(_context.getNode(), "name") + "$TestBody";
  }

  public static Object propertyMacro_GetPropertyValue_602731281382637766(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "test" + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_815823070325289644(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "PatternTest_" + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static boolean ifMacro_Condition_1563914226484976394(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(SLinkOperations.getTarget(_context.getNode(), "matches", true), "value") == true;
  }

  public static SNode sourceNodeQuery_1563914226484903651(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "nodeToMatch", true);
  }

  public static SNode sourceNodeQuery_1563914226484903662(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "pattern", true);
  }

  public static SNode sourceNodeQuery_1563914226484903741(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "value", true);
  }

  public static SNode sourceNodeQuery_1563914226484925028(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "value", true);
  }

  public static SNode sourceNodeQuery_1563914226484972313(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static Iterable sourceNodesQuery_1563914226484903732(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "variable", true);
  }

  public static Iterable sourceNodesQuery_1563914226484925018(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "property", true);
  }

  public static Iterable sourceNodesQuery_1563914226484968076(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "value", true);
  }

  public static Iterable sourceNodesQuery_1563914226484968027(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "list", true);
  }
}
