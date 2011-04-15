package jetbrains.mps.debug.apiLang.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.BaseHelginsDescriptor;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;

public class TypesystemDescriptor extends BaseHelginsDescriptor {
  public TypesystemDescriptor() {
    {
      InferenceRule_Runtime inferenceRule = new typeof_CreateBreakpointOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_DebuggerReference_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new DebuggerTypeIsDebuggerType_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
  }
}
