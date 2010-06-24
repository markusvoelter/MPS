package jetbrains.mps.analyzers.mpsAnalyzers.nullable;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.smodel.SNode;

public class notNullInstruction extends Instruction {
  private SNode mynode;
  private String myPresentation;

  public notNullInstruction(SNode node) {
    StringBuilder sb = new StringBuilder();
    sb.append("notNull");
    mynode = node;
    sb.append(" " + node);
    myPresentation = sb.toString();
  }

  @Override
  public String commandPresentation() {
    return myPresentation;
  }

  public SNode getnode() {
    return mynode;
  }
}
