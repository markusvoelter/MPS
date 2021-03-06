package jetbrains.mps.debugger.api.lang.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.debugger.api.lang.structure.BreakpointCreator", "jetbrains.mps.debugger.api.lang.structure.BreakpointableNodeItem", "jetbrains.mps.debugger.api.lang.structure.ConceptDeclarationReference", "jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_Debug_Project", "jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_DebuggableNode", "jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_DebuggableNode_Deprecated", "jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_ScopeNode", "jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_UnitNode", "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_CreateBreakpoint", "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_CreateBreakpoint_Deprecated", "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_GetUnitName", "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_GetVariables", "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_PropertyStringGetter", "jetbrains.mps.debugger.api.lang.structure.CreateBreakpointOperation", "jetbrains.mps.debugger.api.lang.structure.DebugInfoInitializer", "jetbrains.mps.debugger.api.lang.structure.DebuggableNodeItem", "jetbrains.mps.debugger.api.lang.structure.DebuggerConfiguration", "jetbrains.mps.debugger.api.lang.structure.DebuggerReference", "jetbrains.mps.debugger.api.lang.structure.DebuggerType", "jetbrains.mps.debugger.api.lang.structure.GetDebuggerSettings_Function", "jetbrains.mps.debugger.api.lang.structure.ScopeNodeItem", "jetbrains.mps.debugger.api.lang.structure.UnitNodeItem", "jetbrains.mps.debugger.api.lang.structure.VariableNodeExpression", "jetbrains.mps.debugger.api.lang.structure.VariableNodeItem"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 0:
        return new BreakpointCreator_BehaviorDescriptor();
      case 1:
        return new BreakpointableNodeItem_BehaviorDescriptor();
      case 8:
        return new ConceptFunction_CreateBreakpoint_BehaviorDescriptor();
      case 3:
        return new ConceptFunctionParameter_Debug_Project_BehaviorDescriptor();
      case 4:
        return new ConceptFunctionParameter_DebuggableNode_BehaviorDescriptor();
      case 2:
        return new ConceptDeclarationReference_BehaviorDescriptor();
      case 18:
        return new DebuggerType_BehaviorDescriptor();
      case 17:
        return new DebuggerReference_BehaviorDescriptor();
      case 13:
        return new CreateBreakpointOperation_BehaviorDescriptor();
      case 19:
        return new GetDebuggerSettings_Function_BehaviorDescriptor();
      case 16:
        return new DebuggerConfiguration_BehaviorDescriptor();
      case 5:
        return new ConceptFunctionParameter_DebuggableNode_Deprecated_BehaviorDescriptor();
      case 6:
        return new ConceptFunctionParameter_ScopeNode_BehaviorDescriptor();
      case 7:
        return new ConceptFunctionParameter_UnitNode_BehaviorDescriptor();
      case 9:
        return new ConceptFunction_CreateBreakpoint_Deprecated_BehaviorDescriptor();
      case 10:
        return new ConceptFunction_GetUnitName_BehaviorDescriptor();
      case 11:
        return new ConceptFunction_GetVariables_BehaviorDescriptor();
      case 12:
        return new ConceptFunction_PropertyStringGetter_BehaviorDescriptor();
      case 14:
        return new DebugInfoInitializer_BehaviorDescriptor();
      case 15:
        return new DebuggableNodeItem_BehaviorDescriptor();
      case 20:
        return new ScopeNodeItem_BehaviorDescriptor();
      case 21:
        return new UnitNodeItem_BehaviorDescriptor();
      case 22:
        return new VariableNodeExpression_BehaviorDescriptor();
      case 23:
        return new VariableNodeItem_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
