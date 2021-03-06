package jetbrains.mps.bash.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bash.behavior.CommandList_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class AsyncExecution_Intention extends BaseIntention implements Intention {
  public AsyncExecution_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.bash.structure.CommandList";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Execute the command asynchronously";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    SNode selectedNode = editorContext.getSelectedNode();
    SNode commandlist = SNodeOperations.getAncestor(selectedNode, "jetbrains.mps.bash.structure.CommandList", false, false);
    if (commandlist != node) {
      return false;
    }
    return CommandList_Behavior.call_isBaseCommandExists_3905757829894475414(node) && (SLinkOperations.getTarget(node, "terminator", true) == null) || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "terminator", true), "jetbrains.mps.bash.structure.SemicolonTerminator") || SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(node, "terminator", true)), "jetbrains.mps.bash.structure.CommandTerminator");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNodeFactoryOperations.setNewChild(node, "terminator", "jetbrains.mps.bash.structure.AsyncTerminator");
  }

  public String getLocationString() {
    return "jetbrains.mps.bash.intentions";
  }
}
