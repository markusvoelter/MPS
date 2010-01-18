package jetbrains.mps.lang.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.smodel.SNode;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.dataFlow.framework.instructions.ReadInstruction;
import jetbrains.mps.lang.dataFlow.framework.instructions.WriteInstruction;

public class DataFlow {
  /*package*/ static final String MAY_BE_UNREACHABLE = "mayBeUnreachable";

  public DataFlow() {
  }

  private static boolean mayBeUnreachable(Instruction instruction) {
    return Boolean.TRUE.equals(instruction.getUserObject(MAY_BE_UNREACHABLE));
  }

  public static Program buildProgram(SNode node) {
    return DataFlowManager.getInstance().buildProgramFor(node);
  }

  public static Set<SNode> getUnreachableNodes(Program program) {
    Set<Instruction> unreachable = program.getUnreachableInstructions();
    Set<SNode> unreachableNodes = new HashSet<SNode>();
    for (Instruction i : unreachable) {
      if (!(DataFlow.mayBeUnreachable(i)) && i.getSource() != null) {
        SNode unreachableNode = (SNode) i.getSource();
        if (unreachableNode.isInstanceOfConcept(Statement.concept)) {
          unreachableNodes.add((SNode) i.getSource());
        } else {
          if (unreachableNode.isInstanceOfConcept(StatementList.concept)) {
            if (!(unreachableNode.getParent().isInstanceOfConcept(Statement.concept))) {
              unreachableNodes.add((SNode) i.getSource());
            }
          } else {
            INodeAdapter adapter = BaseAdapter.fromNode(unreachableNode);
            unreachableNodes.add(adapter.getParent(Statement.class).getNode());
          }
        }
      }
    }
    return unreachableNodes;
  }

  public static Set<SNode> getExpectedReturns(Program program) {
    Set<Instruction> expectedReturns = program.getExpectedReturns();
    Set<SNode> result = new HashSet<SNode>();
    for (Instruction instr : expectedReturns) {
      result.add((SNode) instr.getSource());
    }
    return result;
  }

  public static Set<SNode> getUninitializedReads(Program program) {
    Set<SNode> reads = new HashSet<SNode>();
    for (ReadInstruction read : program.getUninitializedReads()) {
      reads.add((SNode) read.getSource());
    }
    return reads;
  }

  public boolean isInitializedRewritten(Program program, SNode write) {
    WriteInstruction writeInstruction = null;
    for (Instruction instruction : program.getInstructionsFor(write)) {
      if (instruction instanceof WriteInstruction && instruction.getSource() == write) {
        writeInstruction = (WriteInstruction) instruction;
        break;
      }
    }
    if (writeInstruction != null) {
      return program.isInitializedRewritten(writeInstruction);
    }
    return false;
  }

  public static Set<SNode> getUsedVariables(Program program, SNode node) {
    Set<SNode> readVars = new HashSet<SNode>();
    for (Instruction i : program.getInstructions()) {
      if (i instanceof ReadInstruction) {
        readVars.add((SNode) ((ReadInstruction) i).getVariable());
      }
    }
    return readVars;
  }

  public static Set<SNode> getUnusedAssignments(SNode node) {
    return DataFlow.getUnusedAssignments(DataFlow.buildProgram(node));
  }

  public static Set<SNode> getUnusedAssignments(Program program) {
    Set<SNode> unusedAssignments = new HashSet<SNode>();
    for (WriteInstruction write : program.getUnusedAssignments()) {
      unusedAssignments.add((SNode) write.getSource());
    }
    return unusedAssignments;
  }
}
