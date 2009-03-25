package jetbrains.mps.lang.pattern.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.lang.pattern.dataFlow.PatternVariableDeclaration_DataFlow;
import jetbrains.mps.lang.pattern.dataFlow.PropertyPatternVariableDeclaration_DataFlow;
import jetbrains.mps.lang.pattern.dataFlow.PatternExpression_DataFlow;
import jetbrains.mps.lang.pattern.dataFlow.PatternVariableReference_DataFlow;
import jetbrains.mps.lang.pattern.dataFlow.PropertyPatternVariableReference_DataFlow;

public class DFABuilders extends DataFlowBuilders {

  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", new PatternVariableDeclaration_DataFlow());
    manager.register("jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration", new PropertyPatternVariableDeclaration_DataFlow());
    manager.register("jetbrains.mps.lang.pattern.structure.PatternExpression", new PatternExpression_DataFlow());
    manager.register("jetbrains.mps.lang.pattern.structure.PatternVariableReference", new PatternVariableReference_DataFlow());
    manager.register("jetbrains.mps.lang.pattern.structure.PropertyPatternVariableReference", new PropertyPatternVariableReference_DataFlow());
  }

}
