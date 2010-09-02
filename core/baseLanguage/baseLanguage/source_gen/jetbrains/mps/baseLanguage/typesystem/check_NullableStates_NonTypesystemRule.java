package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.analyzers.runtime.framework.CustomAnalyzerRunner;
import java.util.Map;
import jetbrains.mps.baseLanguage.dataFlow.NullableState;
import jetbrains.mps.baseLanguage.dataFlow.NullableAnalyzerRunner;
import jetbrains.mps.lang.dataFlow.framework.AnalysisResult;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.lang.dataFlow.framework.instructions.ReadInstruction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.dataFlow.framework.instructions.WriteInstruction;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_NullableStates_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_NullableStates_NonTypesystemRule() {
  }

  public void applyRule(final SNode iMethodLike, final TypeCheckingContext typeCheckingContext) {
    CustomAnalyzerRunner<Map<SNode, NullableState>> nullableRunner = new NullableAnalyzerRunner(iMethodLike);
    AnalysisResult<Map<SNode, NullableState>> result = nullableRunner.analyze();
    for (Instruction instruction : nullableRunner.getProgram().getInstructions()) {
      SNode source = (SNode) instruction.getSource();
      SNode variable = source;
      if (SNodeOperations.isInstanceOf(source, "jetbrains.mps.baseLanguage.structure.VariableReference")) {
        variable = SLinkOperations.getTarget(SNodeOperations.cast(source, "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false);
      }
      NullableState varState = result.get(instruction).get(variable);
      SNode parent = SNodeOperations.getParent(source);
      if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.DotExpression") && !(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.checkedDots.structure.CheckedDotExpression"))) {
        SNode dot = SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.structure.DotExpression");
        if (SLinkOperations.getTarget(dot, "operand", true) == source && !(IOperation_Behavior.call_operandCanBeNull_323410281720656291(SLinkOperations.getTarget(dot, "operation", true)))) {
          if (NullableState.canBeNull(varState)) {
            {
              BaseIntentionProvider intentionProvider = null;
              IErrorTarget errorTarget = new NodeErrorTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(dot, "This operation can produce 'java.lang.NullPointerException'", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3791846458263577277", intentionProvider, errorTarget);
            }
          }
        }
      }
      // Test equals and not equals is always true or false 
      if (instruction instanceof ReadInstruction && (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.EqualsExpression") || SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.NotEqualsExpression"))) {
        boolean inCondition = false;
        boolean equals = SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.EqualsExpression");
        boolean isNull = NullableState.NULL.equals(varState);
        boolean isNotNull = NullableState.NOTNULL.equals(varState);
        if (ListSequence.fromList(SNodeOperations.getDescendants(SNodeOperations.getParent(source), "jetbrains.mps.baseLanguage.structure.NullLiteral", false, new String[]{})).isNotEmpty()) {
          if (SNodeOperations.getAncestor(source, "jetbrains.mps.baseLanguage.structure.IfStatement", false, false) != null && ListSequence.fromList(SNodeOperations.getAncestors(source, null, false)).contains(SLinkOperations.getTarget(SNodeOperations.getAncestor(source, "jetbrains.mps.baseLanguage.structure.IfStatement", false, false), "condition", true))) {
            inCondition = true;
          }
          if (SNodeOperations.getAncestor(source, "jetbrains.mps.baseLanguage.structure.WhileStatement", false, false) != null && ListSequence.fromList(SNodeOperations.getAncestors(source, null, false)).contains(SLinkOperations.getTarget(SNodeOperations.getAncestor(source, "jetbrains.mps.baseLanguage.structure.WhileStatement", false, false), "condition", true))) {
            inCondition = true;
          }
          if (inCondition) {
            if (equals && isNotNull || !(equals) && isNull) {
              {
                BaseIntentionProvider intentionProvider = null;
                IErrorTarget errorTarget = new NodeErrorTarget();
                IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(parent, "This condition is always false", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3791846458263577391", intentionProvider, errorTarget);
              }
            }
            if (equals && isNull || !(equals) && isNotNull) {
              {
                BaseIntentionProvider intentionProvider = null;
                IErrorTarget errorTarget = new NodeErrorTarget();
                IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(parent, "This condition is always true", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3791846458263577404", intentionProvider, errorTarget);
              }
            }
          }
        }
      }
      if (instruction instanceof WriteInstruction) {
        WriteInstruction write = (WriteInstruction) instruction;
        List<SNode> annotation = SLinkOperations.getTargets(((SNode) write.getVariable()), "annotation", true);
        if (annotation != null && ListSequence.fromList(annotation).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, "annotation", false) != null);
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, "annotation", false);
          }
        }).contains(SNodeOperations.getNode("f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)", "~NotNull"))) {
          SNode value = (SNode) write.getValue();
          if (SNodeOperations.isInstanceOf(value, "jetbrains.mps.baseLanguage.structure.VariableReference")) {
            value = SLinkOperations.getTarget(SNodeOperations.cast(value, "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false);
          }
          if (NullableState.canBeNull(result.get(instruction).get(value))) {
            {
              BaseIntentionProvider intentionProvider = null;
              IErrorTarget errorTarget = new NodeErrorTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError((SNode) write.getValue(), "This expression might evaluate to null but is assigned to a variable that is annotated with @NotNull", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3791846458263577483", intentionProvider, errorTarget);
            }
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.IMethodLike";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
