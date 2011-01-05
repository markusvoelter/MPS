package jetbrains.mps.lang.structure.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class AddDeprecatedAnnotation_Intention extends BaseIntention implements Intention {
  public AddDeprecatedAnnotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.structure.structure.IStructureDeprecatable";
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
    if ((SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("deprecatedNode"), true) == null)) {
      return "Add Deprecated Annotation";
    }
    return "Remove Deprecated Annotation";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    if ((SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("deprecatedNode"), true) == null)) {
      SNode annotation = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation", null);
      SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("deprecatedNode"), annotation, true);
    } else {
      SNodeOperations.detachNode(SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("deprecatedNode"), true));
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.structure.intentions";
  }
}
