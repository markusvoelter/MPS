package jetbrains.mps.debug.apiLang.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.debug.api.IDebugger;
import jetbrains.mps.debug.api.Debuggers;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class QueriesGenerated {
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_DebuggerReference_1104094430779069345(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.debug.apiLang.structure.DebuggerReference");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            List<String> debuggerNames = ListSequence.fromList(new ArrayList<String>());
            for (IDebugger debugger : ListSequence.fromList(Debuggers.getInstance().getDebuggers())) {
              ListSequence.fromList(debuggerNames).addElement(debugger.getName());
            }
            return debuggerNames;
          }
        };
        Iterable<String> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final String item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode debuggerReference = SNodeFactoryOperations.createNewNode("jetbrains.mps.debug.apiLang.structure.DebuggerReference", null);
                SPropertyOperations.set(debuggerReference, "debuggerName", (item));
                return debuggerReference;
              }

              public String getMatchingText(String pattern) {
                return "debugger<" + (item) + ">";
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return (item) + " Debugger";
              }
            });
          }
        }
      }
    }
    return result;
  }
}
