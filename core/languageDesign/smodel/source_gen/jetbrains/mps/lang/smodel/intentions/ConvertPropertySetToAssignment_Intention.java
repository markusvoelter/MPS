package jetbrains.mps.lang.smodel.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class ConvertPropertySetToAssignment_Intention extends BaseIntention {
  public ConvertPropertySetToAssignment_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.smodel.structure.Property_SetOperation";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Convert to Assignment";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode lValue = IOperation_Behavior.call_getOperand_1213877410070(node);
    SNode rValue = SLinkOperations.getTarget(node, "value", true);
    SNodeOperations.detachNode(SLinkOperations.getTarget(node, "value", true));
    SNode dotExpr = IOperation_Behavior.call_getDotExpression_1224687669172(node);
    SNodeOperations.detachNode(SLinkOperations.getTarget(dotExpr, "operand", true));
    SNode assignment = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.AssignmentExpression", null);
    SLinkOperations.setTarget(assignment, "lValue", lValue, true);
    SLinkOperations.setTarget(assignment, "rValue", rValue, true);
    SNodeOperations.replaceWithAnother(dotExpr, assignment);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.smodel.intentions";
  }
}
